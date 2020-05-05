package blah;

public abstract class PolymorphicParameters {

    protected String type;

    protected PolymorphicParameters() {
        this.type = this.getClass().getSimpleName();
    }

    public String getType() {
        return type;
    }

    // Workaround for null "type" property getting sent when creating the request from generated code.
    // Caused by springfox's duplicated inherited property bug.  See https://github.com/springfox/springfox/issues/2559.
    public void setType(String type) {
        this.type = type != null ? type : this.getClass().getSimpleName();
    }
}
