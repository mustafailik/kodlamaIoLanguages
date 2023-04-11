package com.demo.kodlamaIoLanguages.business.requests.languageRequests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateLanguagesRequest {
    private int id;
    private String name;
}
