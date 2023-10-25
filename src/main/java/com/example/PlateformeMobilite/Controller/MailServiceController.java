package com.example.PlateformeMobilite.Controller;


import com.example.PlateformeMobilite.Entity.Form;
import com.example.PlateformeMobilite.Interfaces.IEmailService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@CrossOrigin(origins = "http://localhost:8081", maxAge = 3600, allowCredentials="true")
@AllArgsConstructor
public class MailServiceController {
    private final IEmailService emailService;
    @PostMapping("/sendEmails/{formId}")
    public ResponseEntity<String> sendEmails(@PathVariable Long formId) {
        emailService.sendEmailsToAcceptedAndRejectedUsers(formId);
        return ResponseEntity.ok("Emails sent successfully");
    }
}
