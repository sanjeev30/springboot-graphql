package me.sanjeevsharma.springgraphql;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public record Book(Integer id,
                   String name,
                   Integer pageCount,
                   Integer authorId) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "JavaScript", 950, 1),
            new Book(2, "Java", 578, 2),
            new Book(3, "Spring Boot", 698, 1),
            new Book(4, "Web Development", 580, 2)
    );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream()
                .filter(book -> Objects.equals(book.id, id))
                .findFirst();
    }
}
