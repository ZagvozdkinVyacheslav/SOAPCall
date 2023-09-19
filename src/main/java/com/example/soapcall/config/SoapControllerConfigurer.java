package com.example.soapcall.config;

import com.example.soapcall.components.ResourceProps;
import com.wsdl.CustomWebService;
import com.wsdl.CustomWebServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.bind.DatatypeConverter;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class SoapControllerConfigurer {
    private final ResourceProps resourceProps;

    @Bean
    public CustomWebServiceImpl soapCloudService(){
        CustomWebService customWebService = new CustomWebService();//new URL("https://doc-upload2-stage.mos.ru/adapters/CustomWebService2?wsdl")

        CustomWebServiceImpl soapService = customWebService.getAdaptersWebServicePort();
        Map<String, List<String>> requestHeaders = new HashMap<>();

        String user = resourceProps.getCloudUsername();
        String pw = resourceProps.getCloudPassword();

        StringBuilder buf = new StringBuilder(user);
        buf.append(":");
        buf.append(pw);
        String creds = DatatypeConverter.printBase64Binary(buf.toString().getBytes());
        requestHeaders.put("Authorization", Collections.singletonList("Basic " + creds));

        BindingProvider bindingProvider = (BindingProvider)soapService;
        bindingProvider.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, resourceProps.getCloudUrl());

        return soapService;
    }
}
