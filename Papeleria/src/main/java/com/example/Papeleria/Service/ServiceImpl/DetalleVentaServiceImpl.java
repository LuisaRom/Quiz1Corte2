package com.example.Papeleria.Service.ServiceImpl;

import com.example.Papeleria.Model.DetalleVenta;
import com.example.Papeleria.Repository.DetalleVentaRepository;
import com.example.Papeleria.Service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService {

    @Autowired
    private DetalleVentaRepository detalleVentaRepository;

    @Override
    public List<DetalleVenta> findAll() {
        return detalleVentaRepository.findAll();
    }

    @Override
    public DetalleVenta findById(Integer id) {
        return detalleVentaRepository.findById(id).orElse(null);
    }

    @Override
    public DetalleVenta save(DetalleVenta detalleVenta) {
        return detalleVentaRepository.save(detalleVenta);
    }

    @Override
    public void delete(Integer id) {
        detalleVentaRepository.deleteById(id);
    }
}

