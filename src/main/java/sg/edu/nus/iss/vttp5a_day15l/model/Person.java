package sg.edu.nus.iss.vttp5a_day15l.model;

public class Person 
{
    // Put in necessary validations (Practice)
    private Integer id;
    private String fullName;
    private String email;

    // Constructors
    public Person() {
    }

    public Person(Integer id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    // Getters Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    // Methods
    @Override
    public String toString() {
        return id + ", " + fullName + ", " + email; // need this to save for csv
    }    

    

    
}
