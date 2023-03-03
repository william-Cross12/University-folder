public class Exercise_2 {
    public static void main(String[] args)
    {
        Product2 product = new Product2(298756, "Computer", 5000000);

        Exercise_2.print_Product(product);
    }

    public static void print_Product(Product2 product)
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
    private String name;
    private int quantity;

    public Product2(int id, String name, int quantity)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }


    public void setQuantity(int new_quantity)
    {
        this.quantity = new_quantity;
    }


    public int getId()
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