import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique{
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("There Is a Light That Never Goes Out", "To die by your side Is such a heavenly way to die");
        trackList.put("This Charming man", "I would go out tonight But I haven't got a stitch to wear");
        trackList.put("I Know It's Over", "Oh Mother, I can feel the soil falling over my head");
        trackList.put("How Soon Is Now?", "I am human and I need to be loved");

        String track = trackList.get("How Soon Is Now?");
        System.out.println(track);

        // for (HashMap.Entry<String, String> entry : trackList.entrySet()){
        //     System.out.println("Track = " + entry.getKey() + " , Lyric = " + entry.getValue());
        // }

        Set<String> keys = trackList.keySet();
        for(String key: keys){
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}