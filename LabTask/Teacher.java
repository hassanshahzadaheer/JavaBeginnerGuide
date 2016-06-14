/**
 * Teacher.java
 * 
 * Hassan Shahzad aheer
 * hassanshahzadaheer@gmail.com
 * 
 * Mini sutdent management system
 * Main class 
 * 12 - June - 2016
 **/


public class Teacher {

    private String name;
    private int age;
    private String subject;
    private String experiance;

    public Teacher(String name, int age, String subject, String experiance) {
        this.name = name;
        this.age = age;
        this.subject = subject;
        this.experiance = experiance;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getExperiance() {
        return experiance;
    }

    public void setExperiance(String experiance) {
        this.experiance = experiance;
    }
    
    
    public String display(){
        
        System.out.println("\t"+name + "\t\t"+ age + "\t"+ subject + "\t"+ experiance);
        return "";
    }
    
}
