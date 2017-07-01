package eatfast.dbservice.service;

import javax.jws.WebService;

@WebService
public class MainServiceImpl implements MainService {

    public boolean isUser(String login, String password) {
        return true;
    }
}
