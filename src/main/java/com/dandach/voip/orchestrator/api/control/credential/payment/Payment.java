package com.dandach.voip.orchestrator.api.control.credential.payment;

import com.dandach.voip.orchestrator.api.control.Subscriber;
import com.dandach.voip.orchestrator.api.control.credential.Account;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "payment")
@Accessors(chain = true)
public class Payment {
    /*
     * Payment ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    /**
     * Payment Amount
     */
    @Column(name = "amount")
    private double amount;

    /**
     * Payment Amount
     */
    @Column(name = "is_paid")
    private boolean paid;

    /**
     * Relation with Account
     */
    @ManyToOne
    @JoinColumn(name="account_id")
    private Account account;

    /**
     * Payment Created Date
     */
    @Column(name = "created_date", nullable = false)
    private Date createdDate;

    /**
     * Payment Updated Date
     */
    @Column(name = "updated_date", nullable = false)
    private Date updatedDate;
}
