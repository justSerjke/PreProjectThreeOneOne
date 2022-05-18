package ru.justserjke.preproject_3_1_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.justserjke.preproject_3_1_1.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
