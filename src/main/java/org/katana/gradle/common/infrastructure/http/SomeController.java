package org.katana.gradle.common.infrastructure.http;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class SomeController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello, the time at the server is now " + new Date() + "\n";
    }

    @GetMapping("/api/v1/hello")
    public List<String> hellov1() {
        return Arrays.asList("one", "two", "more...");
    }

    @GetMapping("/api/v2/hello")
    public List<String> hellov2() {
        return Arrays.asList("three", "four", "more...");
    }

    @GetMapping("/api/v3/hello")
    public List<String> hellov3() {
        return Arrays.asList("five", "six", "more...");
    }
}
