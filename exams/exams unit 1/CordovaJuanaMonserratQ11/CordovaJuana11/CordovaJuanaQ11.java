  public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    boolean mainLoop = true; 
    int option;
    do{
     System.out.println("Enter the table that you want to study 1. \n or (0) "
             + "for Exit --> ");
        option = input.nextInt();
        
        switch(option){            

        
        case 1:
            System.out.println("Enter a table");
             final int top = 12;
        int product;
        int table;
        table = input.nextInt();
        System.out.println("Multiplication tables: " + table);
       for(int n = 1; n <= top; n++){
            product = table * n;
            System.out.println( table + " * " + n + " = " + product);
            product++;
        }
              break;
                 case 0:
            System.out.println("-> see you later <-");
                    System.exit(0);
                    break;
        }
        
    }while (option != 0);
    }
    
}
