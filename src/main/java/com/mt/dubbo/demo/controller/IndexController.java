package com.mt.dubbo.demo.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mt.dubbo.demo.vo.Result;
import com.neo.xnol.message.dto.ScheduleSmsDTO;
import com.neo.xnol.message.dto.SitemailDTO;
import com.neo.xnol.message.dto.SystemAdviceEventDTO;
import com.neo.xnol.message.facade.SitemailFacade;
import com.neo.xnol.message.facade.SysMsgEventFacade;

@Controller
@RequestMapping("/dubbo")
public class IndexController extends BaseController {

    @Autowired
    private SysMsgEventFacade sysMsgEventFacade;

    @Autowired
    private SitemailFacade sitemailFacade;

    /*
     * @Autowired private LocalCacheFacade localCacheFacade;
     */

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    @ResponseBody
    public Result index(HttpServletRequest request) throws InterruptedException, ExecutionException {
        SystemAdviceEventDTO dto = new SystemAdviceEventDTO();

        SitemailDTO ddd = sitemailFacade.getMessage(150998, 3268666);

        List<String> nameList = new ArrayList<String>();
        nameList.add("mineline");
        nameList.add("mineline");
        // List<UserPersonDTO> ll1 = userPersonQueryFacade.getByUserNameList(nameList);
        //
        // localCacheFacade.flush();
        dto.setEventCode("product-phasedRepayBySms-event");
        // dto.setEventCode("mobile-validateCode4RegisterBySms-event");
        dto.setEventCode("payment-withdrawApplyBySms-event");
        // dto.setEventCode("ppVoice");
        // dto.setEventCode("yyy");
        dto.setFactorage(new BigDecimal("222"));
        dto.setTransferoutAmount(new BigDecimal("33"));
        dto.setBankName("中国银行");
        dto.setRechargeAmount(new BigDecimal("11"));
        dto.setProductName("测试");
        dto.setOperateTime(new Date());
        dto.setValidateCode("12345");
        BigDecimal amout = new BigDecimal("22");
        dto.setPurchaseAmount(amout);
        dto.setUserName("aaa");
        dto.setContent("568545");
        dto.setTitle("邮件。。。");
        // localCacheFacade.flush();
        // dto.setEventCode("product-repayBySms-event");

        // dto.setEmail("263506885@qq.com");
        dto.setMobile("18688736814");
        dto.setEventSource("User");
        dto.setValidateCode("12345");
        dto.setProductName("测试产品");
        dto.setPurchaseAmount(new BigDecimal("222"));
        dto.setWithdrawAmount(new BigDecimal("33"));
        dto.setRepaymentPeriod("1");
        dto.setRewardAmount(new BigDecimal("33"));
        List<String> list = new ArrayList<String>();
        list.add("");
        sysMsgEventFacade.sendSysMsgEvent(dto);
        // demoService.sayHello("aa");

        List<ScheduleSmsDTO> scheduleSmsDTOList = new ArrayList<ScheduleSmsDTO>();
        ScheduleSmsDTO s1 = new ScheduleSmsDTO();
        s1.setContent("t");
        s1.setMobile("18688736814");
        s1.setPriority(3);
        s1.setScheduleTime(new Date());
        s1.setSource("Task");
        scheduleSmsDTOList.add(s1);
        scheduleSmsDTOList.add(s1);
        // smsFacade.sendScheduleSms(s1);
        // sitemailFacade.getSitemailsByReciverID("12722", 0, 1);

        SitemailDTO s = new SitemailDTO();
        // s.setId(BigInteger.valueOf(2));
        // sitemailFacade.sendSitemail(s);
        SitemailDTO sitemailDTO = new SitemailDTO();
        // ResponseDTO<List<SitemailDTO>> response = sitemailFacade.getSystemSitemails(sitemailDTO);
        // sitemailDTO.setMailStatus(2);
        // sitemailDTO.setSiteMailIds("732078,732077");
        // com.neo.xnol.message.dto.ResponseDTO<PageResponseDTO<SitemailDTO>> r = sitemailFacade
        // .getSitemailsByReciverID("100002", 0, 10);
        long[] l = new long[1];
        l[0] = 734889l;
        // sitemailFacade.updateSiteMailReceiveStatus(100002, 3, l);
        // List<Long> sss = sitemailFacade.getUnreadMailIds(100002);
        // localCacheFacade.flush();
        System.out.println("===");
        return this.result(0, "", "");
    }

    public static void main(String[] args) {
    }

}
