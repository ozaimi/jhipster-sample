package com.oz.jhipster.cucumber.stepdefs;

import com.oz.jhipster.JhipstersampleApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipstersampleApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
