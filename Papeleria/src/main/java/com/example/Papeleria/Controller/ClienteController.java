package com.example.Papeleria.Controller;

import com.example.Papeleria.Model.Cliente;
import com.example.Papeleria.Model.DetalleVenta;
import com.example.Papeleria.Service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<Cliente> getAll() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public Cliente getById(@PathVariable Long id) {
        return clienteService.findById(id);
    }

    @PostMapping("/clientes")
    public ResponseEntity<?> crearClientes(@RequestBody List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            clienteService.guardar(cliente);
        }
        return ResponseEntity.ok("Clientes creados exitosamente");
    }


    @PutMapping("/{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente cliente) {
        cliente.setId_cliente(Math.toIntExact(id));
        return clienteService.save(cliente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clienteService.deleteById(id);
    }

    @PostMapping("/batch")
    public List<Cliente> saveAll(@RequestBody List<Cliente> clientes) {
        return clienteService.saveAll(clientes);
    }

    @GetMapping("/detalles-venta")
    public List<Cliente> obtenerClientesConDetalles() {
        return clienteService.obtenerClientesConDetalles();
    }

    @GetMapping("/{idCliente}/detalleventa")
    public List<DetalleVenta> obtenerDetallePorCliente(@PathVariable Long idCliente) {
        return clienteService.obtenerDetallePorCliente(idCliente);
    }



}
