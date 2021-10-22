https://youtrack.jetbrains.com/issue/IDEA-180498

profile-specific files (both yaml and properties);
application-default.* file for default profiles;

multiple files:
- both application.yaml and application.properties: 
  both recognized, precedence is not checked https://youtrack.jetbrains.com/issue/IDEA-281022
- both application.yaml and application.yml:
  both recognized. 
- extra config/application.* file:
    recognized, precedence is not checked https://youtrack.jetbrains.com/issue/IDEA-280929
- spring.config.additional-location; (add manually to SB fileset)
    recognized , precedence is not checked https://youtrack.jetbrains.com/issue/IDEA-281010
spring.config.import;

custom:
- spring.config.location - ok

check precedence for all variants

