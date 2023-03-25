package com.sungjujjand.nofireball;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class eventcommand implements CommandExecutor {
    //on command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("nofireball")) {
            if (args.length == 0) {
                sender.sendMessage("true or false를 입력해주세요");
                return true;
            }
            else if (args.length == 1) {
                if (args[0].equalsIgnoreCase("true")) {
                    event.fireball = true;
                    sender.sendMessage("가스트 화염구 방지가 비활성화 되었습니다");
                    return true;
                }
                else if (args[0].equalsIgnoreCase("false")) {
                    event.fireball = false;
                    sender.sendMessage("가스트 화염구 방지가 활성화 되었습니다");
                    return true;
                }
                else {
                    sender.sendMessage("true or false를 입력해주세요");
                    return true;
                }
            }
            else {
                sender.sendMessage("true or false를 입력해주세요");
                return true;
            }
        }
        return false;
    }


}
