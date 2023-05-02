package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* renamed from: X.2PF  reason: invalid class name */
public class AnonymousClass2PF {
    public static final byte[] A08 = {87, 65, 77, 80, 83, 73, 68, 1};
    public int A00;
    public int A01;
    public AnonymousClass2PK A02;
    public String A03 = "00000000-0000-0000-0000-000000000000";
    public ArrayList A04 = new ArrayList();
    public final int A05;
    public final AnonymousClass1CK A06;
    public final RandomAccessFile A07;

    public AnonymousClass2PF(AnonymousClass1CK r2, RandomAccessFile randomAccessFile, int i2) {
        this.A05 = i2;
        this.A07 = randomAccessFile;
        this.A06 = r2;
    }

    public final void A00() {
        try {
            RandomAccessFile randomAccessFile = this.A07;
            randomAccessFile.seek(54);
            randomAccessFile.writeByte(this.A01);
            randomAccessFile.writeByte(this.A00);
            for (int i2 = 0; i2 < this.A01; i2++) {
                ArrayList arrayList = this.A04;
                randomAccessFile.writeInt(((AnonymousClass2PG) arrayList.get(i2)).A01);
                randomAccessFile.writeInt(((AnonymousClass2PG) arrayList.get(i2)).A00);
                randomAccessFile.writeBoolean(((AnonymousClass2PG) arrayList.get(i2)).A02);
            }
        } catch (IOException e2) {
            StringBuilder sb = new StringBuilder("queuefile/flushMetaToFile failed to write ");
            sb.append(e2.getMessage());
            Log.e(sb.toString());
        }
    }

    public boolean A01(byte[] bArr, int i2) {
        int i3;
        ArrayList arrayList = this.A04;
        int i4 = this.A00;
        if (((AnonymousClass2PG) arrayList.get(i4)).A01 <= 8 && ((AnonymousClass2PG) arrayList.get(i4)).A02) {
            Log.e("queuefile/writeBytes in privatestats see locked empty mini event buffer");
            i4 = this.A00;
            ((AnonymousClass2PG) arrayList.get(i4)).A02 = false;
        }
        if (!((AnonymousClass2PG) arrayList.get(i4)).A02) {
            int length = bArr.length;
            if (length < i2) {
                i2 = length;
            }
            AnonymousClass2PK r2 = this.A02;
            if (i2 <= r2.A00 - r2.A02) {
                ((AnonymousClass2PG) arrayList.get(this.A00)).A01 += r2.A00(bArr, i2);
                A00();
                return true;
            } else if (((AnonymousClass2PG) arrayList.get(i4)).A00 < 65536) {
                try {
                    this.A07.setLength(65792);
                    ((AnonymousClass2PG) arrayList.get(this.A00)).A00 = AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
                    AnonymousClass2PK r1 = this.A02;
                    r1.A00 = AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
                    if (i2 <= AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED - r1.A02) {
                        i3 = r1.A00(bArr, i2);
                        ((AnonymousClass2PG) arrayList.get(this.A00)).A01 += i3;
                    } else {
                        i3 = 0;
                    }
                    A00();
                    if (i3 > 0) {
                        return true;
                    }
                } catch (IOException e2) {
                    StringBuilder sb = new StringBuilder("queuefile/writeBytes failed to write ");
                    sb.append(e2.getMessage());
                    Log.e(sb.toString());
                }
            }
        }
        return false;
    }
}
