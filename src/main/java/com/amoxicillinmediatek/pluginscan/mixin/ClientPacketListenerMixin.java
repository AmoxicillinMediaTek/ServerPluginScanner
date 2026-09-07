package com.amoxicillinmediatek.pluginscan.mixin;

import com.amoxicillinmediatek.pluginscan.PluginScanScanner;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.protocol.game.ClientboundCommandSuggestionsPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPacketListener.class)
public abstract class ClientPacketListenerMixin {
    @Inject(method = "handleCommandSuggestions", at = @At("TAIL"))
    private void pluginscan$handleCommandSuggestions(
        ClientboundCommandSuggestionsPacket packet, CallbackInfo callbackInfo) {
        PluginScanScanner.onSuggestionsPacket(packet);
    }
}
