package it.codingjam.kafkaconfluentallpoc.resources;

import it.codingjam.kafkaconfluentallpoc.models.dtos.UserUpsertDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/users", consumes = MediaType.APPLICATION_JSON_VALUE)
public class UserResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserResource.class);

    @PostMapping
    public void save(@RequestBody UserUpsertDto user) {
        LOGGER.info("Received user {}", user);
    }
}
