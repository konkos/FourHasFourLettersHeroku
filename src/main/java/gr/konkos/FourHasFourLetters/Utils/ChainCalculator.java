package gr.konkos.FourHasFourLetters.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ChainCalculator {

    private List<Response> chain;

    public ChainCalculator(){
        chain = new ArrayList<>();
    }

    private Long calculateNextHop(long in){
        String s = NumberToWord.convertNumber(in);
        return (long) s.length();
    }

    public List<Response> calculateChain(Long num){
        while(true){
            Response response = new Response(NumberToWord.convertNumber(num), num);

            Long finalNum = num;
            Optional<Response> count = chain.stream().filter(res -> Objects.equals(res.getNumber(), finalNum)).findAny();

            if (count.isPresent())
                break;

            chain.add(response);

            num = calculateNextHop(num);
        }

        return chain;
    }

}
