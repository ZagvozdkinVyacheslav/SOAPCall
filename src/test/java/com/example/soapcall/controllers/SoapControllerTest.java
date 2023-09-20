package com.example.soapcall.controllers;

import com.example.soapcall.services.FileSystem;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import wsdl.ErrorMessageExceptionException;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIOException;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class SoapControllerTest {
    @Autowired
    SoapController controller;


    @Test
    void getDocNotFind() {
        try {
            controller.get("B","C://Users//zagvo//Downloads");
        } catch (ErrorMessageExceptionException e) {
            assertTrue(true);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void getPathExc() {
        try {
            controller.get("B77322C0-F32F-4BEF-B345-BB9D0754D5EF","C://Users//zagvo//Downloads//Test");
        } catch (ErrorMessageExceptionException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            assertTrue(true);

        }
    }

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}