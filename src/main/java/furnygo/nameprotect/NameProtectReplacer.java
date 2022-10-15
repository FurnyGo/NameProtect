package furnygo.nameprotect;

import net.minecraft.client.MinecraftClient;

public class NameProtectReplacer {
    public static String replaceName(String string) {
        String username = MinecraftClient.getInstance().getSession().getUsername();
        if (NameProtect.CONFIG.toggleMod() && NameProtect.CONFIG.fakeNickname() != null) {
            return string.replace(username, NameProtect.CONFIG.fakeNickname().replace("&", "§"));
        }
        return string;
    }
}