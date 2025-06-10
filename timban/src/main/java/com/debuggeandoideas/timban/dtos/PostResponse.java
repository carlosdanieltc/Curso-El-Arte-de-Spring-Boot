package com.debuggeandoideas.timban.dtos;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class PostResponse {

    private LocalDateTime dateCreation;
    private String content;
    private String img;
}
