package sayhello.domain;

import sayhello.domain.*;
import sayhello.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Print extends AbstractEvent {

    private Long id;

    public Print(Printing aggregate){
        super(aggregate);
    }
    public Print(){
        super();
    }
}
