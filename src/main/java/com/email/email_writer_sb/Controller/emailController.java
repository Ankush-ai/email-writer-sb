package com.email.email_writer_sb.Controller;

import com.email.email_writer_sb.Entity.EmailRequest;
import com.email.email_writer_sb.Service.EmailGeneratorService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins="*")
public class emailController {
    private EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response =emailGeneratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }




}
