package com.demo.kodlamaIoLanguages.business.concretes;

import com.demo.kodlamaIoLanguages.business.abstracts.LanguageService;
import com.demo.kodlamaIoLanguages.business.requests.languageRequests.CreateLanguageRequest;
import com.demo.kodlamaIoLanguages.business.requests.languageRequests.UpdateLanguagesRequest;
import com.demo.kodlamaIoLanguages.business.responses.languageResponses.GetAllLanguageResponse;
import com.demo.kodlamaIoLanguages.dataAccess.abstracts.LanguageRepository;
import com.demo.kodlamaIoLanguages.dataAccess.abstracts.TechnologyRepository;
import com.demo.kodlamaIoLanguages.entities.concretes.Language;
import com.demo.kodlamaIoLanguages.entities.concretes.Technology;
import com.demo.kodlamaIoLanguages.mapper.ModelMapperService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
@AllArgsConstructor

public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;
    private TechnologyRepository technologyRepository;
    private ModelMapperService modelMapperService;


    @Override
    public List<GetAllLanguageResponse> getAll() {
        List<Language> languages = this.languageRepository.findAll();
        List<GetAllLanguageResponse> languagesResponse = new ArrayList<>();
        Map<Integer, String> technologies;
        for (Language language:languages) {
            technologies = new HashMap<>();
            GetAllLanguageResponse responseItem = new GetAllLanguageResponse();
            responseItem.setId(language.getId());
            responseItem.setName(language.getName());
            for(Technology technology: technologyRepository.findAll()){
                if(technology.getLanguage()==language){
                    technologies.put(technology.getId(), technology.getName());
                }
            }
            responseItem.setTechnologies(technologies);
            languagesResponse.add(responseItem);
        }
        return languagesResponse;
    }



    @Override
    public void add(CreateLanguageRequest createLanguageRequest) {
        Language language = this.modelMapperService.forRequest().map(createLanguageRequest, Language.class);
        this.languageRepository.save(language);
    }

    @Override
    public void delete(int id) {
        this.languageRepository.deleteById(id);
    }

    @Override
    public void update(UpdateLanguagesRequest updateLanguagesRequest) {
        Language language = this.modelMapperService.forResponse()
                .map(updateLanguagesRequest, Language.class);
        this.languageRepository.save(language);
    }
}
