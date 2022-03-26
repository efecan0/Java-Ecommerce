
package ecommerce;

import java.time.LocalDate;
import java.util.ArrayList;


public class User {
    private String username;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String password;
    private String email;
    private String homeAddress;
    private String workAddress;
    private ArrayList<Product> favoriteProducts;
    private ArrayList<CreditCard> creditCards;
    private ArrayList<Product> orderedProducts;

    public User(String username, String password) {
        this.name = username;
        this.surname = "";
        this.email ="";
        this.dateOfBirth= LocalDate.now();
        this.username = username;
        this.password = password;
        this.favoriteProducts = new ArrayList<>();
        this.creditCards = new ArrayList<>();
        this.orderedProducts = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth.getDayOfMonth()+ "/"+ dateOfBirth.getMonthValue() +"/"+ dateOfBirth.getYear();
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public ArrayList<Product> getFavoriteProducts() {
        return favoriteProducts;
    }

    public ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }

    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public void addCreditCard(CreditCard cc){
        System.out.println(""+cc.getNumber() + " Numbered credit card added.");
        this.creditCards.add(cc);
    }

    public void addFavoriteProduct(Product p){
        System.out.println(this.name + " added "+ p.getName()+" as his/her favorite product");
        this.favoriteProducts.add(p);
    }

    public void buyProduct(Product p){
        if (  this.creditCards.size() > 0){
            buyProduct(p,this.creditCards.get(0));
        }else {
            System.out.println(this.name + " Doesnt Have any defined Credit Card\n Cancelling order");
        }
    }
    public void buyProduct(Product p, CreditCard cc){
        System.out.println(this.name + " using credit card as " + cc.getNumber() + " to try for ordering " + p.getName()  );
        if ( p.isStockAvailable()){
            this.orderedProducts.add(p);
            System.out.println( p.getName() + " Ordered by "+ this.getName()+" " + this.surname);
            p.productOrdered();
        }else {
            System.out.println(p.getName() + " doesn't exist on stocks so Cancelling order");
        }
    }

    public void listFavoriteProducts(){
        System.out.println(this.name + this.surname + "'s favorite Prodcuts are :");
        for (Product p :this.favoriteProducts){
            System.out.println(p.getName());
        }
    }

    public void listAllOrderedProducts(){
        System.out.println(this.name +" "+ this.surname + " ordered Totally "+this.orderedProducts.size() + " Which are :");
        System.out.println("Begining of Ordered List");
        for (Product p :this.orderedProducts){
            System.out.println(p.getName());
        }
        System.out.println("End of Ordered List");
    }


    @Override
    public String toString() {
        return  "username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", workAddress='" + workAddress + '\'' +
                ", favoredProducts=" + favoriteProducts +
                ", creditCards=" + creditCards +
                ", orderedProducts=" + orderedProducts;
    }
}
