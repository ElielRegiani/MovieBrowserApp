package br.com.app.moviebrowserapi.domain.DTO;

import br.com.app.moviebrowserapi.domain.entities.UserRole;

public class RegisterDTO {

    private String login;

    private String password;

    private UserRole role;

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

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
