package net.fabricmc.bot.enums

/**
 * An enum representing each type of channel that may be configured, for easier reference.
 *
 * @param value A human-readable representation of the given channel.
 */
enum class Channels(val value: String) {
    /** The channel used for staff alerts (eg by filters). **/
    ALERTS("alerts"),

    /** The channel intended for running bot commands within. **/
    BOT_COMMANDS("bot-commands"),

    /** The channel used for staff action logging. **/
    ACTION_LOG("action-log"),

    /** The channel used for user action logging.. **/
    MODERATOR_LOG("moderator-log"),
}
