package com.demoflutter.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoflutter.demo.models.User;
import com.demoflutter.demo.service.UserService;

@RestController
@RequestMapping("/rest/user")
public class UserController {
    
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public @ResponseBody List<User> getAllUsers(){
        System.out.println("Richiesti tutti gli utenti");
        List<User> listaUtenti = this.userService.getAllUsers();
        return listaUtenti;
    }

    @RequestMapping(value = "/{code}", method = RequestMethod.GET)
    public @ResponseBody User getUsersByCode(@PathVariable("code") String code){
        System.out.println("Richiesto l'utente: " + code);
        User u = this.userService.getUserByCode(code);
        return u;
    }

    @RequestMapping(value="/insert", method = RequestMethod.POST)
    public @ResponseBody User insertNewUser(@RequestBody User user){
        System.out.println("Inserimento di un nuovo user");
        User u = this.userService.inseerUser(user);
        return u;
    }
}
