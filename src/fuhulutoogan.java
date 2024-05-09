import java.util.*;

public class fuhulutoogan {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<String>();
        Scanner in = new Scanner(System.in);

        myList.add("jittlyang");
        myList.add("fuhulutoogan");
        myList.add("duck");
        myList.add("ollie");
        myList.add("annaconda in pierces pants");
        myList.add("bear");
        myList.add("duck 2.0");
        myList.add("andrew Zimmerman");
        myList.add("monkey");
        myList.add("that one bear from the movie cocaine bear but specifically the baby on the left");

        for(int i =0; i < myList.size(); i++){
            System.out.println(i+ 1 +". " );
            System.out.println(myList.get(i));
        }
     /*   System.out.println("Give me an item to remove");
        int myItem = 0;
        myItem = in.nextInt();

        myItem--;

        myList.remove(myItem);

        for(int i =0; i < myList.size(); i++){
            System.out.println(i+1+". ");
            System.out.println(myList.get(i));
        }

        System.out.println("what do you want to add");
        String myString ="";
        myString = in.next();

        myList.add(myString);

        for(int i =0; i < myList.size(); i++){
            System.out.println(i+ 1 +". " );
            System.out.println(myList.get(i));
        }
*/
        System.out.println("what do you want to replace");
        String myString2 ="";
        myString2 = in.next();

        myList.set(5,myString2);

        for(int i =0; i < myList.size(); i++){
            System.out.println(i+ 1 +". " );
            System.out.println(myList.get(i));
        }










    }

}
