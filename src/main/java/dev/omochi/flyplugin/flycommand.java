package dev.omochi.flyplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class flycommand  implements CommandExecutor {
    @Override

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player=(Player) sender;
        if(player.getAllowFlight()){
            player.setAllowFlight(false);
            player.sendMessage(ChatColor.RED+"flyモードが無効化されました");
        }else {
            player.setAllowFlight(true);
            player.sendMessage(ChatColor.GREEN+"flyモードが有効化されました");
        }
        return true;
    }
}
