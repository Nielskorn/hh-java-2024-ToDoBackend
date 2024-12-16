package org.neuefische.hhjava2024todobackend.service;

import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class IdService {

  public static   String createId(){
      return UUID.randomUUID().toString();
  }
}
