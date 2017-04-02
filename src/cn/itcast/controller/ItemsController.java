package cn.itcast.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import cn.itcast.pojo.Items;
import cn.itcast.pojo.QueryVo;
import cn.itcast.service.ItemService;

@Controller
public class ItemsController {
	
	@Autowired
	private ItemService  itemService;
	
	@RequestMapping({"itemList.action"  ,"aaaa.action"})
	public String  findAll(Model model){
		List<Items> list =itemService.findAll();
		model.addAttribute("itemList", list);
		return "itemList";
	}
	@RequestMapping("itemEdit.action")
	public String  itemEdit(Integer id,Model model){
		Items item  =itemService.findById(id);
		model.addAttribute("item", item);
		return "editItem";
	}
	/*@RequestMapping("updateitem.action")
	public String  updateitem(Items items ,Model model,MultipartFile pictureFile,HttpServletRequest  req) throws IOException{
		
		itemService.updateitem(items);
		List<Items> list =itemService.findAll();
		model.addAttribute("itemList", list);
	   String realPath = req.getServletContext().getRealPath("/img/1");
	   File file = new File(realPath+pictureFile);
	  
	   
		return "itemList";
	}*/
	@RequestMapping("batchDel.action")
	public String  batchDel(QueryVo qv ,Integer[] ids,Model model){
		List<Items> list2 = qv.getList();
		for (Items items : list2) {
			System.out.println(items);
		}
		System.out.println(ids.toString());
		return null;
	}
	@RequestMapping("abc.action")
	@ResponseBody 
	public  Items  abc(@RequestBody  Items items){
		System.out.println("asdsa");
		System.out.println(items);
		
		
	return items;
	}
	@RequestMapping("a.action")
	public  void   a(){
		System.out.println("asdsa");

	}
	
   @RequestMapping("xxx.action")
   public String ss(){
	   return "redirect:itemList.action";
   }
}
