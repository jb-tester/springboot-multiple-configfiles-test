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
@ConditionalOnProperty(name = "myconditions.condition8", havingValue = "any_except_application-default.yaml_c8", matchIfMissing = false)
public class Bean8Config {
    @Bean
    public BundleBean8 bundleBean8() {
        return new BundleBean8();
    }
}
