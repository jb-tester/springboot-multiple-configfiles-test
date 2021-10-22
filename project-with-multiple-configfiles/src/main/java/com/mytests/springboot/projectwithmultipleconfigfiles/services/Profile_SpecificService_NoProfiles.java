package com.mytests.springboot.projectwithmultipleconfigfiles.services;

import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean6;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * *
 * <p>Created by irina on 10/22/2021.</p>
 * <p>Project: springboot-multiple-configfiles-test</p>
 * *
 */
@Service @Profile({"!foo && !bar"})
public class Profile_SpecificService_NoProfiles implements ProfileSpecificService {

    @Override
    public String getId() {
        return "not foo, not bar";
    }

}
