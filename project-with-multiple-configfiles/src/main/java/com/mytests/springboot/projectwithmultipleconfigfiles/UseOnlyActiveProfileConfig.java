package com.mytests.springboot.projectwithmultipleconfigfiles;

import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean6;
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
public class UseOnlyActiveProfileConfig {
    // check that only the property key from the active profile-specific configuration file is considered
    // set the 'foo' profile to check

    @Autowired(required = false)
    private BundleBean6 bean6; // should be available only if 'foo' profile is set

    @Autowired
    private Environment environment;

    @Autowired
    private ProfileSpecificService profileSpecificService;



    public void test() {
        System.out.println("Check that the bean is available for autowiring only if the condition-matching property is defined in the active profile's specific configuration file");
        System.out.println(profileSpecificService.getId());
        System.out.println("active profiles: "+ Arrays.toString(environment.getActiveProfiles()));
        System.out.println("myconditions.condition6 property value: "+environment.getProperty("myconditions.condition6"));
        System.out.println("bundleBean6 available: "+bean6);
        System.out.println("-----------------");
    }
}
