package Api.DofusLite.DofusLite.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//---------------- Template
import Api.DofusLite.DofusLite.Dao.TemplateDao;
import Api.DofusLite.DofusLite.Model.TemplateModel;
//!--------------------------

import java.util.List;
//=========================================RESOURCE======================================
@RestController
public class TemplateController {
	
    @Autowired // ---> Spring se charge d'en fabriquer une instance
    private TemplateDao templateDao; //DAO ==> Repository
    
    @RequestMapping(value="/Templates", method=RequestMethod.GET)
    public List<TemplateModel> TemplateArray() {
    	return templateDao.findAll();
    }
    
    @RequestMapping(value="/Templates/{id}", method=RequestMethod.GET)
	public List<TemplateModel> IdTemplate(@PathVariable int id) {
    	return templateDao.findById(id);
	}
    
    @RequestMapping(value="/Templates", method=RequestMethod.POST)
    public TemplateModel createTemplate(@RequestBody TemplateModel template) { // Cette annotation demande à Spring que le JSON contenu dans la partie body de la requête HTTP soit converti en objet Java
    	 templateDao.save(template);
    	 return template;

    }
    

}



/*
 * value : URI à laquelle cette méthode doit répondre.
 * method : Type de requêtes cette méthode doit répondre.
 */
