package cn.itcast.pojo;

import java.util.List;

public class QueryVo {

	private List<Items> list;
	private List<Integer> ids;

	public List<Items> getList() {
		return list;
	}

	public void setList(List<Items> list) {
		this.list = list;
	}

	public List<Integer> getIds() {
		return ids;
	}

	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
}
