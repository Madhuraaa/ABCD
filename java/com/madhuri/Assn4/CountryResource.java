package com.madhuri.Assn4;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("commons")
public class CountryResource {
	CountryRepository repo=new CountryRepository();
	
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Country> getCountrys() {
		
		System.out.println("workinggg");
		return repo.getCountrys();
	}
		

		@GET
		@Path("com/{id}")
		@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
		public Country getCoun(@PathParam("id") int  id) {

			return repo.getcountry(id);
	}
		
		
	@POST
	@Path("com")
	
	public Country createCountry(Country c) {
		System.out.println(c);
		repo.create(c);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
		return c;
		
	}

}
