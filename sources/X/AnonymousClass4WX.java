package X;

import java.util.List;

/* renamed from: X.4WX  reason: invalid class name */
public final class AnonymousClass4WX {
    public final int A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public AnonymousClass4WX(String str, String str2, List list, int i2, boolean z2) {
        this.A02 = str;
        this.A00 = i2;
        this.A01 = str2;
        this.A04 = z2;
        this.A03 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WX) {
                AnonymousClass4WX r5 = (AnonymousClass4WX) obj;
                if (!C18450wi.A0R(this.A02, r5.A02) || this.A00 != r5.A00 || !C18450wi.A0R(this.A01, r5.A01) || this.A04 != r5.A04 || !C18450wi.A0R(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A09 = AnonymousClass3K2.A09(this.A01, (AnonymousClass3K4.A07(this.A02) + this.A00) * 31);
        boolean z2 = this.A04;
        if (z2) {
            z2 = true;
        }
        return AnonymousClass3K2.A06(this.A03, (A09 + (z2 ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("FcsStateMachineContextParams(stateName=");
        A0r.append(this.A02);
        A0r.append(", qplInstanceKey=");
        A0r.append(this.A00);
        A0r.append(", fdsManagerId=");
        A0r.append(this.A01);
        A0r.append(", isModalOnScreen=");
        A0r.append(this.A04);
        A0r.append(", backStateCache=");
        return AnonymousClass3K2.A0k(this.A03, A0r);
    }
}
