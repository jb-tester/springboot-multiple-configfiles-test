package com.mytests.springboot.projectwithmultipleconfigfiles;

import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean6;
import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean7;
import com.mytests.springboot.projectwithmultipleconfigfiles.services.ProfileSpecificService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * *
 * <p>Created by irina on 10/22/2021.</p>
 * <p>Project: springboot-multiple-configfiles-test</p>
 * *
 */
@Service
public class AllPropertiesVersusActiveProfileSpecific {
    // check that active profile-specific properties file overrides all other files
    // set the 'foo' profile to check

    @Autowired(required = false)
    private BundleBean7 bundleBean7; // should be available only if 'foo' profile is NOT set https://youtrack.jetbrains.com/issue/IDEA-281058

    @Autowired
    private Environment environment;

    @Autowired
    private ProfileSpecificService profileSpecificService;



    public void test() {
        System.out.println("Check that the bean is available for autowiring ONLY if specific profile ('foo') is NOT set \n" +
                "since the property with not matching value is defined \n" +
                "in the active profile's specific configuration file that overrides all other configs\n" +
                "and is available with no or different profiles set");
        System.out.println(profileSpecificService.getId());
        System.out.println("active profiles: "+ Arrays.toString(environment.getActiveProfiles()));
        System.out.println("myconditions.condition7 property value: "+environment.getProperty("myconditions.condition7"));
        System.out.println("bundleBean6 available: "+bundleBean7);
        System.out.println("-----------------");
    }
}
