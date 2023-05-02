package com.facebook.redex;

import X.C28721Xj;

public class RunnableRunnableShape16S0100000_I0_15 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape16S0100000_I0_15(C28721Xj r2) {
        this.A01 = 37;
        this.A00 = r2;
    }

    public RunnableRunnableShape16S0100000_I0_15(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0272, code lost:
        if (r10 == -2) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0284, code lost:
        if (r10 >= 0) goto L_0x0286;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0294, code lost:
        if (r12 != 4) goto L_0x0296;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0296, code lost:
        if (r2 == r7) goto L_0x02b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02b1, code lost:
        r1 = new byte[r2];
        java.lang.System.arraycopy(r6, 0, r1, 0, r2);
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02b8, code lost:
        r2 = (org.whispersystems.jobqueue.Job) new java.io.ObjectInputStream(new java.io.ByteArrayInputStream(r6)).readObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r2.A02(r17);
        r5.A02.A00(r5.A00, r2);
        r3.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0321, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        android.util.Log.w("PersistentStore", r1);
        r24.getWritableDatabase().delete("queue", "_id = ?", new java.lang.String[]{java.lang.String.valueOf(r17)});
     */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x0222 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r25 = this;
            r1 = r25
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x057c;
                case 1: goto L_0x0564;
                case 2: goto L_0x0155;
                case 3: goto L_0x013b;
                case 4: goto L_0x012a;
                case 5: goto L_0x011b;
                case 6: goto L_0x0557;
                case 7: goto L_0x0522;
                case 8: goto L_0x051a;
                case 9: goto L_0x0510;
                case 10: goto L_0x044b;
                case 11: goto L_0x0443;
                case 12: goto L_0x043b;
                case 13: goto L_0x0433;
                case 14: goto L_0x042b;
                case 15: goto L_0x00fb;
                case 16: goto L_0x0423;
                case 17: goto L_0x041b;
                case 18: goto L_0x040b;
                case 19: goto L_0x00ef;
                case 20: goto L_0x00b3;
                case 21: goto L_0x0402;
                case 22: goto L_0x03ef;
                case 23: goto L_0x03de;
                case 24: goto L_0x0025;
                case 25: goto L_0x03d4;
                case 26: goto L_0x03ca;
                case 27: goto L_0x03c2;
                case 28: goto L_0x03b8;
                case 29: goto L_0x0007;
                case 30: goto L_0x0011;
                case 31: goto L_0x0007;
                case 32: goto L_0x03a9;
                case 33: goto L_0x039c;
                case 34: goto L_0x0389;
                case 35: goto L_0x0381;
                case 36: goto L_0x036e;
                case 37: goto L_0x016f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A00
            X.0pP r0 = (X.C14570pP) r0
            X.10F r0 = r0.A02
            r0.A00()
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.VoipActivityV2 r0 = (com.whatsapp.voipcalling.VoipActivityV2) r0
            X.25g r1 = r0.A12
            if (r1 == 0) goto L_0x0010
            java.lang.String r0 = "VoiceService:onVideoMaximizedDialogShown"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r1.A03
            int r0 = r0 + 1
            r1.A03 = r0
            return
        L_0x0025:
            java.lang.Object r0 = r1.A00
            X.2P2 r0 = (X.AnonymousClass2P2) r0
            X.1ZK r5 = r0.A00
            X.0rz r4 = r5.A10
            X.01D r0 = r4.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r3 = "voice_note_lock_tip_show_count"
            r0 = 0
            int r2 = r1.getInt(r3, r0)
            r0 = 4
            if (r2 >= r0) goto L_0x0010
            X.00l r7 = r5.A0j
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131167289(0x7f070839, float:1.7948847E38)
            int r6 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r8 = r7.getResources()
            android.content.res.Configuration r0 = r8.getConfiguration()
            int r0 = r0.screenLayout
            r1 = r0 & 15
            r0 = 1
            if (r1 != r0) goto L_0x0099
            r7 = 2131232537(0x7f080719, float:1.8081186E38)
            r0 = 2131167287(0x7f070837, float:1.7948843E38)
            int r0 = r8.getDimensionPixelSize(r0)
            int r6 = r6 - r0
            float r6 = (float) r6
            X.2P3 r0 = r5.A0O
            int r0 = r0.getWidth()
            int r1 = -r0
            r0 = 2131167285(0x7f070835, float:1.794884E38)
            int r0 = r8.getDimensionPixelSize(r0)
            int r1 = r1 - r0
            float r1 = (float) r1
        L_0x0078:
            X.013 r0 = r5.A11
            boolean r0 = r0.A0T()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0083
            float r1 = -r1
        L_0x0083:
            r0 = 2131892814(0x7f121a4e, float:1.9420387E38)
            r5.A0F(r6, r1, r7, r0)
            int r1 = r2 + 1
            if (r1 < 0) goto L_0x05d2
            android.content.SharedPreferences$Editor r0 = r4.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r1)
            r0.apply()
            return
        L_0x0099:
            r0 = 2131167284(0x7f070834, float:1.7948837E38)
            int r1 = r8.getDimensionPixelSize(r0)
            X.2P3 r0 = r5.A0O
            int r0 = r0.A0M
            int r6 = r6 - r0
            int r6 = r6 - r1
            float r6 = (float) r6
            r0 = 2131167286(0x7f070836, float:1.7948841E38)
            int r0 = r8.getDimensionPixelSize(r0)
            float r1 = (float) r0
            r7 = 2131232535(0x7f080717, float:1.8081182E38)
            goto L_0x0078
        L_0x00b3:
            java.lang.Object r0 = r1.A00
            X.1ZK r0 = (X.AnonymousClass1ZK) r0
            X.0rv r5 = r0.A0J
            if (r5 == 0) goto L_0x0010
            X.1Lw r4 = r0.A1E
            long r2 = java.lang.System.currentTimeMillis()
            java.io.File r1 = r4.A03(r5)
            if (r1 == 0) goto L_0x00d0
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00d0
            r1.setLastModified(r2)
        L_0x00d0:
            java.io.File r1 = r4.A02(r5)
            if (r1 == 0) goto L_0x00df
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x00df
            r1.setLastModified(r2)
        L_0x00df:
            java.io.File r1 = r4.A01(r5)
            if (r1 == 0) goto L_0x0010
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0010
            r1.setLastModified(r2)
            return
        L_0x00ef:
            java.lang.Object r0 = r1.A00
            X.1ZK r0 = (X.AnonymousClass1ZK) r0
            android.animation.AnimatorSet r0 = r0.A0E
            if (r0 == 0) goto L_0x0010
            r0.end()
            return
        L_0x00fb:
            java.lang.Object r3 = r1.A00
            X.29C r3 = (X.AnonymousClass29C) r3
            X.2PR r0 = r3.A08
            if (r0 == 0) goto L_0x0010
            X.2PV r0 = r3.A0D
            if (r0 == 0) goto L_0x010a
            r0.A00()
        L_0x010a:
            X.2PR r2 = r3.A08
            X.2PW r1 = r3.A0F()
            boolean r0 = r3.A0P
            r0 = r0 ^ 1
            r2.A08(r1, r0)
            r3.A0J()
            return
        L_0x011b:
            java.lang.Object r1 = r1.A00
            X.15O r1 = (X.AnonymousClass15O) r1
            X.1bx r0 = r1.A00
            if (r0 == 0) goto L_0x0010
            r0.A06()
            r0 = 0
            r1.A00 = r0
            return
        L_0x012a:
            java.lang.Object r0 = r1.A00
            X.2P5 r0 = (X.AnonymousClass2P5) r0
            X.29I r1 = r0.A04
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            r1.A00(r0)
            return
        L_0x013b:
            java.lang.Object r0 = r1.A00
            X.0ps r0 = (X.C14860ps) r0
            java.util.List r0 = r0.A0B
            java.util.Iterator r1 = r0.iterator()
        L_0x0145:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r1.next()
            X.0rA r0 = (X.AnonymousClass0rA) r0
            r0.AZI()
            goto L_0x0145
        L_0x0155:
            java.lang.Object r0 = r1.A00
            X.0ps r0 = (X.C14860ps) r0
            java.util.List r0 = r0.A0B
            java.util.Iterator r1 = r0.iterator()
        L_0x015f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r1.next()
            X.0rA r0 = (X.AnonymousClass0rA) r0
            r0.AZH()
            goto L_0x015f
        L_0x016f:
            java.lang.Object r0 = r1.A00
            r23 = r0
            r0 = r23
            X.1Xj r0 = (X.C28721Xj) r0
            r23 = r0
            X.1Xk r5 = r0.A06
            r8 = 0
            java.lang.String r9 = "encrypted = 0"
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            X.1Xn r0 = r5.A03
            r24 = r0
            android.database.sqlite.SQLiteDatabase r6 = r24.getReadableDatabase()
            r4 = 0
            java.lang.String r22 = "queue"
            java.lang.String r13 = "_id ASC"
            r11 = r8
            r12 = r8
            r14 = r8
            r7 = r22
            r10 = r8
            android.database.Cursor r4 = r6.query(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0367 }
        L_0x019a:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0367 }
            if (r0 == 0) goto L_0x033e
            java.lang.String r0 = "_id"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0367 }
            long r17 = r4.getLong(r0)     // Catch:{ all -> 0x0367 }
            java.lang.String r0 = "item"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0367 }
            java.lang.String r1 = r4.getString(r0)     // Catch:{ all -> 0x0367 }
            java.lang.String r0 = "encrypted"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0367 }
            r4.getInt(r0)     // Catch:{ all -> 0x0367 }
            byte[] r9 = r1.getBytes()     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int r8 = r9.length     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int r0 = r8 * 3
            int r7 = r0 >> 2
            byte[] r6 = new byte[r7]     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int[] r21 = X.AnonymousClass2P7.A00     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r20 = 6
            r19 = 0
            r2 = 0
            r12 = 0
            r0 = 0
        L_0x01d1:
            r14 = 3
            r13 = 4
            r11 = 2
            r15 = 1
            if (r0 >= r8) goto L_0x028e
            if (r12 != 0) goto L_0x0223
        L_0x01d9:
            int r1 = r0 + 4
            if (r1 > r8) goto L_0x0220
            byte r10 = r9[r0]     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r21[r10]     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int r19 = r10 << 18
            int r10 = r0 + 1
            byte r10 = r9[r10]     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r21[r10]     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int r10 = r10 << 12
            r19 = r19 | r10
            int r10 = r0 + 2
            byte r10 = r9[r10]     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r21[r10]     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int r10 = r10 << r20
            r19 = r19 | r10
            int r10 = r0 + 3
            byte r10 = r9[r10]     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r10 = r10 & 255(0xff, float:3.57E-43)
            r10 = r21[r10]     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r19 = r19 | r10
            if (r19 < 0) goto L_0x0220
            int r10 = r2 + 2
            r0 = r19
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r6[r10] = r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int r10 = r2 + 1
            int r0 = r19 >> 8
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r6[r10] = r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int r0 = r19 >> 16
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r6[r2] = r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int r2 = r2 + 3
            r0 = r1
            goto L_0x01d9
        L_0x0220:
            if (r0 < r8) goto L_0x0223
            goto L_0x0296
        L_0x0223:
            int r16 = r0 + 1
            byte r0 = r9[r0]     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r10 = r21[r0]     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r1 = -1
            if (r12 == 0) goto L_0x022f
            goto L_0x0236
        L_0x022f:
            if (r10 < 0) goto L_0x0232
            goto L_0x0289
        L_0x0232:
            if (r10 == r1) goto L_0x0242
            goto L_0x02d9
        L_0x0236:
            if (r12 == r15) goto L_0x0284
            r0 = -2
            if (r12 == r11) goto L_0x0276
            if (r12 == r14) goto L_0x0245
            if (r12 == r13) goto L_0x0272
            r0 = 5
            if (r12 == r0) goto L_0x0232
        L_0x0242:
            r0 = r16
            goto L_0x01d1
        L_0x0245:
            if (r10 < 0) goto L_0x0261
            int r0 = r19 << 6
            r10 = r10 | r0
            int r1 = r2 + 2
            byte r0 = (byte) r10     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r6[r1] = r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int r1 = r2 + 1
            int r0 = r10 >> 8
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r6[r1] = r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int r0 = r10 >> 16
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r6[r2] = r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int r2 = r2 + 3
            r19 = r10
            r12 = 0
            goto L_0x0242
        L_0x0261:
            if (r10 != r0) goto L_0x0232
            int r1 = r2 + 1
            int r0 = r19 >> 2
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r6[r1] = r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int r0 = r19 >> 10
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r6[r2] = r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int r2 = r2 + 2
            goto L_0x0274
        L_0x0272:
            if (r10 != r0) goto L_0x0232
        L_0x0274:
            r12 = 5
            goto L_0x0242
        L_0x0276:
            if (r10 >= 0) goto L_0x0286
            if (r10 != r0) goto L_0x0232
            int r1 = r2 + 1
            int r0 = r19 >> 4
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r6[r2] = r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r2 = r1
            r12 = 4
            goto L_0x0242
        L_0x0284:
            if (r10 < 0) goto L_0x0232
        L_0x0286:
            int r0 = r19 << 6
            r10 = r10 | r0
        L_0x0289:
            int r12 = r12 + 1
            r19 = r10
            goto L_0x0242
        L_0x028e:
            if (r12 == r15) goto L_0x02d9
            if (r12 == r11) goto L_0x02a8
            if (r12 == r14) goto L_0x0299
            if (r12 == r13) goto L_0x02d9
        L_0x0296:
            if (r2 == r7) goto L_0x02b8
            goto L_0x02b1
        L_0x0299:
            int r1 = r2 + 1
            int r0 = r19 >> 10
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r6[r2] = r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            int r2 = r1 + 1
            int r0 = r19 >> 2
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r6[r1] = r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            goto L_0x0296
        L_0x02a8:
            int r1 = r2 + 1
            int r0 = r19 >> 4
            byte r0 = (byte) r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r6[r2] = r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r2 = r1
            goto L_0x0296
        L_0x02b1:
            byte[] r1 = new byte[r2]     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r0 = 0
            java.lang.System.arraycopy(r6, r0, r1, r0, r2)     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r6 = r1
        L_0x02b8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r1.<init>(r6)     // Catch:{ ClassNotFoundException -> 0x02e1 }
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x02e1 }
            java.lang.Object r2 = r0.readObject()     // Catch:{ ClassNotFoundException -> 0x02e1 }
            org.whispersystems.jobqueue.Job r2 = (org.whispersystems.jobqueue.Job) r2     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r0 = r17
            r2.A02(r0)     // Catch:{ IOException -> 0x0321 }
            X.1Xo r1 = r5.A02     // Catch:{ IOException -> 0x0321 }
            android.content.Context r0 = r5.A00     // Catch:{ IOException -> 0x0321 }
            r1.A00(r0, r2)     // Catch:{ IOException -> 0x0321 }
            r3.add(r2)     // Catch:{ IOException -> 0x0321 }
            goto L_0x019a
        L_0x02d9:
            java.lang.String r1 = "bad base-64"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ ClassNotFoundException -> 0x02e1 }
            r0.<init>(r1)     // Catch:{ ClassNotFoundException -> 0x02e1 }
            throw r0     // Catch:{ ClassNotFoundException -> 0x02e1 }
        L_0x02e1:
            r6 = move-exception
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ RuntimeException -> 0x0311 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0311 }
            java.io.PrintWriter r0 = new java.io.PrintWriter     // Catch:{ RuntimeException -> 0x0311 }
            r0.<init>(r2)     // Catch:{ RuntimeException -> 0x0311 }
            r6.printStackTrace(r0)     // Catch:{ RuntimeException -> 0x0311 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0311 }
            r1.<init>()     // Catch:{ RuntimeException -> 0x0311 }
            java.lang.String r0 = r6.getMessage()     // Catch:{ RuntimeException -> 0x0311 }
            r1.append(r0)     // Catch:{ RuntimeException -> 0x0311 }
            java.lang.String r0 = "\n"
            r1.append(r0)     // Catch:{ RuntimeException -> 0x0311 }
            java.lang.String r0 = r2.toString()     // Catch:{ RuntimeException -> 0x0311 }
            r1.append(r0)     // Catch:{ RuntimeException -> 0x0311 }
            java.lang.String r1 = r1.toString()     // Catch:{ RuntimeException -> 0x0311 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0311 }
            r0.<init>(r1)     // Catch:{ RuntimeException -> 0x0311 }
            throw r0     // Catch:{ RuntimeException -> 0x0311 }
        L_0x0311:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()     // Catch:{ IOException -> 0x0321 }
            boolean r0 = r0 instanceof java.lang.ClassNotFoundException     // Catch:{ IOException -> 0x0321 }
            if (r0 == 0) goto L_0x0320
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x0321 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0321 }
            throw r0     // Catch:{ IOException -> 0x0321 }
        L_0x0320:
            throw r1     // Catch:{ IOException -> 0x0321 }
        L_0x0321:
            r1 = move-exception
            java.lang.String r0 = "PersistentStore"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0367 }
            android.database.sqlite.SQLiteDatabase r6 = r24.getWritableDatabase()     // Catch:{ all -> 0x0367 }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0367 }
            java.lang.String r1 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x0367 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0367 }
            java.lang.String r1 = "_id = ?"
            r0 = r22
            r6.delete(r0, r1, r2)     // Catch:{ all -> 0x0367 }
            goto L_0x019a
        L_0x033e:
            r4.close()
            r0 = r23
            X.1Xu r2 = r0.A04
            monitor-enter(r2)
            java.util.LinkedList r0 = r2.A01     // Catch:{ all -> 0x037e }
            r0.addAll(r3)     // Catch:{ all -> 0x037e }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x037e }
        L_0x034f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x037e }
            if (r0 == 0) goto L_0x035f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x037e }
            org.whispersystems.jobqueue.Job r0 = (org.whispersystems.jobqueue.Job) r0     // Catch:{ all -> 0x037e }
            r2.A01(r0)     // Catch:{ all -> 0x037e }
            goto L_0x034f
        L_0x035f:
            X.1Xv r0 = r2.A05     // Catch:{ all -> 0x037e }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x037e }
            r0.open()     // Catch:{ all -> 0x037e }
            goto L_0x037c
        L_0x0367:
            r1 = move-exception
            if (r4 == 0) goto L_0x036d
            r4.close()
        L_0x036d:
            throw r1
        L_0x036e:
            java.lang.Object r0 = r1.A00
            X.1Xj r0 = (X.C28721Xj) r0
            X.1Xu r2 = r0.A04
            monitor-enter(r2)
            X.1Xv r0 = r2.A05     // Catch:{ all -> 0x037e }
            android.os.ConditionVariable r0 = r0.A00     // Catch:{ all -> 0x037e }
            r0.open()     // Catch:{ all -> 0x037e }
        L_0x037c:
            monitor-exit(r2)
            return
        L_0x037e:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x0381:
            java.lang.Object r0 = r1.A00
            X.2P8 r0 = (X.AnonymousClass2P8) r0
            X.AnonymousClass2P8.A06(r0)
            return
        L_0x0389:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r0
            android.view.View r1 = r0.A09
            r0 = 2131366817(0x7f0a13a1, float:1.8353538E38)
            android.view.View r1 = X.C004601z.A0E(r1, r0)
            r0 = 8
            r1.sendAccessibilityEvent(r0)
            return
        L_0x039c:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = (com.whatsapp.voipcalling.VoipCallControlBottomSheetV2) r0
            com.obwhatsapp.calling.views.VoipCallControlBottomSheetDragIndicator r2 = r0.A0O
            r1 = 0
            r0 = 64
            r2.performAccessibilityAction(r0, r1)
            return
        L_0x03a9:
            java.lang.Object r0 = r1.A00
            X.2PE r0 = (X.AnonymousClass2PE) r0
            com.whatsapp.voipcalling.VoipActivityV2 r0 = r0.A00
            android.view.View r2 = r0.A0P
            r1 = 0
            r0 = 64
            r2.performAccessibilityAction(r0, r1)
            return
        L_0x03b8:
            java.lang.Object r1 = r1.A00
            com.whatsapp.voipcalling.VoipActivityV2 r1 = (com.whatsapp.voipcalling.VoipActivityV2) r1
            float r0 = r1.A00
            r1.A3d(r0)
            return
        L_0x03c2:
            java.lang.Object r0 = r1.A00
            com.whatsapp.voipcalling.JNIUtils r0 = (com.whatsapp.voipcalling.JNIUtils) r0
            r0.lambda$updateH26XCodecSupported$0()
            return
        L_0x03ca:
            java.lang.Object r0 = r1.A00
            X.1cz r0 = (X.C30811cz) r0
            X.1ZM r0 = r0.A07
            r0.Afd()
            return
        L_0x03d4:
            java.lang.Object r0 = r1.A00
            X.1cz r0 = (X.C30811cz) r0
            X.1ZM r0 = r0.A07
            r0.A84()
            return
        L_0x03de:
            java.lang.Object r1 = r1.A00
            java.io.File r1 = (java.io.File) r1
            boolean r0 = X.AnonymousClass01E.A01()
            r0 = r0 ^ 1
            X.AnonymousClass00B.A0F(r0)
            X.AnonymousClass1XI.A0N(r1)
            return
        L_0x03ef:
            java.lang.Object r0 = r1.A00
            X.1ZK r0 = (X.AnonymousClass1ZK) r0
            android.view.View r1 = r0.A0f
            r0 = 2131367013(0x7f0a1465, float:1.8353936E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0402:
            java.lang.Object r1 = r1.A00
            X.1ZK r1 = (X.AnonymousClass1ZK) r1
            r0 = 1
            r1.A0O(r0)
            return
        L_0x040b:
            java.lang.Object r0 = r1.A00
            X.2PH r0 = (X.AnonymousClass2PH) r0
            X.2PI r0 = r0.A00
            android.media.MediaPlayer$OnErrorListener r3 = r0.A07
            android.media.MediaPlayer r2 = r0.A09
            r1 = 1
            r0 = 0
            r3.onError(r2, r1, r0)
            return
        L_0x041b:
            java.lang.Object r0 = r1.A00
            X.2Cx r0 = (X.AnonymousClass2Cx) r0
            r0.A0K()
            return
        L_0x0423:
            java.lang.Object r0 = r1.A00
            X.2PL r0 = (X.AnonymousClass2PL) r0
            r0.A00()
            return
        L_0x042b:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.videoplayback.ExoPlaybackControlView r0 = (com.obwhatsapp.videoplayback.ExoPlaybackControlView) r0
            r0.A05()
            return
        L_0x0433:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.videoplayback.ExoPlaybackControlView r0 = (com.obwhatsapp.videoplayback.ExoPlaybackControlView) r0
            r0.A00()
            return
        L_0x043b:
            java.lang.Object r0 = r1.A00
            X.2PN r0 = (X.AnonymousClass2PN) r0
            X.AnonymousClass2PN.A00(r0)
            return
        L_0x0443:
            java.lang.Object r0 = r1.A00
            X.024 r0 = (X.AnonymousClass024) r0
            r0.A01()
            return
        L_0x044b:
            java.lang.Object r8 = r1.A00
            X.1GX r8 = (X.AnonymousClass1GX) r8
            monitor-enter(r8)
            java.util.Map r0 = r8.A0A     // Catch:{ all -> 0x050d }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x050d }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x050d }
        L_0x045a:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x050d }
            if (r0 == 0) goto L_0x0499
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x050d }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x050d }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x050d }
            com.facebook.redex.RunnableRunnableShape11S0200000_I0_9 r0 = (com.facebook.redex.RunnableRunnableShape11S0200000_I0_9) r0     // Catch:{ all -> 0x050d }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x050d }
            android.os.Handler r0 = (android.os.Handler) r0     // Catch:{ all -> 0x050d }
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x050d }
            java.lang.Thread r0 = r0.getThread()     // Catch:{ all -> 0x050d }
            java.lang.String r2 = r0.getName()     // Catch:{ all -> 0x050d }
            java.util.Map r1 = r8.A0B     // Catch:{ all -> 0x050d }
            java.lang.Object r0 = r3.getKey()     // Catch:{ all -> 0x050d }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x050d }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x050d }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x050d }
            if (r0 == 0) goto L_0x0493
            r8.A02(r2)     // Catch:{ all -> 0x050d }
        L_0x0491:
            monitor-exit(r8)     // Catch:{ all -> 0x050d }
            goto L_0x050c
        L_0x0493:
            java.util.Map r0 = r8.A0C     // Catch:{ all -> 0x050d }
            r0.remove(r2)     // Catch:{ all -> 0x050d }
            goto L_0x045a
        L_0x0499:
            java.util.List r0 = r8.A09     // Catch:{ all -> 0x050d }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x050d }
        L_0x049f:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x050d }
            if (r0 == 0) goto L_0x0508
            java.lang.Object r9 = r13.next()     // Catch:{ all -> 0x050d }
            X.2PX r9 = (X.AnonymousClass2PX) r9     // Catch:{ all -> 0x050d }
            java.util.concurrent.ThreadPoolExecutor r0 = r9.A03     // Catch:{ all -> 0x050d }
            long r4 = r0.getTaskCount()     // Catch:{ all -> 0x050d }
            long r2 = r0.getCompletedTaskCount()     // Catch:{ all -> 0x050d }
            long r6 = r9.A01     // Catch:{ all -> 0x050d }
            long r0 = r9.A00     // Catch:{ all -> 0x050d }
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x04c6
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 != 0) goto L_0x04c6
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x04c6
            goto L_0x04cf
        L_0x04c6:
            r12 = 0
            java.util.Map r1 = r8.A0C     // Catch:{ all -> 0x050d }
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x050d }
            r1.remove(r0)     // Catch:{ all -> 0x050d }
            goto L_0x0501
        L_0x04cf:
            r12 = 1
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x050d }
            r11.<init>()     // Catch:{ all -> 0x050d }
            java.lang.String r10 = "Signal Protocol Stuck: lastTaskCount:"
            r11.append(r10)     // Catch:{ all -> 0x050d }
            r11.append(r6)     // Catch:{ all -> 0x050d }
            java.lang.String r6 = " lastCompleted:"
            r11.append(r6)     // Catch:{ all -> 0x050d }
            r11.append(r0)     // Catch:{ all -> 0x050d }
            java.lang.String r0 = " currentTaskCount:"
            r11.append(r0)     // Catch:{ all -> 0x050d }
            r11.append(r4)     // Catch:{ all -> 0x050d }
            java.lang.String r0 = " currentCompleted:"
            r11.append(r0)     // Catch:{ all -> 0x050d }
            r11.append(r2)     // Catch:{ all -> 0x050d }
            java.lang.String r0 = r11.toString()     // Catch:{ all -> 0x050d }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x050d }
            java.lang.String r0 = r9.A02     // Catch:{ all -> 0x050d }
            r8.A02(r0)     // Catch:{ all -> 0x050d }
        L_0x0501:
            r9.A00 = r2     // Catch:{ all -> 0x050d }
            r9.A01 = r4     // Catch:{ all -> 0x050d }
            if (r12 == 0) goto L_0x049f
            goto L_0x0491
        L_0x0508:
            r8.A00()     // Catch:{ all -> 0x050d }
            goto L_0x0491
        L_0x050c:
            return
        L_0x050d:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x050d }
            throw r1
        L_0x0510:
            java.lang.Object r0 = r1.A00
            X.25Z r0 = (X.AnonymousClass25Z) r0
            X.25V r0 = r0.A02
            r0.ARJ()
            return
        L_0x051a:
            java.lang.Object r0 = r1.A00
            X.1Ld r0 = (X.C25791Ld) r0
            r0.A05()
            return
        L_0x0522:
            java.lang.Object r3 = r1.A00
            com.whatsapp.util.FloatingChildLayout r3 = (com.whatsapp.util.FloatingChildLayout) r3
            android.animation.ValueAnimator r0 = r3.A06
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x0534
            android.animation.ValueAnimator r0 = r3.A06
            r0.reverse()
            return
        L_0x0534:
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {0, 127} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofInt(r0)
            r3.A06 = r2
            r1 = 13
            com.facebook.redex.IDxUListenerShape141S0100000_2_I1 r0 = new com.facebook.redex.IDxUListenerShape141S0100000_2_I1
            r0.<init>(r3, r1)
            r2.addUpdateListener(r0)
            android.animation.ValueAnimator r2 = r3.A06
            int r0 = r3.A01
            long r0 = (long) r0
            android.animation.ValueAnimator r0 = r2.setDuration(r0)
            r0.start()
            return
        L_0x0557:
            java.lang.Object r0 = r1.A00
            X.2PQ r0 = (X.AnonymousClass2PQ) r0
            android.media.MediaPlayer r0 = r0.A00
            r0.reset()
            r0.release()
            return
        L_0x0564:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.twofactor.TwoFactorAuthActivity r3 = (com.obwhatsapp.twofactor.TwoFactorAuthActivity) r3
            java.lang.String r2 = r3.A02
            if (r2 != 0) goto L_0x0574
            X.0ps r0 = r3.A01
            java.lang.String r2 = r0.A01()
            r3.A02 = r2
        L_0x0574:
            X.0ps r1 = r3.A01
            java.lang.String r0 = r3.A04
            r1.A04(r2, r0)
            return
        L_0x057c:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.twofactor.TwoFactorAuthActivity r4 = (com.obwhatsapp.twofactor.TwoFactorAuthActivity) r4
            r4.Ac1()
            int[] r1 = r4.A08
            int r0 = r1.length
            r3 = 0
            r2 = 1
            if (r0 != r2) goto L_0x05a3
            r1 = r1[r3]
            if (r1 == r2) goto L_0x059d
            r0 = 2
            if (r1 != r0) goto L_0x0599
            X.0pt r1 = r4.A05
            r0 = 2131892288(0x7f121840, float:1.941932E38)
        L_0x0596:
            r1.A09(r0, r2)
        L_0x0599:
            r4.finish()
            return
        L_0x059d:
            X.0pt r1 = r4.A05
            r0 = 2131892278(0x7f121836, float:1.94193E38)
            goto L_0x0596
        L_0x05a3:
            X.02C r1 = r4.AGM()
        L_0x05a7:
            int r0 = r1.A04()
            if (r0 <= 0) goto L_0x05b1
            r1.A0p()
            goto L_0x05a7
        L_0x05b1:
            android.view.View r1 = r4.getCurrentFocus()
            if (r1 == 0) goto L_0x05bc
            X.1Ai r0 = r4.A0B
            r0.A01(r1)
        L_0x05bc:
            X.02i r0 = r4.A00
            if (r0 == 0) goto L_0x05c8
            r0.A0N(r3)
            X.02i r0 = r4.A00
            r0.A0P(r3)
        L_0x05c8:
            java.lang.String r0 = r4.A06
            com.obwhatsapp.twofactor.DoneFragment r0 = com.obwhatsapp.twofactor.DoneFragment.A01(r0)
            r4.A37(r0, r3)
            return
        L_0x05d2:
            java.lang.String r0 = "Show count must be greater than or equal to 0"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape16S0100000_I0_15.run():void");
    }
}
