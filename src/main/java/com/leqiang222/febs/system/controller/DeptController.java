package com.leqiang222.febs.system.controller;


import com.leqiang222.febs.common.controller.BaseController;
import com.leqiang222.febs.common.domain.QueryRequest;
import com.leqiang222.febs.system.domain.Dept;
import com.leqiang222.febs.system.domain.Role;
import com.leqiang222.febs.system.manager.UserManager;
import com.leqiang222.febs.system.service.IDeptService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author leqiang222
 */
@Slf4j
@Validated
@RestController
@RequestMapping("/dept")
public class DeptController extends BaseController {

    @Autowired
    private IDeptService deptService;

    @GetMapping
    public Map<String, Object> deptList(QueryRequest queryRequest, Dept dept) {
//        return getDataTable(roleService.findRoles(role, queryRequest));
        return getDataTable(deptService.findDepts());
    }
}