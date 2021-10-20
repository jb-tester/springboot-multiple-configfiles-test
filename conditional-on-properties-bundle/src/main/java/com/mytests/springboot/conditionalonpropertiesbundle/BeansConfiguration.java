package com.mytests.springboot.conditionalonpropertiesbundle;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 20.10.2021.</p>
 * <p>Project: springboot-multiple-configfiles-test</p>
 * *
 */
@Configuration
@ConfigurationPropertiesScan
public class BeansConfiguration {

    @Bean
    @ConditionalOnProperty(name = "myconditions.condition0", havingValue = "main_app_properties_c0")
    public BundleBean0 bundleBean0() {
        return new BundleBean0();
    }
}
