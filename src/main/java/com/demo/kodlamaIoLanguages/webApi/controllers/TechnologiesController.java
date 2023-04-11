package com.demo.kodlamaIoLanguages.webApi.controllers;

import com.demo.kodlamaIoLanguages.business.abstracts.TechnologyService;
import com.demo.kodlamaIoLanguages.business.requests.techonolgyRequests.CreateTechnologyRequest;
import com.demo.kodlamaIoLanguages.business.requests.techonolgyRequests.UpdateTechnologyRequest;
import com.demo.kodlamaIoLanguages.business.responses.technologyResponses.GetAllTechnologyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {

    private TechnologyService technologyService;
    @Autowired
    public TechnologiesController(TechnologyService technologyService) {
        this.technologyService = technologyService;
    }
    @GetMapping("/getAll")
    public List<GetAllTechnologyResponse> getAll(){
        return technologyService.getAll();
    }
    @PostMapping("/add")
    public void add(@RequestBody CreateTechnologyRequest createTechnologyRequest){
        this.technologyService.add(createTechnologyRequest);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        this.technologyService.delete(id);
    }

    @PutMapping("/update")
    public void update(UpdateTechnologyRequest updateTechnologyRequest){
        this.technologyService.update(updateTechnologyRequest);
    }
}
