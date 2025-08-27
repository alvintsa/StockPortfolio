@Service //object/class
public class PortfolioService{
    // Autowire repositories
    private final List<User> users = new ArrayList<>();
    // Add user, add stock, get portfolio, get summary, fetch prices, etc.
    public User addUser(User user){ // add to database
        users.add(user);
        UserRepository.save(user);
        return user;

    }
}