package com.huutran.financetracker.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import com.huutran.financetracker.dao.MoneyResource;
import com.huutran.financetracker.services.MoneyResourceService;
/**
 * 服务类
 * @author 刘前进 xindong888@163.com  www.xjke.com
 * @since 1.0.0
 */
@RestController
@CrossOrigin
@RequestMapping("/moneyResource")
public class MoneyResourceController {

    final
    MoneyResourceService moneyResourceService;

    public MoneyResourceController(MoneyResourceService moneyResourceService) {
        this.moneyResourceService = moneyResourceService;
    }

    /**
     * 根据MoneyResource的字段,自动生成条件,字段的值为null不生成条件
     * http://localhost:8080/user/?id=1
     * @param moneyResource 实体对象
     * @param pageable 分页/排序对象
     * @return 返回的是实体,里面涵盖分页信息及状态码
     */
     @GetMapping
     ResponseEntity<Object> search(MoneyResource moneyResource, Pageable pageable) {
             return moneyResourceService.search(moneyResource, pageable);
     }
     @PostMapping
     void create() {
     }
     @PutMapping
     void update(){
     }
     @DeleteMapping("/")
     void delete(){
     }
}
