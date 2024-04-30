public class Main {
    public static void main(String[] args) {
        Channel ch = new Channel("Rama");
        User user1 = new User("Momol ");
        User user2 = new User("Latif ");
        User user3 = new User("Rehan Jawir");

        ch.addSubscriber(user1);
        ch.addSubscriber(user2);
        ch.notifyUser("Ada video baru buat anda! Jangan lupa di subscribe ya!");

        user3.subscribe(ch);
        ch.notifyUser("Video baru!");
    }
}