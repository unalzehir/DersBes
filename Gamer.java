package gamePlay;

import java.time.LocalDate;

public class Gamer implements IEntity {

	private int id;
	private String nationalyId;
	private String firsName;
	private String lastName;
	private LocalDate birthOfYear;
	
	public Gamer(int id, String nationalyId, String firsName, String lastName, LocalDate birthOfYear) {
		super();
		this.id = id;
		this.nationalyId = nationalyId;
		this.firsName = firsName;
		this.lastName = lastName;
		this.birthOfYear = birthOfYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNationalyId() {
		return nationalyId;
	}

	public void setNationalyId(String nationalyId) {
		this.nationalyId = nationalyId;
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthOfYear() {
		return birthOfYear;
	}

	public void setBirthOfYear(LocalDate birthOfYear) {
		this.birthOfYear = birthOfYear;
	}
}
