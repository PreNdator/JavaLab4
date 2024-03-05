import java.util.HashMap;
import java.util.HashSet;

public class Division {
    private  static int _currId = 0;
    private static HashSet<Division> _allDivisions;
    private static HashMap<String, Integer> _divisionsId;
    private final String _name;
    private final int _id;

    private Division(String name, int id){
        _name=name;
        _id=id;
    };

    public static Division GetDivision(String name){
        Division division;
        if(_divisionsId.containsKey(name)){
            division = getDivisionByName(name);
        }
        else{
            division = new Division(name, _currId);
            _divisionsId.put(name, _currId);
            ++_currId;
            _allDivisions.add(division);
        }
        return division;
    }

    private static Division getDivisionByName(String name) {
        for (Division division : _allDivisions) {
            if (division.getName().equals(name)) {
                return division;
            }
        }
        return null;
    }

    public String getName() {
        return _name;
    }

    public int getId() {
        return _id;
    }

}
