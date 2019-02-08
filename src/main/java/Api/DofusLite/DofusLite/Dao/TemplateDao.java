package Api.DofusLite.DofusLite.Dao;
import Api.DofusLite.DofusLite.Model.TemplateModel;
import java.util.List;
//========================================CrudRepository=====================
import org.springframework.data.repository.CrudRepository;



//=========================================CRUD======================================


public interface TemplateDao extends CrudRepository<TemplateModel, Long> { //long serialVersionUID
	public List<TemplateModel>findAll();
	public List<TemplateModel>findById(int id);
}
