package com.qise.dao;

import com.qise.domain.AppCategory;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author jql
 * @date 2020/4/25 - 10:14
 */
public interface AppCategoryMapper {

    /**
     * @Description: 根据父类id查询类别信息
     * @param: [parentId]
     * @return: java.util.List<com.bdqn.appInfo.pojo.Category>
     * @Date: 2019/07/19 16:59
     */
    @Select(" <script>  " +
            " select * from app_category where 1=1" +
            " <if test='parentId != null'> and parentId = #{parentId} </if>" +
            " <if test='parentId == null'> and parentId is null </if> " +
            " </script> ")
    List<AppCategory> selectByParentId(@Param("parentId") Integer parentId);

    /**
     * 通过categoryLevelId查分类名称
     * @param categoryLevelId
     * @return
     */
    @Select("select categoryName from app_category where id = #{categoryLevelId}")
    String findCategoryNameByCategoryId(Integer categoryLevelId);

    /**
     * 通过分类字符串去查分类的Id
     */
    @Select("select id from app_category where categoryName = #{categoryName}")
    Integer findCategoryIdByCategoryName(String categoryName);

    /**
     *  查询所有的一级分类
     * @return
     */
    @Select("select categoryName from app_category where parentId is null")
    List<String> findCategoryLevel1();

    /**
     *  通过一级分类名去查对应二级分类选项的更新操作
     */
    @Select("select categoryName from app_category where parentId = " +
            " (select id from app_category where categoryName = #{value}) ")
    List<String> findCategoryLevel2(String categoryLevel1);

    /**
     * 通过二级分类名去查对应三级分类选项的更新操作
     * @param categoryLevel2
     * @return
     */
    @Select("select categoryName from app_category where parentId = " +
            " (select id from app_category where categoryName = #{value})")
    List<String> findCategoryLevel3(String categoryLevel2);

}
