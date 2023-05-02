package X;

import java.util.Map;

/* renamed from: X.0zO  reason: invalid class name and case insensitive filesystem */
public class C20030zO extends C20040zP {
    public final Map A00;

    public C20030zO(Map map) {
        this.A00 = map;
        if (!map.containsKey(0)) {
            throw new IllegalArgumentException("Logging entry-point controller map must contain controller for NULL LoggingEntryPoint type");
        } else if (!map.containsKey(1)) {
            throw new IllegalArgumentException("Logging entry-point controller map must contain controller for CTWA_ADS LoggingEntryPoint type");
        }
    }
}
