package com.example.enhancejavarest.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "blog")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer blogId;

    @Lob
    @Column(name = "blog_body")
    private String blogBody;

//    @OneToOne(mappedBy = "campaign")
//    private Campaign campaign;
}