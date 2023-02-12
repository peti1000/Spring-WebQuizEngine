package hu.peti1000.springwebquizengine.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Quiz {

    private String title;
    private String text;
    private String[] options;
}
