package Api.DofusLite.DofusLite.Dao;
import Api.DofusLite.DofusLite.Model.TemplateModel;
import java.util.List;
// DAO -> Data access object
//========================================CrudRepository=====================
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



//=========================================CRUD======================================
@Repository
public interface TemplateDao extends CrudRepository<TemplateModel, Long> { //long serialVersionUID

	public List<TemplateModel>findAll();
	public List<TemplateModel>findById(int id);

}
