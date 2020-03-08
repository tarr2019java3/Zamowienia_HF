public class Main {
    public static void main(String[] args) {

        Customer customer=new Customer ("Piotr", "Nowak",20,"www@wp.pl");
        Customer customer1=new Customer ("Jan", "Pak",32,"ddd@wp.pl");
        Customer customer2=new Customer ("Jacek", "Ziuk",17,"sss@wp.pl");
        Customer customer3=new Customer ("Iwo", "Dino",54,"uuu@wp.pl");

        Product product= new Product("kilof", 203,Category.A);
        Product product1= new Product("piła", 123,Category.B);
        Product product2= new Product("wiadro", 13,Category.C);
        Product product3= new Product("łom", 78,Category.A);

        Order order= new Order(customer, product, 234, 12/04/2020);
        Order order1= new Order(customer1, product1, 34,23/07/2020);
        Order order2= new Order(customer2, product2, 76,07/07/2021);
        Order order3= new Order(customer3, product3, 543, 30/05/2022);

    }

}
