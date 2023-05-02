package X;

import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.io.IOException;

@Deprecated
/* renamed from: X.1mn  reason: invalid class name and case insensitive filesystem */
public class C35971mn {
    public final C15900s5 A00;
    public final C36181n8 A01;
    public final C36041mu A02;
    public final C30851d4 A03;
    public final C31691es A04;
    public final C31741ex A05;
    public final C36451nZ A06;
    public final C208211s A07;

    public C35971mn(C15900s5 r2, C31861f9 r3, C30851d4 r4, C31691es r5, C31901fD r6, C31741ex r7, C31711eu r8, C208211s r9, AnonymousClass16P r10) {
        this.A00 = r2;
        this.A07 = r9;
        this.A05 = r7;
        this.A02 = new C36041mu(r6, r9, r10);
        this.A06 = new C36451nZ(r8);
        this.A04 = r5;
        this.A03 = r4;
        this.A01 = new C36181n8(r3, r9, r10);
    }

    public static C30971dG A00(C36441nY r5, int i2) {
        byte[] A002 = r5.A00().A01.A00();
        int length = A002.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(A002, 1, bArr, 0, length);
        byte[] bArr2 = new byte[3];
        bArr2[2] = (byte) i2;
        bArr2[1] = (byte) (i2 >> 8);
        bArr2[0] = (byte) (i2 >> 16);
        return new C30971dG(bArr2, bArr, (byte[]) null);
    }

    public C36531nh A01() {
        try {
            C31941fH A022 = this.A03.A02();
            C36341nO r2 = new C36341nO(A022.A01);
            C36411nV r1 = new C36411nV(A022.A00);
            Log.i("axolotl loading identity key pair");
            return new C36531nh(r2, r1);
        } catch (C36291nJ unused) {
            throw new SQLiteException("Invalid public key stored in identities table");
        }
    }

    public C36481nc A02(C36421nW r3) {
        try {
            return new C36481nc(this.A07.A0D(C31811f4.A00(r3)).A00());
        } catch (IOException unused) {
            throw new AssertionError("serialize/deserialize failed from Session object");
        }
    }

    public void A03(C36341nO r4, C36421nW r5) {
        AnonymousClass1WL r2;
        if (r4 != null) {
            try {
                r2 = new AnonymousClass1WL(C28851Ya.A01(r4.A00.A00()));
            } catch (C31751ey unused) {
                throw new AssertionError("Conversion between ECPublicKey and CurvePublicKey should never fail");
            }
        } else {
            r2 = null;
        }
        this.A07.A0R(r2, C31811f4.A00(r5));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00b1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C36421nW r9, X.C36481nc r10) {
        /*
            r8 = this;
            X.1ni r0 = r10.A01     // Catch:{ IOException -> 0x00bf }
            X.1mt r0 = r0.A00     // Catch:{ IOException -> 0x00bf }
            X.1Ww r0 = r0.A05     // Catch:{ IOException -> 0x00bf }
            byte[] r0 = r0.A04()     // Catch:{ IOException -> 0x00bf }
            int r0 = r0.length     // Catch:{ IOException -> 0x00bf }
            if (r0 == 0) goto L_0x00b7
            X.11s r7 = r8.A07
            X.1Yb r6 = X.C31811f4.A00(r9)
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            java.util.LinkedList r0 = r10.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x001e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r0 = r1.next()
            X.1ni r0 = (X.C36541ni) r0
            X.1mt r0 = r0.A00
            r4.add(r0)
            goto L_0x001e
        L_0x0030:
            X.1ny r0 = X.C36701ny.A03
            X.1Wr r3 = r0.A0U()
            X.1ni r0 = r10.A01
            X.1mt r0 = r0.A00
            r3.A03()
            X.1Wm r1 = r3.A00
            X.1ny r1 = (X.C36701ny) r1
            r1.A02 = r0
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r3.A03()
            X.1Wm r2 = r3.A00
            X.1ny r2 = (X.C36701ny) r2
            X.1XE r1 = r2.A01
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x005f
            X.1XE r1 = X.C28541Wm.A0G(r1)
            r2.A01 = r1
        L_0x005f:
            X.C28591Ws.A01(r4, r1)
            X.1Wm r0 = r3.A02()
            byte[] r1 = r0.A02()
            X.01d r0 = r7.A0K
            X.0tf r5 = r0.A02()
            X.1cj r4 = r5.A00()     // Catch:{ all -> 0x00b2 }
            X.19U r3 = r7.A0F     // Catch:{ all -> 0x00ad }
            monitor-enter(r3)     // Catch:{ all -> 0x00ad }
            X.1ex r0 = r7.A0B     // Catch:{ IOException -> 0x0088 }
            r0.A02(r6, r1)     // Catch:{ IOException -> 0x0088 }
            X.1ev r0 = new X.1ev     // Catch:{ IOException -> 0x0088 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0088 }
            r3.A03(r0, r6)     // Catch:{ IOException -> 0x0088 }
            r4.A00()     // Catch:{ IOException -> 0x0088 }
            goto L_0x00a2
        L_0x0088:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00aa }
            r1.<init>()     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "axolotl storeSession for "
            r1.append(r0)     // Catch:{ all -> 0x00aa }
            r1.append(r6)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = " failed to update"
            r1.append(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00aa }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00aa }
        L_0x00a2:
            monitor-exit(r3)     // Catch:{ all -> 0x00aa }
            r4.close()     // Catch:{ all -> 0x00b2 }
            r5.close()
            return
        L_0x00aa:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00aa }
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            throw r0     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            throw r0
        L_0x00b7:
            java.lang.String r1 = "Alice base key missing from session"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x00bf }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00bf }
            throw r0     // Catch:{ IOException -> 0x00bf }
        L_0x00bf:
            r2 = move-exception
            java.lang.String r1 = "Cannot store invalid session"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35971mn.A04(X.1nW, X.1nc):void");
    }
}
