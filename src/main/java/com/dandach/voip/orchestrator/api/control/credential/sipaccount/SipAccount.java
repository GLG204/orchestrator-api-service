package com.dandach.voip.orchestrator.api.control.credential.sipaccount;

import com.dandach.voip.orchestrator.api.control.credential.Account;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "sip_account")
@Accessors(chain = true)
public class SipAccount {
    /*
     * SIP Account ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

    /**
     * Extension
     */
    @Column(name = "extension", unique = true, nullable = false)
    private int extension;

    /**
     * Relation with Account
     */
    @ManyToOne
    @JoinColumn(name="account_id")
    private Account account;
}