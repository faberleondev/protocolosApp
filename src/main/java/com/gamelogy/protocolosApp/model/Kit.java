package com.gamelogy.protocolosApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "kit")
public class Kit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String lote;

    @Column(name = "nombre", nullable = false)
    private String nombreKit;

    @Column(name = "tipo")
    private String tipoKit;

    @Column(name = "cantidad")
    private Integer cantidadKit;

    @Column(name = "fecha_vencimiento")
    private LocalDate fechaVencimientoKit;

}
