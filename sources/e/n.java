package e;

import android.os.Handler;
import android.os.Looper;

/* compiled from: XFMFile */
public final class n extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1697a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f1698b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Looper looper, Object obj, int i2) {
        super(looper);
        this.f1697a = i2;
        this.f1698b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r2v40, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v54 */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x003c, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016e, code lost:
        if (r3 != 9) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x017a, code lost:
        if (r1 != 12) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0181, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMessage(android.os.Message r15) {
        /*
            r14 = this;
            int r0 = r14.f1697a
            r1 = 4
            r2 = 2
            r3 = 3
            switch(r0) {
                case 0: goto L_0x000b;
                default: goto L_0x0008;
            }
        L_0x0008:
            r0 = 1
            goto L_0x03cc
        L_0x000b:
            int r0 = r15.what
            r2 = 0
            java.lang.String r4 = "canceled"
            java.lang.String r5 = "Dispatcher"
            switch(r0) {
                case 1: goto L_0x03bf;
                case 2: goto L_0x0347;
                case 3: goto L_0x0015;
                case 4: goto L_0x0308;
                case 5: goto L_0x0242;
                case 6: goto L_0x0234;
                case 7: goto L_0x01ce;
                case 8: goto L_0x0015;
                case 9: goto L_0x0144;
                case 10: goto L_0x0139;
                case 11: goto L_0x006d;
                case 12: goto L_0x0022;
                default: goto L_0x0015;
            }
        L_0x0015:
            r0 = 1
            e.c0 r1 = com.squareup.picasso.Picasso.f1534p
            e.f r2 = new e.f
            r2.<init>(r14, r15, r0)
            r1.post(r2)
            goto L_0x03cb
        L_0x0022:
            java.lang.Object r15 = r15.obj
            java.lang.Object r0 = r14.f1698b
            e.q r0 = (e.q) r0
            java.util.LinkedHashSet r1 = r0.f1710h
            boolean r1 = r1.remove(r15)
            if (r1 != 0) goto L_0x0032
            goto L_0x03cb
        L_0x0032:
            java.util.WeakHashMap r1 = r0.f1709g
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x003c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x005e
            java.lang.Object r3 = r1.next()
            e.b r3 = (e.b) r3
            java.lang.Object r4 = r3.f1614j
            boolean r4 = r4.equals(r15)
            if (r4 == 0) goto L_0x003c
            if (r2 != 0) goto L_0x0057
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0057:
            r2.add(r3)
            r1.remove()
            goto L_0x003c
        L_0x005e:
            if (r2 == 0) goto L_0x03cb
            android.os.Handler r15 = r0.f1712j
            r0 = 13
            android.os.Message r0 = r15.obtainMessage(r0, r2)
            r15.sendMessage(r0)
            goto L_0x03cb
        L_0x006d:
            java.lang.Object r15 = r15.obj
            java.lang.Object r0 = r14.f1698b
            e.q r0 = (e.q) r0
            java.util.LinkedHashSet r1 = r0.f1710h
            boolean r1 = r1.add(r15)
            if (r1 != 0) goto L_0x007d
            goto L_0x03cb
        L_0x007d:
            java.util.LinkedHashMap r1 = r0.f1707e
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x0087:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x03cb
            java.lang.Object r2 = r1.next()
            e.i r2 = (e.i) r2
            com.squareup.picasso.Picasso r3 = r2.f1648b
            boolean r3 = r3.f1549n
            e.b r6 = r2.f1657k
            java.util.ArrayList r7 = r2.f1658l
            if (r7 == 0) goto L_0x00a5
            boolean r8 = r7.isEmpty()
            if (r8 != 0) goto L_0x00a5
            r8 = 1
            goto L_0x00a6
        L_0x00a5:
            r8 = 0
        L_0x00a6:
            if (r6 != 0) goto L_0x00ab
            if (r8 != 0) goto L_0x00ab
            goto L_0x0087
        L_0x00ab:
            java.lang.String r9 = "' was paused"
            java.lang.String r10 = "because tag '"
            java.lang.String r11 = "paused"
            if (r6 == 0) goto L_0x00e1
            java.lang.Object r12 = r6.f1614j
            boolean r12 = r12.equals(r15)
            if (r12 == 0) goto L_0x00e1
            r2.d(r6)
            java.util.WeakHashMap r12 = r0.f1709g
            java.lang.Object r13 = r6.d()
            r12.put(r13, r6)
            if (r3 == 0) goto L_0x00e1
            com.squareup.picasso.Request r6 = r6.f1606b
            java.lang.String r6 = r6.a()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r10)
            r12.append(r15)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            e.o0.f(r5, r11, r6, r12)
        L_0x00e1:
            if (r8 == 0) goto L_0x0123
            int r6 = r7.size()
            int r6 = r6 + -1
        L_0x00e9:
            if (r6 < 0) goto L_0x0123
            java.lang.Object r8 = r7.get(r6)
            e.b r8 = (e.b) r8
            java.lang.Object r12 = r8.f1614j
            boolean r12 = r12.equals(r15)
            if (r12 != 0) goto L_0x00fa
            goto L_0x0120
        L_0x00fa:
            r2.d(r8)
            java.util.WeakHashMap r12 = r0.f1709g
            java.lang.Object r13 = r8.d()
            r12.put(r13, r8)
            if (r3 == 0) goto L_0x0120
            com.squareup.picasso.Request r8 = r8.f1606b
            java.lang.String r8 = r8.a()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r10)
            r12.append(r15)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            e.o0.f(r5, r11, r8, r12)
        L_0x0120:
            int r6 = r6 + -1
            goto L_0x00e9
        L_0x0123:
            boolean r6 = r2.b()
            if (r6 == 0) goto L_0x0087
            r1.remove()
            if (r3 == 0) goto L_0x0087
            java.lang.String r2 = e.o0.c(r2)
            java.lang.String r3 = "all actions paused"
            e.o0.f(r5, r4, r2, r3)
            goto L_0x0087
        L_0x0139:
            java.lang.Object r0 = r14.f1698b
            e.q r0 = (e.q) r0
            int r15 = r15.arg1
            r0.getClass()
            goto L_0x03cb
        L_0x0144:
            java.lang.Object r15 = r15.obj
            android.net.NetworkInfo r15 = (android.net.NetworkInfo) r15
            java.lang.Object r0 = r14.f1698b
            e.q r0 = (e.q) r0
            java.util.concurrent.ExecutorService r2 = r0.f1705c
            boolean r4 = r2 instanceof e.g0
            if (r4 == 0) goto L_0x018f
            e.g0 r2 = (e.g0) r2
            if (r15 == 0) goto L_0x0189
            r2.getClass()
            boolean r4 = r15.isConnectedOrConnecting()
            if (r4 != 0) goto L_0x0160
            goto L_0x0189
        L_0x0160:
            int r3 = r15.getType()
            if (r3 == 0) goto L_0x0171
            r4 = 1
            if (r3 == r4) goto L_0x0182
            r4 = 6
            if (r3 == r4) goto L_0x0182
            r4 = 9
            if (r3 == r4) goto L_0x0182
            goto L_0x017f
        L_0x0171:
            int r1 = r15.getSubtype()
            switch(r1) {
                case 1: goto L_0x017d;
                case 2: goto L_0x017d;
                case 3: goto L_0x0181;
                case 4: goto L_0x0181;
                case 5: goto L_0x0181;
                case 6: goto L_0x0181;
                default: goto L_0x0178;
            }
        L_0x0178:
            r3 = 12
            if (r1 == r3) goto L_0x0181
            goto L_0x017f
        L_0x017d:
            r1 = 1
            goto L_0x0182
        L_0x017f:
            r1 = 3
            goto L_0x0182
        L_0x0181:
            r1 = 2
        L_0x0182:
            r2.setCorePoolSize(r1)
            r2.setMaximumPoolSize(r1)
            goto L_0x018f
        L_0x0189:
            r2.setCorePoolSize(r3)
            r2.setMaximumPoolSize(r3)
        L_0x018f:
            if (r15 == 0) goto L_0x03cb
            boolean r15 = r15.isConnected()
            if (r15 == 0) goto L_0x03cb
            java.util.WeakHashMap r15 = r0.f1708f
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x03cb
            java.util.WeakHashMap r15 = r0.f1708f
            java.util.Collection r15 = r15.values()
            java.util.Iterator r15 = r15.iterator()
        L_0x01a9:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x03cb
            java.lang.Object r1 = r15.next()
            e.b r1 = (e.b) r1
            r15.remove()
            com.squareup.picasso.Picasso r2 = r1.f1605a
            boolean r2 = r2.f1549n
            if (r2 == 0) goto L_0x01c9
            com.squareup.picasso.Request r2 = r1.f1606b
            java.lang.String r2 = r2.a()
            java.lang.String r3 = "replaying"
            e.o0.e(r5, r3, r2)
        L_0x01c9:
            r2 = 0
            r0.e(r1, r2)
            goto L_0x01a9
        L_0x01ce:
            java.lang.Object r15 = r14.f1698b
            e.q r15 = (e.q) r15
            r15.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.ArrayList r1 = r15.f1715m
            r0.<init>(r1)
            java.util.ArrayList r1 = r15.f1715m
            r1.clear()
            android.os.Handler r15 = r15.f1712j
            r1 = 8
            android.os.Message r1 = r15.obtainMessage(r1, r0)
            r15.sendMessage(r1)
            boolean r15 = r0.isEmpty()
            if (r15 == 0) goto L_0x01f4
            goto L_0x03cb
        L_0x01f4:
            r15 = 0
            java.lang.Object r15 = r0.get(r15)
            e.i r15 = (e.i) r15
            com.squareup.picasso.Picasso r15 = r15.f1648b
            boolean r15 = r15.f1549n
            if (r15 == 0) goto L_0x03cb
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x020a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0229
            java.lang.Object r1 = r0.next()
            e.i r1 = (e.i) r1
            int r2 = r15.length()
            if (r2 <= 0) goto L_0x0221
            java.lang.String r2 = ", "
            r15.append(r2)
        L_0x0221:
            java.lang.String r1 = e.o0.c(r1)
            r15.append(r1)
            goto L_0x020a
        L_0x0229:
            java.lang.String r15 = r15.toString()
            java.lang.String r0 = "delivered"
            e.o0.e(r5, r0, r15)
            goto L_0x03cb
        L_0x0234:
            java.lang.Object r15 = r15.obj
            e.i r15 = (e.i) r15
            java.lang.Object r0 = r14.f1698b
            e.q r0 = (e.q) r0
            r1 = 0
            r0.d(r15, r1)
            goto L_0x03cb
        L_0x0242:
            java.lang.Object r15 = r15.obj
            e.i r15 = (e.i) r15
            java.lang.Object r0 = r14.f1698b
            e.q r0 = (e.q) r0
            r0.getClass()
            java.util.concurrent.Future r1 = r15.f1660n
            if (r1 == 0) goto L_0x0259
            boolean r1 = r1.isCancelled()
            if (r1 == 0) goto L_0x0259
            r1 = 1
            goto L_0x025a
        L_0x0259:
            r1 = 0
        L_0x025a:
            if (r1 == 0) goto L_0x025e
            goto L_0x03cb
        L_0x025e:
            java.util.concurrent.ExecutorService r1 = r0.f1705c
            boolean r1 = r1.isShutdown()
            r3 = 0
            if (r1 == 0) goto L_0x026c
            r0.d(r15, r3)
            goto L_0x03cb
        L_0x026c:
            boolean r1 = r0.f1717o
            if (r1 == 0) goto L_0x0280
            android.content.Context r1 = r0.f1704b
            java.lang.StringBuilder r2 = e.o0.f1699a
            java.lang.String r2 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r2 = r1.getActiveNetworkInfo()
        L_0x0280:
            int r1 = r15.f1664r
            if (r1 <= 0) goto L_0x0286
            r3 = 1
            goto L_0x0287
        L_0x0286:
            r3 = 0
        L_0x0287:
            if (r3 != 0) goto L_0x028b
            r1 = 0
            goto L_0x0295
        L_0x028b:
            int r1 = r1 + -1
            r15.f1664r = r1
            com.squareup.picasso.RequestHandler r1 = r15.f1656j
            boolean r1 = r1.d(r2)
        L_0x0295:
            if (r1 == 0) goto L_0x02bf
            com.squareup.picasso.Picasso r1 = r15.f1648b
            boolean r1 = r1.f1549n
            if (r1 == 0) goto L_0x02a6
            java.lang.String r1 = "retrying"
            java.lang.String r2 = e.o0.c(r15)
            e.o0.e(r5, r1, r2)
        L_0x02a6:
            java.lang.Exception r1 = r15.f1662p
            boolean r1 = r1 instanceof e.z
            if (r1 == 0) goto L_0x02b5
            int r1 = r15.f1655i
            com.squareup.picasso.NetworkPolicy r2 = com.squareup.picasso.NetworkPolicy.NO_CACHE
            int r2 = r2.f1530a
            r1 = r1 | r2
            r15.f1655i = r1
        L_0x02b5:
            java.util.concurrent.ExecutorService r0 = r0.f1705c
            java.util.concurrent.Future r0 = r0.submit(r15)
            r15.f1660n = r0
            goto L_0x03cb
        L_0x02bf:
            boolean r1 = r0.f1717o
            if (r1 == 0) goto L_0x02ce
            com.squareup.picasso.RequestHandler r1 = r15.f1656j
            r1.getClass()
            boolean r1 = r1 instanceof e.b0
            if (r1 == 0) goto L_0x02ce
            r1 = 1
            goto L_0x02cf
        L_0x02ce:
            r1 = 0
        L_0x02cf:
            r0.d(r15, r1)
            if (r1 == 0) goto L_0x03cb
            e.b r1 = r15.f1657k
            if (r1 == 0) goto L_0x02e6
            java.lang.Object r2 = r1.d()
            if (r2 == 0) goto L_0x02e6
            r3 = 1
            r1.f1615k = r3
            java.util.WeakHashMap r3 = r0.f1708f
            r3.put(r2, r1)
        L_0x02e6:
            java.util.ArrayList r15 = r15.f1658l
            if (r15 == 0) goto L_0x03cb
            int r1 = r15.size()
            r2 = 0
        L_0x02ef:
            if (r2 >= r1) goto L_0x03cb
            java.lang.Object r3 = r15.get(r2)
            e.b r3 = (e.b) r3
            java.lang.Object r4 = r3.d()
            if (r4 == 0) goto L_0x0305
            r5 = 1
            r3.f1615k = r5
            java.util.WeakHashMap r5 = r0.f1708f
            r5.put(r4, r3)
        L_0x0305:
            int r2 = r2 + 1
            goto L_0x02ef
        L_0x0308:
            java.lang.Object r15 = r15.obj
            e.i r15 = (e.i) r15
            java.lang.Object r0 = r14.f1698b
            e.q r0 = (e.q) r0
            r0.getClass()
            int r1 = r15.f1654h
            com.squareup.picasso.MemoryPolicy r2 = com.squareup.picasso.MemoryPolicy.NO_STORE
            int r2 = r2.f1528a
            r1 = r1 & r2
            if (r1 != 0) goto L_0x031e
            r1 = 1
            goto L_0x031f
        L_0x031e:
            r1 = 0
        L_0x031f:
            if (r1 == 0) goto L_0x032a
            com.squareup.picasso.Cache r1 = r0.f1713k
            java.lang.String r2 = r15.f1652f
            android.graphics.Bitmap r3 = r15.f1659m
            r1.set(r2, r3)
        L_0x032a:
            java.util.LinkedHashMap r1 = r0.f1707e
            java.lang.String r2 = r15.f1652f
            r1.remove(r2)
            r0.a(r15)
            com.squareup.picasso.Picasso r0 = r15.f1648b
            boolean r0 = r0.f1549n
            if (r0 == 0) goto L_0x03cb
            java.lang.String r15 = e.o0.c(r15)
            java.lang.String r0 = "for completion"
            java.lang.String r1 = "batched"
            e.o0.f(r5, r1, r15, r0)
            goto L_0x03cb
        L_0x0347:
            java.lang.Object r15 = r15.obj
            e.b r15 = (e.b) r15
            java.lang.Object r0 = r14.f1698b
            e.q r0 = (e.q) r0
            r0.getClass()
            java.lang.String r1 = r15.f1613i
            java.util.LinkedHashMap r2 = r0.f1707e
            java.lang.Object r2 = r2.get(r1)
            e.i r2 = (e.i) r2
            if (r2 == 0) goto L_0x037b
            r2.d(r15)
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x037b
            java.util.LinkedHashMap r2 = r0.f1707e
            r2.remove(r1)
            com.squareup.picasso.Picasso r1 = r15.f1605a
            boolean r1 = r1.f1549n
            if (r1 == 0) goto L_0x037b
            com.squareup.picasso.Request r1 = r15.f1606b
            java.lang.String r1 = r1.a()
            e.o0.e(r5, r4, r1)
        L_0x037b:
            java.util.LinkedHashSet r1 = r0.f1710h
            java.lang.Object r2 = r15.f1614j
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x039f
            java.util.WeakHashMap r1 = r0.f1709g
            java.lang.Object r2 = r15.d()
            r1.remove(r2)
            com.squareup.picasso.Picasso r1 = r15.f1605a
            boolean r1 = r1.f1549n
            if (r1 == 0) goto L_0x039f
            com.squareup.picasso.Request r1 = r15.f1606b
            java.lang.String r1 = r1.a()
            java.lang.String r2 = "because paused request got canceled"
            e.o0.f(r5, r4, r1, r2)
        L_0x039f:
            java.util.WeakHashMap r0 = r0.f1708f
            java.lang.Object r15 = r15.d()
            java.lang.Object r15 = r0.remove(r15)
            e.b r15 = (e.b) r15
            if (r15 == 0) goto L_0x03cb
            com.squareup.picasso.Picasso r0 = r15.f1605a
            boolean r0 = r0.f1549n
            if (r0 == 0) goto L_0x03cb
            com.squareup.picasso.Request r15 = r15.f1606b
            java.lang.String r15 = r15.a()
            java.lang.String r0 = "from replaying"
            e.o0.f(r5, r4, r15, r0)
            goto L_0x03cb
        L_0x03bf:
            java.lang.Object r15 = r15.obj
            e.b r15 = (e.b) r15
            java.lang.Object r0 = r14.f1698b
            e.q r0 = (e.q) r0
            r1 = 1
            r0.e(r15, r1)
        L_0x03cb:
            return
        L_0x03cc:
            int r4 = r15.what
            java.lang.Object r5 = r14.f1698b
            r6 = 1
            if (r4 == 0) goto L_0x0437
            if (r4 == r0) goto L_0x042f
            if (r4 == r2) goto L_0x041a
            if (r4 == r3) goto L_0x0403
            if (r4 == r1) goto L_0x03e7
            e.c0 r0 = com.squareup.picasso.Picasso.f1534p
            e.f r1 = new e.f
            r1.<init>(r14, r15, r3)
            r0.post(r1)
            goto L_0x043e
        L_0x03e7:
            e.l0 r5 = (e.l0) r5
            java.lang.Object r15 = r15.obj
            java.lang.Long r15 = (java.lang.Long) r15
            int r0 = r5.f1690l
            int r0 = r0 + 1
            r5.f1690l = r0
            long r0 = r5.f1684f
            long r2 = r15.longValue()
            long r2 = r2 + r0
            r5.f1684f = r2
            int r15 = r5.f1690l
            long r0 = (long) r15
            long r2 = r2 / r0
            r5.f1687i = r2
            goto L_0x043e
        L_0x0403:
            e.l0 r5 = (e.l0) r5
            int r15 = r15.arg1
            long r0 = (long) r15
            int r15 = r5.f1692n
            int r15 = r15 + 1
            r5.f1692n = r15
            long r2 = r5.f1686h
            long r2 = r2 + r0
            r5.f1686h = r2
            int r15 = r5.f1691m
            long r0 = (long) r15
            long r2 = r2 / r0
            r5.f1689k = r2
            goto L_0x043e
        L_0x041a:
            e.l0 r5 = (e.l0) r5
            int r15 = r15.arg1
            long r0 = (long) r15
            int r15 = r5.f1691m
            int r15 = r15 + 1
            r5.f1691m = r15
            long r2 = r5.f1685g
            long r2 = r2 + r0
            r5.f1685g = r2
            long r0 = (long) r15
            long r2 = r2 / r0
            r5.f1688j = r2
            goto L_0x043e
        L_0x042f:
            e.l0 r5 = (e.l0) r5
            long r0 = r5.f1683e
            long r0 = r0 + r6
            r5.f1683e = r0
            goto L_0x043e
        L_0x0437:
            e.l0 r5 = (e.l0) r5
            long r0 = r5.f1682d
            long r0 = r0 + r6
            r5.f1682d = r0
        L_0x043e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.n.handleMessage(android.os.Message):void");
    }
}
