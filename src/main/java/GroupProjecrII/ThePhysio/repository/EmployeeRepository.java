package GroupProjecrII.ThePhysio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import GroupProjecrII.ThePhysio.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>  {

}
