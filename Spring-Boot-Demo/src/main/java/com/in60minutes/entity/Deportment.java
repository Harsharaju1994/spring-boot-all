package com.in60minutes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Deportment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long deportmentId;
    private String deportmentName;
    private String deportmentCode;
}
