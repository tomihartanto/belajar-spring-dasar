package programmerzamannow.spring.now;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmerzamannow.spring.now.data.cyclic.CyclicA;
import programmerzamannow.spring.now.data.cyclic.CyclicB;
import programmerzamannow.spring.now.data.cyclic.CyclicC;

@Configuration
public class CyclicConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA) {
        return new CyclicC(cyclicA);
    }

}
