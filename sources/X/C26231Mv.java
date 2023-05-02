package X;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1Mv  reason: invalid class name and case insensitive filesystem */
public class C26231Mv implements C206611c {
    public final AnonymousClass01Z A00;
    public final C16980tz A01;
    public final C17250um A02;
    public final AnonymousClass1MF A03;
    public final Map A04 = new ConcurrentHashMap();

    public C26231Mv(AnonymousClass01Z r5, C16980tz r6, C17250um r7, AnonymousClass1MF r8) {
        this.A01 = r6;
        this.A02 = r7;
        this.A03 = r8;
        this.A00 = r5;
        List<AnonymousClass2V1> A002 = AnonymousClass4Z2.A00();
        for (AnonymousClass2V1 r2 : A002) {
            this.A04.put(r2.AGT(), r2);
        }
    }

    public /* bridge */ /* synthetic */ C37891pu A7L(Object obj, float f2) {
        return new C102324yl((AnonymousClass2V1) obj, Float.valueOf(1.0f));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:70:0x0159 */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0165  */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List AHu() {
        /*
            r13 = this;
            X.0tz r0 = r13.A01
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "content_stickers"
            java.io.File r3 = new java.io.File
            r3.<init>(r1, r0)
            boolean r0 = r3.exists()
            r12 = 0
            if (r0 == 0) goto L_0x0163
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x015a }
            r2.<init>(r3)     // Catch:{ Exception -> 0x015a }
            java.lang.String r1 = X.AnonymousClass01S.A08     // Catch:{ Exception -> 0x015a }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x015a }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x015a }
            android.util.JsonReader r5 = new android.util.JsonReader     // Catch:{ Exception -> 0x015a }
            r5.<init>(r0)     // Catch:{ Exception -> 0x015a }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0155 }
            r4.<init>()     // Catch:{ all -> 0x0155 }
            r5.beginArray()     // Catch:{ all -> 0x0155 }
        L_0x002f:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x014d
            r5.beginObject()     // Catch:{ all -> 0x0155 }
            r6 = r12
            r7 = r12
        L_0x003a:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0155 }
            r8 = 1
            if (r0 == 0) goto L_0x0080
            java.lang.String r9 = r5.nextName()     // Catch:{ all -> 0x0155 }
            r2 = -1
            int r1 = r9.hashCode()     // Catch:{ all -> 0x0155 }
            r0 = -791592328(0xffffffffd0d14278, float:-2.80863539E10)
            if (r1 == r0) goto L_0x005f
            r0 = 114586(0x1bf9a, float:1.60569E-40)
            if (r1 != r0) goto L_0x0069
            java.lang.String r0 = "tag"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x0069
            r2 = 0
            goto L_0x0069
        L_0x005f:
            java.lang.String r0 = "weight"
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x0069
            r2 = 1
        L_0x0069:
            if (r2 == 0) goto L_0x007b
            if (r2 == r8) goto L_0x0071
            r5.skipValue()     // Catch:{ all -> 0x0155 }
            goto L_0x003a
        L_0x0071:
            double r0 = r5.nextDouble()     // Catch:{ all -> 0x0155 }
            float r2 = (float) r0     // Catch:{ all -> 0x0155 }
            java.lang.Float r7 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0155 }
            goto L_0x003a
        L_0x007b:
            java.lang.String r6 = r5.nextString()     // Catch:{ all -> 0x0155 }
            goto L_0x003a
        L_0x0080:
            r5.endObject()     // Catch:{ all -> 0x0155 }
            if (r6 == 0) goto L_0x0137
            if (r7 == 0) goto L_0x0137
            java.util.Map r2 = r13.A04     // Catch:{ all -> 0x0155 }
            java.lang.Object r9 = r2.get(r6)     // Catch:{ all -> 0x0155 }
            X.2V1 r9 = (X.AnonymousClass2V1) r9     // Catch:{ all -> 0x0155 }
            if (r9 != 0) goto L_0x0125
            java.lang.String r1 = "StickerShapeCreator:"
            boolean r0 = r6.startsWith(r1)     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x00a0
            java.lang.String r0 = ""
            java.lang.String r10 = r6.replace(r1, r0)     // Catch:{ all -> 0x0155 }
            goto L_0x00a1
        L_0x00a0:
            r10 = 0
        L_0x00a1:
            if (r10 == 0) goto L_0x00e6
            X.01Z r0 = r13.A00     // Catch:{ all -> 0x0155 }
            java.io.File r11 = r0.A03(r10)     // Catch:{ all -> 0x0155 }
            boolean r0 = r11.exists()     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x0125
            X.1jm r1 = new X.1jm     // Catch:{ all -> 0x0155 }
            r1.<init>()     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = r11.getAbsolutePath()     // Catch:{ all -> 0x0155 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x00c0
            r0 = r12
            goto L_0x00cc
        L_0x00c0:
            java.lang.String r0 = r11.getAbsolutePath()     // Catch:{ all -> 0x0155 }
            byte[] r0 = com.whatsapp.stickers.WebpUtils.fetchWebpMetadata(r0)     // Catch:{ all -> 0x0155 }
            X.1XO r0 = X.AnonymousClass1XO.A00(r0)     // Catch:{ all -> 0x0155 }
        L_0x00cc:
            r1.A04 = r0     // Catch:{ all -> 0x0155 }
            r1.A0D = r10     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = r11.getAbsolutePath()     // Catch:{ all -> 0x0155 }
            r1.A09 = r0     // Catch:{ all -> 0x0155 }
            r1.A01 = r8     // Catch:{ all -> 0x0155 }
            X.C37711pb.A00(r1)     // Catch:{ all -> 0x0155 }
            X.1MF r0 = r13.A03     // Catch:{ all -> 0x0155 }
            X.4zZ r8 = new X.4zZ     // Catch:{ all -> 0x0155 }
            r8.<init>(r1, r0)     // Catch:{ all -> 0x0155 }
            r2.put(r6, r8)     // Catch:{ all -> 0x0155 }
            goto L_0x0124
        L_0x00e6:
            java.lang.String r1 = "EmojiShapeCreator:"
            boolean r0 = r6.startsWith(r1)     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = ""
            java.lang.String r6 = r6.replace(r1, r0)     // Catch:{ all -> 0x0155 }
            goto L_0x00f6
        L_0x00f5:
            r6 = 0
        L_0x00f6:
            if (r6 == 0) goto L_0x0125
            X.0um r1 = r13.A02     // Catch:{ IllegalArgumentException -> 0x010e }
            X.1pj r0 = new X.1pj     // Catch:{ IllegalArgumentException -> 0x010e }
            r0.<init>((java.lang.String) r6)     // Catch:{ IllegalArgumentException -> 0x010e }
            X.4zY r8 = new X.4zY     // Catch:{ IllegalArgumentException -> 0x010e }
            r8.<init>(r0, r1)     // Catch:{ IllegalArgumentException -> 0x010e }
            java.lang.String r0 = r8.AGT()     // Catch:{ IllegalArgumentException -> 0x010c }
            r2.put(r0, r8)     // Catch:{ IllegalArgumentException -> 0x010c }
            goto L_0x0124
        L_0x010c:
            r2 = move-exception
            goto L_0x0110
        L_0x010e:
            r2 = move-exception
            r8 = r9
        L_0x0110:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0155 }
            r1.<init>()     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = "Unable to create emoji shape creator from "
            r1.append(r0)     // Catch:{ all -> 0x0155 }
            r1.append(r6)     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0155 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0155 }
        L_0x0124:
            r9 = r8
        L_0x0125:
            if (r9 == 0) goto L_0x002f
            boolean r0 = r9.A5u()     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x002f
            X.4yl r0 = new X.4yl     // Catch:{ all -> 0x0155 }
            r0.<init>(r9, r7)     // Catch:{ all -> 0x0155 }
            r4.add(r0)     // Catch:{ all -> 0x0155 }
            goto L_0x002f
        L_0x0137:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0155 }
            r1.<init>()     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = "RecentShapesHelper/init/ tag or weight is null for tag="
            r1.append(r0)     // Catch:{ all -> 0x0155 }
            r1.append(r6)     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0155 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0155 }
            goto L_0x002f
        L_0x014d:
            r5.close()     // Catch:{ Exception -> 0x0152 }
            r12 = r4
            goto L_0x0163
        L_0x0152:
            r1 = move-exception
            r12 = r4
            goto L_0x015b
        L_0x0155:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0159 }
        L_0x0159:
            throw r0     // Catch:{ Exception -> 0x015a }
        L_0x015a:
            r1 = move-exception
        L_0x015b:
            java.lang.String r0 = "RecentShapesHelper/init"
            com.whatsapp.util.Log.e(r0, r1)
            r3.delete()
        L_0x0163:
            if (r12 != 0) goto L_0x016a
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x016a:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26231Mv.AHu():java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0067 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AaZ(java.util.List r7) {
        /*
            r6 = this;
            X.0tz r0 = r6.A01     // Catch:{ IOException -> 0x0068 }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x0068 }
            java.io.File r2 = r0.getFilesDir()     // Catch:{ IOException -> 0x0068 }
            java.lang.String r1 = "content_stickers"
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x0068 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0068 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0068 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0068 }
            java.lang.String r1 = X.AnonymousClass01S.A08     // Catch:{ IOException -> 0x0068 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0068 }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x0068 }
            android.util.JsonWriter r5 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0068 }
            r5.<init>(r0)     // Catch:{ IOException -> 0x0068 }
            java.lang.String r0 = ""
            r5.setIndent(r0)     // Catch:{ all -> 0x0063 }
            r5.beginArray()     // Catch:{ all -> 0x0063 }
            java.util.Iterator r4 = r7.iterator()     // Catch:{ all -> 0x0063 }
        L_0x002c:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0063 }
            if (r0 == 0) goto L_0x005c
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x0063 }
            X.4yl r3 = (X.C102324yl) r3     // Catch:{ all -> 0x0063 }
            r5.beginObject()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "tag"
            android.util.JsonWriter r1 = r5.name(r0)     // Catch:{ all -> 0x0063 }
            X.2V1 r0 = r3.A01     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = r0.AGT()     // Catch:{ all -> 0x0063 }
            r1.value(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "weight"
            android.util.JsonWriter r2 = r5.name(r0)     // Catch:{ all -> 0x0063 }
            float r0 = r3.A00     // Catch:{ all -> 0x0063 }
            double r0 = (double) r0     // Catch:{ all -> 0x0063 }
            r2.value(r0)     // Catch:{ all -> 0x0063 }
            r5.endObject()     // Catch:{ all -> 0x0063 }
            goto L_0x002c
        L_0x005c:
            r5.endArray()     // Catch:{ all -> 0x0063 }
            r5.close()     // Catch:{ IOException -> 0x0068 }
            return
        L_0x0063:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0067 }
        L_0x0067:
            throw r0     // Catch:{ IOException -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26231Mv.AaZ(java.util.List):void");
    }
}
