package com.springAnno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by Kuldeep.Kumar on 22/03/2017.
 */
/*@Configuration
public class Config {
    @Bean
    public Knight getKnight(){
        return new BraveKnight(getPrincessQuest());
//        return new BraveKnight(GetDragonQuest());
    }
    @Bean
    public Quest GetDragonQuest(){
        return new DragonSlayingQuest();
    }
    @Bean
    public Quest getPrincessQuest(){
        return new PrincessRescuingQuest();
    }
}*/

@Configuration
@ComponentScan  // Can specify package name

public class Config {

}