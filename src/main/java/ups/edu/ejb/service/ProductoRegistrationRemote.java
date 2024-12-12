package ups.edu.ejb.service;

import jakarta.ejb.Remote;
import ups.edu.ejb.model.Producto;

/**
 * Interfaz remota para el registro de productos.
 * 
 * Esta interfaz define los métodos que pueden ser utilizados de forma remota
 * por clientes fuera del servidor.
 */
@Remote
public interface ProductoRegistrationRemote {

    /**
     * Registra un nuevo producto en el sistema.
     *
     * @param producto el producto que se va a registrar
     */
    void register(Producto producto);
}
