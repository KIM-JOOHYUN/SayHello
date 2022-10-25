package sayhello.domain;

import sayhello.domain.*;
import sayhello.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class SayHello extends AbstractEvent {

    private Long id;
    private String name;
}


