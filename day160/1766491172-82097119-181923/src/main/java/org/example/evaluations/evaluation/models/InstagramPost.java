package org.example.evaluations.evaluation.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.UUID;

@Entity
public class InstagramPost {
    @Id
    private UUID id;
    @ManyToOne
    @JoinColumn(name = "instagram_page_id")
    private InstagramPage instagramPage;
    @OneToMany(mappedBy = "post")
    private List<InstagramLike> instagramLikes;
    @OneToMany(mappedBy = "post")
    private List<InstagramComment> instagramComments;

    private String content;
}

