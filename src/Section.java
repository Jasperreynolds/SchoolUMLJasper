public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize = 0;

    public Section(String name, Teacher teacher){
        this.name = name;
        this.teacher = teacher;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(Teacher t){
        this.teacher = t;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student s){
        this.students[currentSize] = s;
        currentSize ++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        String names = "";
        for(int i=0; i<currentSize; i++) {
            names += students[i].getName() + " ";
        }
        return "This " + this.name + " class is taught by " + this.teacher.getName() + " and has " +
                this.currentSize + " students: " + names + "\n";
    }
}
