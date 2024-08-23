package org.example.jekinsprac;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/test")
public class JenkinsController {
    @GetMapping()
    public String saveTest() {
        return "jenkins test: 27try";
    }
}
