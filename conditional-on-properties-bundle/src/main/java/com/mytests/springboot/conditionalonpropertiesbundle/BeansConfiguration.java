package com.mytests.springboot.conditionalonpropertiesbundle;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 20.10.2021.</p>
 * <p>Project: springboot-multiple-configfiles-test</p>
 * *
 */
@Configuration
@ConfigurationPropertiesScan
@ComponentScan
public class BeansConfiguration {

    
}
