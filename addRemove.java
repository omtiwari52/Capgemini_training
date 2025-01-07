import java.util.*;

public class addRemove {

    static ArrayList<Integer> lis = new ArrayList<>();

    public static void addInteger(int a){
        lis.add(a);
    }
    public static void removeInteger(int index){
        for(int i = 0; i < lis.size(); i++){
            if( i == index){
                lis.remove(index);
            }
        }
    }
    // public static void addRemoveChoice(int n){
    //     Scanner sc = new Scanner(System.in);
    //     int choice = sc.nextInt();
    //     switch (choice) {
    //         case 1:
    //             addInteger(n);
    //             System.out.println("You added "+ n + " in the list");
    //             break;
    //         case 2:
    //             if(lis.size() >= n){
    //                 removeInteger(n);
    //                 System.out.println("You removed "+ n + " index from the list");
    //             }
    //             else{
    //                 System.out.println("Index out of bounds");
    //             }
    //     }
    //     System.out.println("You wish to continue??");
    //     int user = sc.nextInt();
    //     System.out.println("Enter choice: "+ user);
    //     if(user == 1){
    //         addRemoveChoice(n);
    //     }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                addInteger(n);
                System.out.println("You added "+ n + " in the list");
                break;
            case 2:
                if(lis.size() >= n){
                    removeInteger(n);
                    System.out.println("You removed "+ n + " index from the list");
                }
                else{
                    System.out.println("Index out of bounds");
                }
        }

        // addRemoveChoice(n);
        for(int i = 0; i < lis.size(); i++){
            System.out.print("Your new list is: " + lis.get(i));
        }
    }
}
