import MyPet.Pet;
public class Main {

    public static void main(String[] args){
        Pet bambina = new Pet();
        bambina.name = "Bambina";
        bambina.breed = "ScotishFold";
        bambina.age = 4;
        bambina.weight = 3.5f;
        bambina.setGender("She");
        System.out.println(bambina.introduceMyPet());

        Pet corolina = new Pet();
        corolina.name = "Corolina";
        corolina.breed = "British";
        corolina.age = 2;
        corolina.weight = 2.3f;
        corolina.seteyeColor("green");
        System.out.println(corolina.introduceMyPet2());
    }
}
