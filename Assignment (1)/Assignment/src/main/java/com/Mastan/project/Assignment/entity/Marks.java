package com.Mastan.project.Assignment.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "marks")
public class Marks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int id;

    private String studentName;
    private String className;
    private String section;

    private Integer english;
    private Integer math;
    private Integer science;
    private Integer history;
    private Integer geography;

    private String additionalNotes;
}
