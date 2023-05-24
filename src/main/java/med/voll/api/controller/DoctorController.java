package med.voll.api.controller;

import med.voll.api.doctor.InformationsDoctor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @PostMapping
    public void create(@RequestBody InformationsDoctor doctor) {
        System.out.println(doctor);
    }
}
