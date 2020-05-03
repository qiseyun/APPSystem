package com.qise.controller;

import com.qise.dao.AppInfoMapper;
import com.qise.domain.AppInfo;
import com.qise.domain.DataDictionary;
import com.qise.service.AppCategoryService;
import com.qise.service.AppInfoService;
import com.qise.service.DataDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author jql
 * @date 2020/4/25 - 10:29
 */
@Controller
@RequestMapping(value = "/dev/flatform/app")
public class DevSEController {

    @Autowired
    private AppInfoService appInfoService;

    @Autowired
    private AppCategoryService appCategoryService;

    /**
     * 进入app维护并将所有APP信息查询
     * @param model
     * @return
     */
    @RequestMapping(value="/begin")
    public String findInfo(Model model){
        List<AppInfo> all = appInfoService.findAll();
        model.addAttribute("applist",all );
        return "devHome/appInfoList";
    }

    /**
     * 跳转到添加app页面
     * @return
     */
    @RequestMapping(value = "/addBegin")
    public String addBegin(){
        return "devHome/addApp";
    }

    /**
     * 根据软件名称模糊查询
     * @param softwareName
     * @param model
     * @return
     */
    @RequestMapping(value = "/list")
    public String findByName(@RequestParam String softwareName,Model model){
        List<AppInfo> byName = appInfoService.findByName(softwareName);
        model.addAttribute("applist", byName);
        return "devHome/appInfoList";
    }

    @RequestMapping(value = "/one")
    public String one(Model model){
        List<String> categoryLevel1 = appCategoryService.findCategoryLevel1();
        model.addAttribute("one", categoryLevel1);
        return "devHome/appInfoList";
    }


    @RequestMapping(value = "two")
    public String two(@RequestParam("categoryLevel1") String categoryLevel1 ,Model model){
        if (categoryLevel1.equals(null) || categoryLevel1==""){
            return null;
        }
        List<String> categoryLevel2 = appCategoryService.findCategoryLevel2(categoryLevel1);
        model.addAttribute("two", categoryLevel2);
        return "devHome/appInfoList";
    }

    @RequestMapping(value = "three")
    public String three(String categoryLevel1, String categoryLevel2 ,Model model){
        if (categoryLevel1.equals(null) || categoryLevel1=="" || categoryLevel2.equals(null) || categoryLevel2==""){
            return null;
        }
        List<String> categoryLevel3 = appCategoryService.findCategoryLevel3(categoryLevel2);
        model.addAttribute("three", categoryLevel3);
        return "devHome/appInfoList";
    }



}
