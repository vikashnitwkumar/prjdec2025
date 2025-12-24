package org.example.evaluations.evaluation.models;


import jakarta.persistence.*;
import org.hibernate.annotations.MapKeyCompositeType;


@Entity

public class TeacherRating {
    @Embedded
    private TeacherRatingId id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    private Student student;


    @ManyToOne
    @MapsId("teacherId")
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    private int rating;
}
