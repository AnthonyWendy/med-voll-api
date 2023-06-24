package med.voll.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.api.anddress.AddressDoctor;
import med.voll.api.doctor.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorRepository repository;

    @PostMapping
    @Transactional
    public void create(@RequestBody @Valid InformationsDoctor doctor) {
        repository.save(new Doctor(doctor));
    }

    @GetMapping
    public Page<DataListDoctor> getAll(@PageableDefault(size = 10, sort = {"name"}) Pageable pageable) {
        return repository.findAll(pageable).map(DataListDoctor::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid DataUpdateDoctor dates){
        var medico = repository.getById(dates.id());
        medico.updateInformation(dates);

    }
}
