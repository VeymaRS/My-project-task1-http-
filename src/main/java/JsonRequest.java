import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonRequest {
    public final String id;
    public final String text;
    public final String type;
    public final String user;
    public final Integer upvotes;


    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    public JsonRequest(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Integer upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "\nJsonRequest" +
                "\nid=" + id +
                "\ntext='" + text + '\'' +
                "\ntype='" + type + '\'' +
                "\nuser='" + user + '\'' +
                "\nupvotes=" + upvotes;
    }
}
