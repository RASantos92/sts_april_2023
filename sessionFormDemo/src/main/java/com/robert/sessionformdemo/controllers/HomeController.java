package com.robert.sessionformdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String setCount(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		
		int countFromSession = (int) session.getAttribute("count");
		countFromSession++;
		session.setAttribute("count", countFromSession);
		return "counterPage.jsp";
	}
	
	@GetMapping("/get/count")
	public String getCount() {
		return "countGet.jsp";
	}
	
	@GetMapping("/search")
	public String search() {
		return "searchForm.jsp";
	}
	
	// http://localhost:8080/search?keyword=Huskies
	@GetMapping("/display/search")
	public String search(@RequestParam("keyword") String keyword, Model model) {
		model.addAttribute("keyword", keyword);
		return "displaySearchForm.jsp";
	}
	
	
	
	
	@GetMapping("/review/form")
	public String reviewForm() {
		return "postForm/reviewForm.jsp";
	}
	
	
	@PostMapping("/process/review")
	public String processReview(@RequestParam("movie") String movie, @RequestParam("rating") Integer rating, @RequestParam("comment") String comment,HttpSession session ,RedirectAttributes redirectAttributes, @RequestParam("reviewer") String reviewer) {
		System.out.println(rating + " " + (rating < 0));
		if(rating < 0 || rating > 5) {
			redirectAttributes.addFlashAttribute("ratingError", "rating must be above 0 and below five");
			return "redirect:/review/form";
		}
		session.setAttribute("comment", comment);
		session.setAttribute("rating", rating);
		session.setAttribute("movie", movie);
		session.setAttribute("reviewer", reviewer);
		return "redirect:/display/review";
	}
	
	
	@GetMapping("/display/review")
	public String displayReviewForm() {
		return "postForm/displayReviewForm.jsp";
	}
	
}
