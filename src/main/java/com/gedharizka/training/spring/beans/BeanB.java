package com.gedharizka.training.spring.beans;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BeanB {
    private BeanC c;
    private  BeanD d;
}
