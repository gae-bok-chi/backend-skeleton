package com.gaebokchi.backendskeleton.controller;

import com.gaebokchi.backendskeleton.Service.ExamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequiredArgsConstructor
@RestController("/")
public class ExamController {

    private final ExamService service;

    @GetMapping("/health_check")
    public Map<?, ?> healthCheck() {
        return service.getStatus();
    }
}
