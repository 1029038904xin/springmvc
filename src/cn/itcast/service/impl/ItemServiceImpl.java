package cn.itcast.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import cn.itcast.dao.ItemDao;
import cn.itcast.pojo.Items;
import cn.itcast.service.ItemService;


@Service
@Transactional
public class ItemServiceImpl implements ItemService {
       @Autowired
	   private ItemDao  itemDao;

	@Override
	public List<Items> findAll() {
		// TODO Auto-generated method stub
		return itemDao.findAll();
	}

	@Override
	public Items findById(Integer id) {
		
		return itemDao.findById(id);
	}

	@Override
	public void updateitem(Items model) {
		// TODO Auto-generated method stub
		itemDao.updateitem(model);
	}
	
	
}
