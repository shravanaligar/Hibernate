package com.shravan.DemoHiber;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {
    
    @Id
    private int aid;
    private AlienName aname;
    private String color;
    
    // Getters and Setters
    public int getAid() {
        return aid;
    }
    
    public void setAid(int aid) {
        this.aid = aid;
    }
    
   
    
    public AlienName getAname() {
		return aname;
	}

	public void setAname(AlienName as) {
		this.aname = as;
	}

	public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
}
