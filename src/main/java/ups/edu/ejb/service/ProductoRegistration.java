package ups.edu.ejb.service;


import java.util.List;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ups.edu.ejb.model.Producto;

@Stateless
public class ProductoRegistration implements ProductoRegistrationLocal, ProductoRegistrationRemote {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void register(Producto producto) {
        em.persist(producto);
    }

    @Override
    public List<Producto> listarProductos() {
        return em.createQuery("SELECT p FROM Producto p", Producto.class).getResultList();
    }
}