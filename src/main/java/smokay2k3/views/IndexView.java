package smokay2k3.views;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.dropwizard.jackson.Jackson;
import io.dropwizard.views.View;
import smokay2k3.Comment;
import smokay2k3.React;
import smokay2k3.resource.CommentsResource;

import java.util.List;

public class IndexView extends View {

    private final String content;
    private final String data;

    public IndexView() throws JsonProcessingException {
        super("index.ftl");

        //TODO the comments should come from a service that is injected
        ObjectMapper mapper = Jackson.newObjectMapper();
        React react = new React();
        List<Comment> comments = new CommentsResource().getComments();
        String commentBox = react.renderCommentBox(comments);
        String data = mapper.writeValueAsString(comments);

        this.content = commentBox;
        this.data = data;
    }

    public String getContent() {
        return content;
    }

    public String getData() {
        return data;
    }
}
