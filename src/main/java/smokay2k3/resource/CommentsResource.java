package smokay2k3.resource;

import smokay2k3.Comment;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import java.util.ArrayList;
import java.util.List;

@Path("/comments.json")
public class CommentsResource {

    //This should be a service that handles the comments
    private final List<Comment> comments;

    public CommentsResource(){
        comments = new ArrayList<Comment>();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Comment> getComments() {
        return comments;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public List<Comment> addComment(MultivaluedMap<String,String> multivaluedMap) {
        Comment comment = new Comment();
        comment.setAuthor(multivaluedMap.getFirst("author"));
        comment.setText(multivaluedMap.getFirst("text"));
        comments.add(comment);
        return comments;
    }
}
