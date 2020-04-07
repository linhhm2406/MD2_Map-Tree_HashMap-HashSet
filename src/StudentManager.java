import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentManager {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",28,"HN");
        Student student2 = new Student("Hung",22,"HN");
        Student student3 = new Student("Ha",24,"HN");

        Map<Integer,Student> hashMap = new HashMap<>();
        hashMap.put(1,student1);
        hashMap.put(2,student2);
        hashMap.put(3,student3);
        hashMap.put(4,student1);

        for (int i = 1; i <= hashMap.size() ; i++) {
            hashMap.get(i).displayStudent();
        }

        Set<Student> hashSet = new HashSet<>();
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student1);
        System.out.println("----");
        for (Student student : hashSet) {
            student.displayStudent();
        }
    }
}
