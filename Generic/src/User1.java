//ЛОКАЛЬНЫЙ ВНУТРЕННИЙ КЛАСС
public class User1 {
    private String login;
    private String password;

    public User1(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.println("Пользователь с логином " + login + " и паролем " + password + " отправил запрос");
            }
        }

        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User user = new User("admin", "password");
        user.createQuery();
    }
}