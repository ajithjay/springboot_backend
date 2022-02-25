package io.javas.studentdata;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@CrossOrigin
@Validated
public class UserConroller {

    
    @Autowired
    private UserRepository userRepository;

    //getmethod
    @GetMapping("/")
    public List<User> getUsers(){
       return userRepository.findAll();

    }

    
    
//for getting value using id
    @GetMapping("/{id}")
    public User getUsers(@PathVariable String id){
       return userRepository.findById(id).orElse(null);

    }

    //postmethod
    @Autowired
    private SequenceGeneratorService service;

    @PostMapping("/")
    public User PostMethod( @RequestBody @Valid User user){
        //get the sequnce and update the id
        user.setId(service.getSequenceNumber(User.SEQUENCE_NAME));
        return userRepository.save(user);
    }



    

    
}
