package com.Mastan.project.Assignment.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Map;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class StudentDto {


    private String studentName;
    private String className;
    private String section;
    private Map<String, Integer> subjectMarks;
    private String additionalNotes;
}
