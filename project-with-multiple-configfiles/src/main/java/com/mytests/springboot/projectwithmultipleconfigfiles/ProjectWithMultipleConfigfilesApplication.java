package com.mytests.springboot.projectwithmultipleconfigfiles;

import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean0;
import com.mytests.springboot.conditionalonpropertiesbundle.BundleBean2;
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

	public static void main(String[] args) {
		SpringApplication.run(ProjectWithMultipleConfigfilesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	mainAppPropertiesVersusExtraAppProperties.test();
	mainAppPropertiesVersusAdditionalLocationProperties.test();
	mainAppPropertiesVersusMainAppYaml.test();
	extraAppPropertiesVersusAdditionalLocationProperties.test();
	}
}
