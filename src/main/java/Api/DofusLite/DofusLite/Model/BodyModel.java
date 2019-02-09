package Api.DofusLite.DofusLite.Model;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="BodyModel")
public class BodyModel implements Serializable {
	private static final long serialVersionUID= 85023L;
	
	
	@Id
	@Column(name="idBodyModel")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	
	@Column(name="bodyName")
    private String name;
	
	@Column(name="bodyHealth")
    private int health;
	
	
	
public BodyModel() {}
    
    public BodyModel(int id, String name,int health) {
        this.id=id;
        this.name=name;
        this.health=health;

    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
	
	 @Override
	 public String toString(){  

	 return "Body{"+

	 "id= " + id + 
	 ", Nom de l'equipement= '"+ name + '\'' + 
	 ", Vie= " + health + '}';
	 }





}
