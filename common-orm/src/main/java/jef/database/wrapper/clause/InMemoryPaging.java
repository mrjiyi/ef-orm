package jef.database.wrapper.clause;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jef.database.rowset.CachedRowSetImpl;
import jef.database.rowset.Row;

public class InMemoryPaging implements InMemoryProcessor{
	private int start;
	private int end;
	
	public InMemoryPaging(int start,int end){
		this.start=start;
		this.end=end;
	}
	
	public void process(CachedRowSetImpl rows) throws SQLException {
		if(end<=start){
			rows.setRvh(new ArrayList<Row>());
			rows.refresh();
		}
		List<Row> list=rows.getRvh();
		if(start==0 && end>=list.size()){
			return;
		}
		int end=this.end;
		if(end>list.size()){
			end=list.size();
		}
		rows.setRvh(rows.getRvh().subList(start, end));
		rows.refresh();
	}

	
}
