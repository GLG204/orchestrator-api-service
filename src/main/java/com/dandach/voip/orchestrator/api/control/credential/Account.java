package com.dandach.voip.orchestrator.api.control.credential;

import com.dandach.voip.orchestrator.api.control.Subscriber;
import com.dandach.voip.orchestrator.api.control.credential.payment.Payment;
import com.dandach.voip.orchestrator.api.control.credential.session.Session;
import com.dandach.voip.orchestrator.api.control.credential.simcard.SimCard;
import com.dandach.voip.orchestrator.api.control.credential.sipaccount.SipAccount;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "account")
@Accessors(chain = true)
public class Account {
    /*
     * Account ID
     */
    @Id
    @Column(name = "id")
    private Long id;

    /*
     * User Name
     */
    @Column(name = "username", unique = true, nullable = false)
    private String username;

    /*
     * Password
     */
    @Column(name = "password", unique = true, nullable = false)
    private String password;

    /*
     * is blocked
     */
    @Column(name = "is_blocked", nullable = false)
    private boolean blocked;

    /*
     * Due Date
     */
    @Column(name = "due_date", nullable = false)
    private Date dueDate;

    /*
     * Relation With Subscriber
     */
    @OneToOne
    @MapsId
    private Subscriber subscriber;


    /**
     * Relation With Session
     */
    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    private Set<Session> sessions;

    /**
     * Relation With Payment
     */
    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    private Set<Payment> payments;

    /**
     * Relation With SIM Card
     */
    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    private Set<SimCard> simCards;

    /**
     * Relation with SIP Account
     */
    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY)
    private Set<SipAccount> sipAccounts;
}