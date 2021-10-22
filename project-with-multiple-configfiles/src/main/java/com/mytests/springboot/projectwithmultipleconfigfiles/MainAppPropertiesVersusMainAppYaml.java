package com.mytests.springboot.projectwithmultipleconfigfiles;

import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean0;
import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean2;
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
public class MainAppPropertiesVersusMainAppYaml {
    // https://youtrack.jetbrains.com/issue/IDEA-281022
    // Check the property key defined both in
    // application.properties and 
    // application.yaml
    // matching value is provided in application.yaml
    // not matching value is provided in application.properties
    @Autowired(required = false)
    private BundleBean2 bundleBean2; // should not be available!
    @Autowired
    private Environment environment;

    public void test() {
        System.out.println("Check the property key defined both in application.properties and application.yaml:");
        System.out.println("property value: "+environment.getProperty("myconditions.condition2"));
        if (bundleBean2 != null) {
            System.out.println("bundleBean2 is available");
            System.out.println("check that it is shown as available for autowiring");
        } else {
            System.out.println("bundleBean2 conditions don't match");
            System.out.println("check that it is shown as not available for autowiring");
        }
        System.out.println("-----------------");
    }
}
