package com.api.ibcs.api.ibcs.models;

import javax.validation.constraints.NotEmpty;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "Preenchimento obrigatório!")
    @Getter
    @Setter
    private String title;

    @NotEmpty(message = "Preenchimento obrigatório!")
    @Getter
    @Setter
    private String subTitle;

    @NotEmpty(message = "Preenchimento obrigatório!")
    @Getter
    @Setter
    private String text;

    @Getter
    @Setter
    private String image;
     
    //falta colocar o parametro de data e hora
}
