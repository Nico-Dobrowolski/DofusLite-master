package Api.DofusLite.DofusLite.Dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Api.DofusLite.DofusLite.Model.PersonnageModel;;

@Repository
public interface PersonnageDao extends CrudRepository<PersonnageModel, Long>{
	public List<PersonnageModel>findAll();
	public List<PersonnageModel>findById(int id);
	
	

}
