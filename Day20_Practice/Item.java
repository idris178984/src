package Day20_Practice;

public class Item {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] itemPrices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        int indexNumberOfGloves=-1;
        boolean ipad=false;
        String report="";

        for (int i = 0; i < items.length; i++) {
            String itemNames=items[i];
            double itemPrice=itemPrices[i];
            int ıtemIDs=itemIDs[i];

            if(itemNames.equals("Gloves")){
                indexNumberOfGloves=i;
            }
            if(itemNames.equals("ipad")){
                ipad=true;
            }
            report += itemNames +" - "+itemPrice+" -"+itemIDs+"\n";

            System.out.println("indexNumOfGloves = " + indexNumberOfGloves);
            System.out.println("ipad = " + ipad);
            System.out.println(report);
        }

    }
}
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID


 */