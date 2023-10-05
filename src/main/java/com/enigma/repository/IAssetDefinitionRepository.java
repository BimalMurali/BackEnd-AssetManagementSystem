package com.enigma.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.enigma.entity.AssetDefinition;

@Repository
public interface IAssetDefinitionRepository extends CrudRepository<AssetDefinition, Integer>{
	
	//search by name
	
//	//custom methods
//	@Query("from Employee WHERE employeename like %?1%")
//	public List<Employee> findByEmployeeName(String name);
//	
//	//inner join
//	@Query("SELECT new com.nissan.dto.EmployeeDeptDTO(e.id,e.employeename,e.designation,d.departmentName)from Employee e INNER JOIN e.department d ORDER BY e.id")
//	public List<EmployeeDeptDTO> findAllDTOEmployees();
	
	
	//delete
//	@Modifying
//	@Transactional
//	@Query("UPDATE AssetDefinition SET isActive=false where id= :id")
//	public void deleteEmployeeById(@Param("id")int id);
	
	//delete
	@Modifying
	@Transactional
	@Query("UPDATE AssetDefinition SET isActive = false WHERE id = :id")
	public void deleteId(@Param("id") int id);

}

