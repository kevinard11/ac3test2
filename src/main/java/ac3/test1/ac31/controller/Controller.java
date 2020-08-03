package ac3.test1.ac31.controller;

import ac3.test1.ac31.dao.Dao;
import org.json.simple.JSONObject;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping(value="/")
    public ResponseEntity<?> welcome(){
        System.out.println("test");return new ResponseEntity<>("Welcome", HttpStatus.OK);
    }
}
