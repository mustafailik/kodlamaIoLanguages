package com.demo.kodlamaIoLanguages.business.requests.techonolgyRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTechnologyRequest {
    private String name;
    private int languageId;
}
