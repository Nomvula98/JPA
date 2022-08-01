package entity.operations;

import entity.StudentEntity;
import entity.collection.mapping.Address;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class CreateStudent {
    public static void main(String[] args) {
        //We need to create entityManager for us to be able to perform persistence operations,
        // to create entityManager, we use entityManagerFactory
        //To persist a student, we need to begin an entity transaction

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("student_details");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        /**
         * Here we insert the record of students in DB.
         * The EntityManager provides persist() method to insert records.
         * **/
        entityManager.getTransaction().begin();

        Address a1=new Address();
        a1.setE_pincode(201301);
        a1.setE_city("Noida");
        a1.setE_state("Uttar Pradesh");

        Address a2=new Address();
        a2.setE_pincode(302001);
        a2.setE_city("Jaipur");
        a2.setE_state("Rajasthan");

        StudentEntity student=new StudentEntity();
        student.setId(202);
        student.setS_name("Nomvula");
        student.setS_age(24);
        student.getAddress().add(a1);

        StudentEntity student2=new StudentEntity();
        student2.setId(203);
        student2.setS_name("Portia");
        student2.setS_age(22);
        student.getAddress().add(a2);

        StudentEntity student3=new StudentEntity();
        student3.setId(204);
        student3.setS_name("Busi");
        student3.setS_age(26);

        entityManager.persist(student);
        entityManager.persist(student2);
        entityManager.persist(student3);

        entityManager.getTransaction().commit();

        entityManagerFactory.close();
        entityManager.close();

/**
 * Here we search for a particular record and fetch it and print it on console
 * EntityManger interface provides find() method that searches an element on the basis of primary key.
 * */
        StudentEntity student1 =entityManager.find(StudentEntity.class,101);

        System.out.println("Student id = "+student1.getId());
        System.out.println("Student Name = "+student1.getS_name());
        System.out.println("Student Age = "+student1.getS_age());
/**
 *Here we update the age of the student on the basis of primary Key
 * JPA allows us to change the records in database by updating an entity.
 * */

    StudentEntity student4=entityManager.find(StudentEntity.class,102);
        System.out.println("Before Updation");
        System.out.println("Student id = "+student4.getId());
        System.out.println("Student Name = "+student4.getS_name());
        System.out.println("Student Age = "+student4.getS_age());

        student4.setS_age(30);

        System.out.println("After Updation");
        System.out.println("Student id = "+student4.getId());
        System.out.println("Student Name = "+student4.getS_name());
        System.out.println("Student Age = "+student4.getS_age());
/**
 * Here we remove a particular record of the student
 *
 * EntityManager interface provides remove() method.
 * The remove() method uses primary key to delete the particular record.
 * */

        entityManager.getTransaction().begin();

        StudentEntity student5=entityManager.find(StudentEntity.class,102);
        entityManager.remove(student5);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();
        entityManager.close();

}
}