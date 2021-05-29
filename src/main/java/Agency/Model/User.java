package Agency.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "user")
@Getter
@Setter
public class User  {
    @Column(name = "userId")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    @Column(name = "name")
    private  String Name;
}
