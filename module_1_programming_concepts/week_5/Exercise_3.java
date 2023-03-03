import java.util.ArrayList;
public class Exercise_3 {
    public static void main(String[] args)
    {
        Product3 product = new Product3(298756, "Computer", 5000000);
        Product3 product2 = new Product3(23462, "Keyboard", 324675);
        Product3 product3 = new Product3(3256, "Mouse", 23567);
        Product3 product4 = new Product3(298756, "Computer", 5000000);      //creates more products to test new functionalities

        product.setId(20);
        product.setName("20");
        product.setQuantity(20);


        StockList3 stocklist = new StockList3(product);
        stocklist.addProduct(product2);
        stocklist.addProduct(product3);
        stocklist.addProduct(product4);


        ArrayList<Product3> products = stocklist.getProducts();
        for(Product3 product_from_list:products)
        {
            Exercise_3.print_Product(product_from_list);
        }


        Product3 found_product = stocklist.findProduct(298756);

        System.out.println();
        System.out.println("found product:");

        Exercise_3.print_Product(found_product);



    }

    public static void print_Product(Product3 product)
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
        System.out.println();
    }
}


class StockList3
{
    private ArrayList<Product3> product_collection = new ArrayList<Product3>();     //arraylist of products


    public StockList3(Product3 product)             //constructs the class
    {
        this.product_collection.add(product);
    }


    public void addProduct(Product3 product)        //adds products to arraylist
    {
        this.product_collection.add(product);
    }

    public void removeProduct(Product3 product)     //removes product from arraylist
    {
        this.product_collection.remove(product);
    }

    public Product3 findProduct(int id)             //user sends id
    {
        for(Product3 product_from_list:(this.product_collection))       //checks through everything in the arraylist
        {
            if((product_from_list.getId()) == id)       //if the arraylist id is the same as the inputted id:
            {
                return(product_from_list);    //outputs that item from the arraylist
            }
        }
        return null;
    }


    public ArrayList<Product3> getProducts()
    {
        return this.product_collection;
    }
}


class Product3
{
    private int id;
    private String name;
    private int quantity;

    public Product3(int id, String name, int quantity)
    {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }


    public void setId(int new_id)
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


class StockDemo3
{

}