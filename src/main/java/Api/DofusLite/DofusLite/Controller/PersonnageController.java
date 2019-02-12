package Api.DofusLite.DofusLite.Controller;





import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
//---------------- Person
import Api.DofusLite.DofusLite.Dao.PersonnageDao;
import Api.DofusLite.DofusLite.Model.PersonnageModel;
//!--------------------------
import java.util.List;

import javax.transaction.Transactional;
//=========================================RESOURCE======================================

@Transactional // besoin pour pourvoir utiliser delete id 
@RestController
public class PersonnageController {

    @Autowired // ---> Spring se charge d'en fabriquer une instance
    private PersonnageDao personnageDao; //DAO ==> Repository
    
    
    @GetMapping(value="/Personnages")
    public List<PersonnageModel> PersonnageArray() {
    	return personnageDao.findAll();
    }
    
    @GetMapping(value = "/Personnages/{getId}")
 	public List<PersonnageModel> IdPersonnage(@PathVariable int getId) {
     	return personnageDao.findById(getId);
 	}
    

    //value = "/Personnages", consumes= {"application/json"}
    @PostMapping(value="/Personnages")
    public PersonnageModel addPersonnage(@RequestBody PersonnageModel personnage) {
    	//return personnageDao.save(personnage);

    	System.out.println(personnage);
    	return personnageDao.save(personnage);
    }
    
    
    @DeleteMapping(value="/Personnages/{deleteId}")
    public  List<PersonnageModel> IdDelete(@PathVariable int deleteId) {
    	return personnageDao.deleteById(deleteId);
    }
    


    
    
}
