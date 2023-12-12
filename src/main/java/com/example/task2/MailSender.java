package com.example.task2;

import com.mailjet.client.ClientOptions;
import com.mailjet.client.MailjetClient;
import com.mailjet.client.MailjetRequest;
import com.mailjet.client.MailjetResponse;
import com.mailjet.client.errors.MailjetException;
import com.mailjet.client.resource.Emailv31;

import lombok.Builder;
import lombok.ToString;

@Builder @ToString
public class MailSender {
    public static void sendMail(MailInfo info, String api, String apiKey) throws MailjetException {
        MailjetClient client;
        MailjetRequest request;
        MailjetResponse response;
        ClientOptions options = ClientOptions.builder().apiKey(api).apiSecretKey(apiKey).build();
        client = new MailjetClient(options);
        request = new MailjetRequest(Emailv31.resource) 
                        .property("Email", info.getClient().getMail())
                        .property("From", info.getClient().getName())
                        .property("Subject", info.getMailCode())
                        .property("Age", info.getClient().getAge())
                        .property("ID", info.getClient().getId());
        response = client.post(request);
        System.out.println(response.getStatus());
    }
}
