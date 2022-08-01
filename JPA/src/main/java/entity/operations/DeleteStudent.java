package entity.operations;

import entity.StudentEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DeleteStudent {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student_details");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        StudentEntity student=entityManager.find(StudentEntity.class,102);
        entityManager.remove(student);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        entityManager.close();
    }

}
