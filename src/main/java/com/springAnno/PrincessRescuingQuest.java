package com.springAnno;

import org.apache.xpath.SourceTree;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by Kuldeep.Kumar on 22/03/2017.
 */
/*public class PrincessRescuingQuest implements Quest{
    @Override
    public void embark(){
        System.out.println("Embarking on a quest to rescue a beautiful princess ");


    }
}*/
@Component
//@Primary
public class PrincessRescuingQuest implements Quest{
    @Override
    public void embark(){
        System.out.println("Embarking on a quest to rescue a beautiful princess ");


    }
}