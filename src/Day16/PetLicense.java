package Day16;

public class PetLicense {

    //fields
    private String issueDate;
    private int licenseNumber;
    private int zipCode;
    private Pet animal;

    //constructors
    public PetLicense() {
    }

    public PetLicense(String issueDate, int licenseNumber, String name, String species, String primaryBreed, String secondaryBreed, int zipCode) {
        this.issueDate = issueDate;
        this.licenseNumber = licenseNumber;
        this.zipCode = zipCode;
        this.animal = new Pet(name, species, primaryBreed, secondaryBreed);
    }

    //accessors
    public String getIssueDate() { return this.issueDate; }
    public int getLiceseNumber() { return this.licenseNumber; }
    public int getZipCode() { return this.zipCode; }
    public Pet getAnimal() { return this.animal; }


    //mutators
    public void setIssueDate (String value) { this.issueDate = value; }
    public void setLicenseNumber (int value) { this.licenseNumber = value; }
    public void setZipCode (int value) { this.zipCode = value; }
    public void setAnimal (Pet value) { this.animal = value; }

    //toString
    public String toString() {
        return String.format("<PetLicense id=%d name=%s>\n", this.licenseNumber, this.animal.getName());
    }

}