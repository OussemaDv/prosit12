import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public  class StudentManagement implements Management{
    public void displayStudents(List<Student> students, Consumer<Student> con){

        Iterator<Student> studentIterator = students.iterator();
        while(studentIterator.hasNext()) {
            con.accept((Student) studentIterator);
        }
    }

    public void displayStudentsByFilter(List<Student> students, Predicate<Student> pre, Consumer<Student> con){
        Iterator<Student> studentIterator = students.iterator();
        while(studentIterator.hasNext()) {
            if(pre.test((Student) studentIterator))
                con.accept((Student) studentIterator);
        }
    }
    public String returnStudentsNames(List<Student> students, Function<Student, String> fun){
        String names="";
        Iterator<Student> studentIterator = students.iterator();
        while(studentIterator.hasNext()) {
            names += fun.apply((Student) studentIterator) + ",";
        }
        return names;
    }
    public Student createStudent(Supplier<Student> sup){
        return sup.get();
    }
    public List<Student> sortStudentsById(List<Student> students, Comparator<Student> com){
        Collections.sort((List<Student>) students,com);
        return students;
    }
}
