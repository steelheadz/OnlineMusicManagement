package com.wll.service.impl;

import com.wll.pojo.Admin;
import com.wll.mapper.AdminMapper;
import com.wll.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wll
 * @since 2025-04-24
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
