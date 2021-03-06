package cn.js.sandglass.finance.dao;

import cn.js.sandglass.finance.entitiy.AccountType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountTypeDao extends JpaRepository<AccountType, Long> {

    AccountType findById(String id);

}
