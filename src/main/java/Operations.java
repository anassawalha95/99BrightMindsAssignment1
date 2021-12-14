import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.logging.Level;
import java.util.regex.Pattern;

public
class Operations {

    private static Log logging;

    static {
        try {
            logging = new Log("logs/Operations.txt","operationsLogger");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ;




    public static void sortedUsersBasedOnReferenceNumber(ArrayList<User> users){
        try {

            users.sort(Comparator.comparing(user -> user.getCustomerReferenceNumber()));

            for (User user : users) {
                printUser(user);
            }
        }
        catch (Exception e){

            logging.logger.setLevel(Level.SEVERE);
          //  logging.logger.severe(e.toString());
            logging.logger.severe("sortedUsersBasedOnReferenceNumber function in class Operation had an issue");

        }

        logging.logger.setLevel(Level.FINE);
        logging.logger.info("user called sortedUsersBasedOnReferenceNumber function");

    }


    public static void findAndPrintUserBasedOnCustomerReferenceNumber(ArrayList<User> users){
        try {
        Scanner scanner= new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Customer Reference Number: ");
        int input= scanner.nextInt();
        boolean flag=true;

        logging.logger.setLevel(Level.INFO);
        logging.logger.info("The user entered: "+ input);
        for(User user : users)
        {
          if (user.getCustomerReferenceNumber() ==input) {
              printUser(user);
              flag=false;
          }
        }

        if (flag)
        System.out.println("User Not Found :(");
        }
        catch (Exception e){
            logging.logger.setLevel(Level.SEVERE);
            logging.logger.severe(e.toString());
            logging.logger.severe("findAndPrintUserBasedOnCustomerReferenceNumber function in class Operation had an issue.  ");
        }

        logging.logger.setLevel(Level.FINE);
        logging.logger.info("user called findAndPrintUserBasedOnCustomerReferenceNumber function");


    }

    public static void printUsersWithValidEmail (ArrayList<User> users){
        try {
            String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
            for (User user : users) {
                if (Pattern.matches(regex, user.getEmail())) {
                    printUser(user);
                }
            }
        }
        catch (Exception e){

            logging.logger.setLevel(Level.SEVERE);
            logging.logger.severe(e.toString());
            logging.logger.severe("printUsersWithValidEmail function in class Operation had an issue");
        }

        logging.logger.setLevel(Level.FINE);
        logging.logger.info("user called printUsersWithValidEmail function");

    }

    public static ArrayList<User> printDuplicateUsers(ArrayList<User> users){
        try {
            for (int i = 0; i < users.size(); i++) {
                for (int j = i + 1; j < users.size(); j++) {
                    if (users.get(i)
                            .getId() == users.get(j)
                            .getId()) {
                        if (!Thread.currentThread()
                                .getStackTrace()[2].getMethodName()
                                .equals("printUsersAlphabeticallyWithoutDuplicates"))
                            printUser(users.get(i));
                        users.remove(i);

                    }

                }
            }


        }
        catch (Exception e){

            logging.logger.setLevel(Level.SEVERE);
            logging.logger.severe(e.toString());
            logging.logger.severe("printDuplicateUsers function in class Operation had an issue");
        }

        logging.logger.setLevel(Level.FINE);
        logging.logger.info("user called printDuplicateUsers function");

        return users;

    }

    public static void printUsersAlphabeticallyWithoutDuplicates(ArrayList<User> users){
        try {
        printDuplicateUsers(users);
        users.sort(Comparator.comparing(user -> user.getName().toLowerCase()));
        for(User user : users)
        { printUser(user);

        }
        }
        catch (Exception e){
            logging.logger.setLevel(Level.SEVERE);
            logging.logger.severe(e.toString());
            logging.logger.severe("printUsersAlphabeticallyWithoutDuplicates function in class Operation had an issue");
        }


        logging.logger.setLevel(Level.FINE);
        logging.logger.info("user called printUsersAlphabeticallyWithoutDuplicates function");

    }


    private static void printUser(User user){
        try {
        System.out.println("User id: "+user.getId());
        System.out.println("User Name: "+user.getName());
        System.out.println("User Mobile Number: "+user.getMobile());
        System.out.println("User E-mail: "+user.getEmail());
        System.out.println("User Reference Number: "+user.getCustomerReferenceNumber());

        System.out.println("\n ----------------------- \n ");

        }
        catch (Exception e){

            logging.logger.setLevel(Level.SEVERE);
            logging.logger.severe(e.toString());
            logging.logger.severe("printUser function in class Operation had an issue");
        }
        logging.logger.setLevel(Level.FINE);
        logging.logger.info("user called printUser function");
    }


}
