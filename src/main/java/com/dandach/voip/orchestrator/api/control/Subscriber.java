package com.dandach.voip.orchestrator.api.control;

import com.dandach.voip.orchestrator.api.control.credential.Account;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "subscriber")
@Accessors(chain = true)
public class Subscriber {
    /*
     * Subscriber ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    /*
     * First Name
     */
    @Column(name = "first_name", nullable = false)
    private String firstName;

    /*
     *Last Name
     */
    @Column(name = "last_name", nullable = false)
    private String lastName;

    /**
     * Subscriber Gender
     */
    @Column(name = "gender", nullable = false)
    private Character gender;

    /**
     * Relation With Email
     */
    @OneToMany(mappedBy = "subscriber", fetch = FetchType.LAZY)
    private Set<Email> emails;

    /**
     * Relation With Account
     */
    @OneToOne(mappedBy = "subscriber",cascade = CascadeType.ALL)
    private Account account;

    /**
     * Subscriber Created Date
     */
    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    /**
     * Subscriber Updated Date
     */
    @Column(name = "updated_date", nullable = false)
    private Date updatedDate;
}
