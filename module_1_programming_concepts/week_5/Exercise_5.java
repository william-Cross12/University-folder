import java.util.ArrayList;
public class Exercise_5 {

}



class StockDemo5
{

    private Product5 product;
    private Product5 product2;
    private Product5 product3;
    private StockList5 stocklist;


    public void run()       //adds run method that when called will run everything in the StockDemo class in the correct order
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
        this.product = new Product5(298756, "Computer", 5000000);
        this.product2 = new Product5(23462, "Keyboard", 324675);
        this.product3 = new Product5(3256, "Mouse", 23567);
    }

    public void addToList()
    {
        this.stocklist = new StockList5(this.product);
        this.stocklist.addProduct(this.product2);
        this.stocklist.addProduct(this.product3);
    }

    public void removeFromList()
    {
        this.stocklist.removeProduct(product2);
    }

    public void printList()
    {
        ArrayList<Product5> products = this.stocklist.getProducts();
        for(Product5 product:products)
        {
            this.printProduct(product);
        }
    }

    public void printProduct(Product5 product)
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
        Product5 found_product = this.stocklist.findProduct(298756);

        System.out.println();
        System.out.println("found product:");
        System.out.println(found_product);
    }
}


class StockList5
{
    private ArrayList<Product5> product_collection = new ArrayList<Product5>();


    public StockList5(Product5 product)
    {
        this.product_collection.add(product);
    }

    public void addProduct(Product5 product)
    {
        this.product_collection.add(product);
    }

    public void removeProduct(Product5 product)
    {
        this.product_collection.remove(product);
    }

    public Product5 findProduct(int id)
    {
        for(Product5 product_from_list:(this.product_collection))
        {
            if((product_from_list.getId()) == id)
            {
                return(product_from_list);
            }
        }
        return null;
    }


    public ArrayList<Product5> getProducts()
    {
        return this.product_collection;
    }
}


class Product5
{
    private int id;
    private String name;
    private int quantity;

    public Product5(int id, String name, int quantity)
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