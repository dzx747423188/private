package com.point.kmss.example.dao;

import com.point.kmss.example.models.MmallUser;
import java.util.List;

public interface MmallUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbg.generated
     */
    int insert(MmallUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbg.generated
     */
    MmallUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbg.generated
     */
    List<MmallUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mmall_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(MmallUser record);
}