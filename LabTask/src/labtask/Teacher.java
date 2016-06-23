package labtask;

public class Teacher extends Person {

    private String expirance;
    private String subject;

    public Teacher(String expirance, String subject, String name, int age) {
        super(name, age);
        this.expirance = expirance;
        this.subject = subject;
    }

    public String getExpirance() {
        return expirance;
    }

    public void setExpirance(String expirance) {
        this.expirance = expirance;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
 
    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.printf("\tExpirance\tSubject");
        
        
    }

}
