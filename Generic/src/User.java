//ОБЫЧНЫЙ ВНУТРЕННИЙ КЛАСС
public class User {
    private String password;
    private String login;

    public User(String password, String login) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }
    public class Query {
        public void printToLog() {
            System.out.println(login + "Пользователь c логином и паролем" + password + "отправил запрос");
        }

    }

    public static void main(String[] args) {
        User user = new User("example_login", "example_password");
        user.createQuery();

        User.Query query1 = user.new Query();
        query1.printToLog();

        Query query2 = new User("123486", "oreshek").new Query();
        query2.printToLog();
    }

}
