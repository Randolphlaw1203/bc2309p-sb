package com.vtxlab.demothymeleafbootcamp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import com.vtxlab.demothymeleafbootcamp.model.CoinData;
import com.vtxlab.demothymeleafbootcamp.service.ApiService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CoinDataController {

  private ApiService apiService;

  @Autowired
  public void MyController(ApiService apiService) {
    this.apiService = apiService;
  }

  @GetMapping("/coin-data")
  public String displayExternalData(Model model) {
    List<CoinData> coinDataList = apiService.fetchCoinData();
    model.addAttribute("coinDataList", coinDataList);
    return "coin-data";
  }

}
