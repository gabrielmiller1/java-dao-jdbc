
package model.dao;

import java.util.List;
import model.entities.Department;

public interface DepartmentDao {
    
    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer Id);
    List<Department> findAll();
}
