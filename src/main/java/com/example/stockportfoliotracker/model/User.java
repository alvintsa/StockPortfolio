@Entity // indicates that this class is a database entity -> a row in a table
public class User {
    @Id @GeneratedValue // makes Id the primary key. GeneratedValue makes the id val automatically generate.

    private Long id; // need to use save function for db to generate id
    private String name;
    private String email;

    public Long getId(){
        return id;
    }

    public void setName(String name_input){
        this.name = name_input;
    }

    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return this.email;
    }

    public String getName(){
        return this.name;
    }

    public void getInfo(){
        System.out.println("Id" + this.getId() + "Name: " + this.getName() + "Email " + this.getEmail());
    }
}