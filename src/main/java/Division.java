import java.util.HashMap;
import java.util.HashSet;

public class Division {
    private  static int _currId = 0;
    private static final HashMap<String, Division> _divisionsByName = new HashMap<>();
    private static final HashMap<String, Integer> _divisionsId = new HashMap<>();
    private final String _name;
    private final int _id;

    private Division(String name, int id){
        _name=name;
        _id=id;
    };

    /**
     * Retrieves a division by its name, creating a new division if it doesn't exist.
     * @param name The name of the division to retrieve.
     * @return The division object associated with the given name.
     */
    public static Division GetDivision(String name){
        Division division;
        if(_divisionsId.containsKey(name)){
            division = getDivisionByName(name);
        }
        else{
            division = new Division(name, _currId);
            _divisionsId.put(name, _currId);
            ++_currId;
            _divisionsByName.put(name, division);
        }
        return division;
    }

    private static Division getDivisionByName(String name) {
        return _divisionsByName.get(name);
    }

    public String getName() {
        return _name;
    }

    public int getId() {
        return _id;
    }

}
