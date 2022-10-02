public class    Application {
    public static void main(String[] args) throws Exception {

        Account account1 = new Account("makcat_3");

        Follower follower1 = new Follower("chris", account1);
        Follower follower2 = new Follower("vanda", account1);

        account1.addObserver(follower1);
        account1.addObserver(follower2);

        Post p1 = new Post("Nur-Sultan", "suiiiii", "https://www.instagram.com/p/CdGf7ioqFUM/?utm_source=ig_web_copy_link");

        account1.publishPost(p1);

        Account account2 = new Account("Jason");

        Follower follower3 = new Follower(account1.toString(), account2);
        Follower follower4 = new Follower(follower2.toString(), account2);

        account2.addObserver(follower3);
        account2.addObserver(follower4);

        Post p2 = new Post("UKA city", "nice view <3", "Jason/Photos/my/friends.png");

        account2.publishPost(p2);
    }
}
