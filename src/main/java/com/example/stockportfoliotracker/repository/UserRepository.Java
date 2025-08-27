public interface UserRepository extends JpaRepository<User, Long> {} // extends JpaRepository<User, Long>: you inherit all CRUD and query methods from Spring Data JPA.
// when user.save or other methods are called because it extends JPA, it does db like actions

// not constructors. indicates that User is the class the repository manages. Long indicates the type of the primary key (id) for the class.