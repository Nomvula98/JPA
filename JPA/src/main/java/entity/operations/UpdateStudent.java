package entity.operations;

import entity.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *Here we update the age of the student on the basis of primary Key
 *
 * JPA allows us to change the records in database by updating an entity.
 * */
public class UpdateStudent {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student_details");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StudentEntity student=entityManager.find(StudentEntity.class,102);
        System.out.println("Before Updation");
        System.out.println("Student id = "+student.getId());
        System.out.println("Student Name = "+student.getS_name());
        System.out.println("Student Age = "+student.getS_age());

        student.setS_age(30);

        System.out.println("After Updation");
        System.out.println("Student id = "+student.getId());
        System.out.println("Student Name = "+student.getS_name());
        System.out.println("Student Age = "+student.getS_age());
    }

}
