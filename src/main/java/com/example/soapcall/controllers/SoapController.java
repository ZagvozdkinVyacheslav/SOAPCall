package com.example.soapcall.controllers;



import com.example.soapcall.services.FileSystem;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import wsdl.CustomWebServiceImpl;
import wsdl.ErrorMessageExceptionException;
import wsdl.GetDocumentRequest;
import wsdl.GetDocumentResponse;
import javax.activation.DataHandler;
import javax.xml.ws.Holder;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;


@RestController
@RequiredArgsConstructor
public class SoapController {
    @Autowired
    private CustomWebServiceImpl customWebService;
    @Autowired
    private FileSystem fileSystem;

    @GetMapping(value = "/documents")
    public ResponseEntity<Object> get(@RequestParam String uuid,@RequestParam String filePath) throws ErrorMessageExceptionException, IOException {
        Holder<DataHandler> holder = new Holder<>();
        Holder<GetDocumentResponse.Properties> propertiesHolder = new Holder<>();

        customWebService.getDocument(uuid, holder, propertiesHolder);//"B77322C0-F32F-4BEF-B345-BB9D0754D5EF"
        GetDocumentRequest getDocumentRequest =  new GetDocumentRequest();
        getDocumentRequest.setDocumentId(uuid);

        File fileData = fileSystem.createFile(filePath, "data.txt");//"C://Users//zagvo//Downloads"
        fileSystem.writeInFile(fileData, Arrays.toString(customWebService.getDocumentData(getDocumentRequest)));

        fileSystem.pojoToJsonFile(filePath, "Properties.json",propertiesHolder);
        return new ResponseEntity<>("Документ успешно получен" ,HttpStatus.OK);
    }
}
