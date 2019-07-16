package HashCodeMethod;

public class HashExample {

    public static void main(String[] args) {
        Product prod1 = new Product("chocolate", 2.99);
        Product prod2 = new Product("chocolate", 2.99);
        System.out.println(prod1.equals(prod2));                        // They seem to be same
        System.out.println(prod1.hashCode());                           // If they are same then
        System.out.println(prod2.hashCode());                           // hashCode should return same value
                                                                        //
                                                                        // It happens because
                                                                        // they were generated and overridden
                                                                        // in class Product
    }



}

