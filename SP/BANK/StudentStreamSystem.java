import java.util.*;
import java.util.stream.*;

interface StreamActions {
    void addStudent(Student student);
    void searchStudent(String id);
    void displayStudents();
}

class Student {
    String id;
    int ITmark;
    int English;
    String stream;

    Student(String id, int ITmark, int English, String stream) {
        this.id = id;
        this.ITmark = ITmark;
        this.English = English;
        this.stream = stream;
    }

    @Override
    public String toString() {
        return "Student ID: " + id + ", IT Marks: " + ITmark + ", English Marks: " + English + ", Stream: " + stream;
    }
}

class StreamClass implements StreamActions {
    List<Student> students = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully to " + student.stream + " stream.");
    }

    @Override
    public void searchStudent(String id) {
        System.out.println("\n### Searching for Student ID: " + id + " ###");
        students.stream()
                .filter(student -> student.id.equalsIgnoreCase(id))
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Student with ID " + id + " not found.")
                );
    }

    @Override
    public void displayStudents() {
        System.out.println("\n### Students in this Stream ###");
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            students.forEach(System.out::println);
        }
    }
}

     public class StudentStreamSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, StreamClass> streamMap = new HashMap<>();
        streamMap.put("Commerce", new StreamClass());
        streamMap.put("Maths", new StreamClass());
        streamMap.put("Science", new StreamClass());
        streamMap.put("Technology", new StreamClass());

        int choice;
        do {
            System.out.println("\n# Student Stream Management System #");
            System.out.println("1. Create Student");
            System.out.println("2. Search Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter IT Marks: ");
                    int ITmark = sc.nextInt();
                    System.out.print("Enter English Marks: ");
                    int English = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Stream (Commerce/Maths/Science/Technology): ");
                    String stream = sc.nextLine();

                    StreamClass streamClass = streamMap.get(stream);
                    if (streamClass != null) {
                        streamClass.addStudent(new Student(id, ITmark, English, stream));
                    } else {
                        System.out.println("Invalid stream. Please try again.");
                    }
                    break;

                case 2:
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Student ID to search: ");
                    String searchId = sc.nextLine();

                    System.out.println("\n### Searching across all streams ###");
                    boolean found = false;

                    for (Map.Entry<String, StreamClass> entry : streamMap.entrySet()) {
                        StreamClass streamObj = entry.getValue();
                        Optional<Student> student = streamObj.students.stream()
                                .filter(s -> s.id.equalsIgnoreCase(searchId))
                                .findFirst();
                        if (student.isPresent()) {
                            System.out.println("Found in Stream: " + entry.getKey());
                            System.out.println(student.get());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student with ID " + searchId + " not found.");
                    }
                    break;

                case 3: 
                    System.out.println("\n### Displaying All Students ###");
                    streamMap.forEach((key, value) -> {
                        System.out.println("\nStream: " + key);
                        value.displayStudents();
                    });
                    break;

                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            } 
        } while (choice != 4);

        sc.close();
    }
}
