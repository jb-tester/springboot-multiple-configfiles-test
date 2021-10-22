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
@ConditionalOnProperty(name = "myconditions.condition4", havingValue = "application_yaml_c4", matchIfMissing = false)
public class Bean4Config {
    @Bean
    public BundleBean4 bundleBean4() {
        return new BundleBean4();
    }
}
