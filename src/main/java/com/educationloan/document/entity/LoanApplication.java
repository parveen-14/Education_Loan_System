package com.educationloan.document.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
    @Table(name = "loan_application")
    @Getter
    @Setter
    public class LoanApplication {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private Long studentId;
        private BigDecimal amount;
        private Integer tenureYears;
        private String status;
    }

