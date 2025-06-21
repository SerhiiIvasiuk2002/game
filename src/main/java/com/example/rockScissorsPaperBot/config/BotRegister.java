package com.example.rockScissorsPaperBot.config;

import com.example.rockScissorsPaperBot.bot.RockScissorsPaperBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

public class BotRegister {
    private final RockScissorsPaperBot bot;

    public BotRegister(RockScissorsPaperBot bot) {
        this.bot = bot;
    }
    public void init() throws TelegramApiException {
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(bot);
    }
}
