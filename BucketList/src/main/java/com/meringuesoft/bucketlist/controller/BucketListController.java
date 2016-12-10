package com.meringuesoft.bucketlist.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.meringuesoft.bucketlist.domain.BucketList;
import com.meringuesoft.bucketlist.mapper.BucketListMapper;

@Controller
public class BucketListController {
	@Autowired
	BucketListMapper bucketListMapper;
	
	@RequestMapping("/")
	public String list(Model model) {
		ArrayList<BucketList> list = bucketListMapper.getList();
		model.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping("/register")
	public String register(@RequestParam String object) {
		bucketListMapper.register(object);
		return "redirect:/";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String number) {
		bucketListMapper.delete(number);
		return "redirect:/";
	}
	
	@RequestMapping("/achieve")
	public String archive(@RequestParam String number) {
		bucketListMapper.achieve(number);
		return "redirect:/";
	}
	
	@RequestMapping("/mark")
	public String mark(@RequestParam String number) {
		bucketListMapper.mark(number);
		return "redirect:/";
	}
}
