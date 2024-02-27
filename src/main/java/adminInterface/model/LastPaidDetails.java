package adminInterface.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LastPaidDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Long id;
	private Date LastPaid;
	
	@ManyToOne
	@JoinColumn(name = "FLAT_NUMBER")
	private Flat flat;
	
	public LastPaidDetails() {}

	public LastPaidDetails(Long id, Date lastPaid) {
	
		this.id = id;
		LastPaid = lastPaid;
	}
	
	public LastPaidDetails(Long id, Date lastPaid, Flat flat) {
		super();
		this.id = id;
		LastPaid = lastPaid;
		this.flat = flat;
	}
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getLastPaid() {
		return LastPaid;
	}

	public void setLastPaid(Date lastPaid) {
		LastPaid = lastPaid;
	}

	public Flat getFlat() {
		return flat;
	}

	public void setFlat(Flat flat) {
		this.flat = flat;
	}

	@Override
	public String toString() {
		return "LastPaidDetails [id=" + id + ", LastPaid=" + LastPaid + ", flat=" + flat + "]";
	}

}
