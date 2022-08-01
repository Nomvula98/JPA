package entity.collection.mapping;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int e_id;
    private String e_name;

    @ElementCollection
    private List<Address> address=new ArrayList<Address>();
}
