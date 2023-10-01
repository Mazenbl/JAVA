public class ZooManagement {

    public static void main(String[] args) {
        //PROSIT 2
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 7;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Nahli";
        myZoo.city = "Ariana";
        myZoo.animals = new Animal[25];

        Zoo Zoo2 = new Zoo();
        Zoo2.name = "Belveder";
        Zoo2.city = "Tunis";
        Zoo2.animals = new Animal[25];


        Animal dog = new Animal("Canine", "Snoopy", 2, true);
        Animal elephant = new Animal("Elephant", "babar", 5, true);
        Animal oiseaux = new Animal("oiseaux", "ziwziw", 4, true);



        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        System.out.println(Zoo2.addAnimal(elephant));
        System.out.println(Zoo2.addAnimal(oiseaux));
        System.out.println(Zoo2.addAnimal(lion));
        System.out.println(Zoo2.addAnimal(dog));


        myZoo.displayAnimals();
        Zoo2.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
         Zoo result = Zoo.comparerZoo(myZoo,Zoo2);
        System.out.println("zoo with more animals is "+result);
        System.out.println(myZoo.isZooFull());
    }

}
