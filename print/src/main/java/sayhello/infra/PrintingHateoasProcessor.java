package sayhello.infra;
import sayhello.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class PrintingHateoasProcessor implements RepresentationModelProcessor<EntityModel<Printing>>  {

    @Override
    public EntityModel<Printing> process(EntityModel<Printing> model) {

        
        return model;
    }
    
}
