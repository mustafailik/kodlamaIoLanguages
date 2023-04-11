package com.demo.kodlamaIoLanguages.business.concretes;

import com.demo.kodlamaIoLanguages.business.abstracts.TechnologyService;
import com.demo.kodlamaIoLanguages.business.requests.techonolgyRequests.CreateTechnologyRequest;
import com.demo.kodlamaIoLanguages.business.requests.techonolgyRequests.UpdateTechnologyRequest;

import com.demo.kodlamaIoLanguages.business.responses.technologyResponses.GetAllTechnologyResponse;
import com.demo.kodlamaIoLanguages.dataAccess.abstracts.TechnologyRepository;
import com.demo.kodlamaIoLanguages.entities.concretes.Language;
import com.demo.kodlamaIoLanguages.entities.concretes.Technology;
import com.demo.kodlamaIoLanguages.mapper.ModelMapperService;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class TechnologyManager implements TechnologyService {

   private TechnologyRepository technologyRepository;
   private ModelMapperService modelMapperService;


    @Override
    public List<GetAllTechnologyResponse> getAll() {
        List<Technology> technologies = technologyRepository.findAll();
        List<GetAllTechnologyResponse> getAllTechnologyResponses = (List<GetAllTechnologyResponse>) technologies.stream()
                .map(technologiess->this.modelMapperService.forResponse().
                        map(technologiess, GetAllTechnologyResponse.class)) .collect(Collectors.toList());
    return getAllTechnologyResponses;
    }



    @Override
    public void add(CreateTechnologyRequest createTechnologyRequest) {
            Technology technology = this.modelMapperService.forRequest().map(createTechnologyRequest, Technology.class);
            this.technologyRepository.save(technology);
    }

    @Override
    public void delete(int id) {
        this.technologyRepository.deleteById(id);
    }

    @Override
    public void update(UpdateTechnologyRequest updateTechnologyRequest) {
        Technology technology = this.modelMapperService.forResponse()
                .map(updateTechnologyRequest , Technology.class);
        this.technologyRepository.save(technology);
    }
}
