package org.neuefische.hhjava2024todobackend.model;

import lombok.Builder;
import org.springframework.data.mongodb.core.annotation.Collation;

@Builder
@Collation("ToDos")
public record ToDo(String id,String description,Status status) {
}
