public class Test {
    public static void main(String[] args) {
        GroupChat groupOne = new GroupChat();
        User userOne = new User("Ilyas", true);
        userOne.send("Hello", groupOne);
        groupOne.recieveMessage();
        userOne.dump(groupOne);
        
        User userTwo = new User("Katie", false);
        userTwo.send("MSG 1", groupOne);
        userTwo.send("MSG 2", groupOne);
        userTwo.send("MSG 3", groupOne);
        userTwo.send("MSG 4", groupOne);
        userTwo.send("MSG 5", groupOne);
        userOne.dump(groupOne);
        userOne.send("I WORK ", groupOne);
        userOne.recieve(groupOne);
    }
}
