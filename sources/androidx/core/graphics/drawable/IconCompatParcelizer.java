package androidx.core.graphics.drawable;

import X.AnonymousClass000;
import X.AnonymousClass0GW;
import X.AnonymousClass0SG;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
    public static IconCompat read(AnonymousClass0SG r4) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.A02 = r4.A00(iconCompat.A02, 1);
        byte[] bArr = iconCompat.A09;
        if (r4.A09(2)) {
            Parcel parcel = ((AnonymousClass0GW) r4).A05;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                bArr = new byte[readInt];
                parcel.readByteArray(bArr);
            }
        }
        iconCompat.A09 = bArr;
        iconCompat.A05 = r4.A01(iconCompat.A05, 3);
        iconCompat.A00 = r4.A00(iconCompat.A00, 4);
        iconCompat.A01 = r4.A00(iconCompat.A01, 5);
        iconCompat.A03 = (ColorStateList) r4.A01(iconCompat.A03, 6);
        String str = iconCompat.A08;
        if (r4.A09(7)) {
            str = ((AnonymousClass0GW) r4).A05.readString();
        }
        iconCompat.A08 = str;
        String str2 = iconCompat.A07;
        if (r4.A09(8)) {
            str2 = ((AnonymousClass0GW) r4).A05.readString();
        }
        iconCompat.A07 = str2;
        iconCompat.A04 = PorterDuff.Mode.valueOf(iconCompat.A08);
        switch (iconCompat.A02) {
            case -1:
                Parcelable parcelable = iconCompat.A05;
                if (parcelable != null) {
                    iconCompat.A06 = parcelable;
                    return iconCompat;
                }
                throw AnonymousClass000.A0T("Invalid icon");
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.A05;
                if (parcelable2 != null) {
                    iconCompat.A06 = parcelable2;
                    return iconCompat;
                }
                byte[] bArr2 = iconCompat.A09;
                iconCompat.A06 = bArr2;
                iconCompat.A02 = 3;
                iconCompat.A00 = 0;
                iconCompat.A01 = bArr2.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.A09, Charset.forName("UTF-16"));
                iconCompat.A06 = str3;
                if (iconCompat.A02 == 2 && iconCompat.A07 == null) {
                    iconCompat.A07 = str3.split(":", -1)[0];
                    return iconCompat;
                }
            case 3:
                iconCompat.A06 = iconCompat.A09;
                return iconCompat;
        }
        return iconCompat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        r5.A07(r1, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        r1 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r1 == 0) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        r5.A06(r1, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        r1 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (r1 == 0) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        r5.A06(r1, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r1 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r1 == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        r5.A07(r1, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        r1 = r4.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        if (r1 == null) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r5.A05(7);
        ((X.AnonymousClass0GW) r5).A05.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        r1 = r4.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        r5.A05(8);
        ((X.AnonymousClass0GW) r5).A05.writeString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r1 = r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0084, code lost:
        r0 = r1.getBytes(java.nio.charset.Charset.forName("UTF-16"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        r4.A09 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (-1 == r1) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        r5.A06(r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        r2 = r4.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r2 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001c, code lost:
        r5.A05(2);
        r1 = ((X.AnonymousClass0GW) r5).A05;
        r1.writeInt(r2.length);
        r1.writeByteArray(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r1 == null) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void write(androidx.core.graphics.drawable.IconCompat r4, X.AnonymousClass0SG r5) {
        /*
            r3 = 1
            android.graphics.PorterDuff$Mode r0 = r4.A04
            java.lang.String r0 = r0.name()
            r4.A08 = r0
            int r0 = r4.A02
            java.lang.String r2 = "UTF-16"
            switch(r0) {
                case -1: goto L_0x006d;
                case 0: goto L_0x0010;
                case 1: goto L_0x006d;
                case 2: goto L_0x0074;
                case 3: goto L_0x0079;
                case 4: goto L_0x007e;
                case 5: goto L_0x006d;
                case 6: goto L_0x007e;
                default: goto L_0x0010;
            }
        L_0x0010:
            int r1 = r4.A02
            r0 = -1
            if (r0 == r1) goto L_0x0018
            r5.A06(r1, r3)
        L_0x0018:
            byte[] r2 = r4.A09
            if (r2 == 0) goto L_0x002c
            r0 = 2
            r5.A05(r0)
            r0 = r5
            X.0GW r0 = (X.AnonymousClass0GW) r0
            android.os.Parcel r1 = r0.A05
            int r0 = r2.length
            r1.writeInt(r0)
            r1.writeByteArray(r2)
        L_0x002c:
            android.os.Parcelable r1 = r4.A05
            if (r1 == 0) goto L_0x0034
            r0 = 3
            r5.A07(r1, r0)
        L_0x0034:
            int r1 = r4.A00
            if (r1 == 0) goto L_0x003c
            r0 = 4
            r5.A06(r1, r0)
        L_0x003c:
            int r1 = r4.A01
            if (r1 == 0) goto L_0x0044
            r0 = 5
            r5.A06(r1, r0)
        L_0x0044:
            android.content.res.ColorStateList r1 = r4.A03
            if (r1 == 0) goto L_0x004c
            r0 = 6
            r5.A07(r1, r0)
        L_0x004c:
            java.lang.String r1 = r4.A08
            if (r1 == 0) goto L_0x005c
            r0 = 7
            r5.A05(r0)
            r0 = r5
            X.0GW r0 = (X.AnonymousClass0GW) r0
            android.os.Parcel r0 = r0.A05
            r0.writeString(r1)
        L_0x005c:
            java.lang.String r1 = r4.A07
            if (r1 == 0) goto L_0x006c
            r0 = 8
            r5.A05(r0)
            X.0GW r5 = (X.AnonymousClass0GW) r5
            android.os.Parcel r0 = r5.A05
            r0.writeString(r1)
        L_0x006c:
            return
        L_0x006d:
            java.lang.Object r0 = r4.A06
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r4.A05 = r0
            goto L_0x0010
        L_0x0074:
            java.lang.Object r1 = r4.A06
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0084
        L_0x0079:
            java.lang.Object r0 = r4.A06
            byte[] r0 = (byte[]) r0
            goto L_0x008c
        L_0x007e:
            java.lang.Object r0 = r4.A06
            java.lang.String r1 = r0.toString()
        L_0x0084:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r2)
            byte[] r0 = r1.getBytes(r0)
        L_0x008c:
            r4.A09 = r0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompatParcelizer.write(androidx.core.graphics.drawable.IconCompat, X.0SG):void");
    }
}
