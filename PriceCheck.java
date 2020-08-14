import java.util.Scanner;

class Main {



    public static void main(String[] args)
    {
        System.out.println("Price Om Namah shivaye");

        String [] product;
        float []  productPrice;

        String [] productSold;
        float []  soldPrice;

        //return number of sale price that entered encorrectly
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of Product want to enter ");


        int numberOfItems = Integer.parseInt(scn.nextLine());

        //Set the size of array
        product = new String[numberOfItems];
        productPrice = new float[numberOfItems];

        for(int i=0; numberOfItems > i; i++)
        {
            System.out.print("Enter Product  " + i +" Name");
            product[i] = scn.nextLine();
        }

        for(int i=0; numberOfItems > i; i++)
        {
            System.out.print("Enter Product Price " + i +"Price");
            productPrice[i] = Float.valueOf(scn.nextLine());
        }

        System.out.print("Enter number of Product Sold");
        Scanner scn2 = new Scanner(System.in);
        int numberOfProductSold = Integer.parseInt(scn2.nextLine());

        //Set the size of array
        productSold = new String[numberOfProductSold];
        soldPrice = new float[numberOfProductSold];

        for(int i=0; numberOfProductSold > i; i++)
        {
            System.out.print("Enter sold Product  " + i +"Name");
            productSold[i] = scn.nextLine();
        }

        for(int i=0; numberOfProductSold > i; i++)
        {
            System.out.print("Enter Sold Price " + i +"Price");
            soldPrice[i] = Float.valueOf(scn.nextLine());
        }

        priceCheck(product, productPrice, productSold, soldPrice);


    }

    public static void priceCheck(String[] product, float[] productPrice, String[] productSold, float[] soldPrice)
    {
        int count = 0;

        // 1st Logic
//        for (int i=0; productSold.length> i ; i++)
//        {
//            if (productPrice[Arrays.asList(product).indexOf(productSold)]  != soldPrice[i])
//            {
//                count++;
//            }
//        }

        // 2nd Logic
        for(int j=0; j < product.length ; j++)
        {
            for (int i=0; i < productSold.length; i++)  // compare array values
            {
                if(product[j].equals(productSold[i]) && (productPrice[j] != soldPrice[i]))
                {
                    count++;
                }
            }
        }

        System.out.print("Total product Price has error" + count);
    }
}
