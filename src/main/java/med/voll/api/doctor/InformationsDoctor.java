package med.voll.api.doctor;

import med.voll.api.address.Address;

public record InformationsDoctor(
        String name,
        String email,
        String crm,
        Specialty specialty,
        Address address
) {
}
