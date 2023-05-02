package X;

import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;

/* renamed from: X.37F  reason: invalid class name */
public class AnonymousClass37F extends C16690tT {
    public final int A00;
    public final C37771pi A01;
    public final /* synthetic */ StickerStorePackPreviewActivity A02;

    public AnonymousClass37F(C37771pi r1, StickerStorePackPreviewActivity stickerStorePackPreviewActivity, int i2) {
        this.A02 = stickerStorePackPreviewActivity;
        this.A00 = i2;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006f, code lost:
        if (r1 != null) goto L_0x0071;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r8) {
        /*
            r7 = this;
            X.1jm[] r8 = (X.C34151jm[]) r8
            int r0 = r8.length
            r1 = 0
            boolean r0 = X.C13690nt.A1R(r0)
            X.AnonymousClass00B.A0G(r0)
            r4 = r8[r1]
            X.AnonymousClass00B.A06(r4)
            com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity r5 = r7.A02
            java.util.Map r1 = r5.A0V
            java.lang.String r0 = r4.A0D
            java.lang.String r1 = X.C13690nt.A0e(r0, r1)
            if (r1 != 0) goto L_0x0071
            X.12W r0 = r5.A0F
            X.1XH r0 = r0.A00()
            r0.A01()
            java.io.File r1 = r0.A03
            java.lang.String r0 = "sticker"
            java.io.File r6 = X.C13700nu.A0C(r1, r0)
            boolean r0 = r6.exists()
            if (r0 != 0) goto L_0x003a
            boolean r0 = r6.mkdirs()
            if (r0 == 0) goto L_0x0076
        L_0x003a:
            java.lang.String r3 = r4.A0D
            X.AnonymousClass00B.A06(r3)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            r1 = 47
            r0 = 45
            java.lang.String r0 = r3.replace(r1, r0)
            r2.append(r0)
            java.lang.String r0 = ".webp"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r2)
            java.io.File r3 = X.C13700nu.A0C(r6, r0)
            java.util.Map r2 = r5.A0V
            java.lang.String r1 = r4.A0D
            java.lang.String r0 = r3.getAbsolutePath()
            r2.put(r1, r0)
            X.14U r0 = r5.A0Q
            java.io.File r0 = r0.A00(r4, r3)
            if (r0 == 0) goto L_0x0076
            java.lang.String r1 = r0.getAbsolutePath()
            if (r1 == 0) goto L_0x0076
        L_0x0071:
            r0 = 2
            r4.A09 = r1
            r4.A01 = r0
        L_0x0076:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37F.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A02;
        C55552jq r1 = stickerStorePackPreviewActivity.A0S;
        int i2 = this.A00;
        r1.A0G(i2, false);
        stickerStorePackPreviewActivity.A0S.A0H((C34151jm) obj, this.A01, i2);
    }
}
