package org.springApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

//@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music classicalMusic;
    private Music rapMusic;
    private Music rockMusic;


//    @Autowired
    public MusicPlayer(@Qualifier("rapMusic") Music rapMusic,
                       @Qualifier("classicalMusic") Music classicalMusic,
                       @Qualifier("rockMusic") Music rockMusic) {
        this.rapMusic = rapMusic;
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }


    public void playMusic(MusicEnum musicEnum) {
        Random random = new Random();
        int randomInt = random.nextInt(3);
        if (musicEnum == MusicEnum.RAP) {
            System.out.println("Playing " + rapMusic.getList().get(randomInt));
        } else if (musicEnum == MusicEnum.CLASSICAL) {
            System.out.println("Playing " + classicalMusic.getList().get(randomInt));
        } else {
            System.out.println("Playing " + rockMusic.getList().get(randomInt));
        }

        System.out.println(getName());
        System.out.println(getVolume());

    }


    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
}
