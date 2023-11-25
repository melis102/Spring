package edu.fra.uas.hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/api/student")  //
@Controller
public class HelloWorldController {

    @RequestMapping(value="hello", method=RequestMethod.GET)
    @ResponseBody
    @GetMapping  //
    public String getHelloWorld(){
        return "<h1>Hello World Spring Boot!</h1>";
    }


    private final List<Student> students = new ArrayList<>(); //mein Code

    @Autowired
    private GradeCalculator gradeCalculator;

    @PostMapping("/{id}/add-grade")
    public void addGrade(@PathVariable int id, @RequestBody double grade) {
        Student student = students.get(id);
        student.addGrade(grade);
    }
    
 
    
 @GetMapping("/{id}/average")
    public double getAverage(@PathVariable int id) {
        Student student = students.get(id);
        return gradeCalculator.calculateAverage(student.getGrades());

        
    } 
}
