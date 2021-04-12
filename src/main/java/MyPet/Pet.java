package MyPet;

public class Pet {
    public String name;
    public String breed;
    public float weight;
    public int age;
    private String gender;
    private String eyecolor;


    public String introduceMyPet(){
        return "\nHi, I have a cat. It's name is " + name +
                ". \nIt is " + breed + " and weight for " + weight +
                " kg. \nIt has three colours, that how you know it is " + gender + ". " +
                gender + " is " + age + " years old.\n";}
    public void setGender(String genderToSet) { gender = genderToSet; }
    public String introduceMyPet2() {
        return "\nHi, I have another cat. It's name is " + name +
                ". \nIt is " + breed + " and weight for " + weight +
                " kg. \nShe is black as the night and her eyes are " +
                eyecolor +"."+" She is " + age + " years old.";
    }
    public void seteyeColor(String eyecolorToSet) { eyecolor = eyecolorToSet; }
}
