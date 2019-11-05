package de.adorsys.keymanagement.keyrotation.config.properties;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConditionalOnProperty("rotation.jdbc.keystore-id")
@ConfigurationProperties(prefix = "rotation.jdbc")
public class JdbcRotationProperties {

    private String keystoreId;
    private String lockTable;
    private String keystoreTable;
}
