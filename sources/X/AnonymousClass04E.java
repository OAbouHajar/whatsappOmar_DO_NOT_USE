package X;

import android.app.PendingIntent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.04E  reason: invalid class name */
public class AnonymousClass04E {
    @Deprecated
    public int A00;
    public PendingIntent A01;
    public IconCompat A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05;
    public final int A06;
    public final Bundle A07;
    public final AnonymousClass04G[] A08;
    public final AnonymousClass04G[] A09;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass04E(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
        this(pendingIntent, new Bundle(), i2 != 0 ? IconCompat.A02((Resources) null, "", i2) : null, charSequence, (AnonymousClass04G[]) null, (AnonymousClass04G[]) null, 0, true, true);
    }

    public AnonymousClass04E(PendingIntent pendingIntent, Bundle bundle, IconCompat iconCompat, CharSequence charSequence, AnonymousClass04G[] r7, AnonymousClass04G[] r8, int i2, boolean z2, boolean z3) {
        this.A05 = true;
        this.A02 = iconCompat;
        if (iconCompat != null && iconCompat.A05() == 2) {
            this.A00 = iconCompat.A04();
        }
        this.A03 = C007503l.A00(charSequence);
        this.A01 = pendingIntent;
        this.A07 = bundle;
        this.A09 = r7;
        this.A08 = r8;
        this.A04 = z2;
        this.A06 = i2;
        this.A05 = z3;
    }

    public IconCompat A00() {
        int i2;
        IconCompat iconCompat = this.A02;
        if (iconCompat != null || (i2 = this.A00) == 0) {
            return iconCompat;
        }
        IconCompat A022 = IconCompat.A02((Resources) null, "", i2);
        this.A02 = A022;
        return A022;
    }
}
