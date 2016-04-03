package za.ac.cput.rcarstens.domain;

import java.io.Serializable;

/**
 * Created by sanXion on 2016/04/03.
 */
public class ContactDetails implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;
    private String homePhone;
    private String cellPhone;

    public String getId() {
        return id;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    private ContactDetails()
    {

    }

    private ContactDetails(Builder builder) {
        this.id = builder.id;
        this.homePhone = builder.homePhone;
        this.cellPhone = builder.cellPhone;
    }

    public static class Builder{
        private String id;
        private String homePhone;
        private String cellPhone;

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder homePhone(String value){
            this.homePhone = value;
            return this;
        }

        public Builder cellPhone(String value){
            this.cellPhone = value;
            return this;
        }

        public Builder copy(ContactDetails value) {
            this.id = value.id;
            this.homePhone = value.homePhone;
            this.cellPhone = value.cellPhone;
            return this;
        }

        public ContactDetails build() {
            return new ContactDetails(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactDetails)) return false;

        ContactDetails contactDetails = (ContactDetails) o;

        if (getId() != null ? !getId().equals(contactDetails.getId()) : contactDetails.getId() != null) return false;
        if (getHomePhone() != null ? !getHomePhone().equals(contactDetails.getHomePhone()) : contactDetails.getHomePhone() != null)
            return false;
        return !(getCellPhone() != null ? !getCellPhone().equals(contactDetails.getCellPhone()) : contactDetails.getCellPhone() != null);

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getHomePhone() != null ? getHomePhone().hashCode() : 0);
        result = 31 * result + (getCellPhone() != null ? getCellPhone().hashCode() : 0);
        return result;
    }
}
