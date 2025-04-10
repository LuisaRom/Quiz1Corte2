package com.example.Papeleria.Service;

import com.example.Papeleria.Model.DetalleVenta;

import java.util.List;

public interface DetalleVentaService {
    List<DetalleVenta> findAll();
    DetalleVenta findById(Integer id);
    DetalleVenta save(DetalleVenta detalleVenta);
    void delete(Integer id);
}
