package me.sanjeevsharma.springgraphql;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public record Author(Integer id,
                     String name) {

    public static List<Author> authors = Arrays.asList(
            new Author(1, "John Doe"),
            new Author(2, "John Payne")
    );

    public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream()
                .filter(author -> Objects.equals(author.id, id))
                .findFirst();
    }
}
