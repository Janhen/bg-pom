package com.janhen.bigdata;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedHashMap;

@Slf4j
public class Test {

  public static void main(String[] args) {

    LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
    map.put(1, "1");
    map.put(2, "2");
    map.put(2, "3");
    map.put(1, "4");
    map.put(1, "4");
    map.put(1, "5");

    for (Integer key : map.keySet()) {
      System.out.println(key + map.get(key));
    }
  }

  @org.junit.Test
  public void tt() {
    log.info("TT");
  }
}
