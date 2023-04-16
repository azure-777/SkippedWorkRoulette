package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class RouletteController {

	//スタート画面に遷移
		@RequestMapping("/")
		public String start() {

			return "input.html";

		}

		//ルーレット画面に遷移
		@RequestMapping("/Roulette")
		public String Roulette() {
			//ローカル変数
			double fn = Math.random();
			//ランダムにViewが表示
			if(fn >= 0.7) {
				return "RouletteView.html";
			}else {
				return "RouletteView2.html";
			}

		}

		//スタート画面からルーレット画面に遷移
		@PostMapping("/Roulette")
	    public String toRedirect(RedirectAttributes redirectAttributes){
	        redirectAttributes.addFlashAttribute("pushedBtn", "スタートボタン");
	        return "RouletteView.html";
	    }

}
