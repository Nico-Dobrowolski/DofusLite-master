package Api.DofusLite.DofusLite.Controller;



import Api.DofusLite.DofusLite.Dao.WeaponDao;

import Api.DofusLite.DofusLite.Model.WeaponModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class WeaponController {

	@Autowired // ---> Spring se charge d'en fabriquer une instance
    private WeaponDao weaponDao; //DAO ==> Repository
	
    @RequestMapping(value="/Weapons", method=RequestMethod.GET)
    public List<WeaponModel> WeaponArray() {
    	return weaponDao.findAll();
    }
    
    @RequestMapping(value="/Weapon/{id}", method=RequestMethod.GET)
	public List<WeaponModel> IdWeapon(@PathVariable int id) {
    	return weaponDao.findById(id);
	}
}
