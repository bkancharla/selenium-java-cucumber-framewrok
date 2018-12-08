package framework.springconfig;

import cucumber.api.java8.En;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan(basePackages = { "framework","com.automation.steps"})
public class SpringCucmberConfig implements En {

}