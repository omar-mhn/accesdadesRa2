package accesdades.ra2.ac1.accesdades_ra2_ac1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;




@RestController
// Define la ruta base para todos los endpoints dentro de esta clase.En este case (api) 

@RequestMapping("/api")
public class StudentsController {
@GetMapping("/students")
public String getStudent() {
    return "Endpoint Get";
}
@PostMapping("/students/batch")
public String postStudent() {
    
    
    return "Endpoint Post";
}



}
