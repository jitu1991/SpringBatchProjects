package com.doj.batch.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.doj.batch.bean.Employee;
import com.doj.batch.bean.Stock;

/**
 * @author Jitender Kumar
 *
 */
public class StockRowMapper implements RowMapper<Stock>{

	@Override
	public Stock mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Stock stock = new Stock();
		stock.setTradeId(resultSet.getInt("tradeid"));
		stock.setTradePrice(resultSet.getDouble("tradeprice"));
		stock.setSecurity(resultSet.getString("security"));
		stock.setInstrumentType(resultSet.getString("instrumenttype"));
		stock.setTradeDate(resultSet.getDate("tradedate"));
		stock.setTradeTime(resultSet.getTime("tradetime"));
		stock.setCurrency(resultSet.getString("currency"));
		stock.setBroker(resultSet.getString("broker"));
		stock.setDirection(resultSet.getString("direction"));
		return stock;
	}
}
