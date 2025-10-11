package accesdades.ra2.ac1.accesdades_ra2_ac1.model;
// Definición de la clase 'student', que representa un modelo o entidad de estudiante.

public class student {
    private long id;
    private String name;
    private int age ;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public student(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public student() {
        
    }
}
