package com.springAnno;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by Kuldeep.Kumar on 22/03/2017.
 */
/*public class DragonSlayingQuest implements  Quest {
    @Override
    public void embark(){
        System.out.println("Embarking on a quest to say a big evil dragon");
    }
}*/

@Component
//@Primary
public class DragonSlayingQuest implements  Quest {
    @Override
    public void embark(){
        System.out.println("Embarking on a quest to say a big evil dragon");
    }
}