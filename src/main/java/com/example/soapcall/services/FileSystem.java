package com.example.soapcall.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import wsdl.GetDocumentResponse;

import javax.xml.ws.Holder;
import java.io.*;

@Service
public class FileSystem {

    public File createFile(String filePath, String name){
        File file = new File(filePath, name);
        return file;
    }
    public void writeInFile(File file,String data) throws IOException {
        FileOutputStream out = new FileOutputStream(file);
        out.write(data.getBytes());
        out.close();
    }
    public void pojoToJsonFile(String filePath, String name, Holder<GetDocumentResponse.Properties> propertiesHolder) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(createFile(filePath, name), propertiesHolder.value);
    }
}
