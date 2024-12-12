package ups.edu.ejb.controller;


import jakarta.annotation.PostConstruct;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import ups.edu.ejb.model.Producto;
import ups.edu.ejb.service.ProductoRegistrationLocal;

@Named
@RequestScoped
public class ProductoController {

    @EJB
    private ProductoRegistrationLocal productoRegistration;

    private Producto newProducto;

    @PostConstruct
    public void initNewProducto() {
        newProducto = new Producto();
    }

    public void register() {
        try {
            productoRegistration.register(newProducto);
            System.out.println("Producto registrado exitosamente: " + newProducto.getNombre());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Getters y setters
    public Producto getNewProducto() {
        return newProducto;
    }

    public void setNewProducto(Producto newProducto) {
        this.newProducto = newProducto;
    }
}