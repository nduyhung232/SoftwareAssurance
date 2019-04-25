package com.hung;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginService {
//    AccountSQL myConnectionSql = new AccountSQL();
//
//    @PostMapping("/login")
//    public ResponseEntity login(@RequestBody Account account) {
//        Account account1 = myConnectionSql.checkLogin(account.getUserName(), account.getPassWord());
//        if (account1 == null) {
//            System.out.println("login fail");
//            account1 = new Account();
//        } else {
//            System.out.println("login: " + account.getUserName());
//        }
//        return ResponseEntity.ok(account1);
//    }
}
