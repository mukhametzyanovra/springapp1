package org.example.springcourse;

import org.springframework.context.annotation.Bean;

public class RapMusic implements Music {
    @Bean
    @Override
    public String getSong() {
        return "Танцуй сама";
    }
}
