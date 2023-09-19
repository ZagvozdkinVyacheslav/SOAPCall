package com.example.soapcall;


import com.wsdl.CustomWebService;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.WebServiceFeature;

@SpringBootApplication
public class SoapCallApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapCallApplication.class, args);

	}

}
