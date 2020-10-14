package com.example.restservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgressController {

	@GetMapping("/api/progress")
	public List<Progress> getAllProgress() {

		List<Progress> progresses = new ArrayList<Progress>();
		
		Progress progressAu = new Progress("Australia","75%","#00C851");
		progresses.add(progressAu);
		
		Progress progressIE = new Progress("Europe","50%","#ffbb33");
		progresses.add(progressIE);
		
		Progress progressHk = new Progress("Hong Kong","80%","#00C851");
		progresses.add(progressHk);
		
		Progress progressUs = new Progress("United States","25%","#CC0000");
		progresses.add(progressUs);
		
		Progress progressCA = new Progress("Cananda","75%","#00C851");
		progresses.add(progressCA);
		
		Progress progressMx = new Progress("Mexico","45%","#ffbb33");
		progresses.add(progressMx);

		return progresses;
	}
}
