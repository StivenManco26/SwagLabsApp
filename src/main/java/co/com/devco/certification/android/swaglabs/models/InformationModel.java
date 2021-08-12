package co.com.devco.certification.android.swaglabs.models;

/**
 * Clase modelo que contiene la informacion para el checkout
 *
 * @author manco.5@hotmail.com
 */
public class InformationModel {
    private String firstName;
    private String lastName;
    private String postalCode;

    public InformationModel(String firstName, String lastName, String postalCode) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPostalCode(postalCode);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
