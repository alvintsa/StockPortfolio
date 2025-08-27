import com.example.stockportfoliotracker.service.PortfolioService;
import com.example.stockportfoliotracker.model.User;


@RestController
@RequestMapping("/portfolio")
public class PortfolioController{
    @Autowired // allows for not having "new" everywhere when isntianstiating a new object
    private PortfolioService portfolioService;
     // Autowire PortfolioService

    @PostMapping("/users")
    public User addUser(@RequestBody User user){ // maps JSON to a User object, and automatically populates User name and email constructors. automatically calls setters
        return PortfolioService.addUser(user); // add to database
    } // request -> controller -> optional class -> service -> optional repository
    
    // POST /users
    // POST /portfolio
    // GET /portfolio/{userId}
    // GET /portfolio/{userId}/summary
    // (Optional) GET /portfolio/{userId}/alerts
}