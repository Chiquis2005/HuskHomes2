package net.william278.huskhomes.teleport;

import net.william278.huskhomes.player.User;
import net.william278.huskhomes.position.Position;
import org.jetbrains.annotations.NotNull;

/**
 * Represents a teleport in the process of being executed
 */
public class Teleport {

    /**
     * The player involved in the teleport
     */
    @NotNull
    public User player;

    /**
     * The target position for the player
     */
    @NotNull
    public Position target;

    /**
     * The type of the teleport
     */
    @NotNull
    public TeleportType type;

    public Teleport(@NotNull User player, @NotNull Position target, @NotNull TeleportType type) {
        this.player = player;
        this.target = target;
        this.type = type;
    }
}
