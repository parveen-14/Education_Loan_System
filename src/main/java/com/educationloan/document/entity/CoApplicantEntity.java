package com.educationloan.document.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "co_applicant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CoApplicantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id")
    private StudentEntity student;

    @OneToMany(mappedBy = "coApplicant", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DocumentEntity> documents;
}

