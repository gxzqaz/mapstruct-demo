package com.example.demo.controller;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonConvert {

    @Mapping(target = "personNameDto", source = "personName")
    PersonDTO po2Dto(PersonPO po);
}
