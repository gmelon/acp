package com.khjl.acp.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@Entity
public class Usher {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private Integer salary;

    @OneToMany(mappedBy = "usher")
    private List<Schedule> scheduleList;

    @OneToMany(mappedBy = "usher")
    private List<Change> changeList;
}