import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, List<String>> classrooms = new HashMap<>();

        // Create the classrooms

        List<String> classroomA = new ArrayList<>();
        List<String> classroomB = new ArrayList<>();
        List<String> classroomC = new ArrayList<>();
        List<String> classroomD = new ArrayList<>();

        // Add student to class A

        classroomA.add("Deniz Gün");
        classroomA.add("Baran Ünlü");
        classroomA.add("Karan Mavi");
        classroomA.add("Ayşe Aslan");

        // Add student to class B

        classroomB.add("Baran Bulut");
        classroomB.add("Zehra Özkaya");
        classroomB.add("Serkan Doğan");
        classroomB.add("Tarkan Ahmet Güzel");

        // Add student to class C

        classroomC.add("Ezgi Ünsal");
        classroomC.add("Ceren Nalan Baysal");
        classroomC.add("Serhan Al");
        classroomC.add("Samet Mutlu");

        // Add student to class D

        classroomD.add("Hakan Açık");
        classroomD.add("İpek Nil Su Seven");
        classroomD.add("İlke Şanlı");
        classroomD.add("Can Budak");


        classrooms.put("A", classroomA);
        classrooms.put("B", classroomB);
        classrooms.put("C", classroomC);
        classrooms.put("D", classroomD);


        //Find student names last with "an" word

        Set<String> keys = classrooms.keySet();

        for (String key : keys) {
            List<String> classroom = classrooms.get(key);
            for (String student : classroom) {
                String[] studentName = student.split(" ");

                boolean isMatch = false;

                for (int i = 0; i < studentName.length - 1; i++) {
                    if (studentName[i].endsWith("an")) {
                        System.out.println("Classroom" + key + " - Student Name: " + student);
                        break;
                    }
                }
            }
        }


    }
}