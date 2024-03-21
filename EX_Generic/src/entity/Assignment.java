package entity;

import java.time.LocalDate;

public class Assignment {
    private Member member;
    private Position position;

    private int dayWorked;

    public Assignment(Member member, Position position, int dayWorked) {
        this.member = member;
        this.position = position;
        this.dayWorked = dayWorked;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getDayWorked() {
        return dayWorked;
    }

    public void setDayWorked(int dayWorked) {
        this.dayWorked = dayWorked;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "member=" + member +
                ", position=" + position +
                ", dayWorked=" + dayWorked +
                '}';
    }
}
