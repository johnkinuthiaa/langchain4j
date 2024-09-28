package com.example.demo.controller;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.springframework.web.bind.annotation.*;

import static dev.langchain4j.model.openai.OpenAiChatModelName.GPT_4_O_MINI;

@RestController
@RequestMapping("/home")
public class OpenAiImageModelExamples {
    @GetMapping("/img")
    public String getJoke(@RequestParam String message){
        ChatLanguageModel model = OpenAiChatModel.builder()
                .apiKey("input your open AI api key")
                .modelName(GPT_4_O_MINI)
                .build();
        return model.generate(message);
    }

}