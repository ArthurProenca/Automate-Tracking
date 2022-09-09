package dev.friday.com.automatetracking.controller.mail;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EmailRestController {
    @GetMapping
    public String sendMail(){
        return "Mail sent";
    }
}
