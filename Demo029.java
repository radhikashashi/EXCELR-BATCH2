import java.util.ArrayList;

 class Demo029 {
    public static void main(String[] args) {
       
        ArrayList<String> friends = new ArrayList<>();

        
        friends.add("Varun");
        friends.add("Shashi");
        friends.add("Vignesh");
        friends.add("Pavan");
        friends.add("Madhav");
        friends.add("Rohith");
        friends.add("Uday");
        friends.add("Vasu");
        friends.add("Harsha");
        friends.add("Azeez");

        
        System.out.println("List of friends:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
