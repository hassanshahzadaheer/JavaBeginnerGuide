
package student;

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

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the experiance
     */
    public String getExperiance() {
        return experiance;
    }

    /**
     * @param experiance the experiance to set
     */
    public void setExperiance(String experiance) {
        this.experiance = experiance;
    }
    
    
    public String display(){
        
        System.out.println("\t"+name + "\t\t"+ age + "\t"+ subject + "\t"+ experiance);
        return "";
    }
    
}
