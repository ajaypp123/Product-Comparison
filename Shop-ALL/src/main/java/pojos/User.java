package pojos;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="User")
public class User {
	
	@Id
	@Column(length = 20, unique = true)
	private String email;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer uId;
	
	@Column(length = 30)
	private String name;
	
	@Column(length = 20)
	private String password;
	
	@Column(length = 30)
	private String userType;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Address> addresses=new ArrayList<>();
	
	@OneToOne(mappedBy="user")
	private Order orders;
	
	public User() {
		System.out.println("Default CTOR of USER POJO");
	}

}
