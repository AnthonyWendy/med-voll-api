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

    public void updateInformation(Address dates) {
        if(dates.street() != null){
            this.street = dates.street();
        }
        if(dates.neighborhood() != null){
            this.neighborhood = dates.neighborhood();
        }
        if(dates.zip() != null){
            this.zip = dates.zip();
        }
        if(dates.city() != null){
            this.city = dates.city();
        }
        if(dates.state() != null){
            this.state = dates.state();
        }
        if(dates.number() != null){
            this.number = dates.number();
        }
        if(dates.complement() != null){
            this.complement = dates.complement();
        }

    }
}
