package sayhello.domain;

import sayhello.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="printings", path="printings")
public interface PrintingRepository extends PagingAndSortingRepository<Printing, Long>{

}
