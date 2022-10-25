package sayhello.domain;

import sayhello.domain.Print;
import sayhello.PrintApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Printing_table")
@Data

public class Printing  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String name;

    @PostPersist
    public void onPostPersist(){


        Print print = new Print(this);
        print.publishAfterCommit();

    }

    public static PrintingRepository repository(){
        PrintingRepository printingRepository = PrintApplication.applicationContext.getBean(PrintingRepository.class);
        return printingRepository;
    }




    public static void printHello(SayHello sayHello){

        /** Example 1:  new item 
        Printing printing = new Printing();
        repository().save(printing);

        */

        /** Example 2:  finding and process
        
        repository().findById(sayHello.get???()).ifPresent(printing->{
            
            printing // do something
            repository().save(printing);


         });
        */

        
    }


}
