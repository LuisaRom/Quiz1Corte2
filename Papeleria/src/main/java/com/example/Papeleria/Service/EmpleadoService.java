package com.example.Papeleria.Service;

import com.example.Papeleria.Model.Empleado;

import java.util.List;

public interface EmpleadoService {
    List<Empleado> findAll();
    Empleado findById(Long id);
    Empleado save(Empleado empleado);
    void delete(Long id);

    void deleteById(Long id);
}
