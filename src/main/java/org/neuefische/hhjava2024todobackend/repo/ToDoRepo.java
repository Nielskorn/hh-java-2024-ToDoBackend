package org.neuefische.hhjava2024todobackend.repo;

import org.neuefische.hhjava2024todobackend.model.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepo extends MongoRepository<ToDo,String> {
}
