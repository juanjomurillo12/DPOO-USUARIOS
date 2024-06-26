package galeria.usuarios;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class FileUtils {
    private static final String USER_DATA_FILE = "userdata.txt";

  
    private static Map<String, String> userCredentials = new HashMap<>();


    public static void registerUser(String username, String password, String role) throws IOException {
        String userData = password + "," + role; 
        userCredentials.put(username, userData);
        saveUserCredentials(); 
    }


    private static void saveUserCredentials() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(USER_DATA_FILE))) {
            for (Map.Entry<String, String> entry : userCredentials.entrySet()) {
                writer.write(entry.getKey() + "," + entry.getValue());
                writer.newLine();
            }
        }
    }

  
    public static void loadUserCredentials() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(USER_DATA_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) { 
                    String username = parts[0];
                    String userData = parts[1] + "," + parts[2];
                    userCredentials.put(username, userData);
                }
            }
        }
    }

  
    public static boolean verifyUser(String username, String password) {
        if (userCredentials.containsKey(username)) {
            String[] details = userCredentials.get(username).split(",");
            return details[0].equals(password); 
        }
        return false;
    }

   
    public static boolean isUserAuthorized(String username, String operation) {
        if (userCredentials.containsKey(username)) {
            String[] details = userCredentials.get(username).split(",");
            String role = details[1];
       
            return checkAuthorization(role, operation);
        }
        return false;
    }

    private static boolean checkAuthorization(String role, String operation) {
    
        switch (role) {
            case "administrador":
                return true; 
            case "cajero":
                return operation.equals("processPayment");
            case "operador":
                return operation.equals("registerBid");
            default:
                return false;
        }
    }
}
