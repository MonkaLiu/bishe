package com.hua.shi.rmd.mapper.category;

import com.hua.shi.rmd.domain.entity.category.CategoryInfo;
import com.hua.shi.rmd.domain.entity.category.CategoryInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CategoryInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Sun Nov 29 10:35:56 CST 2020
     */
    long countByExample(CategoryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Sun Nov 29 10:35:56 CST 2020
     */
    int deleteByExample(CategoryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Sun Nov 29 10:35:56 CST 2020
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Sun Nov 29 10:35:56 CST 2020
     */
    int insert(CategoryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Sun Nov 29 10:35:56 CST 2020
     */
    int insertSelective(CategoryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Sun Nov 29 10:35:56 CST 2020
     */
    List<CategoryInfo> selectByExampleWithRowbounds(CategoryInfoExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Sun Nov 29 10:35:56 CST 2020
     */
    List<CategoryInfo> selectByExample(CategoryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Sun Nov 29 10:35:56 CST 2020
     */
    CategoryInfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Sun Nov 29 10:35:56 CST 2020
     */
    int updateByExampleSelective(@Param("record") CategoryInfo record, @Param("example") CategoryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Sun Nov 29 10:35:56 CST 2020
     */
    int updateByExample(@Param("record") CategoryInfo record, @Param("example") CategoryInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Sun Nov 29 10:35:56 CST 2020
     */
    int updateByPrimaryKeySelective(CategoryInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_category
     *
     * @mbg.generated Sun Nov 29 10:35:56 CST 2020
     */
    int updateByPrimaryKey(CategoryInfo record);
}