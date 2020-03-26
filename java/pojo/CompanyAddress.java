package pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CmpyAddr")
public class CompanyAddress 
{
	@Id	 
	@SequenceGenerator(name = "mySeqGen1", sequenceName = "mySeq1", initialValue = 10)
	@GeneratedValue(generator = "mySeqGen1")
	@Column(name = "Id")
	int addrid;
	@Column(name = "City", nullable = false, length=250)
	String city;
	@Column(name = "State", nullable = false, length=250)
	String state;
	public CompanyAddress(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public int getAddrid() {
		return addrid;
	}
	public void setAddrid(int addrid) {
		this.addrid = addrid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}