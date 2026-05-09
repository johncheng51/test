package com.jm.controllers;
     import java.util.List;
     import org.springframework.web.bind.annotation.*;

      @RestController
      @RequestMapping(value = "/api/Dummy")
      public class DummyController {

      @RequestMapping(value = "hello", method = RequestMethod.GET)
      public String hello() {
             return "from Rest API! for hello";
                  }
          @CrossOrigin
    @RequestMapping(value = "DUMMY", method = RequestMethod.GET)
    public String DUMMY() {
        return "DUMMY from Rest API!";
    }

      /*---append rest---*/
      }
