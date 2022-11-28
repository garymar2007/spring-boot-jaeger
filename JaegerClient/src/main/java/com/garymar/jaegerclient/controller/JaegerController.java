package com.garymar.jaegerclient.controller;

import com.garymar.jaegerclient.service.JaegerClientService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;

@Controller
@RequestMapping("/jaeger/client")
public class JaegerController {

    private JaegerClientService jaegerClientService;

    public JaegerController(JaegerClientService jaegerClientService) {
        this.jaegerClientService = jaegerClientService;
    }

    @GetMapping("/{id}")
    public Mono<String> get(@PathVariable("id") Integer id) {
        return jaegerClientService.get(id);
    }
}
