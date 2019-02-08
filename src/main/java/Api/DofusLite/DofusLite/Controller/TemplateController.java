package Api.DofusLite.DofusLite.Controller;


import Api.DofusLite.DofusLite.Dao.TemplateDao;
import Api.DofusLite.DofusLite.Model.TemplateModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
//=========================================RESOURCE======================================
@RestController
public class TemplateController {
	
    @Autowired // ---> Spring se charge d'en fabriquer une instance
    private TemplateDao templateDao; //DAO ==> Repository
    
    @RequestMapping(value="/Template", method=RequestMethod.GET)
    public List<TemplateModel> TemplateArray() {
    	return templateDao.findAll();
    }
    



    @RequestMapping(value="/Template/{id}", method=RequestMethod.GET)
	public List<TemplateModel> IdProduits(@PathVariable int id) {
    	return templateDao.findById(id);
	}
}



/*
 * value : URI à laquelle cette méthode doit répondre.
 * method : Type de requêtes cette méthode doit répondre.
 */
