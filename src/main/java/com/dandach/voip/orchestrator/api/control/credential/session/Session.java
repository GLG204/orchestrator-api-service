package com.dandach.voip.orchestrator.api.control.credential.session;

import com.dandach.voip.orchestrator.api.control.credential.Account;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "session")
@Accessors(chain = true)
public class Session {
    /*
     * Session ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    /*
     * Session Factory
     */
    @Column(name = "session_factory", nullable = false)
    private String sessionFactory;

    /*
     * is Live
     */
    @Column(name = "live", nullable = false)
    private boolean live;

    /**
     * Relation with Account
     */
    @ManyToOne
    @JoinColumn(name="account_id")
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
