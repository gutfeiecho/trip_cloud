package org.example.trip.user.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.trip.user.domain.UserInfo;
import org.example.trip.user.mapper.UserInfoMapper;
import org.example.trip.user.service.UserInfoService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements UserInfoService {

}
