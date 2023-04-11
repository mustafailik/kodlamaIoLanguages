package com.demo.kodlamaIoLanguages.business.abstracts;

import com.demo.kodlamaIoLanguages.business.requests.techonolgyRequests.CreateTechnologyRequest;
import com.demo.kodlamaIoLanguages.business.requests.techonolgyRequests.UpdateTechnologyRequest;
import com.demo.kodlamaIoLanguages.business.responses.technologyResponses.GetAllTechnologyResponse;

import java.util.List;

public interface TechnologyService {
    List<GetAllTechnologyResponse> getAll();


    void add(CreateTechnologyRequest createTechnologyRequest);
    void delete(int id);
    void update(UpdateTechnologyRequest updateTechnologyRequest);

}
