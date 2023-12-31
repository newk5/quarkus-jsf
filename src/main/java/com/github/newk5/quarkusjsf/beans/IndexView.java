package com.github.newk5.quarkusjsf.beans;

import java.io.Serializable;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

@Named("indexView")
@ViewScoped
public class IndexView implements Serializable {

    private String test = "aaaaaaa";

    

    @PostConstruct
    public void init() {
        test = "This is a test";
    }

    /**
     * @return the test
     */
    public String getTest() {
        return test;
    }

    /**
     * @param test the test to set
     */
    public void setTest(String test) {
        this.test = test;
    }
    
}