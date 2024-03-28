package com.spjap.service;

import com.spjap.model.Cliente;
import com.spjap.model.Prestamo;
import com.spjap.repository.ClienteRepository;
import com.spjap.repository.PrestamoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrestamoService implements IPrestamoService {

    private final PrestamoRepository prestamoRepository;

    //@Override
    //public Prestamo registrar(Prestamo prestamo) { return null;}


    @Override
    public Prestamo getPrestamoById(Long id) {

        return prestamoRepository.getReferenceById(id);
    }

    @Override
    public Prestamo createPrestamo(Prestamo prestamo) {

        return prestamoRepository.save(prestamo);
    }

    @Override
    public Prestamo updatePrestamo(Prestamo prestamo) {
        return prestamoRepository.save(prestamo);
    }

    @Override
    public void deletePrestamo(Long id) {prestamoRepository.deleteById(id);
    }
}

