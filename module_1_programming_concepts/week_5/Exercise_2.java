public class Exercise_2 {
    public static void main(String[] args)
    {
        Product2 product = new Product2(298756, "Computer", 5000000);       //creates product to test if code works at current point

        product.setId(20);
        product.setName("20");
        product.setQuantity(20);

        Exercise_2.print_Product(product);
    }

    public static void print_Product(Product2 product)      //print method
    {
        int id = product.getId();
        String name = product.getName();
        int quantity = product.getQuantity();

        System.out.print(id);
        System.out.println("     id");
        System.out.print(name);
        System.out.println("     name");
        System.out.print(quantity);
        System.out.println("     quantity");
    }
}


class Product2
{
    private int id;
    private String name;        //creates variables for the class
    private int quantity;

    public Product2(int id, String name, int quantity)      //class constructor
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }


    public void setId(int new_id)       //getter methods
    {
        this.id = new_id;
    }

    public void setName(String new_name)
    {
        this.name = new_name;
    }

    public void setQuantity(int new_quantity)
    {
        this.quantity = new_quantity;
    }


    public int getId()          //setter methods
    {
        return(this.id);
    }

    public String getName()
    {
        return(this.name);
    }

    public int getQuantity()
    {
        return(this.quantity);
    }

}


class StockList2
{

}


class StockDemo2
{

}