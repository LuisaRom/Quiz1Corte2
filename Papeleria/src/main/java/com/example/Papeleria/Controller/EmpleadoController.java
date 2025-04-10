package com.example.Papeleria.Controller;

import com.example.Papeleria.Model.Empleado;
import com.example.Papeleria.Service.EmpleadoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empleados")
public class EmpleadoController {
    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping
    public List<Empleado> getAll() {
        return empleadoService.findAll();
    }

    @GetMapping("/{id}")
    public Empleado getById(@PathVariable Long id) {
        return empleadoService.findById(id);
    }

    @PostMapping
    public Empleado save(@RequestBody Empleado empleado) {
        return empleadoService.save(empleado);
    }

    @PutMapping("/{id}")
    public Empleado update(@PathVariable Long id, @RequestBody Empleado empleado) {
        empleado.setId_empleado(Math.toIntExact(id));
        return empleadoService.save(empleado);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        empleadoService.deleteById(id);
    }
}