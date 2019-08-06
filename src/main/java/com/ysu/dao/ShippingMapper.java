package com.ysu.dao;

import com.ysu.pojo.Shipping;
import java.util.List;

public interface ShippingMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ysu_shipping
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ysu_shipping
     *
     * @mbggenerated
     */
    int insert(Shipping record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ysu_shipping
     *
     * @mbggenerated
     */
    Shipping selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ysu_shipping
     *
     * @mbggenerated
     */
    List<Shipping> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ysu_shipping
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Shipping record);
}