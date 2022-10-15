package furnygo.nameprotect;

import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = "nameprotect")
@Config(name = "nameprotect", wrapperName = "NameProtectConfig")
public class NameProtectConfigModel {
    public boolean toggleMod = true;
    public String fakeNickname = "";
}
