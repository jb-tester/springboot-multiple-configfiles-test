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
@ConditionalOnProperty(name = "myconditions.condition7", havingValue = "any_except_application-foo_properties_c7", matchIfMissing = false)
public class Bean7Config {
    @Bean
    public BundleBean7 bundleBean7() {
        return new BundleBean7();
    }
}
