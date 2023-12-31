package com.github.newk5;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;

@ApplicationScoped
@Named("appBean")
public class AppBean implements Serializable {

    @Inject
    Vertx vertx;

    void onStart(@Observes Router router) {

    }

}
