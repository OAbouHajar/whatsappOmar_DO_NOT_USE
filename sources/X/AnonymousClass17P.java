package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.17P  reason: invalid class name */
public class AnonymousClass17P {
    public final Map A00 = new HashMap();
    public final Map A01 = new HashMap();
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();

    public synchronized void A00() {
        this.A02.clear();
        this.A01.clear();
        this.A03.clear();
        this.A00.clear();
    }

    public synchronized String toString() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append("[localdata: ");
        sb.append(this.A01.toString());
        sb.append(" callbacks: ");
        sb.append(this.A00.toString());
        sb.append("]");
        return sb.toString();
    }
}
