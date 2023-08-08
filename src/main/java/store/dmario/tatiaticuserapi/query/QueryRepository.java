package store.dmario.tatiaticuserapi.query;
import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource(collectionResourceRel = "query", path = "query")
public interface  QueryRepository extends PagingAndSortingRepository<Query, Integer>, CrudRepository<Query, Integer>{
    List<Query> findByType(@Param("type") String type);
}
