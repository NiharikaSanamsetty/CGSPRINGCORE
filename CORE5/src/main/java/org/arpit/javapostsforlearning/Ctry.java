package org.arpit.javapostsforlearning;
import org.springframework.beans.factory.annotation.Required;
public class Ctry {
 
    String countryName;
    Cap capital;
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public Cap getCapital() {
        return capital;
    }
 
    @Required
    public void setCapital(Cap capital) {
        this.capital = capital;
    }
}