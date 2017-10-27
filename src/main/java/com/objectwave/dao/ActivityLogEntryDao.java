package com.objectwave.dao;

import java.util.List;

import com.objectwave.dao.utils.DaoOrder;
import com.objectwave.dao.utils.DaoQuery;
import com.objectwave.dao.utils.DaoResult;
import com.objectwave.model.ActivityLogEntry;

public interface ActivityLogEntryDao
{
	ActivityLogEntry getWithId(Integer id) throws Exception;
	DaoResult<ActivityLogEntry> query(DaoQuery query, DaoOrder order) throws Exception;
	DaoResult<ActivityLogEntry> query(DaoQuery query, DaoOrder order,String user) throws Exception;
	DaoResult<ActivityLogEntry> query(DaoQuery query, DaoOrder order,List<String> users) throws Exception;
	void insert(ActivityLogEntry object) throws Exception;
	
	public List<String> getColumnPropertyValues(String column, String match, int maxResults) throws Exception;		
}
