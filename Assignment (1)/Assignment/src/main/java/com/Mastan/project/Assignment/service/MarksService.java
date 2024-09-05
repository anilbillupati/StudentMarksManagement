package com.Mastan.project.Assignment.service;


import com.Mastan.project.Assignment.dto.StudentDto;
import com.Mastan.project.Assignment.entity.Marks;
import com.Mastan.project.Assignment.repository.MarksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksService {
    @Autowired
    private MarksRepository marksRepository;

    public Marks convertDtoToEntity(StudentDto studentDto) {
        Marks marks = new Marks();

        marks.setStudentName(studentDto.getStudentName());
        marks.setClassName(studentDto.getClassName());
        marks.setSection(studentDto.getSection());
        marks.setAdditionalNotes(studentDto.getAdditionalNotes());

        if (studentDto.getSubjectMarks() != null) {
            marks.setEnglish(studentDto.getSubjectMarks().getOrDefault("english", 0));
            marks.setMath(studentDto.getSubjectMarks().getOrDefault("math", 0));
            marks.setScience(studentDto.getSubjectMarks().getOrDefault("science", 0));
            marks.setHistory(studentDto.getSubjectMarks().getOrDefault("history", 0));
            marks.setGeography(studentDto.getSubjectMarks().getOrDefault("geography", 0));
        }

        return marks;
    }
}
