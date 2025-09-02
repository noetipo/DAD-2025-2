package pe.edu.upeu.msproducto.Service;

import pe.edu.upeu.msproducto.Entity.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> listar();

    Optional<Producto> buscarPorId(Integer id);

    Producto guardar(Producto producto);

    Producto actualizar(Producto producto);

    void borrarPorId(Integer id);
}
