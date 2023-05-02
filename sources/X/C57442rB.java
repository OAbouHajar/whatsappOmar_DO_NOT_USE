package X;

import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.gallerypicker.GalleryPickerFragment;
import java.util.ArrayList;

/* renamed from: X.2rB  reason: invalid class name and case insensitive filesystem */
public class C57442rB extends AnonymousClass01X {
    public final ArrayList A00 = AnonymousClass000.A0u();
    public final /* synthetic */ GalleryPickerFragment A01;

    public C57442rB(GalleryPickerFragment galleryPickerFragment) {
        this.A01 = galleryPickerFragment;
        A0B(true);
    }

    public int A0C() {
        return this.A00.size();
    }

    public long A0D(int i2) {
        return (long) i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (r2 != 9) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void ANf(X.C005602k r8, int r9) {
        /*
            r7 = this;
            X.2rg r8 = (X.C57742rg) r8
            java.util.ArrayList r0 = r7.A00
            java.lang.Object r6 = r0.get(r9)
            X.4S6 r6 = (X.AnonymousClass4S6) r6
            r8.A00 = r6
            android.widget.TextView r3 = r8.A03
            com.obwhatsapp.gallerypicker.GalleryPickerFragment r5 = r8.A05
            X.013 r0 = r5.A0C
            java.text.NumberFormat r2 = r0.A0K()
            int r0 = r6.A00
            long r0 = (long) r0
            java.lang.String r0 = r2.format(r0)
            r3.setText(r0)
            com.obwhatsapp.TextEmojiLabel r2 = r8.A04
            java.lang.String r1 = r6.A05
            r0 = 0
            r2.A0I(r0, r1)
            android.widget.ImageView r3 = r8.A01
            int r2 = r6.A02
            if (r2 == 0) goto L_0x006a
            r0 = 1
            if (r2 == r0) goto L_0x0066
            r0 = 2
            if (r2 == r0) goto L_0x0047
            r0 = 4
            if (r2 == r0) goto L_0x006a
            r0 = 5
            if (r2 == r0) goto L_0x0066
            r0 = 6
            if (r2 == r0) goto L_0x0047
            r0 = 7
            if (r2 == r0) goto L_0x006a
            r1 = 9
            r0 = 2131231334(0x7f080266, float:1.8078746E38)
            if (r2 == r1) goto L_0x004a
        L_0x0047:
            r0 = 2131231332(0x7f080264, float:1.8078742E38)
        L_0x004a:
            r3.setImageResource(r0)
            android.widget.ImageView r4 = r8.A02
            java.lang.Object r2 = r4.getTag()
            X.2OV r2 = (X.AnonymousClass2OV) r2
            if (r2 == 0) goto L_0x006e
            java.lang.String r1 = r2.AGT()
            java.lang.String r0 = r6.A00()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006e
            return
        L_0x0066:
            r0 = 2131231333(0x7f080265, float:1.8078744E38)
            goto L_0x004a
        L_0x006a:
            r0 = 2131231331(0x7f080263, float:1.807874E38)
            goto L_0x004a
        L_0x006e:
            X.2OM r0 = r5.A0H
            r0.A01(r2)
            X.2BF r3 = r6.A03
            X.4yQ r2 = new X.4yQ
            r2.<init>(r3, r6, r8)
            r0 = 0
            com.facebook.redex.IDxBRecipientShape31S0300000_1_I1 r1 = new com.facebook.redex.IDxBRecipientShape31S0300000_1_I1
            r1.<init>(r3, r8, r2, r0)
            r4.setTag(r2)
            X.2OM r0 = r5.A0H
            r0.A02(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57442rB.ANf(X.02k, int):void");
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        GalleryPickerFragment galleryPickerFragment = this.A01;
        return new C57742rg(galleryPickerFragment.A05().inflate(R.layout.layout02b1, (ViewGroup) null), galleryPickerFragment);
    }
}
