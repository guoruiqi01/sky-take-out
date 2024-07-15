package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;
import org.springframework.stereotype.Service;

public interface SetmealService {

    /**
     * 新增套餐和对应菜品
     * @param setmealDTO
     */
    void saveWithDish(SetmealDTO setmealDTO);

}
