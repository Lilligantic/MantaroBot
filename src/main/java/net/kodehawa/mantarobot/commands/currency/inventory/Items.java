package net.kodehawa.mantarobot.commands.currency.inventory;

import java.util.Arrays;

public class Items {
	public static final Item HEADPHONES, BAN_HAMMER, KICK_BOOT, FLOPPY_DISK, MY_MATHS, PING_RACKET, LOADED_DICE, FORGOTTEN_MUSIC, CC_PENCIL, OVERFLOWED_BAG;
	public static final Item[] ALL = {
		HEADPHONES =
			new Item(":headphones:", "Headphones", "That's what happens when you listen to too much music. Should be worth something, tho.", 5),
		BAN_HAMMER =
			new Item(":hammer:", "Ban Hammer", "Ban Hammers", "Left by an admin. +INF Dmg", 20),
		KICK_BOOT =
			new Item(":boot:", "Kick Boot", "Kick Boots", "Left by an admin. +INF Knockback", 15),
		FLOPPY_DISK =
			new Item(":floppy_disk:", "Floppy Disk", "Floppy Disks", "Might have some games.", 10),
		MY_MATHS =
			new Item(":pencil:", "My Maths", "\"Oh, I forgot my maths.\"", 5),
		PING_RACKET =
			new Item(":ping_pong:", "Ping Racket", "Ping Rackets", "I won the ping-pong with Discord by a few miliseconds", 5),
		LOADED_DICE =
			new Item(":game_die:", "Loaded dice", "Stolen from `~>dice` command", 5),
		FORGOTTEN_MUSIC =
			new Item(":musical_note:", "Forgotten Music", "Forgotten Musics", "Never downloaded. Probably has Copyright.", 2),
		CC_PENCIL =
			new Item(":pencil2:", "Custom Commands Pencil", "Custom Command Pencils", "We have plenty of those!", 5),
		OVERFLOWED_BAG =
			new Item(":moneybag:", "Overflowed Moneybag", "Overflowed Moneybags", "Congratulations, you fucked up the game!", 1000)
	};

	public static Item fromId(int id) {
		return ALL[id];
	}

	public static int idOf(Item item) {
		return Arrays.asList(ALL).indexOf(item);
	}
}