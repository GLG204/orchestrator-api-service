package com.dandach.voip.orchestrator.api.control;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subscriber")
@AllArgsConstructor
public class SubscriberController {
    private final SubscriberService subscriberService;
}
