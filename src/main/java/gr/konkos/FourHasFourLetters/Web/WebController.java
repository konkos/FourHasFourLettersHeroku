package gr.konkos.FourHasFourLetters.Web;

import gr.konkos.FourHasFourLetters.Utils.ChainCalculator;
import gr.konkos.FourHasFourLetters.Utils.NumberToWord;
import gr.konkos.FourHasFourLetters.Utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/v1/numbertoword")
public class WebController {

    private final WebService webService;

    public WebController(@Autowired WebService webService) {
        this.webService = webService;
    }

    @GetMapping("/convert")
    public ResponseEntity<Response> convertNumberToWord(@RequestParam Long number) {

        if(number > 999_999_999)
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();

        Response response = new Response(NumberToWord.convertNumber(number), number);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/chain/{number}")
    public List getChain(@PathVariable Long number){
        return new ChainCalculator().calculateChain(number);
    }
}
