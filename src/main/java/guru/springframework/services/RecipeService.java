package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Set;

/**
 * Created by ipopov on 01.02.18.
 */
public interface RecipeService {
    public Set<Recipe> getRecipes();
}
