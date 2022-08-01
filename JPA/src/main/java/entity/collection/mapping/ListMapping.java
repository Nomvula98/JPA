package entity.collection.mapping;

import entity.collection.mapping.Address;
import entity.collection.mapping.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListMapping {
    public static void main(String[] args) {

        EntityManagerFactory emf= Persistence.createEntityManagerFactory("student_details");
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();


        Address a1=new Address();
        a1.setE_pincode(201301);
        a1.setE_city("Nandi");
        a1.setE_state("South Africa");

        Address a2=new Address();
        a2.setE_pincode(302001);
        a2.setE_city("Khaya");
        a2.setE_state("Cape Town");

        Employee e1=new Employee();
        e1.setE_id(1);
        e1.setE_name("Carey");
        e1.getAddress().add(a1);

        Employee e2=new Employee();
        e2.setE_id(2);
        e2.setE_name("John");
        e2.getAddress().add(a2);

        em.persist(e1);
        em.persist(e2);

        em.getTransaction().commit();

        em.close();
        emf.close();



    }

}
