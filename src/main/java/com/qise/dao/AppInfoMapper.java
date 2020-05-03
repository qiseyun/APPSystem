package com.qise.dao;

import com.qise.domain.AppInfo;
import com.qise.entaty.QueryPageBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author jql
 * @date 2020/5/2 - 16:07
 */
public interface AppInfoMapper {

    @Select("select softwareName, APKName,softwareSize,flatformId, \n" +
            "categoryLevel1,categoryLevel2,categoryLevel3, \n" +
            "STATUS,downloads,versionId \n" +
            "from app_info;")
    public List<AppInfo> findAll();

    @Select("select * from app_info where softwareName like '%${value}%' ")
    public List<AppInfo> findByName(String softwareName);

    /**
     * 查询详细信息
     * @param queryPageBean
     * @return
     */
    @Select("select * from app_info \n" +
            "        <where> \n" +
            "            <if test='softwareName != null and softwareName != '' and softwareName.length > 0'> \n" +
            "                and softwareName like concat('%',#{softwareName},'%') \n" +
            "            </if> \n" +
            "            <if test='statusValueId != null'> \n" +
            "                and status = #{statusValueId} \n" +
            "            </if>\n" +
            "            <if test='flatFormValueID != null'> \n" +
            "                and flatformId = #{flatFormValueID} \n" +
            "            </if>\n" +
            "            <if test='categoryId1 != null and categoryId2 != null and categoryId3 != null'> \n" +
            "                and categoryLevel3 = #{categoryId3} \n" +
            "            </if>\n" +
            "            <if test='categoryId1 != null and categoryId2 != null and categoryId3 == null'> \n" +
            "                and categoryLevel2 = #{categoryId2} \n" +
            "            </if> \n" +
            "            <if test='categoryId1 != null and categoryId2 == null and categoryId3 == null'> \n" +
            "                and categoryLevel1 = #{categoryId1} \n" +
            "            </if> \n" +
            "        </where>")
    List<AppInfo> findByCondition(QueryPageBean queryPageBean);

    @Select("select * from app_info")
    List<AppInfo> findAlltwo();

    /**
     * 新增一条软件信息
     * @param appInfo
     * @return
     */
    @Insert("insert into \n" +
            "         app_info(softwareName,APKName,supportROM,interfaceLanguage,softwareSize,devId,appInfo,status,flatformId,categoryLevel3,downloads,createdBy,creationDate,categoryLevel1,categoryLevel2,logoPicPath,logoLocPath) \n " +
            "          values(#{softwareName},#{APKName},#{supportROM},#{interfaceLanguage},#{softwareSize},#{devId},#{appInfo},#{status},#{flatformId},#{categoryLevel3},#{downloads},#{createdBy},#{creationDate},#{categoryLevel1},#{categoryLevel2},#{logoPicPath},#{logoLocPath})")
    void addAppInfo(AppInfo appInfo);

}
