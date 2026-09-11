import java.util.*;
public class hm {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<>();
        map.put("india",1);
        map.put("usa",2);
        map.put("uk",3);
        System.out.println(map);
        System.out.println(map.get("india"));
        System.out.println(map.containsKey("usa"));
        System.out.println(map.remove("uk"));
        System.out.println(map.size());
        Set<String> keys=map.keySet();
        for(String k:keys){
            System.out.println("key=" + k +","+ "value=" + map.get(k));
        }

    }
    
}
