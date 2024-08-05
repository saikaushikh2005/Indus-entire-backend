package com.example.demo.controller;


import com.example.demo.entities.HRdetails;
import com.example.demo.entities.Userdetails;
import com.example.demo.servimpl.HRImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hr")
public class HRController {
    //Get By ID
    //Get by ManagerID
    //Get All
    //Create USER

    @Autowired
    private HRImpl h;

    @GetMapping("/get/{Id}")
    public ResponseEntity<HRdetails> addHR(@PathVariable Long Id){
        return ResponseEntity.ok(h.getHR(Id));
    }

    @PostMapping("/add")
    public ResponseEntity<HRdetails> addHR(@RequestBody HRdetails hr){
        hr.setRole("hr");
        HRdetails ret = h.addHR(hr);
        return new ResponseEntity<HRdetails>(hr, HttpStatus.CREATED);
    }

    @PostMapping("/signIn")
    public HRdetails signIn(@RequestParam String username, @RequestParam String password){
        return h.checkHR(username,password);
    }
}
