package com.example.demo.controller;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring",
        uses = PersonConvert.class,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CarConvert {

    CarDTO po2Dto(CarPO po);
}
