package com.dandach.voip.orchestrator.api.control.credential.simcard;

import com.dandach.voip.orchestrator.api.control.credential.Account;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "sim_card")
@Accessors(chain = true)
public class SimCard {
    /*
     * Payment ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    /**
     * SIM card Phone Number
     */
    @Column(name = "phone_number")
    private Long phoneNumber;

    /**
     * SIM card Serial Number
     */
    @Column(name = "serial_number")
    private Long serialNumber;

    /**
     * Relation with Account
     */
    @ManyToOne
    @JoinColumn(name="account_id")
    private Account account;
}