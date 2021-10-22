package com.mytests.springboot.conditionalonpropertiesbundle;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *
 * <p>Created by irina on 21.10.2021.</p>
 * <p>Project: springboot-multiple-configfiles-test</p>
 * *
 */
@Configuration
@ConditionalOnProperty(name = "myconditions.condition3", havingValue = "config/application.properties_c3", matchIfMissing = false)
public class Bean3Config {
    @Bean
    public BundleBean3 bundleBean3() {
        return new BundleBean3();
    }
}
