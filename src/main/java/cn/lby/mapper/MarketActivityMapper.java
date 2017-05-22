package cn.lby.mapper;

import cn.lby.entity.MarketActivity;
import cn.lby.entity.MarketActivityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketActivityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_activity
	 * @mbggenerated
	 */
	int countByExample(MarketActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_activity
	 * @mbggenerated
	 */
	int deleteByExample(MarketActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_activity
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_activity
	 * @mbggenerated
	 */
	int insert(MarketActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_activity
	 * @mbggenerated
	 */
	int insertSelective(MarketActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_activity
	 * @mbggenerated
	 */
	List<MarketActivity> selectByExample(MarketActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_activity
	 * @mbggenerated
	 */
	MarketActivity selectByPrimaryKey(String id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_activity
	 * @mbggenerated
	 */
	int updateByExampleSelective(@Param("record") MarketActivity record,
			@Param("example") MarketActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_activity
	 * @mbggenerated
	 */
	int updateByExample(@Param("record") MarketActivity record,
			@Param("example") MarketActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_activity
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(MarketActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table market_activity
	 * @mbggenerated
	 */
	int updateByPrimaryKey(MarketActivity record);
}