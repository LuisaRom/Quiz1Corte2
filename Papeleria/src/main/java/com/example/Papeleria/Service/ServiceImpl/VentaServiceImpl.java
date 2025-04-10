package com.example.Papeleria.Service.ServiceImpl;

import com.example.Papeleria.Model.Venta;
import com.example.Papeleria.Repository.VentaRepository;
import com.example.Papeleria.Service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class VentaServiceImpl implements VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    @Override
    public List<Venta> findAll() {

        return ventaRepository.findAll();
    }

    @Override
    public Venta findById(Long id) {

        return ventaRepository.findById(id).orElse(null);
    }

    @Override
    public Venta save(Venta venta) {

        return ventaRepository.save(venta);
    }

    @Override
    public void delete(Long id) {
        ventaRepository.deleteById(id);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Venta> obtenerVentasConClientes(Long idEmpleado) {
        return List.of();
    }

    @Override
    public List<Venta> ventasPorEmpleadoYFecha(Long idEmpleado, LocalDate fechaInicio, LocalDate fechaFin) {
        return List.of();
    }
}
