package com.contact.service;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{

    // fake list of contacts
    List<Contact> list = List.of(
            new Contact(1L,"user1@gmail.com","user1", 1L),
            new Contact(1L,"user2@gmail.com","user2", 1L),
            new Contact(1L,"user3@gmail.com","user3", 3L),
            new Contact(1L,"user4@gmail.com","user4", 4L)
    );

    @Override
    public List<Contact> getContacts(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
