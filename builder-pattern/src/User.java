public class User {
    protected final String firtName;
    protected final String lastName;
    protected final String email;
    protected final String address;
    protected final String phone;
    protected final int age;

    private User(UserConfig builder){
        this.firtName = builder.firtName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.address = builder.address;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    protected static class UserConfig {
        private String firtName;
        private String lastName;
        private String email;
        private String address;
        private String phone;
        private int age;
    
        public UserConfig firstName(String firstName){
            this.firtName = firstName;
            return this;
        }
    
        public UserConfig lastName(String lastName){
            this.lastName = lastName;
            return this;
        }
    
        public UserConfig email(String email){
            this.email = email;
            return this;
        }
    
        public UserConfig address(String address){
            this.address = address;
            return this;
        }

        public UserConfig phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserConfig age(int age){
            this.age = age;
            return this;
        }
        
        public User build(){
            return new User(this);
        }
    }
}
