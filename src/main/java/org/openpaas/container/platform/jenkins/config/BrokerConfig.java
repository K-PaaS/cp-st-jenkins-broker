package org.openpaas.container.platform.jenkins.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Configuration
@EnableJpaRepositories("org.openpaas.container.platform.jenkins.repo")
@EntityScan(value = "org.openpaas.container.platform.jenkins.model")
@ComponentScan(basePackages = {"org.openpaas.container.platform.jenkins","org.openpaas.servicebroker"})
public class BrokerConfig {
}
