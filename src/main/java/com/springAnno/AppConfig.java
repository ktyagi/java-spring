package com.springAnno;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages ="com.springAnno")  // If more than one package specify using comma
public class AppConfig
{
/*	@Bean
	public Samsung getPhone()
	{
		return new Samsung();
	}
*//*	@Bean(name="snap")
	public Snapdragon getProcessor()
	{
		return new Snapdragon();
	}*//*
	@Bean
	public MobileProcessor getProcessor()
	{
		return new Snapdragon();
	}*/

}