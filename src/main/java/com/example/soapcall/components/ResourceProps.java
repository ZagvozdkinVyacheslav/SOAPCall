package com.example.soapcall.components;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties(prefix="resource")
public class ResourceProps {

    private String cloudUsername;
    private String cloudPassword;
    private String cloudUrl;
    private Integer loadingStep;

}
