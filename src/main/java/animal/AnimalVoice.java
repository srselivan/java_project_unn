package animal;

import java.util.*;

public class AnimalVoice extends AnimalName{
    protected String voice;

    private final HashMap<String, String> voices = new HashMap<>();

    private void initMap(){
        voices.put("name1", "voice1");
        voices.put("name2", "voice2");
        voices.put("name3", "voice3");
    }

    public AnimalVoice(String name) {
        super(name);
        initMap();
        this.voice = voices.get(name);
    }

    @Override
    public String toString() {
        return voice;
    }
}
