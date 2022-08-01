package entity.collection.mapping;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;
@Embeddable
@Getter
@Setter
public class Address {
        private int e_pincode;
        private String e_city;
        private String e_state;


    }
