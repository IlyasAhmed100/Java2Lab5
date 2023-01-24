import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 


public class Message {
    
    private String user;
    private String message;
    private final LocalDateTime time;
    private static final DateTimeFormatter FORMAT_TIME = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public Message(String user, String message) {
        this.message = message;
        this.user = user;
        time = LocalDateTime.now();
    }
    
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "User " + user + "\n" + " Time " + FORMAT_TIME.format(time) + "\n" + " Message " + message;
    }
}   
