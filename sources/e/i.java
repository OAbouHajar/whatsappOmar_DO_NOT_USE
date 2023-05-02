package e;

import a.a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import com.squareup.picasso.Cache;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;
import com.squareup.picasso.RequestHandler;
import com.squareup.picasso.Transformation;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* compiled from: XFMFile */
public final class i implements Runnable {

    /* renamed from: t  reason: collision with root package name */
    public static final Object f1643t = new Object();

    /* renamed from: u  reason: collision with root package name */
    public static final d f1644u = new d(0);

    /* renamed from: v  reason: collision with root package name */
    public static final AtomicInteger f1645v = new AtomicInteger();

    /* renamed from: w  reason: collision with root package name */
    public static final e f1646w = new e();

    /* renamed from: a  reason: collision with root package name */
    public final int f1647a = f1645v.incrementAndGet();

    /* renamed from: b  reason: collision with root package name */
    public final Picasso f1648b;

    /* renamed from: c  reason: collision with root package name */
    public final q f1649c;

    /* renamed from: d  reason: collision with root package name */
    public final Cache f1650d;

    /* renamed from: e  reason: collision with root package name */
    public final l0 f1651e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1652f;

    /* renamed from: g  reason: collision with root package name */
    public final Request f1653g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1654h;

    /* renamed from: i  reason: collision with root package name */
    public int f1655i;

    /* renamed from: j  reason: collision with root package name */
    public final RequestHandler f1656j;

    /* renamed from: k  reason: collision with root package name */
    public b f1657k;

    /* renamed from: l  reason: collision with root package name */
    public ArrayList f1658l;

    /* renamed from: m  reason: collision with root package name */
    public Bitmap f1659m;

    /* renamed from: n  reason: collision with root package name */
    public Future f1660n;

    /* renamed from: o  reason: collision with root package name */
    public Picasso.LoadedFrom f1661o;

    /* renamed from: p  reason: collision with root package name */
    public Exception f1662p;

    /* renamed from: q  reason: collision with root package name */
    public int f1663q;

    /* renamed from: r  reason: collision with root package name */
    public int f1664r;

    /* renamed from: s  reason: collision with root package name */
    public Picasso.Priority f1665s;

    public i(Picasso picasso, q qVar, Cache cache, l0 l0Var, b bVar, RequestHandler requestHandler) {
        this.f1648b = picasso;
        this.f1649c = qVar;
        this.f1650d = cache;
        this.f1651e = l0Var;
        this.f1657k = bVar;
        this.f1652f = bVar.f1613i;
        Request request = bVar.f1606b;
        this.f1653g = request;
        this.f1665s = request.priority;
        this.f1654h = bVar.f1609e;
        this.f1655i = bVar.f1610f;
        this.f1656j = requestHandler;
        this.f1664r = requestHandler.c();
    }

    public static Bitmap a(List list, Bitmap bitmap) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Transformation transformation = (Transformation) list.get(i2);
            try {
                Bitmap transform = transformation.transform(bitmap);
                if (transform == null) {
                    StringBuilder g2 = a.g("Transformation ");
                    g2.append(transformation.key());
                    g2.append(" returned null after ");
                    g2.append(i2);
                    g2.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        g2.append(((Transformation) it.next()).key());
                        g2.append(10);
                    }
                    Picasso.f1534p.post(new g(g2, 0));
                    return null;
                } else if (transform == bitmap && bitmap.isRecycled()) {
                    Picasso.f1534p.post(new h(transformation, 0));
                    return null;
                } else if (transform == bitmap || bitmap.isRecycled()) {
                    i2++;
                    bitmap = transform;
                } else {
                    Picasso.f1534p.post(new h(transformation, 1));
                    return null;
                }
            } catch (RuntimeException e2) {
                Picasso.f1534p.post(new f(transformation, e2));
                return null;
            }
        }
        return bitmap;
    }

    public static Bitmap c(Source source, Request request) {
        BufferedSource buffer = Okio.buffer(source);
        boolean z2 = buffer.rangeEquals(0, o0.f1700b) && buffer.rangeEquals(8, o0.f1701c);
        boolean z3 = request.purgeable;
        BitmapFactory.Options b2 = RequestHandler.b(request);
        boolean z4 = b2 != null && b2.inJustDecodeBounds;
        if (!z2) {
            InputStream inputStream = buffer.inputStream();
            if (z4) {
                x xVar = new x(inputStream);
                xVar.f1729f = false;
                long j2 = xVar.f1725b + ((long) 1024);
                if (xVar.f1727d < j2) {
                    xVar.b(j2);
                }
                long j3 = xVar.f1725b;
                BitmapFactory.decodeStream(xVar, (Rect) null, b2);
                RequestHandler.a(request.targetWidth, request.targetHeight, b2.outWidth, b2.outHeight, b2, request);
                xVar.a(j3);
                xVar.f1729f = true;
                inputStream = xVar;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, (Rect) null, b2);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
        byte[] readByteArray = buffer.readByteArray();
        if (z4) {
            BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, b2);
            RequestHandler.a(request.targetWidth, request.targetHeight, b2.outWidth, b2.outHeight, b2, request);
        }
        return BitmapFactory.decodeByteArray(readByteArray, 0, readByteArray.length, b2);
    }

    public static i e(Picasso picasso, q qVar, Cache cache, l0 l0Var, b bVar) {
        Request request = bVar.f1606b;
        List list = picasso.f1539d;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            RequestHandler requestHandler = (RequestHandler) list.get(i2);
            if (requestHandler.canHandleRequest(request)) {
                return new i(picasso, qVar, cache, l0Var, bVar, requestHandler);
            }
        }
        return new i(picasso, qVar, cache, l0Var, bVar, f1646w);
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x026b  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap g(com.squareup.picasso.Request r25, android.graphics.Bitmap r26, int r27) {
        /*
            r0 = r25
            r1 = r27
            int r2 = r26.getWidth()
            int r3 = r26.getHeight()
            boolean r4 = r0.onlyScaleDown
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>()
            boolean r5 = r25.b()
            if (r5 != 0) goto L_0x0020
            if (r1 == 0) goto L_0x001c
            goto L_0x0020
        L_0x001c:
            r6 = r2
            r8 = r3
            goto L_0x025c
        L_0x0020:
            int r5 = r0.targetWidth
            int r7 = r0.targetHeight
            float r8 = r0.rotationDegrees
            r9 = 0
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 == 0) goto L_0x0127
            double r11 = (double) r8
            double r13 = java.lang.Math.toRadians(r11)
            double r13 = java.lang.Math.cos(r13)
            double r11 = java.lang.Math.toRadians(r11)
            double r11 = java.lang.Math.sin(r11)
            boolean r5 = r0.hasRotationPivot
            if (r5 == 0) goto L_0x00c2
            float r5 = r0.rotationPivotX
            float r7 = r0.rotationPivotY
            r10.setRotate(r8, r5, r7)
            float r5 = r0.rotationPivotX
            double r7 = (double) r5
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r15 = r15 - r13
            double r17 = r7 * r15
            float r5 = r0.rotationPivotY
            r19 = r7
            double r6 = (double) r5
            double r21 = r6 * r11
            r23 = r10
            double r9 = r21 + r17
            double r6 = r6 * r15
            double r15 = r19 * r11
            double r6 = r6 - r15
            int r5 = r0.targetWidth
            r15 = r4
            double r4 = (double) r5
            double r16 = r4 * r13
            r18 = r2
            r19 = r3
            double r2 = r16 + r9
            double r4 = r4 * r11
            double r4 = r4 + r6
            int r8 = r0.targetHeight
            double r0 = (double) r8
            double r11 = r11 * r0
            r16 = r6
            double r6 = r2 - r11
            double r0 = r0 * r13
            double r13 = r0 + r4
            double r11 = r9 - r11
            double r0 = r0 + r16
            r20 = r0
            double r0 = java.lang.Math.max(r9, r2)
            double r0 = java.lang.Math.max(r6, r0)
            double r0 = java.lang.Math.max(r11, r0)
            double r2 = java.lang.Math.min(r9, r2)
            double r2 = java.lang.Math.min(r6, r2)
            double r2 = java.lang.Math.min(r11, r2)
            r6 = r16
            double r8 = java.lang.Math.max(r6, r4)
            double r8 = java.lang.Math.max(r13, r8)
            r10 = r20
            double r8 = java.lang.Math.max(r10, r8)
            double r4 = java.lang.Math.min(r6, r4)
            double r4 = java.lang.Math.min(r13, r4)
            double r4 = java.lang.Math.min(r10, r4)
            double r0 = r0 - r2
            double r0 = java.lang.Math.floor(r0)
            int r0 = (int) r0
            double r8 = r8 - r4
            double r1 = java.lang.Math.floor(r8)
            r5 = r0
            goto L_0x0125
        L_0x00c2:
            r18 = r2
            r19 = r3
            r15 = r4
            r0 = r10
            r0.setRotate(r8)
            r1 = r25
            int r2 = r1.targetWidth
            double r2 = (double) r2
            double r4 = r2 * r13
            double r2 = r2 * r11
            int r6 = r1.targetHeight
            double r6 = (double) r6
            double r11 = r11 * r6
            double r8 = r4 - r11
            double r6 = r6 * r13
            double r13 = r6 + r2
            double r10 = -r11
            r23 = r0
            r0 = 0
            r16 = r6
            double r6 = java.lang.Math.max(r0, r4)
            double r6 = java.lang.Math.max(r8, r6)
            double r6 = java.lang.Math.max(r10, r6)
            double r4 = java.lang.Math.min(r0, r4)
            double r4 = java.lang.Math.min(r8, r4)
            double r4 = java.lang.Math.min(r10, r4)
            double r8 = java.lang.Math.max(r0, r2)
            double r8 = java.lang.Math.max(r13, r8)
            r10 = r16
            double r8 = java.lang.Math.max(r10, r8)
            double r0 = java.lang.Math.min(r0, r2)
            double r0 = java.lang.Math.min(r13, r0)
            double r0 = java.lang.Math.min(r10, r0)
            double r6 = r6 - r4
            double r2 = java.lang.Math.floor(r6)
            int r2 = (int) r2
            double r8 = r8 - r0
            double r0 = java.lang.Math.floor(r8)
            r5 = r2
            r1 = r0
        L_0x0125:
            int r7 = (int) r1
            goto L_0x012e
        L_0x0127:
            r18 = r2
            r19 = r3
            r15 = r4
            r23 = r10
        L_0x012e:
            r0 = 2
            r1 = 1
            r2 = 5
            r3 = r27
            if (r3 == 0) goto L_0x0170
            r4 = 90
            r6 = 270(0x10e, float:3.78E-43)
            switch(r3) {
                case 3: goto L_0x0144;
                case 4: goto L_0x0144;
                case 5: goto L_0x0141;
                case 6: goto L_0x0141;
                case 7: goto L_0x013e;
                case 8: goto L_0x013e;
                default: goto L_0x013c;
            }
        L_0x013c:
            r8 = 0
            goto L_0x0146
        L_0x013e:
            r8 = 270(0x10e, float:3.78E-43)
            goto L_0x0146
        L_0x0141:
            r8 = 90
            goto L_0x0146
        L_0x0144:
            r8 = 180(0xb4, float:2.52E-43)
        L_0x0146:
            if (r3 == r0) goto L_0x0152
            r9 = 7
            if (r3 == r9) goto L_0x0152
            r9 = 4
            if (r3 == r9) goto L_0x0152
            if (r3 == r2) goto L_0x0152
            r3 = 1
            goto L_0x0153
        L_0x0152:
            r3 = -1
        L_0x0153:
            if (r8 == 0) goto L_0x0165
            float r9 = (float) r8
            r10 = r23
            r10.preRotate(r9)
            if (r8 == r4) goto L_0x015f
            if (r8 != r6) goto L_0x0167
        L_0x015f:
            r24 = r7
            r7 = r5
            r5 = r24
            goto L_0x0167
        L_0x0165:
            r10 = r23
        L_0x0167:
            if (r3 == r1) goto L_0x0172
            float r3 = (float) r3
            r4 = 1065353216(0x3f800000, float:1.0)
            r10.postScale(r3, r4)
            goto L_0x0172
        L_0x0170:
            r10 = r23
        L_0x0172:
            r3 = r25
            boolean r4 = r3.centerCrop
            if (r4 == 0) goto L_0x0203
            if (r5 == 0) goto L_0x0182
            float r4 = (float) r5
            r6 = r18
            float r8 = (float) r6
            float r4 = r4 / r8
            r8 = r19
            goto L_0x0189
        L_0x0182:
            r6 = r18
            float r4 = (float) r7
            r8 = r19
            float r9 = (float) r8
            float r4 = r4 / r9
        L_0x0189:
            if (r7 == 0) goto L_0x018e
            float r9 = (float) r7
            float r11 = (float) r8
            goto L_0x0190
        L_0x018e:
            float r9 = (float) r5
            float r11 = (float) r6
        L_0x0190:
            float r9 = r9 / r11
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x01b9
            float r2 = (float) r8
            float r9 = r9 / r4
            float r9 = r9 * r2
            double r11 = (double) r9
            double r11 = java.lang.Math.ceil(r11)
            int r2 = (int) r11
            int r3 = r3.centerCropGravity
            r9 = r3 & 48
            r11 = 48
            if (r9 != r11) goto L_0x01a9
            r3 = 0
            goto L_0x01b4
        L_0x01a9:
            r9 = 80
            r3 = r3 & r9
            if (r3 != r9) goto L_0x01b1
            int r3 = r8 - r2
            goto L_0x01b4
        L_0x01b1:
            int r3 = r8 - r2
            int r3 = r3 / r0
        L_0x01b4:
            float r0 = (float) r7
            float r9 = (float) r2
            float r9 = r0 / r9
            goto L_0x01e5
        L_0x01b9:
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x01e2
            float r11 = (float) r6
            float r4 = r4 / r9
            float r4 = r4 * r11
            double r11 = (double) r4
            double r11 = java.lang.Math.ceil(r11)
            int r4 = (int) r11
            int r3 = r3.centerCropGravity
            r11 = r3 & 3
            r12 = 3
            if (r11 != r12) goto L_0x01d0
            r2 = 0
            goto L_0x01d9
        L_0x01d0:
            r3 = r3 & r2
            if (r3 != r2) goto L_0x01d6
            int r2 = r6 - r4
            goto L_0x01d9
        L_0x01d6:
            int r2 = r6 - r4
            int r2 = r2 / r0
        L_0x01d9:
            float r0 = (float) r5
            float r3 = (float) r4
            float r0 = r0 / r3
            r3 = r2
            r2 = r8
            r11 = r9
            r9 = r4
            r4 = 0
            goto L_0x01ea
        L_0x01e2:
            r2 = r8
            r4 = r9
            r3 = 0
        L_0x01e5:
            r0 = r4
            r11 = r9
            r4 = r3
            r9 = r6
            r3 = 0
        L_0x01ea:
            if (r15 == 0) goto L_0x01f7
            if (r5 == 0) goto L_0x01f0
            if (r6 > r5) goto L_0x01f7
        L_0x01f0:
            if (r7 == 0) goto L_0x01f5
            if (r8 <= r7) goto L_0x01f5
            goto L_0x01f7
        L_0x01f5:
            r6 = 0
            goto L_0x01f8
        L_0x01f7:
            r6 = 1
        L_0x01f8:
            if (r6 == 0) goto L_0x01fd
            r10.preScale(r0, r11)
        L_0x01fd:
            r6 = r3
            r7 = r4
            r8 = r9
            r9 = r2
            goto L_0x0260
        L_0x0203:
            r6 = r18
            r8 = r19
            boolean r0 = r3.centerInside
            if (r0 == 0) goto L_0x0233
            if (r5 == 0) goto L_0x0210
            float r0 = (float) r5
            float r2 = (float) r6
            goto L_0x0212
        L_0x0210:
            float r0 = (float) r7
            float r2 = (float) r8
        L_0x0212:
            float r0 = r0 / r2
            if (r7 == 0) goto L_0x0218
            float r2 = (float) r7
            float r3 = (float) r8
            goto L_0x021a
        L_0x0218:
            float r2 = (float) r5
            float r3 = (float) r6
        L_0x021a:
            float r2 = r2 / r3
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0220
            goto L_0x0221
        L_0x0220:
            r0 = r2
        L_0x0221:
            if (r15 == 0) goto L_0x022d
            if (r5 == 0) goto L_0x0227
            if (r6 > r5) goto L_0x022d
        L_0x0227:
            if (r7 == 0) goto L_0x022c
            if (r8 <= r7) goto L_0x022c
            goto L_0x022d
        L_0x022c:
            r1 = 0
        L_0x022d:
            if (r1 == 0) goto L_0x025c
            r10.preScale(r0, r0)
            goto L_0x025c
        L_0x0233:
            if (r5 != 0) goto L_0x0237
            if (r7 == 0) goto L_0x025c
        L_0x0237:
            if (r5 != r6) goto L_0x023b
            if (r7 == r8) goto L_0x025c
        L_0x023b:
            if (r5 == 0) goto L_0x0240
            float r0 = (float) r5
            float r2 = (float) r6
            goto L_0x0242
        L_0x0240:
            float r0 = (float) r7
            float r2 = (float) r8
        L_0x0242:
            float r0 = r0 / r2
            if (r7 == 0) goto L_0x0248
            float r2 = (float) r7
            float r3 = (float) r8
            goto L_0x024a
        L_0x0248:
            float r2 = (float) r5
            float r3 = (float) r6
        L_0x024a:
            float r2 = r2 / r3
            if (r15 == 0) goto L_0x0257
            if (r5 == 0) goto L_0x0251
            if (r6 > r5) goto L_0x0257
        L_0x0251:
            if (r7 == 0) goto L_0x0256
            if (r8 <= r7) goto L_0x0256
            goto L_0x0257
        L_0x0256:
            r1 = 0
        L_0x0257:
            if (r1 == 0) goto L_0x025c
            r10.preScale(r0, r2)
        L_0x025c:
            r9 = r8
            r7 = 0
            r8 = r6
            r6 = 0
        L_0x0260:
            r11 = 1
            r5 = r26
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r5, r6, r7, r8, r9, r10, r11)
            r1 = r26
            if (r0 == r1) goto L_0x026f
            r26.recycle()
            goto L_0x0270
        L_0x026f:
            r0 = r1
        L_0x0270:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.g(com.squareup.picasso.Request, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    public static void h(Request request) {
        Uri uri = request.uri;
        String valueOf = uri != null ? String.valueOf(uri.getPath()) : Integer.toHexString(request.resourceId);
        StringBuilder sb = (StringBuilder) f1644u.get();
        sb.ensureCapacity(valueOf.length() + 8);
        sb.replace(8, sb.length(), valueOf);
        Thread.currentThread().setName(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r2.f1660n;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r2 = this;
            e.b r0 = r2.f1657k
            r1 = 0
            if (r0 != 0) goto L_0x001a
            java.util.ArrayList r0 = r2.f1658l
            if (r0 == 0) goto L_0x000f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x001a
        L_0x000f:
            java.util.concurrent.Future r0 = r2.f1660n
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.cancel(r1)
            if (r0 == 0) goto L_0x001a
            r1 = 1
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.b():boolean");
    }

    public final void d(b bVar) {
        boolean z2;
        boolean z3 = true;
        if (this.f1657k == bVar) {
            this.f1657k = null;
            z2 = true;
        } else {
            ArrayList arrayList = this.f1658l;
            z2 = arrayList != null ? arrayList.remove(bVar) : false;
        }
        if (z2 && bVar.f1606b.priority == this.f1665s) {
            Picasso.Priority priority = Picasso.Priority.LOW;
            ArrayList arrayList2 = this.f1658l;
            boolean z4 = arrayList2 != null && !arrayList2.isEmpty();
            b bVar2 = this.f1657k;
            if (bVar2 == null && !z4) {
                z3 = false;
            }
            if (z3) {
                if (bVar2 != null) {
                    priority = bVar2.f1606b.priority;
                }
                if (z4) {
                    int size = this.f1658l.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        Picasso.Priority priority2 = ((b) this.f1658l.get(i2)).f1606b.priority;
                        if (priority2.ordinal() > priority.ordinal()) {
                            priority = priority2;
                        }
                    }
                }
            }
            this.f1665s = priority;
        }
        if (this.f1648b.f1549n) {
            o0.f("Hunter", "removed", bVar.f1606b.a(), o0.d(this, "from "));
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final android.graphics.Bitmap f() {
        /*
            r7 = this;
            int r0 = r7.f1654h
            boolean r0 = com.squareup.picasso.MemoryPolicy.a(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0034
            com.squareup.picasso.Cache r0 = r7.f1650d
            java.lang.String r2 = r7.f1652f
            android.graphics.Bitmap r0 = r0.get(r2)
            if (r0 == 0) goto L_0x0035
            e.l0 r2 = r7.f1651e
            e.n r2 = r2.f1681c
            r2.sendEmptyMessage(r1)
            com.squareup.picasso.Picasso$LoadedFrom r1 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY
            r7.f1661o = r1
            com.squareup.picasso.Picasso r1 = r7.f1648b
            boolean r1 = r1.f1549n
            if (r1 == 0) goto L_0x0033
            java.lang.String r1 = "Hunter"
            java.lang.String r2 = "decoded"
            com.squareup.picasso.Request r3 = r7.f1653g
            java.lang.String r3 = r3.a()
            java.lang.String r4 = "from cache"
            e.o0.f(r1, r2, r3, r4)
        L_0x0033:
            return r0
        L_0x0034:
            r0 = 0
        L_0x0035:
            int r2 = r7.f1664r
            if (r2 != 0) goto L_0x003e
            com.squareup.picasso.NetworkPolicy r2 = com.squareup.picasso.NetworkPolicy.OFFLINE
            int r2 = r2.f1530a
            goto L_0x0040
        L_0x003e:
            int r2 = r7.f1655i
        L_0x0040:
            r7.f1655i = r2
            com.squareup.picasso.RequestHandler r3 = r7.f1656j
            com.squareup.picasso.Request r4 = r7.f1653g
            com.squareup.picasso.RequestHandler$Result r2 = r3.load(r4, r2)
            if (r2 == 0) goto L_0x0072
            com.squareup.picasso.Picasso$LoadedFrom r0 = r2.getLoadedFrom()
            r7.f1661o = r0
            int r0 = r2.f1601d
            r7.f1663q = r0
            android.graphics.Bitmap r0 = r2.getBitmap()
            if (r0 != 0) goto L_0x0072
            okio.Source r0 = r2.getSource()
            com.squareup.picasso.Request r2 = r7.f1653g     // Catch:{ all -> 0x006d }
            android.graphics.Bitmap r2 = c(r0, r2)     // Catch:{ all -> 0x006d }
            r0.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x006b
        L_0x006a:
        L_0x006b:
            r0 = r2
            goto L_0x0072
        L_0x006d:
            r1 = move-exception
            r0.close()     // Catch:{ IOException -> 0x0071 }
        L_0x0071:
            throw r1
        L_0x0072:
            if (r0 == 0) goto L_0x014b
            com.squareup.picasso.Picasso r2 = r7.f1648b
            boolean r2 = r2.f1549n
            if (r2 == 0) goto L_0x0087
            java.lang.String r2 = "Hunter"
            java.lang.String r3 = "decoded"
            com.squareup.picasso.Request r4 = r7.f1653g
            java.lang.String r4 = r4.a()
            e.o0.e(r2, r3, r4)
        L_0x0087:
            e.l0 r2 = r7.f1651e
            r2.getClass()
            java.lang.StringBuilder r3 = e.o0.f1699a
            int r3 = r0.getAllocationByteCount()
            if (r3 < 0) goto L_0x0137
            e.n r2 = r2.f1681c
            r4 = 2
            android.os.Message r3 = r2.obtainMessage(r4, r3, r1)
            r2.sendMessage(r3)
            com.squareup.picasso.Request r2 = r7.f1653g
            boolean r3 = r2.b()
            r4 = 1
            if (r3 != 0) goto L_0x00b3
            java.util.List<com.squareup.picasso.Transformation> r2 = r2.transformations
            if (r2 == 0) goto L_0x00ad
            r2 = 1
            goto L_0x00ae
        L_0x00ad:
            r2 = 0
        L_0x00ae:
            if (r2 == 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r2 = 0
            goto L_0x00b4
        L_0x00b3:
            r2 = 1
        L_0x00b4:
            if (r2 != 0) goto L_0x00ba
            int r2 = r7.f1663q
            if (r2 == 0) goto L_0x014b
        L_0x00ba:
            java.lang.Object r2 = f1643t
            monitor-enter(r2)
            com.squareup.picasso.Request r3 = r7.f1653g     // Catch:{ all -> 0x0134 }
            boolean r3 = r3.b()     // Catch:{ all -> 0x0134 }
            if (r3 != 0) goto L_0x00c9
            int r3 = r7.f1663q     // Catch:{ all -> 0x0134 }
            if (r3 == 0) goto L_0x00e4
        L_0x00c9:
            com.squareup.picasso.Request r3 = r7.f1653g     // Catch:{ all -> 0x0134 }
            int r5 = r7.f1663q     // Catch:{ all -> 0x0134 }
            android.graphics.Bitmap r0 = g(r3, r0, r5)     // Catch:{ all -> 0x0134 }
            com.squareup.picasso.Picasso r3 = r7.f1648b     // Catch:{ all -> 0x0134 }
            boolean r3 = r3.f1549n     // Catch:{ all -> 0x0134 }
            if (r3 == 0) goto L_0x00e4
            java.lang.String r3 = "Hunter"
            java.lang.String r5 = "transformed"
            com.squareup.picasso.Request r6 = r7.f1653g     // Catch:{ all -> 0x0134 }
            java.lang.String r6 = r6.a()     // Catch:{ all -> 0x0134 }
            e.o0.e(r3, r5, r6)     // Catch:{ all -> 0x0134 }
        L_0x00e4:
            com.squareup.picasso.Request r3 = r7.f1653g     // Catch:{ all -> 0x0134 }
            java.util.List<com.squareup.picasso.Transformation> r3 = r3.transformations     // Catch:{ all -> 0x0134 }
            if (r3 == 0) goto L_0x00eb
            goto L_0x00ec
        L_0x00eb:
            r4 = 0
        L_0x00ec:
            if (r4 == 0) goto L_0x0107
            android.graphics.Bitmap r0 = a(r3, r0)     // Catch:{ all -> 0x0134 }
            com.squareup.picasso.Picasso r3 = r7.f1648b     // Catch:{ all -> 0x0134 }
            boolean r3 = r3.f1549n     // Catch:{ all -> 0x0134 }
            if (r3 == 0) goto L_0x0107
            java.lang.String r3 = "Hunter"
            java.lang.String r4 = "transformed"
            com.squareup.picasso.Request r5 = r7.f1653g     // Catch:{ all -> 0x0134 }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x0134 }
            java.lang.String r6 = "from custom transformations"
            e.o0.f(r3, r4, r5, r6)     // Catch:{ all -> 0x0134 }
        L_0x0107:
            monitor-exit(r2)     // Catch:{ all -> 0x0134 }
            if (r0 == 0) goto L_0x014b
            e.l0 r2 = r7.f1651e
            r2.getClass()
            int r3 = r0.getAllocationByteCount()
            if (r3 < 0) goto L_0x0120
            e.n r2 = r2.f1681c
            r4 = 3
            android.os.Message r1 = r2.obtainMessage(r4, r3, r1)
            r2.sendMessage(r1)
            goto L_0x014b
        L_0x0120:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Negative size: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0134:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0134 }
            throw r0
        L_0x0137:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Negative size: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x014b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.i.f():android.graphics.Bitmap");
    }

    public final void run() {
        q qVar;
        try {
            h(this.f1653g);
            if (this.f1648b.f1549n) {
                o0.e("Hunter", "executing", o0.c(this));
            }
            Bitmap f2 = f();
            this.f1659m = f2;
            if (f2 == null) {
                this.f1649c.c(this);
            } else {
                this.f1649c.b(this);
            }
        } catch (a0 e2) {
            if (!NetworkPolicy.isOfflineOnly(e2.f1604b) || e2.f1603a != 504) {
                this.f1662p = e2;
            }
            qVar = this.f1649c;
            qVar.c(this);
        } catch (IOException e3) {
            this.f1662p = e3;
            n nVar = this.f1649c.f1711i;
            nVar.sendMessageDelayed(nVar.obtainMessage(5, this), 500);
        } catch (OutOfMemoryError e4) {
            StringWriter stringWriter = new StringWriter();
            this.f1651e.a().dump(new PrintWriter(stringWriter));
            this.f1662p = new RuntimeException(stringWriter.toString(), e4);
        } catch (Exception e5) {
            this.f1662p = e5;
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
        Thread.currentThread().setName("Picasso-Idle");
        qVar = this.f1649c;
        qVar.c(this);
        Thread.currentThread().setName("Picasso-Idle");
    }
}
