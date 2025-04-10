package com.example.Papeleria.Controller;

import com.example.Papeleria.Model.Venta;
import com.example.Papeleria.Service.VentaService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {
    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @GetMapping
    public List<Venta> getAll() {
        return ventaService.findAll();
    }

    @GetMapping("/{id}")
    public Venta getById(@PathVariable Long id) {
        return ventaService.findById(id);
    }

    @PostMapping
    public Venta save(@RequestBody Venta venta) {
        return ventaService.save(venta);
    }

    @PutMapping("/{id}")
    public Venta update(@PathVariable Long id, @RequestBody Venta venta) {
        venta.setId_venta(Math.toIntExact(id));
        return ventaService.save(venta);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        ventaService.deleteById(id);
    }

    @GetMapping("/empleado/{idEmpleado}/clientes")
    public List<Venta> obtenerVentasConClientes(@PathVariable Long idEmpleado) {
        return ventaService.obtenerVentasConClientes(idEmpleado);
    }

    @GetMapping("/empleado/{idEmpleado}")
    public List<Venta> ventasPorEmpleadoYFecha(
            @PathVariable Long idEmpleado,
            @RequestParam("fechaInicio") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaInicio,
            @RequestParam("fechaFin") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaFin
    ) {
        return ventaService.ventasPorEmpleadoYFecha(idEmpleado, fechaInicio, fechaFin);
    }


}
