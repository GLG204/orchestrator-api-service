package com.dandach.voip.orchestrator.api.control;

import com.dandach.voip.orchestrator.api.control.credential.AccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SubscriberService {
    private final AccountRepository accountRepository;
    private final SubscriberRepository subscriberRepository;

    public void addSubscriber(SubscriberDto.Add dto){

    }

    public void view(long subscriberId){

    }

    public void edit(){
    }
}
