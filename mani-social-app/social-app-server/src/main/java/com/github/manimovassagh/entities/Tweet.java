package com.github.manimovassagh.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.ejb.Local;
import jakarta.persistence.Entity;
import jakarta.persistence.PrePersist;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Tweet extends PanacheEntity {

    public String tweet;
    public String username;
    public LocalDate createdDate;


    @PrePersist
    public void addDate() {
        this.createdDate = LocalDate.now();
    }
}
