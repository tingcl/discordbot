package bot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class CommandsModule extends ListenerAdapter {

    public static final String prefix = "!";

    @Override
    public void onGuildMessageReceived(GuildMessageReceivedEvent event){

        String[] args = event.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase(prefix + "info")){
            EmbedBuilder info = new EmbedBuilder();
            Guild guildInfo = event.getGuild();
            Member memberInfo = event.getMember();
            info.setTitle("Welcome to " + guildInfo.getName() + " " + memberInfo.getEffectiveName().toUpperCase() + "! \uD83E\uDD16");
            info.setDescription("Type \"!commands\" to see all user actions");
            info.setColor(0xFFA500);
            info.setFooter("Created by Jerry", event.getMember().getUser().getAvatarUrl());
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(info.build()).queue();
            info.clear();
        }
        else if(args[0].equalsIgnoreCase(prefix + "commands")) {
            String desc =
                    "!info = server information\n" + "!commands = all commands";
            EmbedBuilder commands = new EmbedBuilder();
            commands.setTitle("List of Commands");
            commands.setDescription(desc);
            commands.setColor(0x187BCD);
            event.getChannel().sendTyping().queue();
            event.getChannel().sendMessage(commands.build()).queue();
            commands.clear();
        }
    }
}
