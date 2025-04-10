package com.example.Papeleria.Service;

import com.example.Papeleria.Model.Producto;
import com.example.Papeleria.Model.Proveedor;

import java.util.List;

public interface ProveedorService {
    List<Proveedor> findAll();
    Proveedor findById(Long id);
    Proveedor save(Proveedor proveedor);
    void delete(Long id);

    void deleteById(Long id);

    List<Producto> obtenerProductosPorProveedor(Long idProveedor);
}
