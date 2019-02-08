package Api.DofusLite.DofusLite.Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//=========================================Entity======================================


@Entity
@Table(name="TemplateModel")
public class TemplateModel implements Serializable {
	private static final long serialVersionUID= 8502013L;	
	@Id
	@Column(name="idTemplateModel")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	
	@Column(name="NomTemplateModel")
    private String nom;
	@Column(name="ClasseTemplateModel")
    private String classe;
	@Column(name="DescriptionTemplateModel")
    private String description;
	@Column(name="UrlTemplateModel")
    private String url;
    
    //defaut constructeur
    
    public TemplateModel() {}
    

    public TemplateModel(int id, String nom, String classe,String description,String url) {
        this.id=id;
        this.nom=nom;
        this.classe=classe;
        this.description=description;
        this.url=url;
    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getClasse() {
		return classe;
	}


	public void setClasse(String classe) {
		this.classe = classe;
	}


	public String getDescrption() {
		return description;
	}


	public void setDescrption(String description) {
		this.description = description;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}
	
	 @Override
	 public String toString(){  

	 return "Template{"+

	 "id= " + id + 
	 ", Nom= '"+ nom + '\'' + 
	 ", Classe= '"+ classe + '\'' + 
	 ", Description= '"+ description + '\'' +
	 ", Url= " + url+ '}';
	 }

    
}
