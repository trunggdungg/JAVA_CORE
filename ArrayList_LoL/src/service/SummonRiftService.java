package service;

import entities.Figure;
import entities.SummonRift;
import entities.Team;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SummonRiftService {
    public static SummonRift summonRiftInput() {
        List<Team> teams = new ArrayList<>();

        System.out.println("Nhập thoi gian (HH:mm:ss): ");
        String time = new Scanner(System.in).nextLine();
//        LocalTime localTime = LocalTime.parse(time,DateTimeFormatter.ofPattern("HH:mm:ss"));
        for(int i =0;i< 2;i++) {
            System.out.println("Nhập thông tin team thứ "+(i+1));
            Team team = TeamService.teamInput();
            teams.add(team);
        }
        return new SummonRift( teams, time);
    }

    public static void ouput() {
        System.out.println(summonRiftInput());

    }
}
