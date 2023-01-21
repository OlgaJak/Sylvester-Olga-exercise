public class Main {
    public static void main(String[] args) {
        University Tartu = new University("Tartu University",2000,5,500,true,50);
         Tartu.upTo300Students();
         Tartu.extraFee();
         Tartu.lunchFree();
        System.out.println();

         SecondarySchool Ilupesa = new SecondarySchool("Ilupesa kool", 1500,9,30,true,12);
         Ilupesa.upTo200Students();
         Ilupesa.breakfastFree();
         Ilupesa.milk();
        System.out.println();

         College Mechanics = new College("Mehhaanikakool", 1000,4,50,true,6);
         Mechanics.upTo300Students();
         Mechanics.breakfastFree();
         Mechanics.extraFree();
        System.out.println();


    }
}
 //- create a Gradle project
//- create a class that implements three interfaces and inherits from one superclass that itself inherits from one superclass
//  - One of the superclasses must be an abstract class
//  - Each class must have at least three methods
