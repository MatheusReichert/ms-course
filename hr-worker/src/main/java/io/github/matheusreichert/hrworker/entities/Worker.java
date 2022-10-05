package io.github.matheusreichert.hrworker.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;
// JPA
@Entity @Table(name = "tb_worker")
//Lommbok
@Data @NoArgsConstructor
public final class Worker implements Serializable {
    @Serial
    private static final long serialVersionUID = 0L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    private Long id;
    private String name;
    private Double dailyIncome;

}
