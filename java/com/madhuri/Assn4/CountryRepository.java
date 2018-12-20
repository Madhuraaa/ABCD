package com.madhuri.Assn4;

import java.util.ArrayList;

import java.util.List;
import java.sql.*;
public class CountryRepository {
	List<Country> con;
	Connection connection=null;
	
	
	
	
	public CountryRepository()   {
		String url="\"jdbc:oracle:thin:@localhost:1521:XE";  
		String username="system";
		String password="orcl11g";
        try {	
        	Class.forName("oracle.jdbc.driver.OracleDriver");  
		connection = DriverManager.getConnection(url,username,password);
        }
        catch(Exception e) {
        	System.out.println(e);
        }
	/*	con=new ArrayList<>();
		
		
		Country co=new Country();
		co.setCountry("India");
		co.setName("Madhuri");
		co.setZipcode(123);
		co.setState("Karnataka");
		
		Country co1=new Country();
		co1.setCountry("India");
		co1.setName("Manasa");
		co1.setZipcode(125);
		co1.setState("Karnataka1");
		
		con.add(co);
		con.add(co1);*/
	}
public List<Country> getCountrys(){
	List<Country> countries =new ArrayList<>();
	String sql="select * from Country ";
	try {
	Statement st=connection.createStatement();
	ResultSet rs=st.executeQuery(sql);
	while(rs.next()) {
		Country a=new Country();
		a.setCountry("India");
		a.setZipcode(123);
		a.setState("Karnataka");
		a.setName("Madhuri");
			countries.add(a);	
	}
	}
	catch(Exception e) {
		System.out.println(e);
		
	}
	return con;
	
}


public Country getcountry(int zipcode){
	//Country a1=null;
	
	/*for(Country a:con) 
	{
		if(a.getZipcode()==id)
			return a;
	}
	return new Country();*/
	String sql="select * from Country where zipcode="+zipcode;
	Country a=new Country();
	try {
	Statement st=connection.createStatement();
	ResultSet rs=st.executeQuery(sql);
	if(rs.next()) {
		
		a.setCountry("India");
		a.setZipcode(123);
		a.setState("Karnataka");
		a.setName("Madhuri");
			
	}
	}
	catch(Exception e) {
		System.out.println(e);
		
	}
	
	return a;
}
public void create(Country c) {
	String sql="insert into values(?,?,?,?)";
	
	try
	{   PreparedStatement st =connection.prepareStatement(sql); 
	 st.setString(1, c.getCountry());
		  st.setInt(2, c.getZipcode());
		  st.setString(3, c.getState());
		  st.setString(4, c.getName());
		  st.executeUpdate();
	     ResultSet rs=st.executeQuery(sql);
	
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	
}


}
