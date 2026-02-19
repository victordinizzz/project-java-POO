public class User {
    private String name;
    private String email;
    private String senha;
    private String sexo;

    public String getEmail() {
        return this.email;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getName() {
        return this.name;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
