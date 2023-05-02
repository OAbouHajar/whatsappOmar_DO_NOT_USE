package e;

import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import okio.ByteString;

/* compiled from: XFMFile */
public abstract class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final StringBuilder f1699a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    public static final ByteString f1700b = ByteString.encodeUtf8("RIFF");

    /* renamed from: c  reason: collision with root package name */
    public static final ByteString f1701c = ByteString.encodeUtf8("WEBP");

    public static void a() {
        if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(com.squareup.picasso.Request r4, java.lang.StringBuilder r5) {
        /*
            java.lang.String r0 = r4.stableKey
            r1 = 50
            if (r0 == 0) goto L_0x0011
            int r0 = r0.length()
            int r0 = r0 + r1
            r5.ensureCapacity(r0)
            java.lang.String r0 = r4.stableKey
            goto L_0x0021
        L_0x0011:
            android.net.Uri r0 = r4.uri
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r0.toString()
            int r2 = r0.length()
            int r2 = r2 + r1
            r5.ensureCapacity(r2)
        L_0x0021:
            r5.append(r0)
            goto L_0x002d
        L_0x0025:
            r5.ensureCapacity(r1)
            int r0 = r4.resourceId
            r5.append(r0)
        L_0x002d:
            r0 = 10
            r5.append(r0)
            float r1 = r4.rotationDegrees
            r2 = 0
            r3 = 120(0x78, float:1.68E-43)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "rotation:"
            r5.append(r1)
            float r1 = r4.rotationDegrees
            r5.append(r1)
            boolean r1 = r4.hasRotationPivot
            if (r1 == 0) goto L_0x005b
            r1 = 64
            r5.append(r1)
            float r1 = r4.rotationPivotX
            r5.append(r1)
            r5.append(r3)
            float r1 = r4.rotationPivotY
            r5.append(r1)
        L_0x005b:
            r5.append(r0)
        L_0x005e:
            boolean r1 = r4.hasSize()
            if (r1 == 0) goto L_0x0079
            java.lang.String r1 = "resize:"
            r5.append(r1)
            int r1 = r4.targetWidth
            r5.append(r1)
            r5.append(r3)
            int r1 = r4.targetHeight
            r5.append(r1)
            r5.append(r0)
        L_0x0079:
            boolean r1 = r4.centerCrop
            if (r1 == 0) goto L_0x0088
            java.lang.String r1 = "centerCrop:"
            r5.append(r1)
            int r1 = r4.centerCropGravity
            r5.append(r1)
            goto L_0x0091
        L_0x0088:
            boolean r1 = r4.centerInside
            if (r1 == 0) goto L_0x0094
            java.lang.String r1 = "centerInside"
            r5.append(r1)
        L_0x0091:
            r5.append(r0)
        L_0x0094:
            java.util.List<com.squareup.picasso.Transformation> r1 = r4.transformations
            if (r1 == 0) goto L_0x00b4
            int r1 = r1.size()
            r2 = 0
        L_0x009d:
            if (r2 >= r1) goto L_0x00b4
            java.util.List<com.squareup.picasso.Transformation> r3 = r4.transformations
            java.lang.Object r3 = r3.get(r2)
            com.squareup.picasso.Transformation r3 = (com.squareup.picasso.Transformation) r3
            java.lang.String r3 = r3.key()
            r5.append(r3)
            r5.append(r0)
            int r2 = r2 + 1
            goto L_0x009d
        L_0x00b4:
            java.lang.String r4 = r5.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e.o0.b(com.squareup.picasso.Request, java.lang.StringBuilder):java.lang.String");
    }

    public static String c(i iVar) {
        return d(iVar, "");
    }

    public static String d(i iVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        b bVar = iVar.f1657k;
        if (bVar != null) {
            sb.append(bVar.f1606b.a());
        }
        ArrayList arrayList = iVar.f1658l;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || bVar != null) {
                    sb.append(", ");
                }
                sb.append(((b) arrayList.get(i2)).f1606b.a());
            }
        }
        return sb.toString();
    }

    public static void e(String str, String str2, String str3) {
        f(str, str2, str3, "");
    }

    public static void f(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", new Object[]{str, str2, str3, str4}));
    }
}
