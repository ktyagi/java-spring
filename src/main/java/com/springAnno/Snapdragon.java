package com.springAnno;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Snap")
public class Snapdragon implements MobileProcessor {

    public void process(){
        System.out.println ("best cpu");
    }
}