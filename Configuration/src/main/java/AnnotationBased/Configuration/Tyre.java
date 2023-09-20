package AnnotationBased.Configuration;

import org.springframework.stereotype.Component;

//aggregation is a has a ralationship
@Component
public class Tyre {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tyre [name=" + name + "]";
	}
	
}
