import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productdetail")
public class Product {

    @Id
    private int pid;

    private String pname;
    private double price;
    private int quantity;
    private String category;
    private String brand;
    private String description;
    private boolean isAvailable;
    private LocalDate manufacturingDate;
    private LocalDateTime createdAt;

    public Product() {
    }

    

    public Product(int pid, String pname, double price, int quantity, String category, String brand, String description,
			boolean isAvailable, LocalDate manufacturingDate, LocalDateTime createdAt) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
		this.category = category;
		this.brand = brand;
		this.description = description;
		this.isAvailable = isAvailable;
		this.manufacturingDate = manufacturingDate;
		this.createdAt = createdAt;
	}



	public int getPid() {
		return pid;
	}



	public void setPid(int pid) {
		this.pid = pid;
	}



	public String getPname() {
		return pname;
	}



	public void setPname(String pname) {
		this.pname = pname;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getBrand() {
		return brand;
	}



	public void setBrand(String brand) {
		this.brand = brand;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public boolean isAvailable() {
		return isAvailable;
	}



	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}



	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}



	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}



	public LocalDateTime getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}




}