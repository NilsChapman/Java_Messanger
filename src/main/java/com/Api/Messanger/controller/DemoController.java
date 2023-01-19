// Java Program to Illustrate DemoController File

// Importing package in this code module src/main/java/com/Api/Messanger/controller
package com.Api.Messanger.controller;
// Importing required classes
import com.Api.Messanger.Objects.MyRequestBody;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// Annotation
@Controller
// Main class
public class DemoController {

    @RequestMapping("/hello")
    @ResponseBody
    // Method
    public String helloGFG()
    {
        return "Hello GeeksForGeeks";
    }

    @GetMapping("/getData")
    public ResponseEntity<String> handleGetRequest() {
        // logic to handle GET request
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

    @PostMapping("/postData")
    public ResponseEntity<String> handlePostRequest(@RequestBody MyRequestBody requestBody) {
        // logic to handle POST request
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}