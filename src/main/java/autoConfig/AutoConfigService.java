package autoConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfigService {

    @Bean
    public UuidService uuidService() {
        return new UuidService();
    }
}