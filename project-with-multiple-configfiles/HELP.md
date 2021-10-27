https://youtrack.jetbrains.com/issue/IDEA-180498

profile-specific files (both yaml and properties):
  - only active profile-specific config is used, the properties from not active profiles-specific files are not considered: ok
  - the property defined in active profile-specific properties file should take precedence over all other configs: 
         precedence is not checked. https://youtrack.jetbrains.com/issue/IDEA-281058
  - the property defined in active profile-specific yaml file ??

application-default.* file for default profiles:
   - default profile config should override all others if no active profiles are set:
     https://youtrack.jetbrains.com/issue/IDEA-281357

multiple files:
- both application.yaml and application.properties: 
  both recognized, precedence is not checked https://youtrack.jetbrains.com/issue/IDEA-281022
- both application.yaml and application.yml:
  both recognized. 
- extra config/application.* file:
    recognized, precedence is not checked https://youtrack.jetbrains.com/issue/IDEA-280929
- spring.config.additional-location; (add manually to SB fileset)
    recognized , precedence is not checked https://youtrack.jetbrains.com/issue/IDEA-281010
- spring.config.import:
    recognized, precedence is checked

custom:
- spring.config.location - ok

check precedence for all variants

