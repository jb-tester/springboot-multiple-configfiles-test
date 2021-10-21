package com.mytests.springboot.projectwithmultipleconfigfiles;

import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean0;
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
public class MainAppPropertiesVersusExtraAppProperties {
    // Check the property key defined both in
    // application.properties and 
    // config/application.properties
    // matching value is provided in application.properties
    //  not matching value is provided in config/application.properties
    @Autowired(required = false)
    private BundleBean0 bundleBean0;
    @Autowired
    private Environment environment;

    public void test() {
        System.out.println("Check the property key defined both in application.properties and config/application" +
                ".properties:");
        System.out.println("property value: "+environment.getProperty("myconditions.condition0"));
        if (bundleBean0 != null) {
            System.out.println("bundleBean0 is available");
            System.out.println("check that it is shown as available for autowiring");
        } else {
            System.out.println("bundleBean0 conditions don't match");
            System.out.println("check that it is shown as not available for autowiring");
        }
        System.out.println("-----------------");
    }
}
