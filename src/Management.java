import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public interface Management {
    void displayStudents(List<Student> students, Consumer<Student> con);
    void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con);
    String returnStudentsNames(List<Student> students, Function<Student, String> fun);
    Student createStudent(Supplier<Student> sup);
    List<Student> sortStudentsById(List<Student> students, Comparator<Student> com);
}
