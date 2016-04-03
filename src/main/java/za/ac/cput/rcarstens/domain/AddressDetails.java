package za.ac.cput.rcarstens.domain;

import java.io.Serializable;

/**
 * Created by sanXion on 2016/04/03.
 */
public class AddressDetails implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String physicalAddress;
    private String postalAddress;

    public String getId() {
        return id;
    }

    public String getPhysicalAddress() {
        return physicalAddress;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    private AddressDetails()
    {

    }

    private AddressDetails(Builder builder) {
        this.id = builder.id;
        this.physicalAddress = builder.physicalAddress;
        this.postalAddress = builder.postalAddress;
    }

    public static class Builder{
        private String id;
        private String physicalAddress;
        private String postalAddress;

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder physicalAddress(String value){
            this.physicalAddress = value;
            return this;
        }

        public Builder postalAddress(String value){
            this.postalAddress = value;
            return this;
        }

        public Builder copy(AddressDetails value) {
            this.id = value.id;
            this.physicalAddress = value.physicalAddress;
            this.postalAddress = value.postalAddress;
            return this;
        }

        public AddressDetails build() {
            return new AddressDetails(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AddressDetails)) return false;

        AddressDetails addressDetails = (AddressDetails) o;

        if (getId() != null ? !getId().equals(addressDetails.getId()) : addressDetails.getId() != null) return false;
        if (getPhysicalAddress() != null ? !getPhysicalAddress().equals(addressDetails.getPhysicalAddress()) : addressDetails.getPhysicalAddress() != null)
            return false;
        return !(getPostalAddress() != null ? !getPostalAddress().equals(addressDetails.getPostalAddress()) : addressDetails.getPostalAddress() != null);

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getPhysicalAddress() != null ? getPhysicalAddress().hashCode() : 0);
        result = 31 * result + (getPostalAddress() != null ? getPostalAddress().hashCode() : 0);
        return result;
    }
}
