package com.test.testapp;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Syed Taher Zama
 */
@RestController
@CrossOrigin
@AllArgsConstructor
public class UserController {

    @GetMapping("/read")
    public ResponseEntity<String> getAlarmStatus()  {

        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}
