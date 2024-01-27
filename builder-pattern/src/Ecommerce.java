public class Ecommerce {
    
    public static void main(String[] args){
        //Creating a user
        User myProfile = new User.UserConfig()
            .firstName("Vem Aiensi")
            .lastName("Marasigan")
            .email("vem.marasigan@neu.edu.ph")
            .address("NEMD9 Sagana, Culiat, QC")
            .phone("####-###-####")
            .age(20)
            .build();
        
        System.out.println("User Created! Here are your details");
        System.out.println("  First Name:   "+ myProfile.firtName);
        System.out.println("  Last Name:    "+ myProfile.lastName);
        System.out.println("  Email:        "+ myProfile.email);
        System.out.println("  Address:      "+ myProfile.address);
        System.out.println("  Phone Number: "+ myProfile.phone);
        System.out.println("  Age:          "+ myProfile.age + "\n");

        System.out.println("-------[ Builder Pattern ]-------\n" +
                        "by Marasigan, Vem Aiensi : 3BSCS-1");
    }
}
