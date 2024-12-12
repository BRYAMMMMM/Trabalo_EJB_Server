package ups.edu.ejb.service;

import java.util.List;

import jakarta.ejb.Local;
import ups.edu.ejb.model.Producto;

@Local
public interface ProductoRegistrationLocal {
    void register(Producto producto);
    List<Producto> listarProductos(); // Declara el método aquí

}