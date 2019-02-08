package Api.DofusLite.DofusLite.Model;


import Api.DofusLite.DofusLite.Model.TemplateModel;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



//=========================================Entity======================================


@Entity
@Table(name="PersonnageModel")
public class PersonnageModel implements Serializable {
	private static final long serialVersionUID= 850206576813L;	
	@Id
	@Column(name="idPersonnageModel")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	@OneToOne
    private TemplateModel idTemplate;
	@Column(name="idWeaponPersonnageModel")
    private int idWeapon;
	@Column(name="idBodyPersonnageModel")
    private int idBody;
    
	
    public PersonnageModel() {}
    
    public PersonnageModel(int id, TemplateModel idTemplate, int idWeapon,int idBody) {
        this.id=id;
        this.idTemplate=idTemplate;
        this.idWeapon=idWeapon;
        this.idBody=idBody;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TemplateModel getIdTemplate() {
		return idTemplate;
	}

	public void setIdTemplate(TemplateModel idTemplate) {
		this.idTemplate = idTemplate;
	}

	public int getIdWeapon() {
		return idWeapon;
	}

	public void setIdWeapon(int idWeapon) {
		this.idWeapon = idWeapon;
	}

	public int getIdBody() {
		return idBody;
	}

	public void setIdBody(int idBody) {
		this.idBody = idBody;
	}
	
	 @Override
	 public String toString(){  

	 return "Personnages{"+

	 "id= " + id + 
	 ", idTemplate= '"+ idTemplate + '\'' + 
	 ", idWeapon= '"+ idWeapon + '\'' + 
	 ", idBody= " + idBody+ '}';
	 }


}
