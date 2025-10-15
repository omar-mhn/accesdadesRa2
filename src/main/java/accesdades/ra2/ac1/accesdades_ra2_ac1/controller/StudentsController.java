package accesdades.ra2.ac1.accesdades_ra2_ac1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import accesdades.ra2.ac1.accesdades_ra2_ac1.model.student;
import accesdades.ra2.ac1.accesdades_ra2_ac1.repository.StudentRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
// Define la ruta base para todos los endpoints dentro de esta clase.En este case (api) 

@RequestMapping("/api")
public class StudentsController {
    @Autowired
    StudentRepository studentRepository;
@GetMapping("/students")
public List<student> getStudent() {
    return studentRepository.findAll();
    
}
@PostMapping("/students/batch")
public String addStudent() {
    int numReg = studentRepository.save();
    return "has afegit " + numReg +" registre.";
}



}
