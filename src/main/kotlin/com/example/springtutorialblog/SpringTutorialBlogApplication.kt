package com.example.springtutorialblog

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringTutorialBlogApplication

fun main(args: Array<String>) {
    runApplication<SpringTutorialBlogApplication>(*args) {
        setBannerMode(Banner.Mode.OFF)
    }
}
