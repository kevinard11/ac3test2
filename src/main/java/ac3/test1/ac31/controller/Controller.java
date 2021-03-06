package ac3.test1.ac31.controller;

import ac3.test1.ac31.dao.Dao;
import org.json.simple.JSONObject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@MapperScan("ac3.test1.ac31.dao")
public class Controller {

    @Autowired
    Dao dao;

    @PostMapping(value = "/")
    public ResponseEntity<?> test(@RequestBody JSONObject req){
        String name = (String) req.get("name");
        String id = dao.check(name);
        if (id != null){ return new ResponseEntity<>("Name already exists", HttpStatus.BAD_REQUEST); }
        dao.save(name);

        return new ResponseEntity<>(name, HttpStatus.OK);
    }

    @GetMapping(value="/{name}")
    public ResponseEntity<?> check(@PathVariable("name") String name){
        System.out.println(name);
        String id = dao.check(name);
        return new ResponseEntity<>("Welcome to ac3test2 project. For testing only "+ id, HttpStatus.OK);
    }

    @GetMapping(value="/debug/{value}")
    public ResponseEntity<?> welcome(@PathVariable("value") int value){
        System.out.println(value);
        value += 3;
        value+=9;
        value+=8;
        value+=12;
        int d =0;
        d+=2;
        d+=9;
        d+=8;
        String b  = "hi";
        return new ResponseEntity<>(value+""+ d+" "+b, HttpStatus.OK);
    }
}
