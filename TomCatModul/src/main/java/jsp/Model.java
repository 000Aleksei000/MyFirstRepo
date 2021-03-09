package jsp;


public class Model  {
        public Student getStudent() {
            Student student = new Student();
            //...
            student.setAge(18);
            student.setName("Alex");
            return student;
        }
}
