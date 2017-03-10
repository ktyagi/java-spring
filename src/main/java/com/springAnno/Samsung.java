package com.springAnno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Samsung {
@Autowired
@Qualifier("In")
MobileProcessor cpu;
//Snapdragon cpu;
	public MobileProcessor setcpu() {
		return cpu;
	}

	public void getcpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}


	public void config() {
		System.out.println ("samsung 12 mp");
		cpu.process();
	}

	
}