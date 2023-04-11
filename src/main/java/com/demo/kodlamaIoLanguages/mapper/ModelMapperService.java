package com.demo.kodlamaIoLanguages.mapper;

import org.modelmapper.ModelMapper;



public interface ModelMapperService {
    ModelMapper forResponse();
    ModelMapper forRequest();
}
