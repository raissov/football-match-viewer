package kz.aitu.team14;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;


public class Bot extends TelegramLongPollingBot {


    Game game = new Game();
    Stadium staduim = new Stadium();
    private long chat_id;
    String lastMassage = " ";
    ReplyKeyboardMarkup replyKeyboardMarkup =  new ReplyKeyboardMarkup();

    public void onUpdateReceived(Update update) {
      update.getUpdateId();
      SendMessage sendMassage = new SendMessage().setChatId(update.getMessage().getChatId());
      chat_id = update.getMessage().getChatId();


      String text = update.getMessage().getText();
      sendMassage.setReplyMarkup(replyKeyboardMarkup);
          try{
              sendMassage.setText(getMassage(text));
              execute(sendMassage);
          }catch (TelegramApiException e){
              e.printStackTrace();
          }
      }

    public String getMassage(String msg){
        ArrayList<KeyboardRow> keyboard = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow =new KeyboardRow();

        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        if(msg.equals("Привет") || msg.equals("Меню")|| msg.equals("/start")){
            keyboard.clear();
            keyboardFirstRow.clear();
            keyboardFirstRow.add("\uD83E\uDD16" +"  "+"О боте");
            keyboardFirstRow.add("\uD83D\uDC40  Ближайшие матчи");
            keyboardSecondRow.add("\uD83C\uDD98  Помощь");
            keyboard.add(keyboardFirstRow);
            keyboard.add(keyboardSecondRow);
            replyKeyboardMarkup.setKeyboard(keyboard);
            return "Выбрать...";

            }
        if (msg.equals("\uD83E\uDD16" +"  "+"О боте")){
            return "\uD83D\uDCBB " +  "This bot was created by @icegeeek and with supporting of Alikhan from ITM";
        }
        if(msg.equals("\uD83C\uDD98  Помощь")){
            return "This bot was created in order to monitor Premier league games, please press to 'Upcoming games' or you find tour games just by writing 'тур 1'";
        }
        if (msg.contains("Hi") || msg.contains("Hello") || msg.contains("Привет") ) {
            return "Hello my friend!";

        }
        if (msg.contains("\uD83D\uDC40  Ближайшие матчи")){
                return  getInfoGame10()+"\n\n"
                        +getInfoGame11()+"\n\n"
                        +getInfoGame12()+"\n\n"
                        +getInfoGame13()+"\n\n"
                        +getInfoGame14()+"\n\n"
                        +getInfoGame15()+"\n\n"
                        +getInfoGame16()+"\n\n"
                        +getInfoGame17()+"\n\n"
                        +"---------------------------------------"
                        +getInfoGame18()+"\n\n"
                        +"---------------------------------------"
                        +getInfoGame19()+"\n\n";

        }
        if (msg.contains("1 тур" ) || msg.contains("тур 1")) {
            return getInfoGame() + "\n\n"
                    +"---------------------------------------"+"\n\n"
                    +getInfoGame1()+"\n\n"
                    +getInfoGame2()+"\n\n"
                    +getInfoGame3()+"\n\n"
                    +getInfoGame4()+"\n\n"
                    +getInfoGame5()+"\n\n"
                    +getInfoGame6()+"\n\n"
                    +"---------------------------------------"+"\n\n"
                    +getInfoGame7()+"\n\n"
                    +getInfoGame8()+"\n\n"
                    +getInfoGame9()+"\n\n";
        }

        return "no";



    }


    public String getBotUsername() {
        return "@AITU_TEAM14_bot";
    }

    public String getBotToken() {
        return "855353682:AAF0zni9emflMNmVGfh31KMJFCrwxozRpng";
    }

    public String getInfoGame() {
    String info = "✅  1 ТУР"+"\n"
            +"\n"+"\uD83D\uDCC5"+game.date1()+"\n\n"+
            "⚽" + game.liverpool()+" "+"-"+" "+game.norwich()
            +"\n"+"\uD83D\uDD22"+game.score()
            +"\n"+staduim.liverpool();
            ;

    return info;
    }
    public String getInfoGame1(){
        String info = "\uD83D\uDCC5"+game.date2()+"\n\n"+
                "⚽" + game.westham()+" "+"-"+" "+game.city()
                +"\n"+"\uD83D\uDD22"+game.score2()
                +"\n"+staduim.westham();
        ;

        return info;
    }
    public  String getInfoGame2(){
        String info = "⚽" + game.Bornmunt()+" "+"-"+" "+game.Sheffilde()
                +"\n"+"\uD83D\uDD22"+game.score3()
                +"\n"+staduim.bornmunt();
        ;

        return info;
    }
    public  String getInfoGame3(){
        String info = "⚽" + game.Bernly()+" "+"-"+" "+game.Sautgemp()
                +"\n"+"\uD83D\uDD22"+game.score4()
                +"\n"+staduim.bernly();
        ;

        return info;
    }
    public String getInfoGame4(){
        String info = "⚽" + game.Crystal()+" "+"-"+" "+game.Everton()
                +"\n"+"\uD83D\uDD22"+game.score5()
                +"\n"+staduim.crystal();
        ;

        return info;
    }
    public String getInfoGame5(){
        String info = "⚽" + game.Wotford()+" "+"-"+" "+game.Braiton()
                +"\n"+"\uD83D\uDD22"+game.score6()
                +"\n"+staduim.wotford();
        ;

        return info;
    }
    public String getInfoGame6(){
        String info = "⚽" + game.Tothenham()+" "+"-"+" "+game.Astonvilla()
                +"\n"+"\uD83D\uDD22"+game.score7()
                +"\n"+staduim.totenham();
        ;

        return info;
    }
    public String getInfoGame7(){
        String info = "\uD83D\uDCC5"+game.date3()+"\n\n"+
                "⚽" + game.Liecter()+" "+"-"+" "+game.Vulverhampton()
                +"\n"+"\uD83D\uDD22"+game.score8()
                +"\n"+staduim.liecter();
        ;

        return info;
    }
    public String getInfoGame8(){
        String info = "⚽" + game.Newcastle()+" "+"-"+" "+game.Arsenal()
                +"\n"+"\uD83D\uDD22"+game.score9()
                +"\n"+staduim.newcastle();
        ;

        return info;
    }
    public String getInfoGame9(){
        String info = "⚽" + game.Manu()+" "+"-"+" "+game.Chelsea()
                +"\n"+"\uD83D\uDD22"+game.score10()
                +"\n"+staduim.manu();
        ;

        return info;
    }
    public String getInfoGame10() {
        String info = "✅  13 ТУР"+"\n"
                +"\n"+"\uD83D\uDCC5"+game.date4()+"\n\n"+
                "⚽" + game.westham()+" "+"-"+" "+game.Tothenham()
                +"\n"+staduim.westham();
        ;

        return info;
    }
    public String getInfoGame11(){
        String info = "⚽" + game.Bornmunt()+" "+"-"+" "+game.Vulverhampton()
                +"\n"+staduim.bornmunt();
        ;
        return  info;
    }
    public String getInfoGame12(){
        String info = "⚽" + game.Arsenal()+" "+"-"+" "+game.Sautgemp()
                +"\n"+staduim.arsenal();
        ;
        return info;
    }
    public String getInfoGame13(){
        String info = "⚽" + game.Braiton()+" "+"-"+" "+game.Liecter()
                +"\n"+staduim.braiton();
        ;
        return info;
    }
    public String getInfoGame14(){
        String info = "⚽" + game.Crystal()+" "+"-"+" "+game.liverpool()
                +"\n"+staduim.crystal();
        ;
        return info;
    }
    public String getInfoGame15(){
        String info = "⚽" + game.Everton()+" "+"-"+" "+game.norwich()
                +"\n"+staduim.everton();
        ;
        return info;
    }
    public String getInfoGame16(){
        String info = "⚽" + game.Wotford()+" "+"-"+" "+game.Bernly()
                +"\n"+staduim.wotford();
        ;
        return info;
    }
    public String getInfoGame17(){
        String info = "⚽" + game.city()+" "+"-"+" "+game.Chelsea()
                +"\n"+staduim.city();
        ;
        return info;
    }
    public String getInfoGame18(){
        String info = "\n"+"\uD83D\uDCC5"+game.date5()+"\n\n"+
                "⚽" + game.Sheffilde()+" "+"-"+" "+game.Manu()
                +"\n"+staduim.sheffilde();
        ;
        return info;
    }
    public String getInfoGame19(){
        String info = "\n"+"\uD83D\uDCC5"+game.date6()+"\n\n"+
                "⚽" + game.Astonvilla()+" "+"-"+" "+game.Newcastle()
                +"\n"+staduim.astonvil();
        ;
        return info;
    }
    }





