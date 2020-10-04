package models;

import lombok.Data;
import lombok.NonNull;
import models.Author;


public @Data class Book {
    private @NonNull String name;

    private @NonNull Author author;



}
