package X;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import java.util.Arrays;

/* renamed from: X.3UQ  reason: invalid class name */
public abstract class AnonymousClass3UQ extends Timeline {
    public final int A00;
    public final AnonymousClass5TE A01;

    public AnonymousClass3UQ(AnonymousClass5TE r2) {
        this.A01 = r2;
        this.A00 = r2.getLength();
    }

    public final C89324by A0A(C89324by r7, int i2, long j2) {
        int binarySearch;
        boolean z2 = this instanceof AnonymousClass3UD;
        if (z2) {
            binarySearch = i2 / ((AnonymousClass3UD) this).A01;
        } else {
            int[] iArr = ((AnonymousClass3UE) this).A04;
            int i3 = i2 + 1;
            binarySearch = Arrays.binarySearch(iArr, i3);
            if (binarySearch < 0) {
                binarySearch = -(binarySearch + 2);
            } else {
                do {
                    binarySearch--;
                    if (binarySearch < 0) {
                        break;
                    }
                } while (iArr[binarySearch] != i3);
            }
        }
        int A0E = A0E(binarySearch);
        int A0D = A0D(binarySearch);
        A0F(binarySearch).A0A(r7, i2 - A0E, j2);
        Object valueOf = z2 ? Integer.valueOf(binarySearch) : ((AnonymousClass3UE) this).A06[binarySearch];
        if (!C89324by.A0F.equals(r7.A09)) {
            valueOf = Pair.create(valueOf, r7.A09);
        }
        r7.A09 = valueOf;
        r7.A00 += A0D;
        r7.A01 += A0D;
        return r7;
    }

    public int A0D(int i2) {
        return this instanceof AnonymousClass3UD ? i2 * ((AnonymousClass3UD) this).A00 : ((AnonymousClass3UE) this).A03[i2];
    }

    public int A0E(int i2) {
        return this instanceof AnonymousClass3UD ? i2 * ((AnonymousClass3UD) this).A01 : ((AnonymousClass3UE) this).A04[i2];
    }

    public Timeline A0F(int i2) {
        return this instanceof AnonymousClass3UD ? ((AnonymousClass3UD) this).A03 : ((AnonymousClass3UE) this).A05[i2];
    }
}
