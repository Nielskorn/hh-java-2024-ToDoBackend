package org.neuefische.hhjava2024todobackend.Controller;

import lombok.RequiredArgsConstructor;
import org.neuefische.hhjava2024todobackend.Dtos.ToDoDto;
import org.neuefische.hhjava2024todobackend.model.ToDo;
import org.neuefische.hhjava2024todobackend.service.ToDoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
@RequiredArgsConstructor
public class ToDoController {
  final ToDoService toDoService;
    @GetMapping
    List<ToDo>getAllTodos(){
      return   toDoService.getAllToDos();
    }
    @GetMapping("/{id}")
    ToDo getToDoById(@PathVariable String id){
      return toDoService.getToDo(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ToDo createToDo(@RequestBody ToDoDto todo){
      return  toDoService.createToDo(todo);
    }
    @PutMapping("/{id}")
    ToDo updatedToDo(@PathVariable String id ,@RequestBody ToDoDto todo){
      return toDoService.update(id,todo);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
  void deletedToDoById(@PathVariable String id){
      toDoService.deleteById(id);
    }

}
