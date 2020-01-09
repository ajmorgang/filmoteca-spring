package es.autentia.tutorial.film.demo;

import org.springframework.stereotype.Component;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Component
@ApplicationPath("/")
public class JaxrsApplication extends Application {
}