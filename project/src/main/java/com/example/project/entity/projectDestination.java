package com.example.project.entity;



	import jakarta.persistence.*;
	import lombok.*;

	@Entity
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	@Table(name="destination")
	public class projectDestination {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="destination_id")
	    private int destinationId;

	    @Column(name="location", nullable=false)
	    private String location;

	    @Column(name="country", nullable=false)
	    private String country;

	    @Column(name="description")
	    private String description;

	    @Column(name="price", nullable=false)
	    private int price;

		public int getDestinationId() {
			return destinationId;
		}

		public void setDestinationId(int destinationId) {
			this.destinationId = destinationId;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = (int) price;
		}
	}

