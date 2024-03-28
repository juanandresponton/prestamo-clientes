package com.spjap.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data  // me genera SET and GET
@NoArgsConstructor  // Me genera un constructor sin Argumentos
@AllArgsConstructor // Me genera un constructor Con todos Argumentos
@Entity  // Especifica que esta clase representa un model de la base de datos 'Entidad'
@Table(name = "prestamos")   //Especifica el nombre de la tabla en la base de datos
public class Prestamo {

    @Id  // Especifica que este campo es el ID
    @Column(name = "loan_id") // Especifica el nombre en la base de datos :La Columna:
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Genera solo el ID
    private Long loanId;
    @ManyToOne
    @JoinColumn(name="client_id",nullable = false)
    private Cliente cliente;
    private BigDecimal monto;
    private BigDecimal tasaInteres;
    private Integer plazo;
    private LocalDate fechaInicio;
    private String estado;
}
