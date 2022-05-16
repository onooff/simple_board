package com.example.simpleBoard.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    private String loginId;
    private String password;
    private String name;
}