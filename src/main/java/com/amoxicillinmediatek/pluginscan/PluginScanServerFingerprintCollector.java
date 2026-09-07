package com.amoxicillinmediatek.pluginscan;

import java.util.List;

final class PluginScanServerFingerprintCollector {
    private PluginScanServerFingerprintCollector() {}

    static Snapshot snapshot() {
        return new Snapshot(List.of());
    }

    static String friendlyName(String id) {
        return id == null ? "unknown" : id;
    }

    record KnownPackInfo(String namespace, String id, String version) {}
    record Snapshot(List<KnownPackInfo> knownPacks) {}
}
