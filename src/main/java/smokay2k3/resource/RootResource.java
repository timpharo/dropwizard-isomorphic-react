package smokay2k3.resource;

import com.fasterxml.jackson.core.JsonProcessingException;
import smokay2k3.views.IndexView;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Produces(MediaType.TEXT_HTML)
public class RootResource {

    @GET
    public IndexView getIndex() throws JsonProcessingException {
        return new IndexView();
    }

}
