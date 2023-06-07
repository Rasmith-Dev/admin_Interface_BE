package adminInterface.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flat implements Serializable {
   
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String ownerName;
    private String email;
    private int flatNumber;
    private String phone;
    private String imageUrl;
    private int due;
    private  Date lastPaid;
    @Column(nullable = false, updatable = false)
    private String flatCode;

    public Flat() {}

    public Flat(String ownerName, String email, int flatNumber, String phone, String imageUrl, String flatCode) {
        this.ownerName = ownerName;
        this.email = email;
        this.flatNumber = flatNumber;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.flatCode = flatCode;
    }

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getownerName() {
		return ownerName;
	}

	public void setName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(int jobTitle) {
		this.flatNumber = jobTitle;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getDue() {
		return due;
	}

	public void setDue(int due) {
		this.due = due;
	}

	public Date getLastPaid() {
		return lastPaid;
	}

	public void setLastPaid(Date lastPaid) {
		this.lastPaid = lastPaid;
	}

	public String getFlatCode() {
		return flatCode;
	}

	public void setFlatCode(String flatCode) {
		this.flatCode = flatCode;
	}

	@Override
	public String toString() {
		return "Flat [id=" + id + ", ownerName=" + ownerName + ", email=" + email + ", flatNumber=" + flatNumber + ", phone=" + phone
				+ ", imageUrl=" + imageUrl + ", due=" + due + ", lastPaid=" + lastPaid + ", flatCode="
				+ flatCode + "]";
	}
	
	
}
