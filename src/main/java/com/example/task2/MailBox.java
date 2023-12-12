package com.example.task2;

import java.util.List;

import com.mailjet.client.errors.MailjetException;

public class MailBox {
    private List<MailInfo> infos;
    private String api;
    private String apikey;
    
    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() throws MailjetException {
        for (MailInfo information: infos) {
            MailSender.sendMail(information, api, apikey);
        }
    }
}
