package com.gaebokchi.backendskeleton.Service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Map;

@Service
public class ExamService {

    public Map<?, ?> getStatus() {
        return Collections.singletonMap("status", "up");
    }
}
