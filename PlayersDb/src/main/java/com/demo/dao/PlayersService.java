package com.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.mdel.Players;
import com.demo.repository.PlayersRepository;

import io.swagger.annotations.ApiOperation;

@RestController
public class PlayersService {
	@Autowired
	PlayersRepository  playerrepo;
	
	@RequestMapping(method=RequestMethod.GET,value="player/all")
	public List<Players> read() {
		return playerrepo.findAll();
	}
	
	@ApiOperation(value="fdsg dkgfrjld dfk ")
	@RequestMapping(method=RequestMethod.GET,value="player/{name}")
	public Optional<Players> readbyname(@PathVariable String name) {
		return playerrepo.findById(name);
	}
}
