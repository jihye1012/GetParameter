package kr.hs.study.GetParameter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;

@Controller
public class getParameterController {
    @GetMapping("/test1")
    public String test1(HttpServletRequest req){
        String a=req.getParameter("data1");
        String b=req.getParameter("data2");
        String c=req.getParameter("data3");

        System.out.println("data1 : "+a);
        System.out.println("data2 : "+b);
        System.out.println("data3 : "+c);

        return "result";
    }

    @GetMapping("/test2")
    public String test2(HttpServletRequest req){
        String a=req.getParameter("data");
        String b=req.getParameter("data2");
        String c[]=req.getParameterValues("data3");

        System.out.println("data1 : "+a);
        System.out.println("data2 : "+b);
        for(String str:c){
            System.out.println("data3 :"+str);
        }
        return "result";

    }
    @GetMapping("/test3")
    public String test3(WebRequest req){
        String a=req.getParameter("data");
        String b=req.getParameter("data2");
        String c[]=req.getParameterValues("data3");

        System.out.println("data1 : "+a);
        System.out.println("data2 : "+b);
        for(String str:c){
            System.out.println("data3 :"+str);
        }
        return "result";

    }
    @PostMapping("/test4")
    public String test4(HttpServletRequest req){
        String a=req.getParameter("data1");
        String b=req.getParameter("data2");
        String c[]=req.getParameterValues("data3");

        System.out.println("data1 : "+a);
        System.out.println("data2 : "+b);
        for(String str:c){
            System.out.println("data3 :"+str);
        }
        return "result";

    }
    @GetMapping("/test5")
    public String test5(@RequestParam("data") String data1,
                        @RequestParam("data2") String data2,
                        @RequestParam("data3") String data3[]){
        System.out.println("data1 : "+data1);
        System.out.println("data2 : "+data2);
        for(String str:data3){
            System.out.println("data3 :"+str);
        }
        return "result";

    }
}
