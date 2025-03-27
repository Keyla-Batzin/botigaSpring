package com.iticbcn.mywebapp.libresapp.Model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Llibre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_llibre;

    @Column
    private String titol;

    @Column
    private String autor;

    @Column
    private String editorial;

    @Column
    private String isbn;

    @Column(name = "data_publicacio")
    private LocalDate dataPublicacio;

    @Column
    private String tematica;
}
