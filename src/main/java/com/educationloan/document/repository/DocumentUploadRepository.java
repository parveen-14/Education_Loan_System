package com.educationloan.document.repository;

import com.educationloan.document.entity.DocumentEntity;
import com.educationloan.document.enumConst.OwnerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface DocumentUploadRepository extends JpaRepository<DocumentEntity, UUID> {

    Optional<DocumentEntity> findByIdAndOwnerTypeAndLoanId(UUID id, OwnerType ownerType, Long loanId);

    List<DocumentEntity> findByOwnerTypeAndStudentIdAndLoanId(OwnerType ownerType, Long studentId, Long loanId);

}