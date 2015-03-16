package pl.grm.narutocraft.commands;

import net.minecraft.command.*;
import net.minecraft.entity.player.*;
import net.minecraft.util.*;
import pl.grm.narutocraft.commands.util.*;

public class NCCommandHelp extends NCCommandBase {
	private EntityPlayer	player;
	private String[]		args;
	
	public void subCommands() {
		// TODO Auto-generated method stub
	}
	
	public void subCommandHelp() {
		player.addChatMessage(new ChatComponentText("Format: '"
				+ "narutocraft <command> <arguments>'"));
		player.addChatMessage(new ChatComponentText("Available commands:"));
		player.addChatMessage(new ChatComponentText("- version : Version information."));
		
	}
	
	public void showHelp(boolean withParams) throws WrongUsageException {
		if (withParams) {
			player.addChatMessage(new ChatComponentText("Your Command: " + args[0]));
		} else {
			player.addChatMessage(new ChatComponentText("No parameters."));
			throw new WrongUsageException(getCommandUsage(player));
		}
	}
	
	@Override
	public void processCommand(ICommandSender commSender, String[] args) {
		try {
			showHelp(false);
		}
		catch (WrongUsageException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
