package homeWork_3;

class User {
    String login;
    String password;

    User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public String toString() {
        return "{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
