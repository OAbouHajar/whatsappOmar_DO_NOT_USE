package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.4jf  reason: invalid class name and case insensitive filesystem */
public final class C93724jf implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(2);
    public final C35731mP[] A00;

    public C93724jf(Parcel parcel) {
        this.A00 = new C35731mP[parcel.readInt()];
        int i2 = 0;
        while (true) {
            Object[] objArr = this.A00;
            if (i2 < objArr.length) {
                objArr[i2] = AnonymousClass3K3.A0U(parcel, C35731mP.class);
                i2++;
            } else {
                return;
            }
        }
    }

    public C93724jf(List list) {
        this.A00 = (C35731mP[]) list.toArray(new C35731mP[0]);
    }

    public C93724jf(C35731mP... r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r4 = r6.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C93724jf A00(X.C93724jf r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L_0x0003
            return r5
        L_0x0003:
            X.1mP[] r4 = r6.A00
            int r3 = r4.length
            if (r3 != 0) goto L_0x0009
            return r5
        L_0x0009:
            X.1mP[] r1 = r5.A00
            int r2 = r1.length
            int r0 = r2 + r3
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r0 = 0
            java.lang.System.arraycopy(r4, r0, r1, r2, r3)
            X.1mP[] r1 = (X.C35731mP[]) r1
            X.4jf r0 = new X.4jf
            r0.<init>((X.C35731mP[]) r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93724jf.A00(X.4jf):X.4jf");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C93724jf.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A00, ((C93724jf) obj).A00);
    }

    public int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public String toString() {
        return AnonymousClass000.A0h(Arrays.toString(this.A00), AnonymousClass000.A0r("entries="));
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(r3);
        for (C35731mP writeParcelable : this.A00) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
