package sayhello.domain;

import sayhello.domain.*;
import sayhello.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class SayHello extends AbstractEvent {

    private Long id;
    private String name;

    public SayHello(Hello aggregate){
        super(aggregate);
    }
    public SayHello(){
        super();
    }
}
