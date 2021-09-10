package com.user.entity;

public class Contact {
    private Long contactId;
    private String email;
    private String contactName;
    private Long userId;

    public Contact(Long contactId, String email, String contactName, Long userId) {
        this.contactId = contactId;
        this.email = email;
        this.contactName = contactName;
        this.userId = userId;
    }

    public Contact() {
    }
}
