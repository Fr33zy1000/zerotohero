package ro.zerotohero.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	private int employeeId;
//	private int departamentId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private List<Role> roleList = new ArrayList<Role>();
//	private List<Departament> departamentList = new ArrayList<Departament>();
	private Departament departament;

	@ManyToOne (fetch = FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn (name = "DEPARTAMENT_ID", insertable = true, updatable = true, nullable = true)
	public Departament getDepartament(){
		return departament;
	}

	public void setDepartament (Departament departament){
		this.departament = departament;
	}

//	@ManyToOne (fetch = FetchType.LAZY, cascade=CascadeType.ALL)
//	@JoinColumn (name = "DEPARTAMENT_ID", insertable = true, updatable = true, nullable = true)
//	public Departament getDepartament(){
//		return departament;
//	}
//
//	public void setDepartament (Departament departament){
//		this.departament = departament;
//	}

//	@ManyToOne(cascade =  , mappedBy = 'employee')
//	public List<Departament> getDepartamentList() {
//		return departamentList;
//	}
//	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch=FetchType.EAGER)
//	@JoinTable(name = "EMPLOYEE_DEPARTAMENT", joinColumns = { @JoinColumn(name = "EMPLOYEE_ID") }, inverseJoinColumns = { @JoinColumn(name = "DEPARTAMENT_ID") })
//	public List<Departament> getDepartamentList() {
//		return departamentList;
//	}
//
//	public void setDepartamentList(List<Departament> departamentList) {
//		this.departamentList = departamentList;
//	}
//


	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, fetch=FetchType.EAGER)
	@JoinTable(name = "EMPLOYEE_ROLE", joinColumns = { @JoinColumn(name = "EMPLOYEE_ID") }, inverseJoinColumns = { @JoinColumn(name = "ROLE_ID") })
	public List<Role> getRoleList() {
		return roleList;
	}



	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMPLOYEE_ID", unique = true, nullable = false)
	public int getEmployeeId() {
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	@Column(name = "PASSWORD", unique = false, nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "FIRST_NAME", unique = false, nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LAST_NAME", unique = false, nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "EMAIL", unique = true, nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}
