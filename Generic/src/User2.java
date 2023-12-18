//Внешний статический класс
public class User2 {
    private static String login;
    private static String password;

    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }
    public static class Query {
        public void printToLog() {
            System.out.println("User with login " + login + " and password " + password + " sent a query.");
        }
    }
    public static void main(String[] args) {
        User2 user = new User2("admin", "password");
        user.createQuery();


        Query query1 = new Query();
        query1.printToLog();

        Query query2 = new User2.Query();
        query2.printToLog();
    }

}