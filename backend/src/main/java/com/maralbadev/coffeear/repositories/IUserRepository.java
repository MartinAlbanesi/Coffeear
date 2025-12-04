package com.maralbadev.coffeear.repositories;

import com.maralbadev.coffeear.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserModel,Long> {
}
