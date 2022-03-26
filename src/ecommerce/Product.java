
package ecommerce;

public class Product {
    private String name;
    private String color;
    private String category;
    private long stockCount;
    private long weight;
    private String descriptionInfo;

    public Product(String name, String color, String category, long stockCount, long weight, String descriptionInfo) {
        this.name = name;
        this.color = color;
        this.category = category;
        this.stockCount = stockCount;
        this.weight = weight;
        this.descriptionInfo = descriptionInfo;
    }

    public Product(String name, String category, long stockCount, long weight) {
        this.name = name;
        this.category = category;
        this.stockCount = stockCount;
        this.weight = weight;
        this.color = "Unknown";
        this.descriptionInfo = "Not Available";
    }

    public Product(String name, String category, long weight) {
        this.name = name;
        this.category = category;
        this.weight = weight;
        this.stockCount = 1;
        this.color = "Unknown";
        this.descriptionInfo = "Not Available";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getStockCount() {
        return stockCount;
    }

    public void setStockCount(long stockCount) {
        this.stockCount = stockCount;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public String getDescriptionInfo() {
        return descriptionInfo;
    }

    public void setDescriptionInfo(String descriptionInfo) {
        this.descriptionInfo = descriptionInfo;
    }

    public void productOrdered(){
        this.stockCount --;
        System.out.println("Remaining stock for "+ this.getName() + " : "+this.stockCount);
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", category='" + category + '\'' +
                ", stockCount=" + stockCount +
                ", weight=" + weight +
                ", descriptionInfo='" + descriptionInfo +  '\'';
    }

    public boolean isStockAvailable(){
        return stockCount > 0 ;
    }

}
