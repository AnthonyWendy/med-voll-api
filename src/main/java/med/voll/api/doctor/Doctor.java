package med.voll.api.doctor;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import med.voll.api.anddress.AddressDoctor;
import med.voll.api.anddress.AddressDoctor;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String crm;
    @NotBlank
    private String phone;
    @Enumerated(EnumType.STRING)
    private Specialty specialty;
    @Embedded
    private AddressDoctor address;

    public Doctor(InformationsDoctor dados) {
        this.name = dados.name();
        this.email = dados.email();
        this.crm = dados.crm();
        this.specialty = dados.specialty();
        this.address = new AddressDoctor(dados.address());
        this.phone = dados.phone();
    }
}
