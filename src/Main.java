import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Claudio", 30));
        studentsList.add(new Student("Marta", 29));
        studentsList.add(new Student("Filippo", 28));
        studentsList.add(new Student("Luca", 26));
        studentsList.add(new Student("Sara", 32));
        studentsList.add(new Student("Ben", 51));
        studentsList.add(new Student("Aldo", 61));
        studentsList.add(new Student("Carla", 41));
        studentsList.add(new Student("Maria", 73));
        studentsList.add(new Student("Anna", 22));
        studentsList.add(new Student("Mauro", 12));
        studentsList.add(new Student("Frank", 1));


        System.out.println("Collezione non ordinata:");
        printStudentList(studentsList);


        sortStudentList(studentsList);


        System.out.println("\nCollezione ordinata per età:");
        printStudentList(studentsList);

    }

    public static void sortStudentList(ArrayList<Student> studentList) {
        for (int i = 0; i < studentList.size(); i++) {
            for (int j = i + 1; j < studentList.size(); j++) {
                //confronta le età degli studenti attuali i e j Se i è maggiore di j, scambia le posizioni
                if (studentList.get(i).getAge() > studentList.get(j).getAge()) {
                    //memorizziamo temporaneamente
                    Student temp = studentList.get(i);
                    //sostituisce i con  j.
                    studentList.set(i, studentList.get(j));
                    //sostituisce j con lo studente temp(prima i).
                    studentList.set(j, temp);
                }
            }
        }
    }


    private static void printStudentList(ArrayList<Student> studentsList) {
        for (Student student : studentsList) {
            System.out.println("Nome: " + student.getName() + ", Età: " + student.getAge());
        }
    }

}

