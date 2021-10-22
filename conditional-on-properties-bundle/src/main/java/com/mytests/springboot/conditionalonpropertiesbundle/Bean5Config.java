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
@ConditionalOnProperty(name = "myconditions.condition5", havingValue = "main_app_properties_c5", matchIfMissing = false)
public class Bean5Config {
    @Bean
    public BundleBean5 bundleBean5() {
        return new BundleBean5();
    }
}
