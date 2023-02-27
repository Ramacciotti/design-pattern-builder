package com.ramacciotti.builder.components;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Window {

    private String type;

    private Double height;

    private Double width;

}
