
public class RelationalFun {
    public static void main(String[] args) {
        // Put some boolean declarations
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 51;
        int yourAge = 20;
        int bobsAge = 20;

        String myName = "Shubham";
        String yourName = "Shivani";

        // Lesson code

        int currentAge = 52;

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is" + yourBool);

        // now add some relational items

        boolean ageComparison = myAge > yourAge;

        System.out.println("myAge > yourAge?: " + ageComparison);

        ageComparison = yourAge > bobsAge;

        System.out.println("yourAge > bobsAge ? :  " + ageComparison);

        ageComparison = yourAge == bobsAge;

        System.out.println("yourAge = bobsAge ? :  " + ageComparison);

        // Now do name comparisons

        boolean nameComparison = myName.equals(yourName);
        System.out.println("do names Match this way?:  " + nameComparison);

        ageComparison = currentAge >= 21;

        System.out.println("my Age is greater than 21 ? : " + ageComparison);

    }


}
