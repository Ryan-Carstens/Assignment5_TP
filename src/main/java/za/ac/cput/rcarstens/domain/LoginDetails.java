package za.ac.cput.rcarstens.domain;

import java.io.Serializable;

/**
 * Created by sanXion on 2016/04/03.
 */
public class LoginDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String email;
    private String password;

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    private LoginDetails()
    {

    }

    private LoginDetails(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.password = builder.password;
    }

    public static class Builder{
        private String id;
        private String email;
        private String password;

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder email(String value){
            this.email = value;
            return this;
        }

        public Builder password(String value){
            this.password = value;
            return this;
        }

        public Builder copy(LoginDetails value) {
            this.id = value.id;
            this.email = value.email;
            this.password = value.password;
            return this;
        }

        public LoginDetails build() {
            return new LoginDetails(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LoginDetails)) return false;

        LoginDetails loginDetails = (LoginDetails) o;

        if (getId() != null ? !getId().equals(loginDetails.getId()) : loginDetails.getId() != null) return false;
        if (getEmail() != null ? !getEmail().equals(loginDetails.getEmail()) : loginDetails.getEmail() != null)
            return false;
        return !(getPassword() != null ? !getPassword().equals(loginDetails.getPassword()) : loginDetails.getPassword() != null);

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        return result;
    }
}
