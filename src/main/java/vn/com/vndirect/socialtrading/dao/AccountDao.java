package vn.com.vndirect.socialtrading.dao;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;
import vn.com.vndirect.socialtrading.model.Account;

import java.util.List;
import java.util.Optional;

@Service
public class AccountDao extends AbstractDao<Account, String> {

    public Optional<Account> getByUsername(String username) {
        return Optional.of(template.queryForObject("SELECT * FROM account WHERE username = ?",
                new BeanPropertyRowMapper<Account>(Account.class),
                username));
    }

    @Override
    public Optional<Account> getSingle(String id) {
        return Optional.empty();
    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public boolean insert(Account e) {
        return false;
    }

    @Override
    public boolean update(Account e) {
        return false;
    }

    @Override
    public boolean save(Account e) {
        return false;
    }

    @Override
    public boolean delete(Account e) {
        return false;
    }
}
