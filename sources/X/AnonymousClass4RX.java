package X;

import com.whatsapp.util.Log;

/* renamed from: X.4RX  reason: invalid class name */
public class AnonymousClass4RX {
    public double A00 = Double.NaN;
    public double A01 = Double.NaN;
    public long A02 = 0;
    public final C210812s A03;

    public AnonymousClass4RX(C210812s r3) {
        this.A03 = r3;
    }

    public double A00() {
        C46192Cv r0 = this.A03.A00;
        double A002 = r0.A00();
        String bool = Boolean.toString(r0.A01());
        StringBuilder A0r = AnonymousClass000.A0r("voip/call/battery_monitor percent = ");
        A0r.append(A002);
        A0r.append(", charging = ");
        Log.i(AnonymousClass000.A0h(bool, A0r));
        return A002;
    }
}
