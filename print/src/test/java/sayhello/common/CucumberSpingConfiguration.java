package sayhello.common;


import sayhello.PrintApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { PrintApplication.class })
public class CucumberSpingConfiguration {
    
}
