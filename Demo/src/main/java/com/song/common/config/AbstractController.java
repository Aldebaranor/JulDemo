package com.song.common.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 王质松
 * @date 2022/7/8 16:42
 */
@RestController
public class AbstractController {
    protected Logger logger = LoggerFactory.getLogger(getClass());
}
