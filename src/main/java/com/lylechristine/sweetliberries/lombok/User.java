package com.lylechristine.sweetliberries.lombok;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class User {

    private Long id;

    private String username;

    private String email;

    private LocalDate lastUpdated;
}
