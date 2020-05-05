package blah;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BothInputAndFormParameters.class, name = "DOG"),
        @JsonSubTypes.Type(value = SomeFormParameters.class, name = "CAT")
})
public interface PolicyFormParameters {
    String getType();

    void setType(String type);
}
