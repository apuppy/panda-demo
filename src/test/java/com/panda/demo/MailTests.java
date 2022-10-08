//package com.panda.demo;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.core.io.FileSystemResource;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//import java.io.File;
//
//@SpringBootTest
//public class MailTests {
//
//    @Autowired
//    private JavaMailSender emailSender;
//
//    @Test
//    void sendSimpleMail() {
//        SimpleMailMessage simpleMail = new SimpleMailMessage();
//        simpleMail.setFrom("1126422830@qq.com(Kevin Leo)");
//        simpleMail.setTo("chinalihongde@163.com");
//        simpleMail.setSubject("A demo simple mail from qq mail");
//        simpleMail.setText("When you can’t find the sunshine, be the sunshine.");
//        emailSender.send(simpleMail);
//    }
//
//    @Test
//    void sendMimeMail() throws MessagingException {
//        MimeMessage mimeMessage = emailSender.createMimeMessage();
//
//        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
//        mimeMessageHelper.setFrom("1126422830@qq.com(Kevin Leo)");
//        mimeMessageHelper.setTo("chinalihongde@163.com");
//        mimeMessageHelper.setSubject("A demo MIME mail from qq mail");
//        mimeMessageHelper.setText("<h1>When you can’t find the sunshine, be the sunshine.</h1> <img src='https://source.unsplash.com/random' />", true);
//
//        String attachment = "/Users/hongde/Downloads/cat-scratch-1.png";
//
//        FileSystemResource file = new FileSystemResource(new File(attachment));
//        mimeMessageHelper.addAttachment("cat-scratch.png", file);
//
//        emailSender.send(mimeMessage);
//    }
//
//}
