package com.amoxicillinmediatek.pluginscan;

import java.util.List;

final class PluginScanHistory {
    private PluginScanHistory() {}

    static void recordPlugins(String serverKey, String category,
        List<PluginScanScanner.PluginResultRow> rows) {
        // History is intentionally kept in memory for this standalone mod.
    }
}
