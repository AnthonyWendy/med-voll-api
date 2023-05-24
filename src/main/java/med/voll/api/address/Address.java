package med.voll.api.address;

public record Address(
        String street,
        String neighborhood,
        String zip,
        String city,
        String state,
        String number,
        String complement

) {
}
