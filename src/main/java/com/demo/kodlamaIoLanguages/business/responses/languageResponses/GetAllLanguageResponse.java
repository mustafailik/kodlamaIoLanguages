package com.demo.kodlamaIoLanguages.business.responses.languageResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllLanguageResponse {
    private int id;
    private String name;
    private Map<Integer, String> technologies;
}
