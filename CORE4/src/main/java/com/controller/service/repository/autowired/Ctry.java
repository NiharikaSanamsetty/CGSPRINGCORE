package com.controller.service.repository.autowired;
public class Ctry{
 
 String countryName; 
 long population;
 
 public Ctry() {
  super();
 }
 public Ctry(String countryName,long population) {
  super();
  this.countryName = countryName;
  this.population=population;
 }
 
 public String getCountryName() {
  return countryName;
 }
 public void setCountryName(String countryName) {
  this.countryName = countryName;
 }
 public long getPopulation() {
  return population;
 }
 public void setPopulation(long population) {
  this.population = population;
 } 
 
}