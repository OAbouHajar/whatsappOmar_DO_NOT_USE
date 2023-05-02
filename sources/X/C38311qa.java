package X;

import com.facebook.redex.IDxNConsumerShape153S0100000_2_I0;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.Executor;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1qa  reason: invalid class name and case insensitive filesystem */
public abstract class C38311qa implements Runnable, C30731cr, C38321qb {
    public C109435Sc A00;
    public final C47292Ij A01;

    public C38311qa(Executor executor) {
        this.A01 = new C47292Ij(executor);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30761cu A00(X.C31701et r4) {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.C38291qY
            if (r0 == 0) goto L_0x0025
            r0 = r3
            X.1qY r0 = (X.C38291qY) r0
            X.1cu r2 = new X.1cu
            r2.<init>()
            X.1jm r1 = r0.A06
        L_0x000e:
            int r0 = r1.A03
            r2.A0A(r0)
            int r0 = r1.A02
            r2.A08(r0)
        L_0x0018:
            int r1 = r4.A01
            r0 = 0
            if (r1 != 0) goto L_0x001e
            r0 = 1
        L_0x001e:
            r2.A0E(r0)
            r2.A07()
            return r2
        L_0x0025:
            boolean r0 = r3 instanceof X.C47282Ii
            if (r0 != 0) goto L_0x0042
            boolean r0 = r3 instanceof X.AnonymousClass278
            if (r0 != 0) goto L_0x0042
            boolean r0 = r3 instanceof X.C38351qe
            if (r0 == 0) goto L_0x003c
            r0 = r3
            X.1qe r0 = (X.C38351qe) r0
            X.1cu r2 = new X.1cu
            r2.<init>()
            X.1jm r1 = r0.A02
            goto L_0x000e
        L_0x003c:
            X.1cu r2 = new X.1cu
            r2.<init>()
            goto L_0x0018
        L_0x0042:
            X.1cu r0 = new X.1cu
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38311qa.A00(X.1et):X.1cu");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: X.3G5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.3Ic} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.3Ic} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: X.3Ic} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass258 A01() {
        /*
            r19 = this;
            r10 = r19
            java.lang.Object r5 = r10.A02()     // Catch:{ 43j -> 0x0088 }
            r3 = r10
            boolean r0 = r10 instanceof X.C38301qZ
            if (r0 == 0) goto L_0x0045
            X.1qZ r3 = (X.C38301qZ) r3
            X.4a8 r5 = (X.C88214a8) r5
            X.0pd r6 = r3.A03
            X.0pf r2 = r3.A02
            java.io.File r0 = r5.A03
            X.4zP r1 = new X.4zP
            r1.<init>(r2, r6, r0)
            X.1qF r0 = r5.A02
            X.4ID r4 = new X.4ID
            r4.<init>(r1, r0)
            X.1cs r2 = r5.A00
            if (r2 != 0) goto L_0x002c
            X.1XK r0 = r5.A01
            X.1cs r2 = new X.1cs
            r2.<init>(r0)
        L_0x002c:
            X.0ua r12 = r3.A01
            X.0xf r1 = r3.A05
            X.0zs r0 = r3.A04
            X.3Ic r5 = new X.3Ic
            r17 = r10
            r11 = r5
            r13 = r6
            r14 = r0
            r15 = r2
            r16 = r4
            r18 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
        L_0x0041:
            monitor-enter(r10)
            r1 = 13
            goto L_0x006c
        L_0x0045:
            X.1qf r3 = (X.C38361qf) r3
            X.4OD r5 = (X.AnonymousClass4OD) r5
            X.0pd r7 = r3.A03
            X.0pf r1 = r3.A02
            java.io.File r0 = r5.A03
            X.4zP r11 = new X.4zP
            r11.<init>(r1, r7, r0)
            X.1qF r13 = r5.A02
            java.lang.String r15 = r5.A05
            java.lang.String r0 = r5.A06
            X.1XK r12 = r5.A01
            X.0ua r6 = r3.A01
            X.0xf r14 = r3.A05
            X.0zs r8 = r3.A04
            X.1cs r9 = r5.A00
            X.3G5 r5 = new X.3G5
            r16 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0041
        L_0x006c:
            X.5Sc r0 = r10.A00     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = "Attempt to run same download multiple times"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0085 }
            X.1et r0 = new X.1et     // Catch:{ all -> 0x0085 }
            r0.<init>(r1)     // Catch:{ all -> 0x0085 }
            X.258 r4 = new X.258     // Catch:{ all -> 0x0085 }
            r4.<init>(r0)     // Catch:{ all -> 0x0085 }
            monitor-exit(r10)     // Catch:{ all -> 0x0085 }
            goto L_0x009a
        L_0x0081:
            r10.A00 = r5     // Catch:{ all -> 0x0085 }
            monitor-exit(r10)     // Catch:{ all -> 0x0085 }
            goto L_0x0096
        L_0x0085:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0085 }
            throw r0
        L_0x0088:
            r0 = move-exception
            int r1 = r0.downloadStatus
            X.1et r0 = new X.1et
            r0.<init>(r1)
            X.258 r4 = new X.258
            r4.<init>(r0)
            goto L_0x009a
        L_0x0096:
            X.258 r4 = r5.A8D()
        L_0x009a:
            X.1et r3 = r4.A00
            int r2 = r3.A01
            r0 = 13
            X.2Ij r1 = r10.A01
            if (r2 != r0) goto L_0x00aa
            boolean r0 = r3.A04
            r1.AQ3(r0)
            return r4
        L_0x00aa:
            X.1cu r0 = r10.A00(r3)
            r1.AQ4(r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38311qa.A01():X.258");
    }

    public Object A02() {
        C38111qG r3;
        File file;
        AnonymousClass1XK r1;
        if (this instanceof C38291qY) {
            C38291qY r2 = (C38291qY) this;
            r3 = new C38111qG(r2.A04, r2.A06.A0G);
            file = r2.A08;
            r1 = AnonymousClass1XK.A0S;
        } else if (this instanceof C47282Ii) {
            C47282Ii r22 = (C47282Ii) this;
            C14710pd r12 = r22.A01;
            String str = r22.A00.A05;
            AnonymousClass00B.A06(str);
            r3 = new C38111qG(r12, str);
            file = r22.A04;
            r1 = AnonymousClass1XK.A0B;
        } else if (this instanceof AnonymousClass278) {
            AnonymousClass278 r32 = (AnonymousClass278) this;
            r32.A08 = true;
            AnonymousClass277 r23 = r32.A03;
            String str2 = r23.A04;
            C38181qN r4 = new C38181qN((String) null, "ppic", (String) null, str2, (String) null);
            File A002 = C219215y.A00(r32.A02.A00, str2, r23.A05);
            r32.A07 = A002;
            return new C88214a8(AnonymousClass1XK.A0B, r4, A002);
        } else if (this instanceof C38351qe) {
            C38351qe r33 = (C38351qe) this;
            AnonymousClass01Z r0 = r33.A00;
            C34151jm r24 = r33.A02;
            String str3 = r24.A0D;
            File A0B = r0.A00.A0B();
            StringBuilder sb = new StringBuilder();
            sb.append(str3.replace(IOUtils.DIR_SEPARATOR_UNIX, '-'));
            sb.append(".tmp");
            File file2 = new File(A0B, sb.toString());
            String str4 = r24.A08;
            if (str4 == null) {
                Log.e("StickerBitmapNetworkFetcher/StickerDownload/makeRequest failed to find enc file hash for sticker");
                throw new C803143j(1);
            } else if (r24.A0B != null) {
                AnonymousClass1XK r42 = AnonymousClass1XK.A0S;
                String str5 = r24.A06;
                AnonymousClass00B.A06(str4);
                AnonymousClass00B.A06("sticker");
                return new AnonymousClass4OD(r42, new C38181qN(str4, "sticker", (String) null, str5, (String) null), file2, r33.A04, r24.A0B, r24.A0D);
            } else {
                Log.e("StickerBitmapNetworkFetcher/StickerDownload/makeRequest failed to find media key for sticker");
                throw new C803143j(1);
            }
        } else {
            AnonymousClass257 r02 = (AnonymousClass257) this;
            AnonymousClass1XK r13 = AnonymousClass1XK.A0J;
            String str6 = r02.A04;
            String str7 = r02.A03;
            AnonymousClass00B.A06(str6);
            AnonymousClass00B.A06("md-app-state");
            return new AnonymousClass4OD(r13, new C38181qN(str6, "md-app-state", (String) null, str7, (String) null), r02.A01, r02.A00, r02.A02, r02.A05);
        }
        return new C88214a8(r1, r3, file);
    }

    public void A03() {
        C109435Sc r0;
        synchronized (this) {
            r0 = this.A00;
        }
        if (r0 != null) {
            r0.cancel();
        }
    }

    public void A4Z(C38331qc r6) {
        C47292Ij r4 = this.A01;
        AnonymousClass1XS r2 = r4.A01;
        IDxNConsumerShape153S0100000_2_I0 iDxNConsumerShape153S0100000_2_I0 = new IDxNConsumerShape153S0100000_2_I0(r6, 18);
        Executor executor = r4.A03;
        r2.A03(iDxNConsumerShape153S0100000_2_I0, executor);
        r4.A02.A03(new IDxNConsumerShape153S0100000_2_I0(r6, 17), executor);
        r4.A00.A03(new IDxNConsumerShape153S0100000_2_I0(r6, 19), executor);
    }

    public void A64(boolean z2) {
        String str;
        if (this instanceof C38351qe) {
            str = "StickerBitmapNetworkFetcher/StickerDownload/cancelMediaDownload attempted to cancel download";
        } else {
            if (this instanceof C38291qY) {
                str = "AvatarStickerBitmapNetworkFetcher/StickerDownload/cancelMediaDownload attempted to cancel download";
            }
            A03();
        }
        Log.i(str);
        A03();
    }

    public void AQ2(long j2) {
        this.A01.AQ1(j2);
    }

    public void run() {
        A01();
    }
}
