package com.example.githubcicd

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/public/v1")
class PublicController {

    @GetMapping(
        produces = [MediaType.TEXT_HTML_VALUE]
    )
    fun sayHello(): String? {
        return ("<html> " + "<title>" + "I did it Ranan & Sanjay" + "</title>" + "<body><h1>"
                + "Successfully deployed backend application with docker" + "</h1></body>" + "</html> ")
    }

}