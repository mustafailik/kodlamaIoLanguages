package com.demo.kodlamaIoLanguages.webApi.controllers;

import com.demo.kodlamaIoLanguages.business.abstracts.LanguageService;
import com.demo.kodlamaIoLanguages.business.requests.languageRequests.CreateLanguageRequest;
import com.demo.kodlamaIoLanguages.business.requests.languageRequests.UpdateLanguagesRequest;
import com.demo.kodlamaIoLanguages.business.responses.languageResponses.GetAllLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
    private LanguageService languageService;
    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }
    @GetMapping("/getall")
    public List<GetAllLanguageResponse> getAll(){
        return this.languageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateLanguageRequest createLanguageRequest){
        this.languageService.add(createLanguageRequest);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        languageService.delete(id);
    }

    @PutMapping("/update")
    public void update(UpdateLanguagesRequest updateLanguagesRequest){
        this.languageService.update(updateLanguagesRequest);
    }
}
