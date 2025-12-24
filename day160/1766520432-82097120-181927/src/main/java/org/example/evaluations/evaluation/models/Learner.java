package org.example.evaluations.evaluation.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Data
public class Learner {
    @Id
    private UUID id;

    private String name;

    private String email;
    // MANY learners → ONE current batch
    @ManyToOne
    @JoinColumn(name = "current_batch_id")
    private Batch currentBatch;
    // MANY learners ↔ MANY batches (history)
    @ManyToMany
    @JoinTable(
            name = "learners_previous_batches",
            joinColumns = @JoinColumn(name = "learner_id"),
            inverseJoinColumns = @JoinColumn(name = "batch_id")
    )
    private Set<Batch> previousBatches=new HashSet<>();
}
