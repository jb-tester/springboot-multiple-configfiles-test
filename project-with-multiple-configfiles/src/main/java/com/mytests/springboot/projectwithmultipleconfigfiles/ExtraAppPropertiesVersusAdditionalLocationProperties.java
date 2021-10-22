package com.mytests.springboot.projectwithmultipleconfigfiles;

import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean1;
import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 21.10.2021.</p>
 * <p>Project: springboot-multiple-configfiles-test</p>
 * *
 */
@Service
public class ExtraAppPropertiesVersusAdditionalLocationProperties {
    //
    // specify spring.config.additional-location=classpath:/additional_config.properties in the SB run configuration
    // and add this file as extra configuration to the SB fileset to test
    // Check the property key defined both in
    // config/application.properties and
    // additional_config.properties defined using spring.config.additional-location
    // matching value is provided in config/application.properties
    //  not matching value is provided in additional_config.properties
    @Autowired(required = false)
    private BundleBean3 bundleBean3; // should not be available
    @Autowired
    private Environment environment;

    public void test() {
        System.out.println("Check the property key defined both in config/application.properties and additional_config.properties" );
        System.out.println("property value: "+environment.getProperty("myconditions.condition3"));
        if (bundleBean3 != null) {
            System.out.println("bundleBean3 is available");
            System.out.println("check that it is shown as available for autowiring");
        } else {
            System.out.println("bundleBean3 conditions don't match");
            System.out.println("check that it is shown as not available for autowiring");
        }
        System.out.println("-----------------");
    }
}
