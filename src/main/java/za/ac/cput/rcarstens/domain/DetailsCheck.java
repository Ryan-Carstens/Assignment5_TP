package za.ac.cput.rcarstens.domain;

import java.io.Serializable;

/**
 * Created by sanXion on 2016/04/03.
 */
public class DetailsCheck {
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
}
