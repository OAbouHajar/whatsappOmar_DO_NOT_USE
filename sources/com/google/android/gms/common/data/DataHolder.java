package com.google.android.gms.common.data;

import X.AnonymousClass000;
import X.C13680ns;
import X.C13690nt;
import X.C15710ri;
import X.C32251fv;
import X.C84134Jj;
import X.C92364hR;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;

@KeepName
public final class DataHolder extends C15710ri implements Closeable {
    public static final C84134Jj A08 = new C84134Jj(new String[0]);
    public static final Parcelable.Creator CREATOR = new C92364hR();
    public Bundle A00;
    public boolean A01 = false;
    public int[] A02;
    public final int A03;
    public final int A04;
    public final Bundle A05;
    public final CursorWindow[] A06;
    public final String[] A07;

    public DataHolder(Bundle bundle, CursorWindow[] cursorWindowArr, String[] strArr, int i2, int i3) {
        this.A03 = i2;
        this.A07 = strArr;
        this.A06 = cursorWindowArr;
        this.A04 = i3;
        this.A05 = bundle;
    }

    public final void A00() {
        this.A00 = C13690nt.A0D();
        int i2 = 0;
        while (true) {
            String[] strArr = this.A07;
            if (i2 >= strArr.length) {
                break;
            }
            this.A00.putInt(strArr[i2], i2);
            i2++;
        }
        CursorWindow[] cursorWindowArr = this.A06;
        int length = cursorWindowArr.length;
        this.A02 = new int[length];
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            this.A02[i4] = i3;
            i3 += cursorWindowArr[i4].getNumRows() - (i3 - cursorWindowArr[i4].getStartPosition());
        }
    }

    public void close() {
        synchronized (this) {
            if (!this.A01) {
                this.A01 = true;
                int i2 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.A06;
                    if (i2 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i2].close();
                    i2++;
                }
            }
        }
    }

    public final void finalize() {
        boolean z2;
        try {
            if (this.A06.length > 0) {
                synchronized (this) {
                    z2 = this.A01;
                }
                if (!z2) {
                    close();
                    String obj = toString();
                    StringBuilder A0g = C13690nt.A0g(C13680ns.A06(obj) + 178);
                    A0g.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    A0g.append(obj);
                    Log.e("DataBuffer", AnonymousClass000.A0h(")", A0g));
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        String[] strArr = this.A07;
        if (strArr != null) {
            int A012 = C32251fv.A01(parcel, 1);
            parcel.writeStringArray(strArr);
            C32251fv.A05(parcel, A012);
        }
        C32251fv.A0E(parcel, this.A06, 2, i2);
        C32251fv.A06(parcel, 3, this.A04);
        C32251fv.A02(this.A05, parcel, 4);
        C32251fv.A06(parcel, 1000, this.A03);
        C32251fv.A05(parcel, A002);
        if ((i2 & 1) != 0) {
            close();
        }
    }
}
