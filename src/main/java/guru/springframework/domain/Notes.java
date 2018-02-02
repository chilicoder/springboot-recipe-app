package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by ipopov on 30.01.18.
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
