package org.springApp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    private List<String> rockList = new ArrayList<>();

    public RockMusic() {
        rockList.add("rock1");
        rockList.add("rock2");
        rockList.add("rock3");
    }

    @Override
    public List<String> getList() {
        return rockList;
    }
}
