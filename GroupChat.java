import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class GroupChat {
    private Queue<Message> messages = new LinkedList<Message>();
    private static final int MAX = 4;

    public GroupChat() {
       setMessages(messages);
    }

    
    /** 
     * @param user
     * @param message
     */
    public void addMessage(String user, String message) {
        if (messages.size() <= MAX) {
            messages.add(new Message(user, message));
        } else {
            System.out.println("There is an error, the server is null");
        }
    }

    
    /** t
     * @param user
     * @param message
     */
    public void addMessagePremium(String user, String message) {
        if (this.messages.size() >= MAX) {
            messages.remove();
        } else {
        addMessage(user, message);
        }
    }

    public void recieveMessage(){
        System.out.println(this.messages.peek());
    }

    public void dumpMessage() {
        Iterator<Message> iterater = this.messages.iterator();
        while (iterater.hasNext()) {
           System.out.println(iterater.next());
        }
        this.messages.clear();
        System.out.println(messages);
    }

    
    /** 
     * @param messages
     */
    public void setMessages(Queue<Message> messages) {
        this.messages = new LinkedList<Message>();
    }

    
    /** 
     * @return Queue<Message>
     */
    public Queue<Message> getMessages() {
        return messages;
    }
}