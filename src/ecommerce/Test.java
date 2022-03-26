
package ecommerce;

import java.time.LocalDate;


public class Test {
    public static void main(String[] args) {
        User efe = new User("efecan","1234");
        efe.setName("Efe");
        efe.setSurname("Erdem");
        efe.setDateOfBirth(LocalDate.of(2001,7,9));
        efe.setHomeAddress("Izmir Home Address");
        efe.setWorkAddress("Everywhere is Trabzon for me");
        efe.setEmail("efecanerdem0907@gmail.com");
        CreditCard cc = new CreditCard(1234234142423425L,efe,502,LocalDate.of(2023,5,1));
        CreditCard cc2 = new CreditCard(4998500123451234L,efe,248,LocalDate.of(2053,12,1));
        efe.addCreditCard(cc);
        efe.addCreditCard(cc2);
        Product p = new Product("Kitkat","White","Chocolate",2L,100L,"Kitkat chocololatey");
        Product p2 = new Product("Marlboro","Red","Cigaratte",10L,20L,"Marboro brand cigaratte");
        efe.addFavoriteProduct(p2);
        efe.addFavoriteProduct(p);
        efe.listFavoriteProducts();
        efe.buyProduct(p2,cc2);
        efe.buyProduct(p);
        efe.buyProduct(p);
        efe.buyProduct(p);
        efe.listAllOrderedProducts();
        System.out.println(efe);
        
        



    }

}

