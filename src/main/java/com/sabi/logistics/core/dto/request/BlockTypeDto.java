package com.sabi.logistics.core.dto.request;

import lombok.Data;

@Data
public class BlockTypeDto {

    private Long id;
    private String name;
    private double length;
    private double width;
    private double height;
    private double price;
}
