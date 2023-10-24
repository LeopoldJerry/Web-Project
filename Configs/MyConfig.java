package Configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.vasilyev.egor.Entities.Cat;
import ru.vasilyev.egor.Entities.Dog;
import ru.vasilyev.egor.Entities.Parrot;

@Configuration
public class MyConfig {
    @Bean
    public Cat getCat(){
        return new Cat();
    }
    @Bean
    public Dog dog(){
        return new Dog();
    }
    @Bean("parrot-kesha")
    public Parrot getParrot(){
        return new Parrot();
    }
}
