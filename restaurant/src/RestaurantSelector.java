/** *************************************************************************
 *                      Activity 5 - Restaurant Selector
 *
 *  Name: Sean REYBOZ
 *  Date: 01/22/23
 *  Last modified: 01/24/23
 *
 *  Summary:
 *  This class asks the user whether any of the party members are vegan,
 *  vegetarian or gluten-free, before displaying a list of restaurants
 *  matching the dietary needs of every member in the group.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantSelector
{
    public static void main(String[] args) {
        // Variables declaration
        String isVegan, isVegetarian, isGlutenIntolerant;

        Map<String, String> restaurants = new HashMap<>();
        restaurants.put("joe", "Joe's Gourmet Burgers");        // V = f,  VG = f,  GF = f
        restaurants.put("pizza", "Main Street Pizza Company");  // V = t,  VG = f,  GF = t
        restaurants.put("cafe", "Corner Café");                 // V = t,  VG = t,  GF = t
        restaurants.put("italian", "Joe's Gourmet Burgers");    // V = t,  VG = f,  GF = f
        restaurants.put("chef", "The Chef's Kitchen");          // V = t,  VG = t,  GF = t

        Scanner input = new Scanner(System.in);

        // Variables initialization
        System.out.print("Is anyone in your party vegetarian? (yes/no): ");
        isVegetarian = input.nextLine();
        System.out.print("Is anyone in your party vegan? (yes/no): ");
        isVegan = input.nextLine();
        System.out.print("Is anyone in your party gluten intolerant? (yes/no): ");
        isGlutenIntolerant = input.nextLine();


        System.out.println("\nHere are your restaurants choices:");

        /*
        if ((isVegetarian.equals("yes") || isVegetarian.equals("no"))
                && isVegan.equals("yes")
                && (isGlutenIntolerant.equals("yes") || isGlutenIntolerant.equals("no"))
        ) {
            System.out.println("\tCorner Café");
            System.out.println("\tThe Chef's Kitchen");
        }

        if (isVegetarian.equals("yes") && isVegan.equals("no") && isGlutenIntolerant.equals("yes")) {
            System.out.println("\tMain Street Pizza Company");
            System.out.println("\tCorner Café");
            System.out.println("\tThe Chef's Kitchen");
        }

        if (isVegetarian.equals("yes") && isVegan.equals("no") && isGlutenIntolerant.equals("no")) {
            System.out.println("\tMain Street Pizza Company");
            System.out.println("\tCorner Café");
            System.out.println("\tMama's Fine Italian");
            System.out.println("\tThe Chef's Kitchen");
        }

        if (isVegetarian.equals("no") && isVegan.equals("no") && isGlutenIntolerant.equals("no")) {
            System.out.println("\tJoe's Gourmet Burgers");
            System.out.println("\tMain Street Pizza Company");
            System.out.println("\tCorner Café");
            System.out.println("\tMama's Fine Italian");
            System.out.println("\tThe Chef's Kitchen");
        }
        */

        // different (somewhat better) approach using a HashMap
        if (isVegan.equals("yes")) {
            restaurants.remove("joe");
            restaurants.remove("pizza");
            restaurants.remove("italian");
        }

        if (isVegetarian.equals("yes")) {
            restaurants.remove("joe");
        }

        if (isGlutenIntolerant.equals("yes")) {
            restaurants.remove("joe");
            restaurants.remove("italian");
        }


        for (String restaurant : restaurants.values()) {
            System.out.printf("\t%s\n", restaurant);
        }
    }
}
