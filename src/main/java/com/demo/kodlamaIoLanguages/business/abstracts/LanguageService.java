package com.demo.kodlamaIoLanguages.business.abstracts;

import com.demo.kodlamaIoLanguages.business.requests.languageRequests.CreateLanguageRequest;
import com.demo.kodlamaIoLanguages.business.requests.languageRequests.UpdateLanguagesRequest;
import com.demo.kodlamaIoLanguages.business.responses.languageResponses.GetAllLanguageResponse;

import java.util.List;

public interface LanguageService {
    List<GetAllLanguageResponse> getAll();

    void add(CreateLanguageRequest createLanguageRequest);
    void delete(int id);
    void update(UpdateLanguagesRequest updateLanguagesRequest);

}
