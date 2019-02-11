package Api.DofusLite.DofusLite.Model;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="WeaponModel")
public class WeaponModel implements Serializable {

	private static final long serialVersionUID= 88143L;

	@Id
	@Column(name="idWeaponModel")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(name="weaponName")
    private String name;
	
	@Column(name="weaponDmg")
    private int dmg;
	
	public WeaponModel() {}
	
    public WeaponModel(int id, String name,int dmg) {
        this.id=id;
        this.name=name;
        this.dmg=dmg;

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

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
	
	
	 @Override
	 public String toString(){  

	 return "Weapon{"+

	 "id = " + id + 
	 ", Nom de l'arme = '"+ name + '\'' + 
	 ", Dommage = " + dmg + '}';
	 }
	
	
	
}
