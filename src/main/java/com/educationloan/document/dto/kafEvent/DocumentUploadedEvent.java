package com.educationloan.document.dto.kafEvent;

import com.educationloan.document.enumConst.DocumentStatus;
import com.educationloan.document.enumConst.DocumentType;
import com.educationloan.document.enumConst.OwnerType;
import lombok.*;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentUploadedEvent {

    private UUID documentId;
    private OwnerType ownerType;
    private String ownerId;
    private long loanId;
    private DocumentType docType;
    private String filename;
    private String s3Key;
    private Long fileSize;
    private String contentType;
    private DocumentStatus status;
    private Instant uploadedAt;
}
