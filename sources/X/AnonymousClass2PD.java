package X;

import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2PD  reason: invalid class name */
public class AnonymousClass2PD {
    public int A00 = 0;
    public String A01;
    public HashMap A02;
    public byte[] A03 = null;
    public boolean[] A04;
    public final C15860rz A05;
    public final AnonymousClass1CI A06;
    public final AnonymousClass1CK A07;

    public AnonymousClass2PD(C15860rz r5, AnonymousClass1CI r6, AnonymousClass1CK r7) {
        this.A07 = r7;
        this.A06 = r6;
        this.A05 = r5;
        this.A02 = new HashMap();
        boolean[] zArr = new boolean[8];
        this.A04 = zArr;
        int i2 = 0;
        do {
            zArr[i2] = false;
            i2++;
        } while (i2 < 8);
        this.A01 = "";
    }

    public void A00(String str) {
        this.A01 = str;
        int i2 = 0;
        do {
            boolean[] zArr = this.A04;
            zArr[i2] = false;
            StringBuilder sb = new StringBuilder();
            sb.append(this.A01);
            sb.append("wampsid");
            sb.append(Integer.toString(i2));
            File file = new File(sb.toString());
            RandomAccessFile randomAccessFile = null;
            if (file.exists()) {
                try {
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
                    try {
                        AnonymousClass2PF r7 = new AnonymousClass2PF(this.A07, randomAccessFile2, i2);
                        RandomAccessFile randomAccessFile3 = r7.A07;
                        randomAccessFile3.seek(0);
                        byte[] bArr = AnonymousClass2PF.A08;
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        randomAccessFile3.read(bArr2);
                        if (Arrays.equals(bArr2, bArr)) {
                            randomAccessFile3.seek((long) length);
                            byte[] bArr3 = new byte[36];
                            randomAccessFile3.read(bArr3);
                            r7.A03 = new String(bArr3, DefaultCrypto.UTF_8);
                            r7.A01 = randomAccessFile3.read();
                            r7.A00 = randomAccessFile3.read();
                            ArrayList arrayList = r7.A04;
                            arrayList.clear();
                            boolean z2 = false;
                            for (int i3 = 0; i3 < r7.A01; i3++) {
                                int readInt = randomAccessFile3.readInt();
                                int readInt2 = randomAccessFile3.readInt();
                                boolean readBoolean = randomAccessFile3.readBoolean();
                                if (readBoolean && readInt <= 8) {
                                    Log.e("queuefile/loadFromFile see locked empty mini event buffer");
                                    z2 = true;
                                    readBoolean = false;
                                }
                                arrayList.add(new AnonymousClass2PG(readInt, readInt2, readBoolean));
                            }
                            int i4 = r7.A00;
                            int i5 = ((AnonymousClass2PG) arrayList.get(i4)).A01;
                            int i6 = ((AnonymousClass2PG) arrayList.get(i4)).A00;
                            r7.A02 = new AnonymousClass2PK(r7.A06, randomAccessFile3, i4, i5, i6);
                            if (z2) {
                                r7.A00();
                            }
                            this.A02.put(r7.A03, r7);
                            zArr[i2] = true;
                        } else {
                            Log.e("privatestatsuploadqueue/initfromqueuefile invalid queue file");
                            try {
                                randomAccessFile2.close();
                                file.delete();
                                return;
                            } catch (IOException | SecurityException e2) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("privatestatsuploadqueue/initfromqueuefile failed to delete the corrupted queue file ");
                                sb2.append(e2.toString());
                                Log.e(sb2.toString());
                                return;
                            }
                        }
                    } catch (Exception e3) {
                        e = e3;
                        randomAccessFile = randomAccessFile2;
                    }
                } catch (Exception e4) {
                    e = e4;
                    StringBuilder sb3 = new StringBuilder("privatestatsuploadqueue/initfromqueuefile failed to load the queue file ");
                    sb3.append(e.toString());
                    Log.e(sb3.toString());
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException | SecurityException e5) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("privatestatsuploadqueue/initfromqueuefile failed to delete the corrupted queue file ");
                            sb4.append(e5.toString());
                            Log.e(sb4.toString());
                        }
                    }
                    i2++;
                    if (i2 >= 8) {
                    }
                }
            }
            i2++;
        } while (i2 >= 8);
    }

    public boolean A01() {
        for (Map.Entry value : this.A02.entrySet()) {
            AnonymousClass2PF r3 = (AnonymousClass2PF) value.getValue();
            int i2 = 0;
            while (true) {
                if (i2 < r3.A01) {
                    if (((AnonymousClass2PG) r3.A04.get(i2)).A01 > 8) {
                        return true;
                    }
                    i2++;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x010b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A02(byte[] r15, int r16, java.lang.String r17) {
        /*
            r14 = this;
            r4 = 0
            java.util.HashMap r7 = r14.A02
            r5 = r17
            java.lang.Object r8 = r7.get(r5)
            X.2PF r8 = (X.AnonymousClass2PF) r8
            if (r8 != 0) goto L_0x010f
            r3 = 0
        L_0x000e:
            boolean[] r6 = r14.A04
            boolean r0 = r6[r3]
            if (r0 != 0) goto L_0x0105
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e4 }
            r1.<init>()     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r0 = r14.A01     // Catch:{ Exception -> 0x00e4 }
            r1.append(r0)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r0 = "wampsid"
            r1.append(r0)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch:{ Exception -> 0x00e4 }
            r1.append(r0)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00e4 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x00e4 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00e4 }
            java.lang.String r0 = "rwd"
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00e4 }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x00e4 }
            X.2PF r2 = new X.2PF     // Catch:{ Exception -> 0x00e4 }
            X.1CK r0 = r14.A07     // Catch:{ Exception -> 0x00e4 }
            r2.<init>(r0, r1, r3)     // Catch:{ Exception -> 0x00e4 }
            X.1CI r9 = r14.A06     // Catch:{ Exception -> 0x00e2 }
            android.content.SharedPreferences r1 = r9.A01()     // Catch:{ Exception -> 0x00e2 }
            r0 = -1
            int r0 = r1.getInt(r5, r0)     // Catch:{ Exception -> 0x00e2 }
            int r8 = r0 + 1
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r8 <= r0) goto L_0x0056
            r8 = 0
        L_0x0056:
            android.content.SharedPreferences r0 = r9.A01()     // Catch:{ Exception -> 0x00e2 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ Exception -> 0x00e2 }
            android.content.SharedPreferences$Editor r0 = r0.putInt(r5, r8)     // Catch:{ Exception -> 0x00e2 }
            r0.apply()     // Catch:{ Exception -> 0x00e2 }
            r9 = r5
            int r1 = r5.length()     // Catch:{ Exception -> 0x00e2 }
            r0 = 36
            if (r1 <= r0) goto L_0x0072
            java.lang.String r9 = r5.substring(r4, r0)     // Catch:{ Exception -> 0x00e2 }
        L_0x0072:
            r2.A03 = r9     // Catch:{ Exception -> 0x00e2 }
            r9 = 1
            r2.A01 = r9     // Catch:{ Exception -> 0x00e2 }
            r2.A00 = r4     // Catch:{ Exception -> 0x00e2 }
            java.io.RandomAccessFile r10 = r2.A07     // Catch:{ Exception -> 0x00e2 }
            r0 = 33024(0x8100, double:1.6316E-319)
            r10.setLength(r0)     // Catch:{ Exception -> 0x00e2 }
            byte[] r0 = X.AnonymousClass2PF.A08     // Catch:{ Exception -> 0x00e2 }
            r10.write(r0)     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r1 = r2.A03     // Catch:{ Exception -> 0x00e2 }
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r1.getBytes(r0)     // Catch:{ Exception -> 0x00e2 }
            r10.write(r0)     // Catch:{ Exception -> 0x00e2 }
            r10.writeByte(r9)     // Catch:{ Exception -> 0x00e2 }
            r10.writeByte(r4)     // Catch:{ Exception -> 0x00e2 }
            r12 = 8
            r10.writeInt(r12)     // Catch:{ Exception -> 0x00e2 }
            r13 = 32768(0x8000, float:4.5918E-41)
            r10.writeInt(r13)     // Catch:{ Exception -> 0x00e2 }
            r10.writeBoolean(r4)     // Catch:{ Exception -> 0x00e2 }
            r0 = 256(0x100, double:1.265E-321)
            r10.seek(r0)     // Catch:{ Exception -> 0x00e2 }
            byte[] r9 = X.AnonymousClass2PK.A06     // Catch:{ Exception -> 0x00e2 }
            r0 = r8 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r0     // Catch:{ Exception -> 0x00e2 }
            r0 = 5
            r9[r0] = r1     // Catch:{ Exception -> 0x00e2 }
            int r0 = r8 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r0     // Catch:{ Exception -> 0x00e2 }
            r0 = 6
            r9[r0] = r1     // Catch:{ Exception -> 0x00e2 }
            r10.write(r9)     // Catch:{ Exception -> 0x00e2 }
            java.util.ArrayList r1 = r2.A04     // Catch:{ Exception -> 0x00e2 }
            X.2PG r0 = new X.2PG     // Catch:{ Exception -> 0x00e2 }
            r0.<init>(r12, r13, r4)     // Catch:{ Exception -> 0x00e2 }
            r1.add(r0)     // Catch:{ Exception -> 0x00e2 }
            int r11 = r2.A00     // Catch:{ Exception -> 0x00e2 }
            X.1CK r9 = r2.A06     // Catch:{ Exception -> 0x00e2 }
            X.2PK r8 = new X.2PK     // Catch:{ Exception -> 0x00e2 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x00e2 }
            r2.A02 = r8     // Catch:{ Exception -> 0x00e2 }
            r0 = 1
            r6[r3] = r0     // Catch:{ Exception -> 0x00e2 }
            int r1 = r14.A00     // Catch:{ Exception -> 0x00e2 }
            if (r1 <= 0) goto L_0x00de
            byte[] r0 = r14.A03     // Catch:{ Exception -> 0x00e2 }
            r2.A01(r0, r1)     // Catch:{ Exception -> 0x00e2 }
        L_0x00de:
            r7.put(r5, r2)     // Catch:{ Exception -> 0x00e2 }
            goto L_0x010e
        L_0x00e2:
            r6 = move-exception
            goto L_0x00e6
        L_0x00e4:
            r6 = move-exception
            r2 = r8
        L_0x00e6:
            java.lang.String r0 = "privatestatsuploadqueue/writeToQueueForPsId failed to create new QueueFile "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r6.toString()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1CK r1 = r14.A07
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0B = r0
            r1.A09()
            r8 = r2
        L_0x0105:
            int r3 = r3 + 1
            r0 = 8
            if (r3 < r0) goto L_0x000e
            if (r8 != 0) goto L_0x010f
            return r4
        L_0x010e:
            r8 = r2
        L_0x010f:
            r0 = r16
            boolean r0 = r8.A01(r15, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PD.A02(byte[], int, java.lang.String):boolean");
    }
}
