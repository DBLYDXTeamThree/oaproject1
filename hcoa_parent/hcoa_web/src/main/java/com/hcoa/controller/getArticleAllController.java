package com.hcoa.controller;

import java.util.List;

import javax.sound.midi.SysexMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hcoa.entity.SendArticle;
import com.hcoa.entity.SendArticleAttach;
import com.hcoa.entity.StaffInfo;
import com.hcoa.service.getArticleAllService;


@Controller
@RequestMapping("/")
public class getArticleAllController {
	@Autowired getArticleAllService gaas;
	@RequestMapping("/togetArticleAll")
	public String todeptmanager(Model model){
		List<SendArticle> list=gaas.findall();
		List<SendArticleAttach> li=gaas.select();
		for(int i=0;i<list.size();i++){
			list.get(i).setCheckerName1(gaas.findChecker(list.get(i).getChecker()));
			list.get(i).setDeptName(gaas.findDept( Long.parseLong(list.get(i).getMainDept())));
			for(int j=0;j<li.size();j++){
				if(li.get(j).getSendArticleId()==list.get(i).getId()){
					list.get(i).setResult(true);
					break;
				}
				else{
					list.get(i).setResult(false);
				}
			}
		}
		model.addAttribute("list",list);
		return "/getArticleAll";
    }
	 /**
     * ����ajax��ѯ
     * @param sendArticle
     * @return
     */
    @RequestMapping("/selectFile")
    @ResponseBody
    public List<SendArticleAttach> selectFile(@RequestBody SendArticle sendArticle){
        List<SendArticleAttach> list= gaas.selectFile(sendArticle.getId());
        System.out.println("list======"+list);
        for(SendArticleAttach sendArticleAttach:list){
          System.out.println("filename======================="+sendArticleAttach.getFileName());
            sendArticleAttach.setCreateByName(( gaas.getName(sendArticleAttach.getCreateby())).getRealname());
            sendArticleAttach.setFileName(sendArticleAttach.getFileName());
        }
//        System.out.println(list);
        return list;
    }
    @RequestMapping("/saveUserInfo")
    @ResponseBody
    public List<SendArticleAttach> saveUserInfo(@RequestBody Long id){
    	List<SendArticleAttach> list=gaas.selectOne(id);
    	System.err.println(id);
    	System.err.println(list.size());
		return list;
    }

}
