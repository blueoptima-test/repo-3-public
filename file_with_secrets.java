public class MyClass {
    private String password = "MySecretPassword123";

    public void doSomething() {
        System.out.println("Doing something...");
    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.doSomething();
        System.out.println("Stored password: " + obj.getPassword());
    }
}
