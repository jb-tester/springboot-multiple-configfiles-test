package com.mytests.springboot.projectwithmultipleconfigfiles;

import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean4;
import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean5;
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
public class MainAppVersusImportedConfig {
    //
    // Check the property key defined both in
    // imported/imported_config.yaml imported using spring.config.import=imported/imported_config.yaml
    // and application.yaml
    // matching value is provided in application.yaml
    // not matching value is provided in imported/imported_config.yaml

    // Check the property key defined both in
    // imported/imported_config.properties imported using spring.config.import=imported/imported_config.properties
    // and application.properties
    // matching value is provided in application.properties
    // not matching value is provided in imported/imported_config.properties
    @Autowired(required = false)
    private BundleBean4 bundleBean4; // should not be available!
    @Autowired(required = false)
    private BundleBean5 bundleBean5; // should not be available!
    @Autowired
    private Environment environment;

    public void test() {
        System.out.println("Check the property key defined both in application.yaml and imported/imported_config.yaml:");
        System.out.println("property value: "+environment.getProperty("myconditions.condition4"));
        if (bundleBean4 != null) {
            System.out.println("bundleBean4 is available");
            System.out.println("check that it is shown as available for autowiring");
        } else {
            System.out.println("bundleBean4 conditions don't match");
            System.out.println("check that it is shown as not available for autowiring");
        }
        System.out.println("Check the property key defined both in application.properties and imported/imported_config.properties:");
        System.out.println("property value: "+environment.getProperty("myconditions.condition5"));
        if (bundleBean5 != null) {
            System.out.println("bundleBean5 is available");
            System.out.println("check that it is shown as available for autowiring");
        } else {
            System.out.println("bundleBean5 conditions don't match");
            System.out.println("check that it is shown as not available for autowiring");
        }
        System.out.println("-----------------");
    }
}
