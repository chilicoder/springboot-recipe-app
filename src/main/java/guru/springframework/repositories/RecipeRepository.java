package guru.springframework.repositories;

import guru.springframework.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by ipopov on 31.01.18.
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
