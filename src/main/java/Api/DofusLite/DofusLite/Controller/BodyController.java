package Api.DofusLite.DofusLite.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import Api.DofusLite.DofusLite.Dao.BodyDoa;
import Api.DofusLite.DofusLite.Model.BodyModel;

@RestController
public class BodyController {
	
	 @Autowired // ---> Spring se charge d'en fabriquer une instance
	    private BodyDoa bodyDoa; //DAO ==> Repository
	    
	    @RequestMapping(value="/Body", method=RequestMethod.GET)
	    public List<BodyModel> BodyArray() {
	    	return bodyDoa.findAll();
	    }
	    



	    @RequestMapping(value="/Body/{id}", method=RequestMethod.GET)
		public List<BodyModel> IdBody(@PathVariable int id) {
	    	return bodyDoa.findById(id);
		}

}
