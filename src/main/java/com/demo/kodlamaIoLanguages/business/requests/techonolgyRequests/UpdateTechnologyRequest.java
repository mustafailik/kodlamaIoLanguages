package com.demo.kodlamaIoLanguages.business.requests.techonolgyRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateTechnologyRequest {
    private int id;
    private int languageId;
    private String name;
}
