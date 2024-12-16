package org.neuefische.hhjava2024todobackend.Dtos;

import lombok.Builder;
import org.neuefische.hhjava2024todobackend.model.Status;

@Builder
public record ToDoDto(String description, Status status ) {
}
