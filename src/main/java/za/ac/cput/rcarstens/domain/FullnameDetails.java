package za.ac.cput.rcarstens.domain;

import java.io.Serializable;

/**
 * Created by sanXion on 2016/04/03.
 */
public class FullnameDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String firstname;
    private String lastname;

    public String getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    private FullnameDetails()
    {

    }

    private FullnameDetails(Builder builder) {
        this.id = builder.id;
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
    }

    public static class Builder{
        private String id;
        private String firstname;
        private String lastname;

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder firstname(String value){
            this.firstname = value;
            return this;
        }

        public Builder lastname(String value){
            this.lastname = value;
            return this;
        }

        public Builder copy(FullnameDetails value) {
            this.id = value.id;
            this.firstname = value.firstname;
            this.lastname = value.lastname;
            return this;
        }

        public FullnameDetails build() {
            return new FullnameDetails(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FullnameDetails)) return false;

        FullnameDetails fullnameDetails = (FullnameDetails) o;

        if (getId() != null ? !getId().equals(fullnameDetails.getId()) : fullnameDetails.getId() != null) return false;
        if (getFirstname() != null ? !getFirstname().equals(fullnameDetails.getFirstname()) : fullnameDetails.getFirstname() != null)
            return false;
        return !(getLastname() != null ? !getLastname().equals(fullnameDetails.getLastname()) : fullnameDetails.getLastname() != null);

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getFirstname() != null ? getFirstname().hashCode() : 0);
        result = 31 * result + (getLastname() != null ? getLastname().hashCode() : 0);
        return result;
    }
}
