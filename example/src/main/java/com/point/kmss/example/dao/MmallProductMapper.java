package com.point.kmss.example.dao;

import com.point.kmss.example.models.MmallProduct;
import java.util.List;

public interface MmallProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbg.generated
     */
    int insert(MmallProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbg.generated
     */
    MmallProduct selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbg.generated
     */
    List<MmallProduct> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MmallProduct record);
}