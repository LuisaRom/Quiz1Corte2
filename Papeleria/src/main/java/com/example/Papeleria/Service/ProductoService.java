package com.example.Papeleria.Service;

import com.example.Papeleria.Model.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> findAll();
    Producto findById(Long id);
    Producto save(Producto producto);
    void delete(Long id);

    void deleteById(Long id);
}
