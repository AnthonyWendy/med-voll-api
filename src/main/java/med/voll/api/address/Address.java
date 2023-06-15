package med.voll.api.address;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record Address(
        @NotBlank
        String street,
        @NotBlank
        String neighborhood,
        @Pattern(regexp = "\\d{8}")
        String zip,
        @NotBlank
        String city,
        @NotBlank
        String state,
        String number,
        String complement

) {
}
