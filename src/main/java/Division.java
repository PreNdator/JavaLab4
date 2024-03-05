import java.util.HashMap;

public class Division {
    private  static int _currId = 0;
    private static HashMap<String, Integer> _allDivisions;
    private String _name;
    private int _id;
    public Division(String name){
        _name = name;
        if(_allDivisions.containsKey(name)){
            _id = _allDivisions.get(name);
        }
        else{
            _allDivisions.put(name, _currId);
            ++_currId;
        }
    }

    public String getName() {
        return _name;
    }

    public int getId() {
        return _id;
    }

}
