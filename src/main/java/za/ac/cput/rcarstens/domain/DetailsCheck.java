package za.ac.cput.rcarstens.domain;

import java.io.Serializable;

/**
 * Created by sanXion on 2016/04/03.
 */
public class DetailsCheck implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private boolean response;

    public String getId() {
        return id;
    }

    public Boolean getResponse() {
        return response;
    }

    private DetailsCheck()
    {

    }

    private DetailsCheck(Builder builder) {
        this.id = builder.id;
        this.response = builder.response;
    }

    public static class Builder{
        private String id;
        private boolean response;

        public Builder id(String value){
            this.id = value;
            return this;
        }

        public Builder response(boolean value){
            this.response = value;
            return this;
        }

        public Builder copy(DetailsCheck value) {
            this.id = value.id;
            this.response = value.response;
            return this;
        }

        public DetailsCheck build() {
            return new DetailsCheck(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DetailsCheck)) return false;

        DetailsCheck detailsCheck = (DetailsCheck) o;

        if (getId() != null ? !getId().equals(detailsCheck.getId()) : detailsCheck.getId() != null) return false;
        return !(getResponse() != null ? !getResponse().equals(detailsCheck.getResponse()) : detailsCheck.getResponse() != null);

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getResponse() != null ? getResponse().hashCode() : 0);
        return result;
    }
}
