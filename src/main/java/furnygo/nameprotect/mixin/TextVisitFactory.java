package furnygo.nameprotect.mixin;

import furnygo.nameprotect.NameProtect;
import furnygo.nameprotect.NameProtectReplacer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(net.minecraft.client.font.TextVisitFactory.class)
public abstract class TextVisitFactory {
    @ModifyArg(at = @At(value = "INVOKE",
            target = "Lnet/minecraft/client/font/TextVisitFactory;visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z",
            ordinal = 0),
            method = {
                    "visitFormatted(Ljava/lang/String;ILnet/minecraft/text/Style;Lnet/minecraft/text/CharacterVisitor;)Z"},
            index = 0)
    private static String adjustText(String text) {
        if (NameProtect.CONFIG.toggleMod()) return NameProtectReplacer.replaceName(text);
        else return text;
    }
}