package com.zhangbaolu.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangbaolu.beans.T_goods;
import com.zhangbaolu.beans.T_type;
import com.zhangbaolu.service.T_goodsService;
import com.zhangbaolu.utils.FileUtils;

@Controller
public class T_goodsController {

	@Resource
	private T_goodsService goodsService;
	//查询所有加分页
	@RequestMapping("list")
	public String queryAll(Model model,@RequestParam(defaultValue="1")Integer pageNum){
		Map<String,Object> map = new HashMap<String, Object>();
		PageHelper.startPage(pageNum, 4);
		List<T_goods> list = goodsService.queryAll(map);
		PageInfo<T_goods> page = new PageInfo<T_goods>(list);
		model.addAttribute("page", page);	
		return "list";
	}
	
	@RequestMapping("toadd")
	public String toadd(Model model){
		List<T_type> typeList = goodsService.queryType();
		model.addAttribute("typeList", typeList);
		return "add";
	}
	
	//添加
	@RequestMapping("add")
	public String add(T_goods goods,MultipartFile file) throws IOException {
		
		try {
			String upload = FileUtils.upload(file);
			goodsService.addGoods(goods);
			return "redirect:list";
		} catch (IllegalStateException e) {
			return "add";
		} 
	}
	
	@RequestMapping("toupdate")
	public String toupdate(Integer gid,Model model){
		T_goods goods = goodsService.queryGoodsByid(gid);
		model.addAttribute("goods", goods);
		List<T_type> typeList = goodsService.queryType();
		model.addAttribute("typeList", typeList);
		return "update";
	}
	
	@RequestMapping("update")
	public String update(T_goods goods,MultipartFile file) throws IOException{
		try {
			String upload = FileUtils.upload(file);
			goodsService.updateGoods(goods);
			return "redirect:list";
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			return "update";
		} 
	}
	
	@RequestMapping("deleteGoods")
	@ResponseBody
	public boolean deleteGoods(String ids){
		
		try {
			goodsService.deleteGoods(ids);
			return true;
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			return false;
		} 
	}
	
}
