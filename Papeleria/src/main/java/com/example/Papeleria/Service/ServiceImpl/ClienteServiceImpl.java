package com.example.Papeleria.Service.ServiceImpl;

import com.example.Papeleria.Model.Cliente;
import com.example.Papeleria.Model.DetalleVenta;
import com.example.Papeleria.Repository.ClienteRepository;
import com.example.Papeleria.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }

    @Override
    public void deleteById(Long id) {
        clienteRepository.deleteById(id);

    }

    @Override
    public void guardar(Cliente cliente) {

    }
    @Override
    public List<Cliente> saveAll(List<Cliente> clientes) {
        return clienteRepository.saveAll(clientes);
    }

    @Override
    public List<Cliente> obtenerClientesConDetalles() {
        return List.of();
    }

    @Override
    public List<DetalleVenta> obtenerDetallePorCliente(Long idCliente) {
        return List.of();
    }

}
