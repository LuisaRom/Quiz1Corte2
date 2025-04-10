package com.example.Papeleria.Controller;

import com.example.Papeleria.Model.DetalleVenta;
import com.example.Papeleria.Service.DetalleVentaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/detalles")
public class DetalleVentaController {

    private final DetalleVentaService detalleService;

    public DetalleVentaController(DetalleVentaService detalleService) {
        this.detalleService = detalleService;
    }

    @GetMapping
    public List<DetalleVenta> getAll() {
        return detalleService.findAll();
    }

    @GetMapping("/{id}")
    public DetalleVenta getById(@PathVariable Integer id) {
        return detalleService.findById(id);
    }

    @PostMapping
    public DetalleVenta save(@RequestBody DetalleVenta detalle) {
        return detalleService.save(detalle);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        detalleService.delete(id);
    }
}
