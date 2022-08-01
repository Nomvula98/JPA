package entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import entity.collection.mapping.Address;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity //marks this POJO as an Entity
@Table(name ="student")
public class StudentEntity {
    @Id //Marks this attribute as a PK
    private int id;

    @Column(name ="name", nullable = false, length=100)
    private String s_name;

    @Column(name ="age", nullable = false)
    private int s_age;

    @ElementCollection
    private List<Address> address=new ArrayList<Address>();
}
