package com.example.soapcall.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import wsdl.GetDocumentResponse;

import javax.xml.ws.Holder;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class FileSystemTest {
    @Autowired
    FileSystem fileSystem;
    @Test
    void createFile() throws IOException {
        File file = fileSystem.createFile("C://Users//zagvo//Downloads", "test.txt");
        fileSystem.writeInFile(file,"testData");
        assertTrue(file.getName().equals("test.txt") && file.getPath().equals("C:\\Users\\zagvo\\Downloads\\test.txt"));
    }

    @Test
    void pojoToJsonFile() throws IOException {
        Holder<GetDocumentResponse.Properties> prop = new Holder<>();
        fileSystem.pojoToJsonFile("C://Users//zagvo//Downloads", "testJson.json",prop);
        File f = new File("C://Users//zagvo//Downloads");
        File[] matchingFiles = f.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith("testJson") && name.endsWith("json");
            }
        });
        assertTrue(matchingFiles.length == 1);
    }



}