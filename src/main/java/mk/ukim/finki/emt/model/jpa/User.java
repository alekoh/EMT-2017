package mk.ukim.finki.emt.model.jpa;


import javax.persistence.*;

/**
 * @author Riste Stojanov
 */
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Long id;

  public String username;

  public String password;

  public String email;

}
