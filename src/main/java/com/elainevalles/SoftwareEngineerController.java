package com.elainevalles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Kyle",
                        "js, node, react, tailwind, css"
                ),
                new SoftwareEngineer(
                        2,
                        "Anne",
                        "java, spring, springboot"
                ),
                new SoftwareEngineer(
                        3,
                        "Thomas",
                        "java, javaScript, python"
                )
        );
    }
}
