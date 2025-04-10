package com.example.Papeleria.Service;

import com.example.Papeleria.Model.Venta;

import java.time.LocalDate;
import java.util.List;

public interface VentaService {
    List<Venta> findAll();
    Venta findById(Long id);
    Venta save(Venta venta);
    void delete(Long id);
    void deleteById(Long id);
    List<Venta> obtenerVentasConClientes(Long idEmpleado);
    List<Venta> ventasPorEmpleadoYFecha(Long idEmpleado, LocalDate fechaInicio, LocalDate fechaFin);
}

