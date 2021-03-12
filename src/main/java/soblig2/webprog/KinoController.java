package soblig2.webprog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController("/")
public class KinoController {
    public final List<Billett> alleBillettter = new ArrayList<>();

    @PostMapping("/lagring")
    public void lagreData(Billett nyBillett){
        alleBillettter.add(nyBillett);
    }
    @GetMapping("/hente")
   public List<Billett> henteData(){
        return alleBillettter;
    }
    @GetMapping("/slette")
    public void sletteAlt(){
        alleBillettter.clear();
    }
}
