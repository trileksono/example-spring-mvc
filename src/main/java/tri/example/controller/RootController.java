package tri.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mikocok on 05/09/2016.
 */
@RestController
@RequestMapping("/api")
public class RootController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    ResponseEntity<String> indexResponse(){
        return new ResponseEntity<>("Index",HttpStatus.OK);
    }

}
