package blah;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = BothInputAndFormParameters.class, name = "BothInputAndFormParameters"),
        @JsonSubTypes.Type(value = SomeFormParameters.class, name = "SomeFormParameters")
})
public interface PolicyFormParameters {
}
