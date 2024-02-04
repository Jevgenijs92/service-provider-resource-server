package com.service.provider.serviceproviderresourceserver;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController()
@RequestMapping("/foos")
@EnableMethodSecurity
public class HomeController {
    @GetMapping()
    @PreAuthorize("hasAuthority('SCOPE_read')")
    public Map<String, String> getFoos() {
        return Map.of("foos", "bar");
    }
}
