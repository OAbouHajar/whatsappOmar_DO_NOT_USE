package X;

import com.obwhatsapp.EmojiPicker$EmojiWeight;

/* renamed from: X.11b  reason: invalid class name and case insensitive filesystem */
public class C206511b implements C206611c {
    public final C16300so A00;
    public final C16980tz A01;
    public final C14710pd A02;

    public C206511b(C16300so r1, C16980tz r2, C14710pd r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ C37891pu A7L(Object obj, float f2) {
        return new EmojiPicker$EmojiWeight((int[]) obj, 1.0f);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x008c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List AHu() {
        /*
            r8 = this;
            X.0tz r0 = r8.A01
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "emoji"
            java.io.File r4 = new java.io.File
            r4.<init>(r1, r0)
            boolean r0 = r4.exists()
            r7 = 0
            if (r0 == 0) goto L_0x00a2
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x008d }
            r5.<init>()     // Catch:{ Exception -> 0x008d }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ Exception -> 0x008d }
            r0.<init>(r4)     // Catch:{ Exception -> 0x008d }
            android.util.JsonReader r6 = new android.util.JsonReader     // Catch:{ Exception -> 0x008d }
            r6.<init>(r0)     // Catch:{ Exception -> 0x008d }
            r6.beginObject()     // Catch:{ all -> 0x0088 }
        L_0x0028:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0064
            java.lang.String r1 = "weights"
            java.lang.String r0 = r6.nextName()     // Catch:{ all -> 0x0088 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0060
            r6.beginObject()     // Catch:{ all -> 0x0088 }
        L_0x003e:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = r6.nextName()     // Catch:{ all -> 0x0088 }
            X.1pj r3 = X.C37941pz.A00(r0)     // Catch:{ all -> 0x0088 }
            double r0 = r6.nextDouble()     // Catch:{ all -> 0x0088 }
            float r2 = (float) r0     // Catch:{ all -> 0x0088 }
            int[] r1 = r3.A00     // Catch:{ all -> 0x0088 }
            com.obwhatsapp.EmojiPicker$EmojiWeight r0 = new com.obwhatsapp.EmojiPicker$EmojiWeight     // Catch:{ all -> 0x0088 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0088 }
            r5.add(r0)     // Catch:{ all -> 0x0088 }
            goto L_0x003e
        L_0x005c:
            r6.endObject()     // Catch:{ all -> 0x0088 }
            goto L_0x0028
        L_0x0060:
            r6.skipValue()     // Catch:{ all -> 0x0088 }
            goto L_0x0028
        L_0x0064:
            r6.endObject()     // Catch:{ all -> 0x0088 }
            r6.close()     // Catch:{ Exception -> 0x008d }
            r7 = r5
            X.0pd r2 = r8.A02     // Catch:{ Exception -> 0x008d }
            r1 = 2880(0xb40, float:4.036E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ Exception -> 0x008d }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ Exception -> 0x008d }
            if (r0 != 0) goto L_0x00a2
            X.01T r0 = X.AnonymousClass2HP.A00     // Catch:{ Exception -> 0x008d }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x008d }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ Exception -> 0x008d }
            X.2HQ r0 = new X.2HQ     // Catch:{ Exception -> 0x008d }
            r0.<init>(r1)     // Catch:{ Exception -> 0x008d }
            X.C43041zF.A02(r0, r5)     // Catch:{ Exception -> 0x008d }
            goto L_0x00a2
        L_0x0088:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x008c }
        L_0x008c:
            throw r0     // Catch:{ Exception -> 0x008d }
        L_0x008d:
            r1 = move-exception
            java.lang.String r0 = "recentemoji/readrecent "
            com.whatsapp.util.Log.e(r0, r1)
            X.0so r3 = r8.A00
            java.lang.String r2 = r1.toString()
            r1 = 0
            java.lang.String r0 = "recentemoji/load-error"
            r3.AcB(r0, r2, r1)
            r4.delete()
        L_0x00a2:
            if (r7 != 0) goto L_0x00a9
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00a9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206511b.AHu():java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AaZ(java.util.List r7) {
        /*
            r6 = this;
            X.0tz r0 = r6.A01     // Catch:{ IOException -> 0x0065 }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x0065 }
            java.io.File r2 = r0.getFilesDir()     // Catch:{ IOException -> 0x0065 }
            java.lang.String r1 = "emoji"
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0065 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0065 }
            X.0so r5 = r6.A00     // Catch:{ IOException -> 0x0065 }
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x0065 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0065 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x0065 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0065 }
            android.util.JsonWriter r4 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0065 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0065 }
            r4.beginObject()     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "weights"
            r4.name(r0)     // Catch:{ all -> 0x0060 }
            r4.beginObject()     // Catch:{ all -> 0x0060 }
            java.util.Iterator r3 = r7.iterator()     // Catch:{ all -> 0x0060 }
        L_0x0030:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0056
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0060 }
            com.obwhatsapp.EmojiPicker$EmojiWeight r1 = (com.obwhatsapp.EmojiPicker$EmojiWeight) r1     // Catch:{ all -> 0x0060 }
            int[] r0 = r1.A01     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x0048
            java.lang.String r2 = "RecentEmojiHelper/persistListJson/emoji is null"
            r1 = 0
            r0 = 1
            r5.AcB(r2, r1, r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0030
        L_0x0048:
            java.lang.String r0 = X.C37781pj.A00(r0)     // Catch:{ all -> 0x0060 }
            r4.name(r0)     // Catch:{ all -> 0x0060 }
            float r0 = r1.A00     // Catch:{ all -> 0x0060 }
            double r0 = (double) r0     // Catch:{ all -> 0x0060 }
            r4.value(r0)     // Catch:{ all -> 0x0060 }
            goto L_0x0030
        L_0x0056:
            r4.endObject()     // Catch:{ all -> 0x0060 }
            r4.endObject()     // Catch:{ all -> 0x0060 }
            r4.close()     // Catch:{ IOException -> 0x0065 }
            return
        L_0x0060:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0     // Catch:{ IOException -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0so r3 = r6.A00
            java.lang.String r2 = r0.toString()
            r1 = 0
            java.lang.String r0 = "recentemoji/save-error"
            r3.AcB(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206511b.AaZ(java.util.List):void");
    }
}
