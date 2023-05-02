package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.14f  reason: invalid class name and case insensitive filesystem */
public final class C214714f {
    public final C212713l A00;
    public final AnonymousClass01Z A01;
    public final C214214a A02;
    public final C19500yX A03;
    public final AnonymousClass14W A04;
    public final C20080zT A05;
    public final C214314b A06;
    public final AnonymousClass14Y A07;
    public final AnonymousClass14V A08;
    public final C213113p A09;
    public final C214514d A0A;
    public final AnonymousClass14X A0B;
    public final AnonymousClass14Z A0C;
    public final C16320sq A0D;

    public C214714f(C212713l r2, AnonymousClass01Z r3, C214214a r4, C19500yX r5, AnonymousClass14W r6, C20080zT r7, C214314b r8, AnonymousClass14Y r9, AnonymousClass14V r10, C213113p r11, C214514d r12, AnonymousClass14X r13, AnonymousClass14Z r14, C16320sq r15) {
        C18450wi.A0H(r15, 1);
        C18450wi.A0H(r6, 2);
        C18450wi.A0H(r13, 3);
        C18450wi.A0H(r10, 4);
        C18450wi.A0H(r9, 5);
        C18450wi.A0H(r5, 6);
        C18450wi.A0H(r14, 7);
        C18450wi.A0H(r8, 9);
        C18450wi.A0H(r7, 10);
        C18450wi.A0H(r3, 12);
        C18450wi.A0H(r11, 13);
        C18450wi.A0H(r2, 14);
        this.A0D = r15;
        this.A04 = r6;
        this.A0B = r13;
        this.A08 = r10;
        this.A07 = r9;
        this.A03 = r5;
        this.A0C = r14;
        this.A02 = r4;
        this.A06 = r8;
        this.A05 = r7;
        this.A0A = r12;
        this.A01 = r3;
        this.A09 = r11;
        this.A00 = r2;
    }

    public final void A00(C37771pi r19, AnonymousClass5QS r20, Integer num, int i2, boolean z2) {
        C37771pi r2 = r19;
        String str = r2.A0F;
        C18450wi.A0B(str);
        C20080zT r4 = this.A05;
        Map map = r4.A01;
        if (map.containsKey(str)) {
            Log.e("StickerPackDownloader/downloadStickersOfAStickerPackAsync attempting to download same pack twice");
            return;
        }
        C16150sX r5 = this.A00.A00.A01;
        C20080zT r12 = (C20080zT) r5.ANd.get();
        AnonymousClass37M r7 = new AnonymousClass37M((C16490t9) r5.AQz.get(), (C211613a) r5.A1E.get(), (AnonymousClass14W) r5.ANc.get(), r20, r12, (C214714f) r5.ANe.get(), num, str, i2, z2);
        map.put(str, 0);
        r4.A00.put(str, r7);
        for (C41781we A032 : this.A04.A01()) {
            A032.A03(r2);
        }
        this.A0D.Ack(r7, r19);
    }
}
