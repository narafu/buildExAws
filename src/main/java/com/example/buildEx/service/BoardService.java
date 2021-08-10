package com.example.buildEx.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.buildEx.domain.repository.BoardRepository;
import com.example.buildEx.dto.BoardDto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BoardService {

	private BoardRepository boardRepository;

	@Transactional
	public Long savePost(BoardDto boardDto) {
		return boardRepository.save(boardDto.toEntity()).getId();
	}
}