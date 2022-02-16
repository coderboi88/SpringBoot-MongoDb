package com.aditya.cricketapi.service;

import com.aditya.cricketapi.model.Match;
import com.aditya.cricketapi.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class MatchService {

    @Autowired
    private MatchRepository matchRepository;

    public void postMatchDetail(Match match) {
        matchRepository.save(match);
    }

    public Match getMatchDetail(Integer id) {
        return matchRepository.findByMatchId(id);
    }

    public String generateScore(int noOfOver,int noOfWicket){
        int totalBall = 6*noOfOver;
        int ball = 1;
        int wicket = 0;
        String answer = "";
        while((wicket<noOfWicket) && (ball<=totalBall)){
            String s = generateRun();
            answer += "Ball "+ball+": "+ s+"\n";
            if(s=="W"){
                wicket++;
            }
            if(ball%6==0){
                answer+="Over Completed\n";
            }
            ball++;
        }

        return answer;
    }
    
    private String generateRun(){
        Random random = new Random();
        int upper_bound = 8;
        int run = random.nextInt(upper_bound);
        return run==7?"W":Integer.toString(run);
    }

    public void deleteMatchDetail(int matchId) {
        matchRepository.deleteById(matchId);
    }

    public void updateMatchDetail(Match match, int parseInt) {
        matchRepository.save(match);
    }
}
