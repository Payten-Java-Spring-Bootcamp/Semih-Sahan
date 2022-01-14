package com.sem.movieap.repository;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity(name = "member")
@Table(name = "member")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    private String lastName;

    @OneToMany(mappedBy = "watchlist", fetch = FetchType.EAGER)
    private List<WatchListEntity> watchLists;

    @OneToMany(mappedBy = "rate", fetch = FetchType.EAGER)
    private List<RateEntity> rates;
}
