import java.util.ArrayList;
public class Exercise_6 {
    public static void main(String[] args)      //main method that runs when the code is ran
    {
        StockDemo6 demo = new StockDemo6();     //initalises the StockDemo class
        demo.run();             //runs the run function in the StockDemo class

    }

}



class StockDemo6
{

    private Product6 product;
    private Product6 product2;
    private Product6 product3;
    private StockList6 stocklist;


    public StockDemo6()
    {

    }


    public void run()
    {
        System.out.println("creating products...");
        this.createProduct();

        System.out.println("adding to list...");
        this.addToList();

        System.out.println("printing list:");
        this.printList();

        System.out.println("removing Keyboard from list...");
        this.removeFromList();

        System.out.println("printing list:");
        this.printList();

        System.out.println("searching list for Computer...");
        this.searchList();

    }


    public void createProduct()
    {
        this.product = new Product6(298756, "Computer", 5000000);
        this.product2 = new Product6(23462, "Keyboard", 324675);
        this.product3 = new Product6(3256, "Mouse", 23567);
    }

    public void addToList()
    {
        this.stocklist = new StockList6(this.product);
        this.stocklist.addProduct(this.product2);
        this.stocklist.addProduct(this.product3);
    }

    public void removeFromList()
    {
        this.stocklist.removeProduct(product2);
    }

    public void printList()
    {
        ArrayList<Product6> products = this.stocklist.getProducts();
        for(Product6 product:products)
        {
            this.printProduct(product);
        }
    }

    public void printProduct(Product6 product)
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

    public void searchList()
    {
        Product6 found_product = this.stocklist.findProduct(298756);

        System.out.println("found product:");
        this.printProduct(found_product);
    }
}


class StockList6
{
    private ArrayList<Product6> product_collection = new ArrayList<Product6>();


    public StockList6(Product6 product)
    {
        this.product_collection.add(product);
    }

    public void addProduct(Product6 product)
    {
        this.product_collection.add(product);
    }

    public void removeProduct(Product6 product)
    {
        this.product_collection.remove(product);
    }

    public Product6 findProduct(int id)
    {
        for(Product6 product_from_list:(this.product_collection))
        {
            if((product_from_list.getId()) == id)
            {
                return(product_from_list);
            }
        }
        return null;
    }


    public ArrayList<Product6> getProducts()
    {
        return this.product_collection;
    }
}


class Product6
{
    private int id;
    private String name;
    private int quantity;

    public Product6(int id, String name, int quantity)
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