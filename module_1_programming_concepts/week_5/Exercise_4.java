import java.util.ArrayList;
public class Exercise_4 {

}



class StockDemo4        //basically this class does all the tests I ran in the earlier tasks without me realising
{

    private Product4 product;
    private Product4 product2;          //variables used in the class
    private Product4 product3;
    private StockList4 stocklist;

    public void createProduct()     //creates the product method
    {
        this.product = new Product4(298756, "Computer", 5000000);
        this.product2 = new Product4(23462, "Keyboard", 324675);
        this.product3 = new Product4(3256, "Mouse", 23567);
    }

    public void addToList()     //method to add created products to the array list in StockList
    {
        this.stocklist = new StockList4(this.product);
        this.stocklist.addProduct(this.product2);
        this.stocklist.addProduct(this.product3);
    }

    public void removeFromList()        //method to remove item from the arraylist
    {
        this.stocklist.removeProduct(product2);
    }

    public void printList()     //method iterates through arraylist sending each to other method which disects them and prints them
    {
        ArrayList<Product4> products = this.stocklist.getProducts();
        for(Product4 product:products)
        {
            this.printProduct(product);
        }
    }

    public void printProduct(Product4 product)      //method that actually prints the information
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

    public void searchList()        //method that searches the arraylist and sends to be printed
    {
        Product4 found_product = this.stocklist.findProduct(298756);

        System.out.println();
        System.out.println("found product:");
        System.out.println(found_product);
    }
}


class StockList4
{
    private ArrayList<Product4> product_collection = new ArrayList<Product4>();


    public StockList4(Product4 product)
    {
        this.product_collection.add(product);
    }

    public void addProduct(Product4 product)
    {
        this.product_collection.add(product);
    }

    public void removeProduct(Product4 product)
    {
        this.product_collection.remove(product);
    }

    public Product4 findProduct(int id)
    {
        for(Product4 product_from_list:(this.product_collection))
        {
            if((product_from_list.getId()) == id)
            {
                return(product_from_list);
            }
        }
        return null;
    }


    public ArrayList<Product4> getProducts()
    {
        return this.product_collection;
    }
}


class Product4
{
    private int id;
    private String name;
    private int quantity;

    public Product4(int id, String name, int quantity)
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