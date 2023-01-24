public class User {
    
    private String username;
    private boolean premiumStatus;
    
        
    public User(String username, boolean premiumStatus) {
        if (premiumStatus) {
            this.username = "$" + username;
        } else {
            this.username = username;   
        }
        setPremiumStatus(premiumStatus);
    }

    
    /** 
     * @return String
     */
    public String getUsername() {
        return username;
    }

    
    /** 
     * @param username
     */
    public void setUsername(String username) {
    }

    
    /** 
     * @return boolean
     */
    public boolean getPremiumStatus() {
        return premiumStatus;
    }

    
    /** 
     * @param premiumStatus
     */
    public void setPremiumStatus(boolean premiumStatus) {
        this.premiumStatus = premiumStatus;
    }

    
    /** 
     * @param message
     * @param gc
     */
    public void send(String message, GroupChat gc) {
        gc.addMessage(username, message);
        if (premiumStatus) {
            gc.addMessagePremium(this.username, message);
        } else {
            gc.addMessage(this.username, message);
        }
    }

    
    /** 
     * @param gc
     */
    public void recieve(GroupChat gc) {
        gc.recieveMessage();
    }

    
    /** 
     * @param gc
     */
    public void dump(GroupChat gc) {
        if (premiumStatus) {
            gc.dumpMessage();
        } else {
            System.out.println("You aren't a premium user you can't dump messages");
        }
       
    }  
}
