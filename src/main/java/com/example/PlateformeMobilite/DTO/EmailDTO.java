package com.example.PlateformeMobilite.DTO;

import lombok.Data;

@Data
public class EmailDTO {
    private Long userId;
    private long formId;
    private String username;
    private String formName;
    private String email;

    public EmailDTO(Long userId, String username, Long formId, String formName, String email) {
        this.userId = userId;
        this.username = username;
        this.formId = formId;
        this.formName = formName;
        this.email = email;  // Set the 'email' field
    }
}
