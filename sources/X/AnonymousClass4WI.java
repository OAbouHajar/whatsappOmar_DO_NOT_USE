package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4WI  reason: invalid class name */
public final class AnonymousClass4WI {
    public List A00;
    public List A01;
    public final int A02;
    public final String A03;

    public /* synthetic */ AnonymousClass4WI(String str, int i2) {
        C440222l r2 = C440222l.A00;
        ArrayList A0u = AnonymousClass000.A0u();
        C18450wi.A0H(str, 1);
        this.A03 = str;
        this.A01 = r2;
        this.A00 = A0u;
        this.A02 = i2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4WI) {
                AnonymousClass4WI r5 = (AnonymousClass4WI) obj;
                if (!C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0E(this.A00, AnonymousClass000.A0E(this.A01, AnonymousClass3K4.A07(this.A03))) + this.A02;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("MapViewBusinessData(viewType=");
        A0r.append(this.A03);
        A0r.append(", clusterList=");
        A0r.append(this.A01);
        A0r.append(", businessList=");
        A0r.append(this.A00);
        A0r.append(", resultState=");
        A0r.append(this.A02);
        return AnonymousClass000.A0j(A0r);
    }
}
