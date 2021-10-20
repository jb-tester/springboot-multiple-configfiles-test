package com.mytests.springboot.conditionalonpropertiesbundle;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * *
 * <p>Created by irina on 20.10.2021.</p>
 * <p>Project: springboot-multiple-configfiles-test</p>
 * *
 */
@ConfigurationProperties("myconditions")
public class BundleConfigProperties {
    String condition0;

    public String getCondition0() {
        return condition0;
    }

    public void setCondition0(String condition0) {
        this.condition0 = condition0;
    }
}
