package itsjava.first.lesson_3.iostreams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class User implements Serializable {
    private String name;
    private transient String pass;
}
