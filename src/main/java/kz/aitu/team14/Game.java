package kz.aitu.team14;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Game {
    private Document document;

    public Game() {
        connect();
    }

    private void connect() {
        try {
            document = Jsoup.connect("https://terrikon.com/football/england/championship/matches").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String liverpool() {
        Element match = document.getElementById("55170");
        for (Element element : match.select(""))
            return element.text();
        return "error";
    }

    public String norwich() {
        Element match = document.getElementById("55170");
        Elements game = match.getElementsByClass("rightalign");
        for (Element element : game.select("a"))
            return element.text();
        return "error";a
    }

    public String score() {
        Element match = document.getElementById("55170");
        Elements game = match.getElementsByClass("score");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }

    public String date1() {
        Element match = document.getElementById("55170");
        return match.getElementsByClass("date").text();
    }

    public String westham() {
        Element match = document.getElementById("55171");
        for (Element element : match.select("a"))
            return element.text();
        return "error";
    }

    public String city() {
        Element match = document.getElementById("55171");
        Elements game = match.getElementsByClass("rightalign");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }

    public String score2() {
        Element match = document.getElementById("55171");
        Elements game = match.getElementsByClass("score");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }

    public String date2() {
        Element match = document.getElementById("55171");
        return match.getElementsByClass("date").text();
    }
    public String Bornmunt() {
        Element match = document.getElementById("55172");
        for (Element element : match.select("a"))
            return element.text();
        return "error";
    }

    public String Sheffilde() {
        Element match = document.getElementById("55172");
        Elements game = match.getElementsByClass("rightalign");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }

    public String score3() {
        Element match = document.getElementById("55172");
        Elements game = match.getElementsByClass("score");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }

    public String Bernly() {
        Element match = document.getElementById("55173");
        for (Element element : match.select("a"))
            return element.text();
        return "error";
    }

    public String Sautgemp() {
        Element match = document.getElementById("55173");
        Elements game = match.getElementsByClass("rightalign");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }

    public String score4() {
        Element match = document.getElementById("55173");
        Elements game = match.getElementsByClass("score");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }
    public String Crystal() {
        Element match = document.getElementById("55174");
        for (Element element : match.select("a"))
            return element.text();
        return "error";
    }

    public String Everton() {
        Element match = document.getElementById("55174");
        Elements game = match.getElementsByClass("rightalign");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }

    public String score5() {
        Element match = document.getElementById("55174");
        Elements game = match.getElementsByClass("score");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }
    public String Wotford() {
        Element match = document.getElementById("55176");
        for (Element element : match.select("a"))
            return element.text();
        return "error";
    }

    public String Braiton() {
        Element match = document.getElementById("55176");
        Elements game = match.getElementsByClass("rightalign");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }

    public String score6() {
        Element match = document.getElementById("55176");
        Elements game = match.getElementsByClass("score");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }
    public String Tothenham() {
        Element match = document.getElementById("55177");
        for (Element element : match.select("a"))
            return element.text();
        return "error";
    }

    public String Astonvilla() {
        Element match = document.getElementById("55177");
        Elements game = match.getElementsByClass("rightalign");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }

    public String score7() {
        Element match = document.getElementById("55177");
        Elements game = match.getElementsByClass("score");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }
    public String date3() {
        Element match = document.getElementById("55179");
        return match.getElementsByClass("date").text();
    }
    public String Liecter() {
        Element match = document.getElementById("55175");
        for (Element element : match.select("a"))
            return element.text();
        return "error";
    }

    public String Vulverhampton() {
        Element match = document.getElementById("55175");
        Elements game = match.getElementsByClass("rightalign");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }

    public String score8() {
        Element match = document.getElementById("55175");
        Elements game = match.getElementsByClass("score");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }
    public String Newcastle() {
        Element match = document.getElementById("55178");
        for (Element element : match.select("a"))
            return element.text();
        return "error";
    }

    public String Arsenal() {
        Element match = document.getElementById("55178");
        Elements game = match.getElementsByClass("rightalign");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }

    public String score9() {
        Element match = document.getElementById("55178");
        Elements game = match.getElementsByClass("score");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }
    public String Manu() {
        Element match = document.getElementById("55179");
        for (Element element : match.select("a"))
            return element.text();
        return "error";
    }

    public String Chelsea() {
        Element match = document.getElementById("55179");
        Elements game = match.getElementsByClass("rightalign");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }

    public String score10() {
        Element match = document.getElementById("55179");
        Elements game = match.getElementsByClass("score");
        for (Element element : game.select("a"))
            return element.text();
        return "error";
    }


    public String date4() {
        Element match = document.getElementById("55299");
        return match.getElementsByClass("date").text();
    }
    public String date5(){
        Element match = document.getElementById("55297");
        return match.getElementsByClass("date").text();
    }
    public String date6(){
        Element match = document.getElementById("55292");
        return match.getElementsByClass("date").text();
    }
}






