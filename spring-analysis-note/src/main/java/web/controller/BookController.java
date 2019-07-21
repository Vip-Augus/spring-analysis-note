package web.controller;

import domain.ComplexBook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome() {
		return "index";
	}

	@RequestMapping(value = "bookView", method = RequestMethod.GET)
	public String helloView(Model model) {
		ComplexBook book1 = new ComplexBook("Spring 源码深度分析", "技术类");
		ComplexBook book2 = new ComplexBook("雪国", "文学类");
		List<ComplexBook> list = new ArrayList<>(2);
		list.add(book1);
		list.add(book2);
		model.addAttribute("bookList", list);
		return "bookView";
	}

	@RequestMapping(value = "plain/{name}")
	@ResponseBody
	public String plain(@PathVariable String name) {
		return name;
	}
}
