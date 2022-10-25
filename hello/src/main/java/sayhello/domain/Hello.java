package sayhello.domain;

import sayhello.domain.SayHello;
import sayhello.HelloApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Hello_table")
@Data

public class Hello  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;

    @PostPersist
    public void onPostPersist(){


        SayHello sayHello = new SayHello(this);
        sayHello.publishAfterCommit();

    }

    public static HelloRepository repository(){
        HelloRepository helloRepository = HelloApplication.applicationContext.getBean(HelloRepository.class);
        return helloRepository;
    }






}
