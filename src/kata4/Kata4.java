package kata4;

import java.util.List;
import model.Histogram;
import model.Mail;
import ui.HistogramDisplay;
import ui.MailHistogramBuilder;
import ui.MailListReader;

public class Kata4 {
    
    private static List<Mail> mailList;
    private static Histogram <String> mailHistogram;
    
    public static void main(String[] args) {
        execute();
    }
    
    private static void execute(){
        input();
        process();
        output();  
    }

    private static void output() {
        new HistogramDisplay("Histograma", mailHistogram).execute();
    }

    private static void process() {
    mailHistogram = MailHistogramBuilder.build(mailList);
    }

    private static void input() {
        String fileName = new String("emails.txt");
        mailList = MailListReader.read(fileName);
    }
}
