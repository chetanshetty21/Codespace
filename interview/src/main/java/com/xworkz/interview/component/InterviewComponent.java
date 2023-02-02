package com.xworkz.interview.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.interview.dto.InterviewDTO;

@Component
@RequestMapping("/attend")
public class InterviewComponent {

	public InterviewComponent() {
		System.out.println("creating" + this.getClass().getSimpleName());
	}

	@PostMapping
	public String onSend(InterviewDTO dto) {
		System.out.println("dto is"+dto);
		return "Interview.jsp";
	}
	
	}

