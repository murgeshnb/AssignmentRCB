package com.Assignment_Rcb;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testvagrant.main.Player;
import com.testvagrant.main.Team;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class RcbMain {
    int frgnCnt=0;


    public boolean validateForeignPlayers(List<Player> ps){

        for (Player p: ps) {
            if(!(p.getCountry().equals("India"))){
                frgnCnt++;
            }
        }
        return frgnCnt==4;
    }

    @Test
    public void validateResponse() throws IOException {

        ObjectMapper mapper=new ObjectMapper();

        Team team = mapper.readValue(new File("./response.json"), Team.class);
        List<Player> ply = team.getPlayer();
        Assert.assertTrue(validateForeignPlayers(ply));

    }

}
