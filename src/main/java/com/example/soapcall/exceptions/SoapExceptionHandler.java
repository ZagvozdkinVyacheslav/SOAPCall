package com.example.soapcall.exceptions;

import com.example.soapcall.services.FileSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import wsdl.ErrorMessageExceptionException;

import java.io.IOException;

@RestControllerAdvice
public class SoapExceptionHandler {
    @ExceptionHandler(value = MissingServletRequestParameterException.class)
    public ResponseEntity<Object> handleMissingParamExc(MissingServletRequestParameterException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.valueOf(400));
    }
    @ExceptionHandler(value = IOException.class)
    public ResponseEntity<Object> handleFileExc(IOException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.valueOf(500));
    }
    @ExceptionHandler(value = IllegalStateException.class)
    public ResponseEntity<Object> handlePathExc(IllegalStateException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.valueOf(400));
    }
    @ExceptionHandler(value = IllegalArgumentException.class)
    public ResponseEntity<Object> handlePathExc(IllegalArgumentException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.valueOf(400));
    }
    @ExceptionHandler(value = ErrorMessageExceptionException.class)
    public ResponseEntity<Object> handleGeneratedFilesExc(ErrorMessageExceptionException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.valueOf(500));
    }
}
