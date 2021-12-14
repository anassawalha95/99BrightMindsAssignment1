import java.util.Scanner;
import java.util.logging.Level;

public
class Main {



    public static
    void main(String[] args) throws Exception{


        Log logging = new Log("logs/main.txt","mainLogger");

        logging.logger.setLevel(Level.FINE);
        logging.logger.info("The Program Started");

        User user=new User();

        try{
        user.createUser(134,"HIMA",529853225,"hima@gmail.com",963258);
        user.createUser(135,"KIYO",544852122,"kiyo@gmail.com",100856);
        user.createUser(136,"MOLU",962355569,"molu@gmail.com",100896);
        user.createUser(137,"GEENA",544002122,"geena@gmailcom",800965);
        user.createUser(138,"MENA",563252144,"menagmail.com",800965);
        user.createUser(136,"MOLU",962355569,"molu@gmail.com",100896);


        }catch (Exception e){

            logging.logger.setLevel(Level.SEVERE);
            logging.logger.severe(e.toString());
            logging.logger.severe("Something went wrong while creating the users");

        }
        logging.logger.setLevel(Level.FINE);
        logging.logger.info("Users Are Created");


        Scanner scanner= new Scanner(System.in); //System.in is a standard input stream.
        int input;
        boolean flag=true;

        while(flag){

            System.out.println("Please Select One Of the Operations: ");

            System.out.println(" 1: sort Users Based On Reference Number");

            System.out.println(" 2: find And Print User Based On Customer Reference Number");

            System.out.println(" 3: print Users With Valid Email");

            System.out.println(" 4: print Duplicate Users ");

            System.out.println(" 5: print Users Alphabetically Without Duplicates");

            System.out.println(" 0: to exit");

            System.out.print(" Operations Number: ");

            input= scanner.nextInt();
            switch(input){
                case 0:
                    flag=false;
                    System.out.println("Bye Bye");
                    break;
                case 1:
                    Operations.sortedUsersBasedOnReferenceNumber(user.getUsers());
                    System.out.println("\n \n ");
                    break;
                case 2:
                    Operations.findAndPrintUserBasedOnCustomerReferenceNumber(user.getUsers());
                    System.out.println("\n \n ");
                    break;
                case 3:
                    Operations.printUsersWithValidEmail(user.getUsers());
                    System.out.println("\n \n ");
                    break;
                case 4:
                    Operations.printDuplicateUsers(user.getUsers());
                    System.out.println("\n \n ");
                    break;
                case 5:
                    Operations.printUsersAlphabeticallyWithoutDuplicates(user.getUsers());
                    System.out.println("\n \n ");
                    break;

                default:
                    System.out.println("Please Choose one of the Operations or enter 0 to quit ");
                    System.out.println("\n \n ");
            }

        }

    }
}
