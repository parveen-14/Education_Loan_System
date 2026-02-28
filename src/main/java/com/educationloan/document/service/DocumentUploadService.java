package com.educationloan.document.service;


import com.educationloan.document.dto.DocumentResponseDTO;
import com.educationloan.document.enumConst.DocumentType;
import com.educationloan.document.enumConst.OwnerType;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

public interface DocumentUploadService {

    DocumentResponseDTO uploadDocument(MultipartFile file,
                                       OwnerType ownerType,
                                       String ownerId,
                                       long loanId,
                                       DocumentType docType);
    String getDownloadUrl(UUID documentId, long loanId);
}