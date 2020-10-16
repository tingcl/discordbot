package bot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        JDABuilder builder = JDABuilder.createDefault("NzY2MjEyNjczOTMwNzg4ODg0.X4gFKQ.X_d-mk8LmmWHax_xGUPVFx7Jjbo");
        builder.setStatus(OnlineStatus.ONLINE);
        builder.setActivity(Activity.playing("!info"));
        builder.addEventListeners(new CommandsModule());
        builder.build();
    }
}
