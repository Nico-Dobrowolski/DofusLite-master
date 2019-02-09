package Api.DofusLite.DofusLite.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//---------------- Personnage
import Api.DofusLite.DofusLite.Dao.PersonnageDao;
import Api.DofusLite.DofusLite.Model.PersonnageModel;
//!--------------------------

import java.util.List;
//=========================================RESOURCE======================================
@RestController
public class PersonnageController {

    @Autowired // ---> Spring se charge d'en fabriquer une instance
    private PersonnageDao personnageDao; //DAO ==> Repository
    
    @RequestMapping(value="/Personnages", method=RequestMethod.GET)
    public List<PersonnageModel> PersonnageArray() {
    	return personnageDao.findAll();
    }
    
    @RequestMapping(value="/Personnage/{id}", method=RequestMethod.GET)
 	public List<PersonnageModel> IdPersonnage(@PathVariable int id) {
     	return personnageDao.findById(id);
 	}
    
    @RequestMapping(value="/Personnages", method=RequestMethod.POST)
    public void createPersonnage(@RequestBody PersonnageModel personnage) {
    	 personnageDao.save(personnage);
    }
    

    
    
}
