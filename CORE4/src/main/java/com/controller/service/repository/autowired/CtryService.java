package com.controller.service.repository.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service("countryService")
public class CtryService {
    @Autowired
 CountryDAO countryDAO;
 public Ctry createNewCountry() {
 
  return countryDAO.createNewCountry();
 }
 
}