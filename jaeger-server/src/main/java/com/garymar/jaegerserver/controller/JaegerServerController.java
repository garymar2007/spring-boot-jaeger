package com.garymar.jaegerserver.controller;

import com.garymar.jaegerserver.service.JaegerServerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/server")
public class JaegerServerController {

    private JaegerServerService jaegerServerService;

    public JaegerServerController(JaegerServerService jaegerServerService) {
        this.jaegerServerService = jaegerServerService;
    }

    @GetMapping("/{id}")
    public Mono<String> get(@PathVariable("id") Integer id) {
        return jaegerServerService.get(id);
    }
}
