package med.voll.api.anddress;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.*;
import med.voll.api.address.Address;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Embeddable
public class AddressDoctor {

    private String street;
    private String neighborhood;
    private String zip;
    private String city;
    private String state;
    private String number;
    private String complement;

    public AddressDoctor(Address address) {
        this.street = address.street();
        this.neighborhood = address.neighborhood();
        this.zip = address.zip();
        this.city = address.city();
        this.state = address.state();
        this.number = address.number();
        this.complement = address.complement();
    }
}
