/**
 * 
 */
package io.dataproject.coronavirustracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.dataproject.coronavirustracker.models.LocationStats;
import io.dataproject.coronavirustracker.services.CoronaVirusDataService;

/**
 * @author Devyansh Ojha
 *
 */
@Controller
public class HomeController {
	@Autowired
	CoronaVirusDataService coronaVirusDataservice;

	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> allStats = coronaVirusDataservice.getAllStats();
		int totalCases = allStats.stream().mapToInt(stat -> Integer.parseInt(stat.getLatestTotalCases())).sum();
		int totalNewCases = allStats.stream().mapToInt(stat -> (stat.getDiffFromPrevDay())).sum();

		model.addAttribute("locationStats", allStats);
		model.addAttribute("totalReportedCases", totalCases);
		model.addAttribute("totalNewCases", totalNewCases);

		return "home";
	}
}
