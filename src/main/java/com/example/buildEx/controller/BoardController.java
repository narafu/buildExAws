package com.example.buildEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.buildEx.dto.BoardDto;
import com.example.buildEx.service.BoardService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class BoardController {

    private BoardService boardService;

	@GetMapping("/test")
	@ResponseBody
	public String test() {
		return "Test Success!";
	}

	@GetMapping("/")
	public String list() {
		return "board/list.html";
	}

	@GetMapping("/post")
	public String write() {
		return "board/write.html";
	}

	@PostMapping("/post")
	public String write(BoardDto boardDto) {
		boardService.savePost(boardDto);

		return "redirect:/";
	}

}
