package com.example.Papeleria.Service.ServiceImpl;

import com.example.Papeleria.Model.Producto;
import com.example.Papeleria.Model.Proveedor;
import com.example.Papeleria.Repository.ProveedorRepository;
import com.example.Papeleria.Service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorRepository proveedorRepository;

    @Override
    public List<Proveedor> findAll() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedor findById(Long id) {
        return proveedorRepository.findById(id).orElse(null);
    }

    @Override
    public Proveedor save(Proveedor proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public void delete(Long id) {
        proveedorRepository.deleteById(id);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<Producto> obtenerProductosPorProveedor(Long idProveedor) {
        return List.of();
    }
}

