package Api.DofusLite.DofusLite.Dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Api.DofusLite.DofusLite.Model.BodyModel;


@Repository
public interface BodyDoa extends CrudRepository<BodyModel, Long>  {
	public List<BodyModel>findAll();
	public List<BodyModel>findById(int id);

}
