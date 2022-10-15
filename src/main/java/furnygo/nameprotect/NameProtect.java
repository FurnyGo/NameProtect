package furnygo.nameprotect;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NameProtect implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("nameprotect");
	public static final furnygo.nameprotect.NameProtectConfig CONFIG = furnygo.nameprotect.NameProtectConfig.createAndLoad();

	@Override
	public void onInitialize() {
		LOGGER.info("NameProtect started");
	}
}
