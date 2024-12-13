package kr.co.joneconsulting.my_restful_service.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class HelloWorldBean {
    private String message;

    /*public HelloWorldBean(String message) {
        this.message = message;
    }*/
}
