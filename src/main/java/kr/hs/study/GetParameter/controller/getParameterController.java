package kr.hs.study.GetParameter.controller;

import kr.hs.study.GetParameter.dto.login;
import kr.hs.study.GetParameter.dto.test7;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;

import static org.apache.coyote.http11.Constants.a;

@Controller
public class getParameterController {
    @GetMapping("/test1")
    public String test1(HttpServletRequest req) {
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String c = req.getParameter("data3");

        System.out.println("data1 : " + a);
        System.out.println("data2 : " + b);
        System.out.println("data3 : " + c);

        return "result";
    }

    @GetMapping("/test2")
    public String test2(HttpServletRequest req) {
        String a = req.getParameter("data");
        String b = req.getParameter("data2");
        String c[] = req.getParameterValues("data3");

        System.out.println("data1 : " + a);
        System.out.println("data2 : " + b);
        for (String str : c) {
            System.out.println("data3 :" + str);
        }
        return "result";

    }

    @GetMapping("/test3")
    public String test3(WebRequest req) {
        String a = req.getParameter("data");
        String b = req.getParameter("data2");
        String c[] = req.getParameterValues("data3");

        System.out.println("data1 : " + a);
        System.out.println("data2 : " + b);
        for (String str : c) {
            System.out.println("data3 :" + str);
        }
        return "result";

    }

    @PostMapping("/test4")
    public String test4(HttpServletRequest req) {
        String a = req.getParameter("data1");
        String b = req.getParameter("data2");
        String c[] = req.getParameterValues("data3");

        System.out.println("data1 : " + a);
        System.out.println("data2 : " + b);
        for (String str : c) {
            System.out.println("data3 :" + str);
        }
        return "result";

    }

    @GetMapping("/test5")
    public String test5(@RequestParam("data") String data1,
                        @RequestParam("data2") String data2,
                        @RequestParam("data3") String data3[]) {
        System.out.println("data1 : " + data1);
        System.out.println("data2 : " + data2);
        for (String str : data3) {
            System.out.println("data3 :" + str);
        }
        return "result";

    }

    @GetMapping("/test6/{a}/{b}/{c}")
        public String test6 (@PathVariable String a,
                            @PathVariable String b,
                @PathVariable String c){
            System.out.println("data1 : " + a);
            System.out.println("data2 : " + b);
            System.out.println("data3 : " + c);

            return "result";
    }
    @GetMapping("/test8")
    public String login_form(){
        return "login_form";
    }

    @PostMapping("/test8")
    public String login(@ModelAttribute login l){
        System.out.println("ID : "+l.getUser_id());
        System.out.println("Password : "+l.getUser_pass());
        return "result";
    }

    @GetMapping("/test7")
    public String test7 (@ModelAttribute test7 t){
        System.out.println("data1 : "+t.getData1());
        System.out.println("data1 : "+t.getData2());
        System.out.println("data1 : "+t.getData3());
        return "result";
    }

}




