package org.neuefische.hhjava2024todobackend.service;

import lombok.RequiredArgsConstructor;
import org.neuefische.hhjava2024todobackend.Dtos.ToDoDto;
import org.neuefische.hhjava2024todobackend.model.ToDo;
import org.neuefische.hhjava2024todobackend.repo.ToDoRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ToDoService {
    final  IdService idService;
   final ToDoRepo toDoRepo;
    public List<ToDo> getAllToDos() {
       return  toDoRepo.findAll();
    }

    public ToDo createToDo(ToDoDto todo) {
        ToDo temp =  new ToDo(idService.createId(),todo.description(),todo.status());
       return toDoRepo.save(temp);
    }

    public ToDo getToDo(String id) {
        return toDoRepo.findById(id).orElseThrow();
    }

    public ToDo update(String id,ToDoDto toDoDto)  {
      try{
        Optional<ToDo> temp = toDoRepo.findById(id);
        if (temp.isPresent()) {
            ToDo toDoTemp= temp.get();
            ToDo returnToDo=new ToDo(toDoTemp.id(),toDoDto.description(),toDoDto.status());

            return toDoRepo.save(returnToDo);
        }else{
            throw new Exception("no such id");
        }

    }catch (Exception e) {
      e.printStackTrace();}
    return null;}

    public void deleteById(String id) {
        toDoRepo.deleteById(id);
    }
}
