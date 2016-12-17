package com.meringuesoft.bucketlist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meringuesoft.bucketlist.domain.BucketList;
import com.meringuesoft.bucketlist.service.BucketListService;

@Controller
public class BucketListController {
	@Autowired
	BucketListService bucketListService;
	
	@RequestMapping("/")
	public String list(Model model) {
		List<BucketList> list = bucketListService.getList();
		model.addAttribute("list", list);
		return "list";
	}
	
	@RequestMapping("/register")
	public String register(String object) {
		BucketList bucketList = new BucketList();
		bucketList.setObject(object);
		bucketListService.register(bucketList);
		return "redirect:/";
	}
	
	@RequestMapping("/delete")
	public String delete(String number) {
		BucketList bucketList = new BucketList();
		bucketList.setNumber(Integer.parseInt(number));
		bucketListService.delete(bucketList);
		return "redirect:/";
	}
	
	@RequestMapping("/achieve")
	public String archive(String number) {
		BucketList bucketList = new BucketList();
		bucketList.setNumber(Integer.parseInt(number));
		bucketListService.achieve(bucketList);
		return "redirect:/";
	}
	
	@RequestMapping("/mark")
	public String mark(String number) {
		BucketList bucketList = new BucketList();
		bucketList.setNumber(Integer.parseInt(number));
		bucketListService.mark(bucketList);
		return "redirect:/";
	}
}
