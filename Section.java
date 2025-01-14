import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sections")
public class Section {

    @Id
    private String id;
    private String sectionName;
    private String depid; // Reference to department

    // Constructors, getters, setters
}
