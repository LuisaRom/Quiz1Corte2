package com.example.Papeleria.Service;

import com.example.Papeleria.Model.Cliente;
import com.example.Papeleria.Model.DetalleVenta;

import java.util.List;

public interface ClienteService {
    List<Cliente> findAll();
    Cliente findById(Long id);
    Cliente save(Cliente cliente);
    void delete(Long id);
    void deleteById(Long id);
    void guardar(Cliente cliente);
    List<Cliente> saveAll(List<Cliente> clientes);
    List<Cliente> obtenerClientesConDetalles();
    List<DetalleVenta> obtenerDetallePorCliente(Long idCliente);
}
