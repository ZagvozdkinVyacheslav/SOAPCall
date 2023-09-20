package com.example.soapcall.config;



import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import wsdl.CustomWebService;
import wsdl.CustomWebServiceImpl;

import javax.xml.bind.DatatypeConverter;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
@RequiredArgsConstructor
public class SoapControllerConfigurer {

    private final String cloudUser = "etpmv_gu_docs";
    private final String cloudPassword = "zC8bUie933YVKkxcgeqM";

    private final String cloudUrl = "https://doc-upload2-stage.mos.ru/adapters/CustomWebService2";

    @Bean
    public CustomWebServiceImpl soapCloudService() {
        CustomWebService customWebService = new CustomWebService();
        CustomWebServiceImpl soapService = customWebService.getAdaptersWebServicePort();
        Map<String, List<String>> requestHeaders = new HashMap<>();

        StringBuilder buf = new StringBuilder(cloudUser);
        buf.append(":");
        buf.append(cloudPassword);
        String creds = DatatypeConverter.printBase64Binary(buf.toString().getBytes());
        requestHeaders.put("Authorization", Collections.singletonList("Basic " + creds));

        BindingProvider bindingProvider = (BindingProvider) soapService;
        bindingProvider.getRequestContext().put(MessageContext.HTTP_REQUEST_HEADERS, requestHeaders);
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, cloudUrl);

        return soapService;
    }
}
