package kz.aitu.team14;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class main {
    public static void main(String[] args){
        ApiContextInitializer.init();
        TelegramBotsApi telegram = new TelegramBotsApi();

        Bot bot = new Bot();
        try {
            telegram.registerBot(bot);

        }catch (TelegramApiException e){
            e.printStackTrace();
        }

    }
}

