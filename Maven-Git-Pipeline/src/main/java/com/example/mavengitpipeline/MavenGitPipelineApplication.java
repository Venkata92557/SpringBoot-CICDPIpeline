package com.example.mavengitpipeline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MavenGitPipelineApplication {
    @GetMapping("/message")
    public String gertMessage(){
        return "Git-Maven-Demo with Pipeline";
    }

    public static void main(String[] args) {

        SpringApplication.run(MavenGitPipelineApplication.class, args);
    }

}
