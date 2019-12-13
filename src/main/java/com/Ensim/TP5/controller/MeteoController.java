package com.Ensim.TP5.controller;

import java.net.InetSocketAddress;
import java.net.Proxy;

import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.Ensim.TP5.model.DataResult;

@Controller
public class MeteoController {

	@PostMapping("/meteo")
	public String showFormular(@RequestBody String adress ,Model model) {
		SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.univ-lemans.fr", 3128));
		clientHttpReq.setProxy(proxy);
		RestTemplate restTemplate = new RestTemplate(clientHttpReq);
		DataResult c = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+adress, DataResult.class);
		double lon = c.getFeatures().get(0).getGeometry().getCoordinates().get(0);
		double lat = c.getFeatures().get(0).getGeometry().getCoordinates().get(1);
		//DarkSky s = restTemplate.getForObject("https://api.darksky.net/forecast/b479cc79abe8e29de07594db8430be12/"+lat+","+lon+"?lang=fr&exclude=hourly&exclude=daily&exclude=flags&units=si", DarkSky.class);
		//model.addAttribute("meteo",s);
		model.addAttribute("adresse",c.getFeatures().get(0).getProperties().getContext());
		model.addAttribute("ville",c.getFeatures().get(0).getProperties().getCity());
		
		return "meteo";
	}	
}