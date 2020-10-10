package ssl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ssl.Foo;

@Configuration
public class DgraphConfig {

  @Bean
  Foo foo() {
    return new Foo();
  }

}
