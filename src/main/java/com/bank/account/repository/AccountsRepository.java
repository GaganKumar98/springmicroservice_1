package com.bank.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.account.entity.Accounts;

@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {

}
