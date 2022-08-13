package com.example.spingbootkubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpingBootKubernetesApplication {
    @GetMapping("/")
    public String home(){
        return " Congratulations you successfully deployed your Application into Kubernetes------!!";
    }
//Test1
    public static void main(String[] args) {
        SpringApplication.run(SpingBootKubernetesApplication.class, args);
    }

}

