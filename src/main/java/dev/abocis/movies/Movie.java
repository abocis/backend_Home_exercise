package dev.abocis.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "mouvies") // define the name of the collection
@Data // add this anotation from lombok intead of adding getter and setters
@AllArgsConstructor // annotation that takes care all constructions
@NoArgsConstructor


//this class represents each document in the movie collections
public class Movie {

    @Id
    private ObjectId id; // add the annotation id the program know it an actual id for each movies
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference
    private List<Review> reviewsIds;
}
