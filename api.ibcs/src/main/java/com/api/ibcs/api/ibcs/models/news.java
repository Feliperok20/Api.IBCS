package com.api.ibcs.api.ibcs.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

import javax.validation.constraints.NotEmpty;

@Entity
public class news {

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
    private String text;

    @Getter
    @Setter
    private String image;


    public news(){

    }

    public news(String title, String text, String image){
        this.title = title;
        this.text = text;
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        news that = (news) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
}
