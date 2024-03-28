package com.spjap.controller;


import com.spjap.model.Cliente;
import com.spjap.model.Prestamo;
import com.spjap.service.IClienteService;
import com.spjap.service.IPrestamoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequiredArgsConstructor
@RestController //Decir que esta clase es administrada o controlada por SPRING
@RequestMapping("/prestamos") //Agregar una ruta para mi clase
public class PrestamoController {

    //ResponseEntity nos sirven para dar respuesta a peticiones con estas... 200 404, 500


    private final IPrestamoService iPrestamoService;


    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> getPrestamoById(@PathVariable Long id) {
        Prestamo prestamo = iPrestamoService.getPrestamoById(id);
        return ResponseEntity.ok(prestamo);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<Prestamo> createPrestamo(@RequestBody Prestamo prestamo) {
        Prestamo createdPrestamo =iPrestamoService.createPrestamo(prestamo);
        return new ResponseEntity<>(createdPrestamo, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Prestamo> updatePrestamo( @RequestBody Prestamo prestamo) {
        Prestamo updatedPrestamo = iPrestamoService.updatePrestamo(prestamo);
        return ResponseEntity.ok(updatedPrestamo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePrestamo(@PathVariable Long id) {
        iPrestamoService.deletePrestamo(id);
        return ResponseEntity.noContent().build();
    }


}

