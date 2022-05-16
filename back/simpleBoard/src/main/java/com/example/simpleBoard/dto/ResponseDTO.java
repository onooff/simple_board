package com.example.simpleBoard.dto;

import com.example.simpleBoard.enums.ResponseCode;
import lombok.Getter;
import lombok.Setter;
import lombok.RequiredArgsConstructor;

@Getter
@Setter
@RequiredArgsConstructor
public class ResponseDTO {
    final private ResponseCode code;
    final private String msg;
    final private Object data;
}
