package com.example.demo.Boot;

import org.springframework.stereotype.Component;

public interface DB {


	public String getData();
		
	}
	

//MVC Arch - model view controller
// 3 layered
//1.presentation UI user interaction -> HTTP - rest,graphql,rtc
//authenticate kregi
//2. service layer -  login wagera - business logic
//3. Persistance layer - 


//getuserRequest method - GETUPI - server ke pass gayi - tomcat ke passs -  servlet dispatcher - end pe request bhejna method pr
//checck krungi - data layer pass krungi service layer pe - return
//service layer - busineess logic - kitne user ka dta , kya type ka data , valid or not, should this drip be unlcoked
//persistance - db se baat, get , delete, update

//agar hm mvc follow kre toh code scalabe - multiple team ek sth kr skti h koi dikkat nhi hoga
//stability ho .. bohtt saare log kaam krte hai so structure follow krte hai kafi sari companies
//scalability, maintainbility, testibility, improve krne mai

//node js - mvc nahi follow
//presentaion - controller - @controller - imp
//services , repositories(3rd layer), (data ka to and fro) - dto(data tranfer object),entities(tables ke sth confirm krega databse ke



//Presetntion <----->  service <--------> Persistance
//           DTO(Validation)   Entity(Tables DB)confirm)



