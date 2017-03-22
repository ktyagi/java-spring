package com.springAnno;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Kuldeep.Kumar on 22/03/2017.
 */
/*public class TestApp {
    public static void main (String[] arg) {
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(Config.class);
        Knight knight = ctx.getBean("getKnight", Knight.class);
        knight.embarkOnQuest();
        //No use just for example
        Quest q =ctx.getBean("getPrincessQuest", Quest.class);
        ctx.close();
    }
}*/

public class TestApp {
    public static void main (String[] arg) {
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(Config.class);
        Knight knight = ctx.getBean( Knight.class);
        knight.embarkOnQuest();
        ctx.close();
    }
}

