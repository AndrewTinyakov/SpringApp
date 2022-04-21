package org.springApp;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

//@Component
//@Scope("singleton")
public class RapMusic implements Music{
    private List <String> rapList = new ArrayList<>();

    public RapMusic() {
        rapList.add("rap1");
        rapList.add("rap2");
        rapList.add("rap3");
    }

    @Override
    public List<String> getList() {
        return rapList;
    }
}
