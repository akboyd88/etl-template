package xyz.andrewkboyd.etltemplate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import reactor.netty.http.server.HttpServerRequest;
import reactor.netty.http.server.HttpServerResponse;

import java.io.IOException;

@Controller("redirectController")
public class RedirectController {
    @RequestMapping("/")
    public void redirectToSwaggerUi(ModelMap model, HttpServerRequest request, HttpServerResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
}
