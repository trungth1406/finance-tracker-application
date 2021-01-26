package com.huutran.financetracker.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;
import com.huutran.financetracker.dao.Transaction;
import com.huutran.financetracker.services.TransactionService;
/**
 * 服务类
 * @author 刘前进 xindong888@163.com  www.xjke.com
 * @since 1.0.0
 */
@RestController
@CrossOrigin
@RequestMapping("/transaction")
public class TransactionController {

    final
    TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    /**
     * 根据Transaction的字段,自动生成条件,字段的值为null不生成条件
     * http://localhost:8080/user/?id=1
     * @param transaction 实体对象
     * @param pageable 分页/排序对象
     * @return 返回的是实体,里面涵盖分页信息及状态码
     */
     @GetMapping
     ResponseEntity<Object> search(Transaction transaction, Pageable pageable) {
             return transactionService.search(transaction, pageable);
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
