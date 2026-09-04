package com.bloxcrypto.pluginscan;

final class PluginScanSettings {
    final boolean commandScannerDebugProbe;

    private PluginScanSettings(boolean commandScannerDebugProbe) {
        this.commandScannerDebugProbe = commandScannerDebugProbe;
    }

    static PluginScanSettings get() {
        return new PluginScanSettings(false);
    }
}
