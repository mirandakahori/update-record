package com.study;

//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController // コントローラーとして機能することを示すアノテーション
//public class MyController {
//
//	@RequestMapping("/")
//	public String methodTop() {
//		return "こんにちは、Spring-Boot の勉強です";
//	}
//}


//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class MyController {
//
//	@Autowired
//	private MyRepository repository;
//
//	@RequestMapping("/")
//	public String methodTop(Model model) {
//		List<Goods> list = repository.findAll();
//		model.addAttribute("htmllist", list);
//		return "index";
//	}
//}

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {

	@Autowired
	private MyRepository repository;

	@GetMapping("/")
	public String methodTop(Model model) {
		List<Goods> list = repository.findAll();
		model.addAttribute("htmllist", list);
		return "index";
	}

	@PostMapping("/")
	public String methodB(@ModelAttribute Goods goods) {
		repository.saveAndFlush(goods);
		return "redirect:/";
	}
}



