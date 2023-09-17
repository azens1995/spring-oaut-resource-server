package dev.eklak.springresourceserver.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@Configuration
@EnableResourceServer // Allows spring boot to configure what's required for our app to become resource server
public class ResourceServerConfig {

}
