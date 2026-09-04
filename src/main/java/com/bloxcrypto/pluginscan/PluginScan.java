package com.bloxcrypto.pluginscan;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.network.chat.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.fabricmc.fabric.api.client.command.v2.ClientCommandManager.literal;

public final class PluginScan implements ClientModInitializer {
    static final Logger LOGGER = LoggerFactory.getLogger("pluginscan");

    @Override
    public void onInitializeClient() {
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) ->
            dispatcher.register(literal("plugscan").executes(context -> {
                context.getSource().sendFeedback(Component.literal(PluginScanScanner.startScan()));
                return 1;
            })));
        ClientTickEvents.END_CLIENT_TICK.register(client -> PluginScanScanner.onTick());
    }
}
