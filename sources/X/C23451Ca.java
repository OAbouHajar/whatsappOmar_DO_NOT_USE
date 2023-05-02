package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

/* renamed from: X.1Ca  reason: invalid class name and case insensitive filesystem */
public class C23451Ca {
    public static final byte[] A0D = "WhatsApp Patch Integrity".getBytes(AnonymousClass01S.A0A);
    public final C16300so A00;
    public final C16040sK A01;
    public final C15900s5 A02;
    public final AnonymousClass19E A03;
    public final AnonymousClass139 A04;
    public final AnonymousClass1RQ A05;
    public final AnonymousClass19W A06;
    public final C16440t3 A07;
    public final C23471Cc A08;
    public final AnonymousClass11P A09;
    public final C20360zv A0A;
    public final C14710pd A0B;
    public final C16320sq A0C;

    public C23451Ca(C16300so r1, C16040sK r2, C15900s5 r3, AnonymousClass19E r4, AnonymousClass139 r5, AnonymousClass1RQ r6, AnonymousClass19W r7, C16440t3 r8, C23471Cc r9, AnonymousClass11P r10, C20360zv r11, C14710pd r12, C16320sq r13) {
        this.A07 = r8;
        this.A0B = r12;
        this.A00 = r1;
        this.A01 = r2;
        this.A0C = r13;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
        this.A0A = r11;
        this.A09 = r10;
        this.A08 = r9;
        this.A04 = r5;
        this.A05 = r6;
    }

    public static byte[] A00(List list, byte[] bArr, byte[] bArr2, boolean z2) {
        boolean z3 = false;
        if (bArr.length == 128) {
            z3 = true;
        }
        AnonymousClass00B.A0C("Current hash array must be of size 128", z3);
        byte[] bArr3 = new byte[128];
        System.arraycopy(bArr, 0, bArr3, 0, 128);
        ByteBuffer wrap = ByteBuffer.wrap(bArr3);
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        for (Object next : list) {
            AnonymousClass00B.A06(next);
            ByteBuffer wrap2 = ByteBuffer.wrap(C40771uf.A00((byte[]) next, bArr2, 128));
            wrap2.order(ByteOrder.LITTLE_ENDIAN);
            wrap.mark();
            while (wrap.hasRemaining()) {
                int position = wrap.position();
                short s2 = wrap.getShort() & 65535;
                short s3 = wrap2.getShort() & 65535;
                int i2 = z2 ? s2 + s3 : s2 - s3;
                int position2 = wrap.position();
                wrap.position(position);
                wrap.putShort((short) (((short) i2) & 65535));
                wrap.position(position2);
            }
            wrap.reset();
        }
        return wrap.array();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00e3 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00ef */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(int r10, java.lang.String r11) {
        /*
            r9 = this;
            X.11P r0 = r9.A09
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            X.19K r0 = r0.A00
            X.0tf r3 = r0.get()
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x00f0 }
            java.lang.String r1 = "SELECT collection_name, lt_hash FROM collection_versions"
            r0 = 0
            android.database.Cursor r2 = r2.A08(r1, r0)     // Catch:{ all -> 0x00f0 }
        L_0x0016:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00e9 }
            if (r0 == 0) goto L_0x003a
            java.lang.String r0 = "collection_name"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e9 }
            java.lang.String r1 = r2.getString(r0)     // Catch:{ all -> 0x00e9 }
            java.lang.String r0 = "lt_hash"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e9 }
            byte[] r0 = r2.getBlob(r0)     // Catch:{ all -> 0x00e9 }
            if (r0 != 0) goto L_0x0036
            r0 = 128(0x80, float:1.794E-43)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x00e9 }
        L_0x0036:
            r6.put(r1, r0)     // Catch:{ all -> 0x00e9 }
            goto L_0x0016
        L_0x003a:
            r2.close()     // Catch:{ all -> 0x00f0 }
            r3.close()
            X.0zv r0 = r9.A0A
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            X.19K r0 = r0.A01
            X.0tf r7 = r0.get()
            X.0tg r2 = r7.A02     // Catch:{ all -> 0x00e4 }
            java.lang.String r1 = "SELECT collection_name, mutation_mac FROM syncd_mutations"
            r0 = 0
            android.database.Cursor r8 = r2.A08(r1, r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "collection_name"
            int r4 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = "mutation_mac"
            int r3 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00dd }
        L_0x0062:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x0084
            java.lang.String r2 = r8.getString(r4)     // Catch:{ all -> 0x00dd }
            byte[] r1 = r8.getBlob(r3)     // Catch:{ all -> 0x00dd }
            java.lang.Object r0 = r5.get(r2)     // Catch:{ all -> 0x00dd }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00dd }
            if (r0 != 0) goto L_0x0080
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00dd }
            r0.<init>()     // Catch:{ all -> 0x00dd }
            r5.put(r2, r0)     // Catch:{ all -> 0x00dd }
        L_0x0080:
            r0.add(r1)     // Catch:{ all -> 0x00dd }
            goto L_0x0062
        L_0x0084:
            r8.close()     // Catch:{ all -> 0x00e4 }
            r7.close()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            if (r11 != 0) goto L_0x00d8
            java.util.Set r0 = r6.keySet()
            r1.addAll(r0)
            java.util.Set r0 = r5.keySet()
            r1.addAll(r0)
        L_0x009f:
            java.util.Iterator r7 = r1.iterator()
        L_0x00a3:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r4 = r7.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r5.get(r4)
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x00bb
            java.util.List r3 = java.util.Collections.emptyList()
        L_0x00bb:
            r0 = 128(0x80, float:1.794E-43)
            byte[] r2 = new byte[r0]
            byte[] r1 = A0D
            r0 = 1
            byte[] r1 = A00(r3, r2, r1, r0)
            java.lang.Object r0 = r6.get(r4)
            byte[] r0 = (byte[]) r0
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x00a3
            X.19E r0 = r9.A03
            r0.A07(r10, r4)
            goto L_0x00a3
        L_0x00d8:
            r1.add(r11)
            goto L_0x009f
        L_0x00dc:
            return
        L_0x00dd:
            r0 = move-exception
            if (r8 == 0) goto L_0x00e3
            r8.close()     // Catch:{ all -> 0x00e3 }
        L_0x00e3:
            throw r0     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00f4 }
            throw r0
        L_0x00e9:
            r0 = move-exception
            if (r2 == 0) goto L_0x00ef
            r2.close()     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            throw r0     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00f4 }
        L_0x00f4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23451Ca.A01(int, java.lang.String):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00d2 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[Catch:{ all -> 0x0029, all -> 0x002d, all -> 0x0100 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] A02(java.lang.String r12, java.util.List r13, java.lang.String[] r14) {
        /*
            r11 = this;
            X.11P r0 = r11.A09
            X.19K r0 = r0.A00
            X.0tf r3 = r0.get()
            X.0tg r4 = r3.A02     // Catch:{ all -> 0x0100 }
            java.lang.String r2 = "SELECT * FROM collection_versions WHERE collection_name = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0100 }
            r0 = 0
            r1[r0] = r12     // Catch:{ all -> 0x0100 }
            android.database.Cursor r1 = r4.A08(r2, r1)     // Catch:{ all -> 0x0100 }
            if (r1 == 0) goto L_0x002e
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "lt_hash"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0029 }
            byte[] r9 = r1.getBlob(r0)     // Catch:{ all -> 0x0029 }
            goto L_0x002f
        L_0x0029:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002d }
        L_0x002d:
            throw r0     // Catch:{ all -> 0x0100 }
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ all -> 0x0100 }
        L_0x0034:
            r3.close()
            if (r9 != 0) goto L_0x003d
            r0 = 128(0x80, float:1.794E-43)
            byte[] r9 = new byte[r0]
        L_0x003d:
            X.0zv r1 = r11.A0A
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            int r0 = r14.length
            if (r0 == 0) goto L_0x00db
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.19K r0 = r1.A01
            X.0tf r6 = r0.get()
            r0 = 975(0x3cf, float:1.366E-42)
            X.1jh r5 = new X.1jh     // Catch:{ all -> 0x00d3 }
            r5.<init>(r14, r0)     // Catch:{ all -> 0x00d3 }
        L_0x0059:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00d8
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x00d3 }
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch:{ all -> 0x00d3 }
            r7.clear()     // Catch:{ all -> 0x00d3 }
            r7.add(r12)     // Catch:{ all -> 0x00d3 }
            java.util.List r0 = java.util.Arrays.asList(r1)     // Catch:{ all -> 0x00d3 }
            r7.addAll(r0)     // Catch:{ all -> 0x00d3 }
            X.0tg r2 = r6.A02     // Catch:{ all -> 0x00d3 }
            int r3 = r1.length     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "SELECT mutation_index, mutation_mac FROM syncd_mutations WHERE collection_name = ? AND mutation_index IN "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d3 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = X.C34111ji.A00(r3)     // Catch:{ all -> 0x00d3 }
            r1.append(r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00d3 }
            java.lang.String[] r0 = X.AnonymousClass01S.A0H     // Catch:{ all -> 0x00d3 }
            java.lang.Object[] r0 = r7.toArray(r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x00d3 }
            android.database.Cursor r4 = r2.A08(r1, r0)     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "mutation_index"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "mutation_mac"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00cc }
        L_0x009f:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00c8
            java.lang.String r10 = r4.getString(r3)     // Catch:{ all -> 0x00cc }
            byte[] r0 = r4.getBlob(r2)     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x00b3
            r8.put(r10, r0)     // Catch:{ all -> 0x00cc }
            goto L_0x009f
        L_0x00b3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
            r1.<init>()     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "SyncdMutationsStore/getLatestMutationsMac: Should never be null for index:"
            r1.append(r0)     // Catch:{ all -> 0x00cc }
            r1.append(r10)     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00cc }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00cc }
            goto L_0x009f
        L_0x00c8:
            r4.close()     // Catch:{ all -> 0x00d3 }
            goto L_0x0059
        L_0x00cc:
            r0 = move-exception
            if (r4 == 0) goto L_0x00d2
            r4.close()     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0104 }
            throw r0
        L_0x00d8:
            r6.close()
        L_0x00db:
            X.0pd r2 = r11.A0B
            r1 = 624(0x270, float:8.74E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x00ea
            java.util.Arrays.toString(r14)
        L_0x00ea:
            java.util.Collection r0 = r8.values()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            byte[] r2 = A0D
            r0 = 0
            byte[] r1 = A00(r1, r9, r2, r0)
            r0 = 1
            byte[] r0 = A00(r13, r1, r2, r0)
            return r0
        L_0x0100:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0104 }
        L_0x0104:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23451Ca.A02(java.lang.String, java.util.List, java.lang.String[]):byte[]");
    }
}
