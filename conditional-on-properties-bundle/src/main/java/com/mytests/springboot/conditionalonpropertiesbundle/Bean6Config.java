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
@ConditionalOnProperty(name = "myconditions.condition6", matchIfMissing = false)
public class Bean6Config {
    @Bean
    public BundleBean6 bundleBean6() {
        return new BundleBean6();
    }
}
