package com.xy.chart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/chart")
public class chartController {
    Map<String, Integer> Max_Data= new HashMap<>();
    List<Map<String,Integer>> Max_list=new LinkedList<>();
    Map<String, Integer> current_Data= new HashMap<>();
    List<Map<String,Integer>> current_list=new LinkedList<>();
    @RequestMapping("/getItems")
    public List<Map<String, Integer>> getItems(){
        return Max_list;
    }
    @RequestMapping("/getData")
    public List<Map<String, Integer>> getData(){
        return current_list;
    }

}
