package programmerzamannow.spring.now;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmerzamannow.spring.now.data.Bar;
import programmerzamannow.spring.now.data.Foo;
import programmerzamannow.spring.now.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {

    @Bean
    public Foo foo() {
        return new Foo();
    }

    @Bean
    public Bar bar() {
        return new Bar();
    }

    @Bean
    public FooBar fooBar (Foo foo, Bar bar) {
        return new FooBar(foo, bar);
    }

}
