https://youtrack.jetbrains.com/issue/IDEA-180498

profile-specific files (both yaml and properties);
application-default.* file for default profiles;

multiple files:
- extra config/application.* file:
    both are recognized, precedence is not checked https://youtrack.jetbrains.com/issue/IDEA-280929
- spring.config.additional-location; (add manually to SB fileset)
    both are recognized , precedence is not checked https://youtrack.jetbrains.com/issue/IDEA-281010
spring.config.import;

custom:
spring.config.location

check precedence for all variants

