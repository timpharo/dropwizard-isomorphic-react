package smokay2k3;

import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;
import smokay2k3.resource.CommentsResource;
import smokay2k3.resource.RootResource;

public class Application extends io.dropwizard.Application<ServerConfiguration> {

    public static void main(String... args) throws Exception {
        new Application().run(args);
    }

    @Override
    public void initialize(Bootstrap<ServerConfiguration> bootstrap) {
        bootstrap.addBundle(new AssetsBundle("/static","/static"));
        bootstrap.addBundle(new ViewBundle<ServerConfiguration>());
    }

    @Override
    public void run(ServerConfiguration configuration, Environment environment) throws Exception {
        //Create resources that need referencing
        RootResource rootResource = new RootResource();
        CommentsResource commentsResource = new CommentsResource();

        //Register resources
        environment.jersey().register(rootResource);
        environment.jersey().register(commentsResource);
    }
}