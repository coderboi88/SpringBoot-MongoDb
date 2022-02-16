package com.aditya.cricketapi.controller;

import com.aditya.cricketapi.model.Match;
import com.aditya.cricketapi.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping("/match/{matchId}")
    public Match getMatchDetail(@PathVariable String matchId){
        return matchService.getMatchDetail(Integer.parseInt(matchId));
        //return matchService.generateScore(match.getNoOfOver(),match.getNoOfWicket());
    }

    @PostMapping("/match")
    public String postMatchDetail(@RequestBody Match match){
        matchService.postMatchDetail(match);
        return "redirect:/match/"+match.getMatchId();
    }

    @DeleteMapping("/deletematch/{matchId}")
    public void deleteMatchDetail(@PathVariable String matchId){
        matchService.deleteMatchDetail(Integer.parseInt(matchId));
    }

    @PutMapping("/updatematch/{matchId}")
    public void updateMatchDetail(@RequestBody Match match,@PathVariable String matchId){
        matchService.updateMatchDetail(match,Integer.parseInt(matchId));
    }

}
