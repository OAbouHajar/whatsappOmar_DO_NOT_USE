package X;

import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

/* renamed from: X.1mo  reason: invalid class name and case insensitive filesystem */
public class C35981mo {
    public static final Random A03 = new Random();
    public final C35971mn A00;
    public final C16440t3 A01;
    public final AnonymousClass16P A02;

    public C35981mo(C35971mn r1, C16440t3 r2, AnonymousClass16P r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public static final C30891d8 A00(Exception exc, byte[] bArr, int i2) {
        int length;
        String str;
        if (exc != null) {
            Log.w("axolotl", exc);
        }
        if (i2 == 0) {
            if (bArr == null || (length = bArr.length) == 0) {
                Log.w("SignalCoordinator/createDecryptionResult axolotl derived null or empty plaintext from message");
                i2 = -1000;
            } else {
                byte b2 = bArr[length - 1] & 255;
                if (b2 == 0) {
                    str = "MessageUtil/removePadding/ axolotl derived plaintext has invalid padding";
                } else if (b2 >= length) {
                    str = "MessageUtil/removePadding/ axolotl derived entire plaintext as padding";
                } else {
                    int i3 = length - b2;
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, 0, bArr2, 0, i3);
                    if (bArr2.length != 0) {
                        return new C30891d8(bArr2, 0);
                    }
                    i2 = -10000;
                }
                Log.w(str);
                i2 = -10000;
            }
        }
        return new C30891d8((byte[]) null, i2);
    }

    public static final boolean A01(C36751o3 r2, C36751o3 r3) {
        C36761o4 r0 = r2.A02;
        if (r0 == null) {
            r0 = C36761o4.A03;
        }
        byte[] A022 = r0.A02();
        C36761o4 r02 = r3.A02;
        if (r02 == null) {
            r02 = C36761o4.A03;
        }
        if (MessageDigest.isEqual(A022, r02.A02())) {
            C36761o4 r03 = r2.A03;
            if (r03 == null) {
                r03 = C36761o4.A03;
            }
            byte[] A023 = r03.A02();
            C36761o4 r04 = r3.A03;
            if (r04 == null) {
                r04 = C36761o4.A03;
            }
            return MessageDigest.isEqual(A023, r04.A02());
        }
    }

    public static final boolean A02(C36751o3 r2, C36751o3 r3) {
        C36761o4 r0 = r2.A02;
        if (r0 == null) {
            r0 = C36761o4.A03;
        }
        byte[] A022 = r0.A02();
        C36761o4 r02 = r3.A03;
        if (r02 == null) {
            r02 = C36761o4.A03;
        }
        if (MessageDigest.isEqual(A022, r02.A02())) {
            C36761o4 r03 = r2.A03;
            if (r03 == null) {
                r03 = C36761o4.A03;
            }
            byte[] A023 = r03.A02();
            C36761o4 r04 = r3.A02;
            if (r04 == null) {
                r04 = C36761o4.A03;
            }
            return MessageDigest.isEqual(A023, r04.A02());
        }
    }

    public static byte[] A03(byte[] bArr) {
        int nextInt = A03.nextInt(16) + 1;
        int length = bArr.length;
        int i2 = length + nextInt;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        Arrays.fill(bArr2, length, i2, (byte) nextInt);
        return bArr2;
    }

    public C36431nX A04() {
        try {
            C31941fH A022 = this.A00.A03.A02();
            C36341nO r4 = new C36341nO(A022.A01);
            C36411nV r1 = new C36411nV(A022.A00);
            Log.i("axolotl loading identity key pair");
            byte b2 = (byte) 5;
            return new C36431nX(new C36671nv(r1.A00, b2), new AnonymousClass1WL(new C30351cD(r4.A00.A00, b2)));
        } catch (C36291nJ unused) {
            throw new SQLiteException("Invalid public key stored in identities table");
        }
    }

    public C36301nK A05(C28861Yb r8) {
        C35971mn r2 = this.A00;
        return new C36301nK(r2, r2, r2, r2.A06, new C36421nW(C31811f4.A01(r8), r8.A00));
    }

    public void A06() {
        C35971mn r7 = this.A00;
        int A022 = r7.A00.A02(C15910s6.A1C);
        int A002 = r7.A04.A00();
        if (A002 >= A022) {
            StringBuilder sb = new StringBuilder("skipping key generation because already more than ");
            sb.append(A022);
            sb.append(" are unsent");
            Log.i(sb.toString());
            return;
        }
        while (true) {
            A022 -= A002;
            if (A022 > 0) {
                A002 = Math.min(A022, 50);
                int A003 = r7.A03.A00();
                StringBuilder sb2 = new StringBuilder("axolotl generating ");
                sb2.append(A002);
                sb2.append(" new prekeys starting from ");
                sb2.append(A003);
                sb2.append(" and recording them in the db");
                Log.i(sb2.toString());
                ArrayList arrayList = new ArrayList();
                LinkedList linkedList = new LinkedList();
                int i2 = A003 - 1;
                for (int i3 = 0; i3 < A002; i3++) {
                    linkedList.add(new C36441nY(C36241nE.A01(), ((i2 + i3) % 16777214) + 1));
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    C36001mq r0 = ((C36441nY) it.next()).A00;
                    arrayList.add(new C31731ew(r0.A01, r0.A02()));
                }
                r7.A07.A0b(arrayList, ((A003 + A002) % 16777214) + 1);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:9:0x0027=Splitter:B:9:0x0027, B:21:0x004d=Splitter:B:21:0x004d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07() {
        /*
            r5 = this;
            X.1mn r0 = r5.A00
            X.1es r0 = r0.A04
            X.01d r0 = r0.A02
            X.0tf r4 = r0.get()
            X.0tg r2 = r4.A02     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "SELECT COUNT(*) as count FROM prekeys WHERE sent_to_server = 0 AND direct_distribution = 0"
            r0 = 0
            android.database.Cursor r3 = r2.A08(r1, r0)     // Catch:{ all -> 0x004e }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0047 }
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "count"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0047 }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0047 }
            r2 = 0
            if (r0 == 0) goto L_0x0027
            r2 = 1
        L_0x0027:
            r3.close()     // Catch:{ all -> 0x004e }
            r4.close()
            java.lang.String r1 = "axolotl has unsent prekeys: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x003f:
            java.lang.String r1 = "Unable to count unsent entries in prekeys table"
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0047 }
            r0.<init>(r1)     // Catch:{ all -> 0x0047 }
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            if (r3 == 0) goto L_0x004d
            r3.close()     // Catch:{ all -> 0x004d }
        L_0x004d:
            throw r0     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0052 }
        L_0x0052:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35981mo.A07():boolean");
    }
}
