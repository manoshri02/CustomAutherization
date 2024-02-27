package com.example.spring.authorizationserver.entity;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.security.core.userdetails.UserDetails;


@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
@EntityListeners(AuditingEntityListener.class)
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    private long id;
    /*@OneToOne//(fetch=FetchType.LAZY)
    @JoinColumn(name="fi_id")*/
   // private FIDetails fiDetail;

    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;



}
