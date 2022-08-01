package entity.operations;

import entity.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
/**
 * Here we search for a particular record and fetch it and print it on console
 *
 * EntityManger interface provides find() method that searches an element on the basis of primary key.
 * */
public class FindStudent {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student_details");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        StudentEntity student =entityManager.find(StudentEntity.class,101);

        System.out.println("Student id = "+student.getId());
        System.out.println("Student Name = "+student.getS_name());
        System.out.println("Student Age = "+student.getS_age());

    }
}
