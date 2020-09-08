package com.example.sample.app.sample;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

    private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

    @RequestMapping(value = "sample1", method = { RequestMethod.GET, RequestMethod.POST })
    public String sample1(Locale locale, Model model) {

        logger.debug("method:sample1 start");
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);
        logger.debug(formattedDate);
        model.addAttribute("serverTime", formattedDate);
        return "welcome/home";
    }
}
