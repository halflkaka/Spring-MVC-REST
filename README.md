A simple Restful service built by Spring MVC. Use Spring-Boot-initializer to initialize the project.  
Tutorial can be found on https://www.youtube.com/watch?v=QHjFVajYYHM.

# Usage
Open and run the project in Eclipse or Intellij IDEA. Use Postman for testing.

# What is JPA?
Java Persistence API.  Mapping Java objects to database tables and vice versa is called /Object-relational mapping/ (ORM). The Java Persistence API (JPA) is one possible approach to ORM. Via JPA the developer can map, store, update and retrieve data from relational databases to Java objects and vice versa.

# Annotations
- @Entity
- @Id
- @GeneratedValue
- @Transient (not stored in DB)

# Example
```
@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String summary;
	public String getSummary() ...
	public void setSummary(String summary) ...
	...
}
```
# Lombok
Automatically generates getters, setters, toString() methods for the fields in a Java class.
# Repository support
`public interface AccountRepository extends JpaRepository<Account, Long> { … }`
Defining this interface serves two purposes: First, by extending JpaRepository we get a bunch of generic CRUD methods into our type that allows saving Accounts, deleting them and so on. Second, this will allow the Spring Data JPA repository infrastructure to scan the classpath for this interface and create a Spring bean for it.

# H2
H2 is a in-memory database. Here use BootStrapData to initialize data in H2.
# Controller
Use annotation @RestController, @RequestMapping.  
Important to add @Service to implementation class so that the controller can distinguish.
## Get
@GetMapping(“/{id}”) 
Use @PathVariable to obtain variable value.
## Post
@PostMapping(“…”), @ResponseStatus(HttpStatus.Created)  
Use @RequestBody to obtain body value.
