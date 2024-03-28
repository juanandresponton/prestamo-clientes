package com.spjap.service;

import com.spjap.model.Cliente;
import com.spjap.model.Prestamo;
// public PrestamoService registar(Prestamo);
public interface IPrestamoService {


    Prestamo  getPrestamoById(Long id);

    Prestamo createPrestamo(Prestamo prestamo);

    Prestamo updatePrestamo(Prestamo prestamo);

    void deletePrestamo(Long id);
}
