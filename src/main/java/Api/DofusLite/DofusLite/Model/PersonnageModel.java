package Api.DofusLite.DofusLite.Model;


import Api.DofusLite.DofusLite.Model.TemplateModel;
import Api.DofusLite.DofusLite.Model.BodyModel;
import Api.DofusLite.DofusLite.Model.WeaponModel;


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
	
	//-----------------------------------------	
	@Id
	@Column(name="idPersonnageModel")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	//-----------------------------------------		
	@OneToOne
    private TemplateModel idTemplate;
	//-----------------------------------------	
	@OneToOne
    private WeaponModel idWeapon;
	//-----------------------------------------	  
	@OneToOne
    private BodyModel idBody;
    
	
    public PersonnageModel() {
    	
    }
    //classe ==> idTemplate exemple classe 1 = idTemplate id 1/Iop
    public PersonnageModel(int id, TemplateModel idTemplate, WeaponModel idWeapon,BodyModel idBody) {
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

	public WeaponModel getIdWeapon() {
		return idWeapon;
	}

	public void setIdWeapon(WeaponModel idWeapon) {
		this.idWeapon = idWeapon;
	}

	public BodyModel getIdBody() {
		return idBody;
	}

	public void setIdBody(BodyModel idBody) {
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
