package com.dandach.voip.orchestrator.api.control;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "email")
@Accessors(chain = true)
public class Email {
    /*
     * Email ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    /**
     * Email Value
     */
    @Column(name = "email_value", nullable = false)
    private String value;

    /**
     * Relation with Subscriber
     */
    @ManyToOne
    @JoinColumn(name="subscriber_id")
    private Subscriber subscriber;
}