public non-sealed class Gerente extends Empregado{

    protected String login;
    protected String password;


    public Gerente(String nome, int idade, double salario, String identificador) {
        super(nome, idade, salario, identificador);
    }

    public Gerente() {
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
