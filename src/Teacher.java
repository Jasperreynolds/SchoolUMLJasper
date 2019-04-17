public class Teacher extends Person{
    private String subject;
    private Section[] sections = new Section[10];
    private int sectionCount;

    public Teacher(String name, int id, String subject){
        super(name, id);
        this.subject = subject;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String n){
        this.subject = n;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addSections(Section s){
        this.sections[sectionCount] = s;
        sectionCount ++;
    }
}
