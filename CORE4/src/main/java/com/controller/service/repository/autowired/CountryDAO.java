package com.controller.service.repository.autowired;

import org.springframework.stereotype.Repository;
 
@Repository("countryDAO")
public class CountryDAO {
 
 public Ctry createNewCountry() {
  // You should get it from database
  Ctry country = new Ctry("�ndia", 40000);
  return country;
 }

