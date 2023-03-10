package com.ms.teacher.dto;

import com.ms.teacher.entities.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseListTeacherDTO {
    private boolean success;
    private List<Teacher> teachers;

}
