package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class GreetingController {

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/election-winner")
    public String electionWinner(@RequestParam(value="candidate", required=false, defaultValue="Hillary Clinton") String candidate, Model model) {
        model.addAttribute("candidate", candidate);
        return "candidate";
    }

    @RequestMapping("/president-roulette")
    public String candidates(@RequestParam(value="candidate1", required=false, defaultValue="FDR") String candidate1,
                             @RequestParam(value="candidate2", required=false, defaultValue="Honest Abe") String candidate2,
                             @RequestParam(value="candidate3", required=false, defaultValue="Richard 'I am not a criminal' Nixon") String candidate3, Model model) {

        List<String> candidates  = new ArrayList<String>();
        candidates.add(candidate1);
        candidates.add(candidate2);
        candidates.add(candidate3);
        String winner = pickRandom(candidates);

        model.addAttribute("winner", winner);
        return "winner";
    }

    private String pickRandom(List<String> candidates) {
        Collections.shuffle(candidates);
        return candidates.get(0);
    }

}
