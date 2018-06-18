package Day16;

public class Pet {

    private String name;
    private String species;
    private String primaryBreed;
    private String secondaryBreed;

    public Pet() {
    }

    public Pet(String name, String species, String primaryBreed, String secondaryBreed) {
        this.name = name;
        this.species = species;
        this.primaryBreed = primaryBreed;
        this.secondaryBreed = secondaryBreed;
    }

    public String getName() { return this.name; }
    public String getSpecies() { return this.species; }
    public String getPrimaryBreed() { return this.primaryBreed; }
    public String getSecondaryBreed() { return this.secondaryBreed; }

    public void setNmae(String name) { this.name = name; }


    public String toString() {
        return String.format("<Pet name=%s, species=%s>\n", this.name, this.species);
    }
}