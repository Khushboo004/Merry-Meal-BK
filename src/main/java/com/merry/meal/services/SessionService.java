package com.merry.meal.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.merry.meal.payload.SessionDto;

public interface SessionService {
	List<SessionDto> getAllSession( );

}
