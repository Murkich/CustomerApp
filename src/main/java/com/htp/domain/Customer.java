package com.htp.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "discount_code")
    private String discountCode;

    @Column(name = "zip")
    private Long zip;

    @Column(name = "name")
    private String name;

    @Column(name = "address_list_one")
    private String address_list_one;

    @Column(name = "address_list_two")
    private String address_list_two;

    @Column(name = "city")
    private String city;

}
