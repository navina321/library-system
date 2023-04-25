import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<String, String> users;

    public Login(){
        users = new HashMap<>();
    }

    public void addUser(String username, String password){
        users.put(username, password);
    }

    public boolean verifyLogin(String username, String password){
        String storedPassword = users.get(username);
        return storedPassword != null && storedPassword.equals(password);
    }
}
