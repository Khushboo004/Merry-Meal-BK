package com.merry.meal.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.merry.meal.data.Session;
import com.merry.meal.payload.SessionDto;
import com.merry.meal.repo.AccountRepo;
import com.merry.meal.repo.SessionRepository;
import com.merry.meal.services.SessionService;
import com.merry.meal.utils.JwtUtils;
@Service

public class SessionServiceImpl implements SessionService{
	

	@Autowired
	private ModelMapper modelmapper;



	@Autowired
	private AccountRepo accountRepo;
	@Autowired
	private SessionRepository sessionRepo;
	
	@Override
	public List<SessionDto> getAllSession( ) {
		List<Session> allSession = this.sessionRepo.findAll();

		List<SessionDto> allSessionDto = allSession.stream().map(sessiom ->this.modelmapper.map(sessiom, SessionDto.class)).collect(Collectors.toList());

		return allSessionDto;
	}

}
