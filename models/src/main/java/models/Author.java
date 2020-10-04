package models;

import lombok.Data;
import lombok.NonNull;

public @Data class Author {

    private @NonNull String name;
    private @NonNull int numberOfBooks;
}
