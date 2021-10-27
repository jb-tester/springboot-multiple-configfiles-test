package com.mytests.springboot.projectwithmultipleconfigfiles;

import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean6;
import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean8;
import com.mytests.springboot.projectwithmultipleconfigfiles.services.ProfileSpecificService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * *
 * <p>Created by irina on 10/27/2021.</p>
 * <p>Project: springboot-multiple-configfiles-test</p>
 * *
 */
@Service
public class UseDefaultProfileIfNoProfilesAreActive {

    @Autowired(required = false)
    private BundleBean8 bundleBean8; // should not be available if no active profiles are set https://youtrack.jetbrains.com/issue/IDEA-281357

    @Autowired
    private Environment environment;

    @Autowired
    private ProfileSpecificService profileSpecificService;
    public void test() {
        System.out.println("Check that property from default profile has the highest precedence if no active profile is set: \n");
        System.out.println("the property that matches the conditions is available in application.properties and in the profile-specific files, \n");
        System.out.println("but the default profile file that is used when no active profiles are set contains the not matching value");
        System.out.println(profileSpecificService.getId());
        System.out.println("active profiles: "+ Arrays.toString(environment.getActiveProfiles()));
        System.out.println("myconditions.condition8 property value: "+environment.getProperty("myconditions.condition8"));
        System.out.println("bundleBean8 available: "+bundleBean8);
        System.out.println("-----------------");
    }
}
