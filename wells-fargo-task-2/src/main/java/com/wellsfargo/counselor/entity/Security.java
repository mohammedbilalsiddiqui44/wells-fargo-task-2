package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

public class Security {
}
    private java.util.UUID Security
@OneToMany
public class Portfolio}
@Id
@GeneratedValue()
private long SecurityId;

@Column(nullable = false)
private String Name;

@Column(nullable = false)
private String category;

@Column(nullable = false)
private String purchasePrice;

@Column(nullable = false)
private String purchaseDate;

@Column(nullable = false)
private String quantity;

protected Client() {

        }

public Client(String Name, String Category, String purchasePrice, String purchaseDate, String quantity) {
        this.Name = Name;
        this.Category = Category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        }

public Long getAdvisorId() {
        return advisorId;
        }
public Long getClientId() {return clientId;}

public String getName() {
        return Name;
        }

public void setName(String Name) {
        this.Name = Name;
        }

public String getCategory() {
        return Category;
        }

public void setCategory(String Category) {
        this.Category = Category;
        }

public String getpurchasePrice() {
        return purchasePrice;
        }

public void setpurchasePrice(String purchasePrice) {
        this.purchasePrice = purchasePrice;
        }

public String getpurchaseDate() {
        return purchaseDate;
        }

public void setpurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
        }

public String getquantity() {
        return quantity;
        }

public void setquantity(String quantity) {
        this.quantity = quantity;
        }


