package com.educationloan.document.globalExceptionHandling;

import com.educationloan.document.dto.ApiErrorResponseDTO.ApiErrorResponse;
import com.educationloan.document.globalExceptionHandling.CustomException.InvalidFileException;
import com.educationloan.document.globalExceptionHandling.CustomException.S3UploadException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {
    private ResponseEntity<ApiErrorResponse> buildResponse(String message, HttpStatus status) {
        return ResponseEntity.status(status).body(
                ApiErrorResponse.builder()
                        .timestamp(Instant.now())
                        .status(status.value())
                        .error(status.getReasonPhrase())
                        .message(message)
                        .build()
        );
    }

    @ExceptionHandler(InvalidFileException.class)
    public ResponseEntity<ApiErrorResponse> handleInvalidFile(InvalidFileException ex) {
        return buildResponse(ex.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(S3UploadException.class)
    public ResponseEntity<ApiErrorResponse> handleS3Upload(S3UploadException ex) {
        return buildResponse(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}



