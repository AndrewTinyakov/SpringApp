package org.springApp;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;


@Component
public class ClassicalMusic implements Music {
    private List<String> classicalList = new ArrayList<>();

    public ClassicalMusic() {
        classicalList.add("classical1");
        classicalList.add("classical2");
        classicalList.add("classical3");
    }

    @Override
    public List<String> getList() {
        return classicalList;
    }

//    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroing");
    }

//    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }


}
