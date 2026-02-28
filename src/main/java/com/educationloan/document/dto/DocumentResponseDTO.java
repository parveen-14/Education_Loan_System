package com.educationloan.document.dto;

import com.educationloan.document.enumConst.DocumentStatus;
import com.educationloan.document.enumConst.DocumentType;
import com.educationloan.document.enumConst.OwnerType;
import lombok.Getter;
import lombok.Setter;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
public class DocumentResponseDTO {

    private UUID id;
    private String filename;
    private String s3Key;
    private String contentType;
    private Long fileSize;
    private DocumentType docType;
    private DocumentStatus status;
    private OwnerType ownerType;
    private Instant uploadedAt;
}