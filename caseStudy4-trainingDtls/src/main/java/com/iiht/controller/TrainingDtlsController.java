package com.iiht.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iiht.model.TrainingDtls;
import com.iiht.model.User;
import com.iiht.service.TrainingDtlsService;
import com.iiht.service.UserService;

@RestController
public class TrainingDtlsController {
     @Autowired
     UserService userService;
     
     @Autowired
     TrainingDtlsService tainingDtlsService;
     
     @GetMapping("/hello")
     String sayHello(){
    	 return "hello";
     }
     
     @GetMapping("/training")
     public List<TrainingDtls> getAllTraining(){
    	 return tainingDtlsService.getAllTraining();
     }
     
     @PostMapping("/training")
     public void addTraining(@RequestBody TrainingDtls trainingDtls){
    	 tainingDtlsService.addTraining(trainingDtls);
     }
     
     @DeleteMapping("/delete/{id}")
     public void deleteTrainingDtls(@PathVariable Long id){
    	 tainingDtlsService.deleteTrainingDtls(id);
     }
     
     @PutMapping("/update/{id}")
     public void updateTrainingDtls(@PathVariable long id,@RequestBody TrainingDtls trainingDtls){
    	 tainingDtlsService.updateTrainingDtls(id,trainingDtls);
     }
     
}