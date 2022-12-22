package com.teamMMM.bot.commands;

import com.teamMMM.bot.util.CommandPlaceholderEmbed;
import net.dv8tion.jda.api.events.guild.GuildReadyEvent;
import net.dv8tion.jda.api.events.interaction.SlashCommandEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class EditGameSettingsCmd extends ListenerAdapter {
    @Override
    public void onSlashCommand(SlashCommandEvent event){
        if(event.getCommandString().contains("edit")){
            event.replyEmbeds(CommandPlaceholderEmbed.createPlaceholderEmbed(event, "edit").build()).queue();
        }
    }
}
