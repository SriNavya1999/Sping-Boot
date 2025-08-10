package com.codeWithMosh.store.services;

import com.codeWithMosh.store.entities.User;
import com.codeWithMosh.store.repositories.UserRepository;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;
    private EntityManager entityManager;


    /*
     * Commenting Transactional will give below op:
     * Transient/ Detached
     * Hibernate: insert into users (email,name,password) values (?,?,?)
     * Transient/ Detached
     *
     * With @Transactional Annotation:
     * Transient/ Detached
     * Hibernate: insert into users (email,name,password) values (?,?,?)
     * Persistent
     */
    @Transactional
    public void ShowEntityStates(){
        User user = User.builder()
                .name("John")
                .password("123")
                .email("John123@gmail.com")
                .build();

        if(entityManager.contains(user)) {
            System.out.println("Persistent");
        } else{
            System.out.println("Transient/ Detached");
        }

        userRepository.save(user);

        if(entityManager.contains(user)) {
            System.out.println("Persistent");
        } else{
            System.out.println("Transient/ Detached");
        }
    }


}
