package com.mytests.springboot.projectwithmultipleconfigfiles;

import com.mytests.springboot.projectwithmultipleconfigfiles.services.ProfileSpecificService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectWithMultipleConfigfilesApplication implements CommandLineRunner {

    @Autowired
    private MainAppPropertiesVersusExtraAppProperties mainAppPropertiesVersusExtraAppProperties;
    @Autowired
    private MainAppPropertiesVersusAdditionalLocationProperties mainAppPropertiesVersusAdditionalLocationProperties;
    @Autowired
    private MainAppPropertiesVersusMainAppYaml mainAppPropertiesVersusMainAppYaml;
    @Autowired
    private ExtraAppPropertiesVersusAdditionalLocationProperties extraAppPropertiesVersusAdditionalLocationProperties;
    @Autowired
    private MainAppVersusImportedConfig mainAppVersusImportedConfig;
    @Autowired
    private UseOnlyActiveProfileConfig useOnlyActiveProfileConfig;

    public static void main(String[] args) {
        SpringApplication.run(ProjectWithMultipleConfigfilesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        mainAppPropertiesVersusExtraAppProperties.test();
        mainAppPropertiesVersusAdditionalLocationProperties.test();
        mainAppPropertiesVersusMainAppYaml.test();
        extraAppPropertiesVersusAdditionalLocationProperties.test();
        mainAppVersusImportedConfig.test();
        useOnlyActiveProfileConfig.test();
    }
}
