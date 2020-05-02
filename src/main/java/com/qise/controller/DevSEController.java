package com.qise.controller;

import com.qise.dao.AppInfoMapper;
import com.qise.domain.AppInfo;
import com.qise.service.AppInfoService;
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
     * 根据软件名称模糊查询
     * @param softwareName
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String findByName(@RequestParam String softwareName,Model model){
        List<AppInfo> byName = appInfoService.findByName(softwareName);
        model.addAttribute("applist", byName);
        return "devHome/appInfoList";
    }

    @RequestMapping("/addBegin")
    public String addBegin(){
        return "devHome/addApp";
    }

}
