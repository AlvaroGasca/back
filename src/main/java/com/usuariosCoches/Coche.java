/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usuariosCoches;
import com.usuariosCoches.usuario.Usuario;
import java.io.Serializable;
import javax.persistence. Column; 
import javax.persistence.Entity;
import javax.persistence. GeneratedValue; 
import javax.persistence. GenerationType;
import javax.persistence. Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok. Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author alvarogasca
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "coches")
public class Coche implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    @Column(name = "modelo")
    private String modelo;

    @Column(name = "annos")
    private Integer annos;

    @Column(name = "matricula")
    private String matricula;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    
    
}
