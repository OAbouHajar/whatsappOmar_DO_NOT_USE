package X;

import com.whatsapp.stickers.info.StickerInfoDialogFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.3yx  reason: invalid class name and case insensitive filesystem */
public class C78953yx extends C16690tT {
    public final C26141Mm A00;
    public final C34151jm A01;
    public final AnonymousClass1CX A02;
    public final WeakReference A03;

    public C78953yx(C26141Mm r2, C34151jm r3, AnonymousClass1CX r4, StickerInfoDialogFragment stickerInfoDialogFragment) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = C13690nt.A0h(stickerInfoDialogFragment);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if (r2.A0R != false) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r8) {
        /*
            r7 = this;
            X.1jm r4 = r7.A01
            java.lang.String r0 = r4.A09
            r2 = 0
            if (r0 == 0) goto L_0x007a
            X.4On r3 = new X.4On
            r3.<init>()
            byte[] r0 = com.whatsapp.stickers.WebpUtils.fetchWebpMetadata(r0)
            X.1XO r6 = X.AnonymousClass1XO.A00(r0)
            if (r6 == 0) goto L_0x0069
            java.lang.String r0 = r6.A05
            r3.A02 = r0
            java.lang.String r0 = r6.A03
            r3.A01 = r0
            java.lang.String r5 = r6.A02
            r3.A00 = r5
            java.lang.String r1 = r6.A04
            r3.A03 = r1
            boolean r0 = r6.A08
            r3.A07 = r0
            boolean r0 = r6.A06
            r3.A05 = r0
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x003e
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "play.google.com"
            boolean r0 = X.C37971q2.A01(r1, r0)
            if (r0 != 0) goto L_0x0040
        L_0x003e:
            r3.A03 = r2
        L_0x0040:
            java.lang.String r0 = r3.A00
            if (r0 == 0) goto L_0x0069
            X.1CX r2 = r7.A02
            boolean r1 = r6.A07
            r0 = 0
            X.1pi r2 = r2.A02(r0, r5, r1)
            if (r2 == 0) goto L_0x0069
            java.lang.String r0 = r2.A02
            if (r0 != 0) goto L_0x0058
            boolean r0 = r2.A0R
            r1 = 0
            if (r0 == 0) goto L_0x0059
        L_0x0058:
            r1 = 1
        L_0x0059:
            r3.A08 = r1
            java.lang.String r0 = r2.A0H
            r3.A01 = r0
            java.lang.String r0 = r2.A0J
            r3.A02 = r0
            boolean r0 = r2.A0R
            r0 = r0 ^ 1
            r3.A04 = r0
        L_0x0069:
            X.1CX r0 = r7.A02
            boolean r0 = r0.A0H(r4)
            r3.A06 = r0
            X.1Mm r0 = r7.A00
            boolean r0 = r0.A01()
            r3.A09 = r0
            return r3
        L_0x007a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78953yx.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0117, code lost:
        if (android.text.TextUtils.isEmpty(r6) != false) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r10) {
        /*
            r9 = this;
            X.4On r10 = (X.C85454On) r10
            java.lang.ref.WeakReference r0 = r9.A03
            java.lang.Object r5 = r0.get()
            com.whatsapp.stickers.info.StickerInfoDialogFragment r5 = (com.whatsapp.stickers.info.StickerInfoDialogFragment) r5
            if (r5 == 0) goto L_0x00b5
            if (r10 == 0) goto L_0x00b5
            boolean r0 = r5.A0X
            if (r0 != 0) goto L_0x00b5
            r5.A0I = r10
            android.widget.Button r0 = r5.A03
            r4 = 0
            r0.setVisibility(r4)
            android.widget.Button r0 = r5.A04
            r0.setVisibility(r4)
            android.view.View r0 = r5.A01
            r3 = 8
            r0.setVisibility(r3)
            com.whatsapp.stickers.StickerView r0 = r5.A0H
            r0.setVisibility(r4)
            java.lang.String r6 = r10.A01
            java.lang.String r2 = r10.A02
            boolean r0 = r10.A07
            if (r0 == 0) goto L_0x003a
            r0 = 2131891947(0x7f1216eb, float:1.9418628E38)
            java.lang.String r2 = r5.A0J(r0)
        L_0x003a:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x00ef
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L_0x00ef
            android.view.View r0 = r5.A02
            r0.setVisibility(r3)
        L_0x004b:
            r8 = 0
        L_0x004c:
            X.0sK r0 = r5.A0A
            boolean r0 = r0.A0G()
            r6 = 1396(0x574, float:1.956E-42)
            if (r0 != 0) goto L_0x00ba
            X.0pd r0 = r5.A04
            boolean r0 = r0.A0C(r6)
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x00ba
            android.widget.Button r2 = r5.A05
            boolean r0 = r10.A09
            if (r0 == 0) goto L_0x00b6
            r2.setVisibility(r4)
        L_0x006b:
            boolean r1 = r10.A09
            r0 = 2131893689(0x7f121db9, float:1.9422162E38)
            if (r1 == 0) goto L_0x0075
            r0 = 2131891864(0x7f121698, float:1.941846E38)
        L_0x0075:
            java.lang.String r7 = r5.A0J(r0)
            android.widget.Button r1 = r5.A03
            java.lang.CharSequence r0 = com.whatsapp.stickers.info.StickerInfoDialogFragment.A01(r5, r7)
            r1.setText(r0)
            android.widget.Button r0 = r5.A03
            r0.setContentDescription(r7)
        L_0x0087:
            boolean r1 = r10.A06
            r0 = 2131891903(0x7f1216bf, float:1.941854E38)
            if (r1 == 0) goto L_0x0091
            r0 = 2131891899(0x7f1216bb, float:1.9418531E38)
        L_0x0091:
            java.lang.String r1 = r5.A0J(r0)
            java.lang.CharSequence r0 = com.whatsapp.stickers.info.StickerInfoDialogFragment.A01(r5, r1)
            r2.setText(r0)
            r2.setContentDescription(r1)
            boolean r0 = r10.A05
            if (r0 == 0) goto L_0x00ae
            X.0pd r0 = r5.A04
            boolean r0 = r0.A0C(r6)
            if (r0 != 0) goto L_0x00ae
            r2.setVisibility(r3)
        L_0x00ae:
            android.widget.TextView r0 = r5.A06
            if (r8 == 0) goto L_0x011b
            r0.setVisibility(r4)
        L_0x00b5:
            return
        L_0x00b6:
            r2.setVisibility(r3)
            goto L_0x006b
        L_0x00ba:
            boolean r0 = r10.A08
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = r10.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00d2
            boolean r0 = r10.A04
            if (r0 != 0) goto L_0x00d2
            android.widget.Button r0 = r5.A05
            r0.setVisibility(r3)
            android.widget.Button r2 = r5.A03
            goto L_0x0087
        L_0x00d2:
            r0 = 2131891864(0x7f121698, float:1.941846E38)
            java.lang.String r2 = r5.A0J(r0)
            android.widget.Button r1 = r5.A03
            java.lang.CharSequence r0 = com.whatsapp.stickers.info.StickerInfoDialogFragment.A01(r5, r2)
            r1.setText(r0)
            android.widget.Button r0 = r5.A03
            r0.setContentDescription(r2)
            android.widget.Button r0 = r5.A05
            r0.setVisibility(r4)
            android.widget.Button r2 = r5.A05
            goto L_0x0087
        L_0x00ef:
            android.view.View r0 = r5.A02
            r0.setVisibility(r4)
            r1 = 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x00fc
            java.lang.String r2 = X.AnonymousClass1ZW.A05(r1, r2)
        L_0x00fc:
            android.widget.TextView r0 = r5.A08
            r0.setText(r2)
            if (r6 == 0) goto L_0x0107
            java.lang.String r6 = X.AnonymousClass1ZW.A05(r1, r6)
        L_0x0107:
            android.widget.TextView r0 = r5.A07
            r0.setText(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x004b
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r8 = 1
            if (r0 == 0) goto L_0x004c
            goto L_0x004b
        L_0x011b:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78953yx.A0A(java.lang.Object):void");
    }
}
