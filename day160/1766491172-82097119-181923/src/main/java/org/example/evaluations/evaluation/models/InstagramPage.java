package org.example.evaluations.evaluation.models;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
public class InstagramPage {
    @Id
    private UUID id;
    @OneToMany(mappedBy = "instagramPage")
    private Set<InstagramPost> posts = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "creater_id")
    private InstagramUser creator;
}

