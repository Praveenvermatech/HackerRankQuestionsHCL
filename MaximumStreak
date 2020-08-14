import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

 class Main {

    public static void main(String[] args)
    {
        List<String> data = new ArrayList<>();

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Number of Employee: ");

        int numberOfItems = Integer.parseInt(scn.nextLine());

        for (int i=0; i<numberOfItems ;i++)
        {
            System.out.print("Enter Employee Attandance (Suppose 4 Employee like 4 days attendence:[YYYY,YYYN,YYYY,YYNY] ):"+i+": ");
            String att = scn.nextLine();
            data.add(att);
        }
        System.out.println("Result" + maxStreak(numberOfItems, data));
    }

    public static int maxStreak(int m, List<String> data)
    {
        int counter = 0;
// Logic 1 for imperative proframming 
        // for(int i=0;i<data.size() ; i++)
        // {
        //     if(m==data.get(i).length())
        //     {
        //         if(!data.get(i).contains("N"))
        //         {
        //             counter++;
        //         }
        //     }
        // }
// Logic 2 for Lembda Expression        
      counter = data.stream().filter(x-> x.length() == m).filter(i-> !i.contains("N")).collect(Collectors.toList()).size();
        return counter;
    }
}
