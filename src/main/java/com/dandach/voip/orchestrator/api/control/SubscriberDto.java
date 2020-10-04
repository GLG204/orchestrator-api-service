package com.dandach.voip.orchestrator.api.control;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

public class SubscriberDto {
    @Getter
    @Setter
    @Accessors(chain = true)
    public static class Add{
        private String firstName;
        private String lastName;
        private Character gender;
        private List<String> emails=new ArrayList<>();
        private String username;
        private String password;
    }
}
