 class Demo024 {
    public static void main(String[] args) {
        
        String[] names = new String[5];
        String[] phoneNumbers = new String[5];
        String[] addresses = new String[5];

       
        names[0] = "Vignesh";
        phoneNumbers[0] = "123-456-7890";
        addresses[0] = "123 Elm Street";

        names[1] = "Madhav";
        phoneNumbers[1] = "234-567-8901";
        addresses[1] = "456 Oak Avenue";

        names[2] = "Pavan";
        phoneNumbers[2] = "345-678-9012";
        addresses[2] = "789 Pine Lane";

        names[3] = "Uday";
        phoneNumbers[3] = "456-789-0123";
        addresses[3] = "321 Maple Drive";

        names[4] = "Shashank";
        phoneNumbers[4] = "567-890-1234";
        addresses[4] = "654 Birch Road";

       
        System.out.println("Details of Friends:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Friend " + (i + 1) + ":");
            System.out.println("Name: " + names[i]);
            System.out.println("Phone Number: " + phoneNumbers[i]);
            System.out.println("Address: " + addresses[i]);
            System.out.println();
        }
    }
}

