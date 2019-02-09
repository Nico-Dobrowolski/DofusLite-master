package Api.DofusLite.DofusLite.Dao;

import Api.DofusLite.DofusLite.Model.WeaponModel;
import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface WeaponDao extends CrudRepository<WeaponModel, Long> {

	public List<WeaponModel>findAll();
	public List<WeaponModel>findById(int id);
}
