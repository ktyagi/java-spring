package com.springAnno;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("In")
public class Intel implements MobileProcessor {

    public void process(){
        System.out.println ("Second best cpu");
    }
}