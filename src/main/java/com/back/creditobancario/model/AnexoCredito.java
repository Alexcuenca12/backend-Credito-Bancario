package com.back.creditobancario.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "anexocredito")
public class AnexoCredito  implements Serializable {

    private static final long serialVersionUID = 1L;

    //id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "anexoCreID")
    private Long anexoCre_id;


}
