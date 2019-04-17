public class Runner {
    public static void main(String[] args){
        School s = new School("Berkeley High");
        Teacher a = new Teacher("Mr. Albinson",7575, "Comp Sci");
        Teacher mb = new Teacher("Mr. Mulholland-Bearhs",556, "Enviro");
        Teacher d = new Teacher("Ms. Dorf", 557,"Math");
        Student lu = new Student("Luke", 345, 12);
        Student gr = new Student("Gregorio",7575,12);
        Student ka = new Student("Kian", 69, 12);
        Student gl = new Student("Gabe", 134, 11);
        Student el = new Student("Eliot", 3457023, 11);
        Student sa = new Student("Sam", 1223, 12);
        Section cs = new Section("Comp Sci",a);
        Section mm = new Section("Math",d);
        Section ev = new Section("Enviro",mb);
        mm.addStudent(ka);
        mm.addStudent(lu);
        cs.addStudent(gl);
        cs.addStudent(gr);
        ev.addStudent(el);
        ev.addStudent(sa);
        System.out.print(mm.toString());
        System.out.print(cs.toString());
        System.out.print(ev.toString());
    }
}
