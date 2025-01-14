import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {

    @Id
    private String id;
    private String studentName;
    private String secid; // Reference to section

    // Constructors, getters, setters
}

