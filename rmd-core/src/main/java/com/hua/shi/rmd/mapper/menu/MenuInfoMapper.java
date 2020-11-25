package com.hua.shi.rmd.mapper.menu;

import com.hua.shi.rmd.domain.entity.menu.MenuInfo;
import com.hua.shi.rmd.domain.entity.menu.MenuInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface MenuInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated Wed Nov 25 23:16:33 CST 2020
     */
    long countByExample(MenuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated Wed Nov 25 23:16:33 CST 2020
     */
    int deleteByExample(MenuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated Wed Nov 25 23:16:33 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated Wed Nov 25 23:16:33 CST 2020
     */
    int insert(MenuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated Wed Nov 25 23:16:33 CST 2020
     */
    int insertSelective(MenuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated Wed Nov 25 23:16:33 CST 2020
     */
    List<MenuInfo> selectByExampleWithRowbounds(MenuInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated Wed Nov 25 23:16:33 CST 2020
     */
    List<MenuInfo> selectByExample(MenuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated Wed Nov 25 23:16:33 CST 2020
     */
    MenuInfo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated Wed Nov 25 23:16:33 CST 2020
     */
    int updateByExampleSelective(@Param("record") MenuInfo record, @Param("example") MenuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated Wed Nov 25 23:16:33 CST 2020
     */
    int updateByExample(@Param("record") MenuInfo record, @Param("example") MenuInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated Wed Nov 25 23:16:33 CST 2020
     */
    int updateByPrimaryKeySelective(MenuInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_menu_info
     *
     * @mbg.generated Wed Nov 25 23:16:33 CST 2020
     */
    int updateByPrimaryKey(MenuInfo record);
}