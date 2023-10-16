package com.example.BootDemo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DemoEntity {
    private Long id;
    private String name;

    public DemoEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
