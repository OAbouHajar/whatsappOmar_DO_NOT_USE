package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.emoji.EmojiDescriptor;

/* renamed from: X.4uk  reason: invalid class name and case insensitive filesystem */
public class C99884uk implements AnonymousClass5RN {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ C26171Mp A01;

    public C99884uk(Resources resources, C26171Mp r2) {
        this.A01 = r2;
        this.A00 = resources;
    }

    public void ANC() {
    }

    public void AQH(int[] iArr) {
        C434420a r4 = new C434420a(iArr);
        long A002 = EmojiDescriptor.A00(r4, false);
        C26171Mp r0 = this.A01;
        C17250um r1 = r0.A0B;
        Resources resources = this.A00;
        Drawable A02 = r1.A02(resources, new C101944y9(resources, r0, iArr), r4, A002);
        if (A02 != null) {
            AnonymousClass3Q4 r12 = r0.A04;
            AnonymousClass00B.A06(r12);
            r12.A05(A02, 0);
            return;
        }
        AnonymousClass3Q4 r3 = r0.A04;
        AnonymousClass00B.A06(r3);
        int i2 = 2;
        if (!AnonymousClass000.A1O((A002 > -1 ? 1 : (A002 == -1 ? 0 : -1)))) {
            i2 = 1;
        }
        r3.A05((Drawable) null, i2);
    }
}
