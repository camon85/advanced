package hello.advanced;

import hello.advanced.trace.logtrae.LogTrace;
import hello.advanced.trace.logtrae.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
//        return new FieldLogTrace();
    }
}
