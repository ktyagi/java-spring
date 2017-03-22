package com.springAnno;

import org.apache.xpath.SourceTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Kuldeep.Kumar on 22/03/2017.
 */
/*public class BraveKnight implements Knight {
    private Quest quest;
    public BraveKnight(Quest q){
        quest=q;
    }
    @Override
    public void embarkOnQuest(){
//        System.out.println("Embark on quest");
        quest.embark();
    }
}*/

@Component
public class BraveKnight implements Knight {
    @Autowired
//    @Qualifier("dragonSlayingQuest")
    @Qualifier("princessRescuingQuest")
    private Quest quest;
    @Override
    public void embarkOnQuest(){
//        System.out.println("Embark on quest");
        quest.embark();
    }
}