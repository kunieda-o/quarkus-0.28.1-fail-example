package xxx.example;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/")
public class ExampleApplication extends Application {
    static Set<Class<?>> classes = new HashSet<>();

    static {
        classes.add(GreetingResource.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return classes;
    }
}
