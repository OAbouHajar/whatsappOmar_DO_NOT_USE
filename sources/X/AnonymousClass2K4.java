package X;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: X.2K4  reason: invalid class name */
public class AnonymousClass2K4 extends C16690tT implements LocationListener {
    public int A00 = 0;
    public int A01 = 15;
    public Location A02 = null;
    public Location A03 = null;
    public Location A04;
    public boolean A05;
    public final AnonymousClass12E A06;
    public final C16300so A07;
    public final AnonymousClass16R A08;
    public final C17130ua A09;
    public final C16440t3 A0A;
    public final C16260sj A0B;
    public final C16460t6 A0C;
    public final C19150xq A0D;
    public final AnonymousClass16V A0E;
    public final C19950zG A0F;
    public final C19430yQ A0G;
    public final C30901d9 A0H;

    public AnonymousClass2K4(AnonymousClass12E r7, C16300so r8, AnonymousClass16R r9, C17130ua r10, C16440t3 r11, C16260sj r12, C16460t6 r13, C19150xq r14, AnonymousClass16V r15, C19950zG r16, C19430yQ r17, C30901d9 r18) {
        this.A0A = r11;
        this.A09 = r10;
        C30901d9 r3 = r18;
        this.A0H = r3;
        this.A07 = r8;
        this.A0C = r13;
        this.A0D = r14;
        this.A0F = r16;
        this.A0B = r12;
        this.A0E = r15;
        this.A0G = r17;
        this.A06 = r7;
        if (r3.A00 == 0.0d || r3.A01 == 0.0d) {
            this.A08 = r9;
            return;
        }
        Location location = new Location("");
        this.A04 = location;
        location.setLatitude(r3.A00);
        this.A04.setLongitude(r3.A01);
        this.A04.setTime(r3.A0I);
        this.A05 = true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:38|39|40|41) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:29|30|(0)|34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x010d, code lost:
        if (r11 == null) goto L_0x0114;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00f2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00f8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:83:0x0192 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:88:0x0197 */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ef A[SYNTHETIC, Splitter:B:32:0x00ef] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x00f8=Splitter:B:40:0x00f8, B:23:0x00de=Splitter:B:23:0x00de} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:74:0x0182=Splitter:B:74:0x0182, B:88:0x0197=Splitter:B:88:0x0197} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A03(X.C17130ua r17, X.C19950zG r18, double r19, double r21, int r23) {
        /*
            r9 = 100
            java.lang.String r6 = "bad bitmap received"
            java.lang.String r5 = "MapDownload/downloadMapThumbnailBitmap/error "
            r3 = 170(0xaa, float:2.38E-43)
            java.lang.String r0 = "https://maps.googleapis.com/maps/api/staticmap?center="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            r7 = r19
            r4.append(r7)
            java.lang.String r12 = ","
            r4.append(r12)
            r0 = r21
            r4.append(r0)
            java.lang.String r2 = "&zoom="
            r4.append(r2)
            r2 = 1
            r10 = r23
            int r10 = java.lang.Math.max(r2, r10)
            r2 = 21
            int r13 = java.lang.Math.min(r2, r10)
            r4.append(r13)
            java.lang.String r2 = "&size="
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = "x"
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = "&sensor=true&format=png8&mobile=true&markers=color:red%7Csize:mid%7C"
            r4.append(r2)
            r4.append(r7)
            r4.append(r12)
            r4.append(r0)
            java.lang.String r2 = "&client=gme-whatsappinc"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00a6 }
            r2.<init>(r4)     // Catch:{ MalformedURLException -> 0x00a6 }
            java.lang.String r15 = r2.getFile()     // Catch:{ MalformedURLException -> 0x00a6 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r4)
            java.lang.String r2 = "&signature="
            r10.append(r2)
            java.lang.String r11 = X.AnonymousClass021.A0H
            r4 = 45
            r2 = 43
            java.lang.String r11 = r11.replace(r4, r2)
            r4 = 95
            r2 = 47
            java.lang.String r2 = r11.replace(r4, r2)
            r14 = 0
            byte[] r11 = android.util.Base64.decode(r2, r14)
            r2 = 1
            byte[][] r4 = new byte[r2][]
            byte[] r2 = r15.getBytes()
            r4[r14] = r2
            byte[] r4 = X.C004101u.A0I(r11, r4)
            r2 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r4, r2)
            java.lang.String r2 = X.AnonymousClass1ZW.A0C(r2)
            r10.append(r2)
            java.lang.String r14 = r10.toString()
            goto L_0x00a7
        L_0x00a6:
            r14 = 0
        L_0x00a7:
            r2 = 24
            r11 = 0
            r16 = 0
            r4 = r18
            r10 = r17
            X.1pl r15 = r4.AFY(r14)     // Catch:{ IOException -> 0x00fe, all -> 0x00fb }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00f3 }
            java.io.InputStream r14 = r15.A9k(r10, r11, r2)     // Catch:{ all -> 0x00f3 }
            android.graphics.BitmapFactory$Options r2 = X.C17970vw.A02     // Catch:{ all -> 0x00e8 }
            android.graphics.Bitmap r11 = android.graphics.BitmapFactory.decodeStream(r14, r11, r2)     // Catch:{ all -> 0x00e8 }
            if (r11 == 0) goto L_0x00e2
            int r2 = r11.getWidth()     // Catch:{ all -> 0x00e8 }
            if (r2 != r3) goto L_0x00e2
            int r2 = r11.getHeight()     // Catch:{ all -> 0x00e8 }
            if (r2 != r3) goto L_0x00e2
            r2 = 35
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r11, r2, r2, r9, r9)     // Catch:{ all -> 0x00e8 }
            if (r14 == 0) goto L_0x00de
            r14.close()     // Catch:{ all -> 0x00dc }
            goto L_0x00de
        L_0x00dc:
            r2 = move-exception
            goto L_0x00f5
        L_0x00de:
            r15.close()     // Catch:{ IOException -> 0x00f9 }
            goto L_0x010f
        L_0x00e2:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x00ea }
            r2.<init>(r6)     // Catch:{ all -> 0x00ea }
            throw r2     // Catch:{ all -> 0x00ea }
        L_0x00e8:
            r2 = move-exception
            goto L_0x00ed
        L_0x00ea:
            r2 = move-exception
            r16 = 1
        L_0x00ed:
            if (r14 == 0) goto L_0x00f2
            r14.close()     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            throw r2     // Catch:{ all -> 0x00f3 }
        L_0x00f3:
            r2 = move-exception
            r3 = 0
        L_0x00f5:
            r15.close()     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            throw r2     // Catch:{ IOException -> 0x00f9 }
        L_0x00f9:
            r2 = move-exception
            goto L_0x0100
        L_0x00fb:
            r0 = move-exception
            r3 = 0
            goto L_0x0105
        L_0x00fe:
            r2 = move-exception
            r3 = 0
        L_0x0100:
            com.whatsapp.util.Log.w(r5, r2)     // Catch:{ all -> 0x0104 }
            goto L_0x010d
        L_0x0104:
            r0 = move-exception
        L_0x0105:
            if (r11 == 0) goto L_0x010c
            if (r11 == r3) goto L_0x010c
            r11.recycle()
        L_0x010c:
            throw r0
        L_0x010d:
            if (r11 == 0) goto L_0x0114
        L_0x010f:
            if (r11 == r3) goto L_0x0114
            r11.recycle()
        L_0x0114:
            if (r3 != 0) goto L_0x019c
            if (r16 == 0) goto L_0x019c
            java.lang.String r2 = "https://dev.virtualearth.net/REST/v1/Imagery/Map/Road/"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r2)
            r11.append(r7)
            r11.append(r12)
            r11.append(r0)
            java.lang.String r2 = "/"
            r11.append(r2)
            r11.append(r13)
            java.lang.String r2 = "?mapSize="
            r11.append(r2)
            r11.append(r9)
            r11.append(r12)
            r11.append(r9)
            java.lang.String r2 = "&pp="
            r11.append(r2)
            r11.append(r7)
            r11.append(r12)
            r11.append(r0)
            java.lang.String r0 = ";54;&key="
            r11.append(r0)
            java.lang.String r0 = X.AnonymousClass021.A05
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            X.1pl r4 = r4.AFY(r0)     // Catch:{ IOException -> 0x0198 }
            r0 = 24
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0193 }
            r2 = 0
            java.io.InputStream r1 = r4.A9k(r10, r2, r0)     // Catch:{ all -> 0x0193 }
            android.graphics.BitmapFactory$Options r0 = X.C17970vw.A02     // Catch:{ all -> 0x018c }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r1, r2, r0)     // Catch:{ all -> 0x018c }
            if (r3 == 0) goto L_0x0186
            int r0 = r3.getWidth()     // Catch:{ all -> 0x018c }
            if (r0 != r9) goto L_0x0186
            int r0 = r3.getHeight()     // Catch:{ all -> 0x018c }
            if (r0 != r9) goto L_0x0186
            if (r1 == 0) goto L_0x0182
            r1.close()     // Catch:{ all -> 0x0193 }
        L_0x0182:
            r4.close()     // Catch:{ IOException -> 0x0198 }
            goto L_0x019c
        L_0x0186:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x018c }
            r0.<init>(r6)     // Catch:{ all -> 0x018c }
            throw r0     // Catch:{ all -> 0x018c }
        L_0x018c:
            r0 = move-exception
            if (r1 == 0) goto L_0x0192
            r1.close()     // Catch:{ all -> 0x0192 }
        L_0x0192:
            throw r0     // Catch:{ all -> 0x0193 }
        L_0x0193:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0197 }
        L_0x0197:
            throw r0     // Catch:{ IOException -> 0x0198 }
        L_0x0198:
            r0 = move-exception
            com.whatsapp.util.Log.w(r5, r0)
        L_0x019c:
            if (r3 == 0) goto L_0x01b5
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r0 = 80
            r3.compress(r1, r0, r2)
            byte[] r0 = r2.toByteArray()
            r2.close()     // Catch:{ IOException -> 0x01b1 }
        L_0x01b1:
            r3.recycle()
            return r0
        L_0x01b5:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2K4.A03(X.0ua, X.0zG, double, double, int):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        r8.A04 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r9) {
        /*
            r8 = this;
            android.location.Location r0 = r8.A04
            if (r0 != 0) goto L_0x0047
            X.16R r0 = r8.A08
            if (r0 == 0) goto L_0x006f
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x006f
            X.0sj r0 = r8.A0B
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x006f
            r2 = 0
        L_0x0017:
            boolean r0 = r8.A05
            if (r0 != 0) goto L_0x0027
            r0 = 40
            if (r2 >= r0) goto L_0x002a
            r0 = 250(0xfa, double:1.235E-321)
            android.os.SystemClock.sleep(r0)
            int r2 = r2 + 1
            goto L_0x0017
        L_0x0027:
            android.location.Location r0 = r8.A03
            goto L_0x0045
        L_0x002a:
            android.location.Location r2 = r8.A02
            if (r2 == 0) goto L_0x006a
            java.lang.String r0 = "MapDownload/doInBackground/using coarseLocation "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            float r0 = r2.getAccuracy()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.location.Location r0 = r8.A02
        L_0x0045:
            r8.A04 = r0
        L_0x0047:
            X.0zG r2 = r8.A0F
            X.0ua r1 = r8.A09
            double r3 = r0.getLatitude()
            android.location.Location r0 = r8.A04
            double r5 = r0.getLongitude()
            int r7 = r8.A01
            byte[] r1 = A03(r1, r2, r3, r5, r7)
            X.1d9 r0 = r8.A0H
            X.0tm r0 = r0.A0F()
            X.AnonymousClass00B.A06(r0)
            r0.A02(r1)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x006a:
            java.lang.String r0 = "MapDownload/doInBackground/failed to get location"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x006f:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2K4.A08(java.lang.Object[]):java.lang.Object");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r25) {
        /*
            r24 = this;
            r0 = r25
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r3 = r0.booleanValue()
            r5 = 2
            r2 = r24
            X.1d9 r4 = r2.A0H
            if (r3 == 0) goto L_0x009a
            r4.A02 = r5
            android.location.Location r0 = r2.A04
            double r0 = r0.getLatitude()
            r4.A00 = r0
            android.location.Location r0 = r2.A04
            double r0 = r0.getLongitude()
            r4.A01 = r0
        L_0x0021:
            boolean r0 = r4 instanceof X.C38841rV
            if (r0 == 0) goto L_0x009e
            X.0t3 r0 = r2.A0A
            long r9 = r0.A00()
            long r6 = r4.A0I
            r8 = r4
            X.1rV r8 = (X.C38841rV) r8
            int r0 = r8.A00
            int r0 = r0 * 1000
            long r0 = (long) r0
            long r6 = r6 + r0
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0115
            if (r3 == 0) goto L_0x00a1
            android.location.Location r0 = r2.A04
            r23 = r0
            X.1Vw r12 = r8.A11
            X.0rv r3 = r12.A00
            boolean r0 = r3 instanceof X.C16060sN
            if (r0 == 0) goto L_0x0098
            X.0so r1 = r2.A07
            X.16V r0 = r2.A0E
            java.util.Set r0 = r0.A00(r12)
            java.util.Set r9 = X.C16030sJ.A0A(r1, r0)
        L_0x0054:
            X.0yQ r5 = r2.A0G
            java.lang.String r1 = "LocationSharingManager/setShareLocation; message.key="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r11 = "; expiration="
            r0.append(r11)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            boolean r0 = X.C16030sJ.A0L(r3)
            if (r0 == 0) goto L_0x00f9
            if (r9 == 0) goto L_0x012a
            java.util.Iterator r9 = r9.iterator()
        L_0x0080:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x012a
            java.lang.Object r1 = r9.next()
            X.0rv r1 = (X.C15830rv) r1
            X.0sK r0 = r5.A09
            boolean r0 = r0.A0I(r1)
            if (r0 != 0) goto L_0x0080
            r13.add(r1)
            goto L_0x0080
        L_0x0098:
            r9 = 0
            goto L_0x0054
        L_0x009a:
            r0 = 0
            r4.A02 = r0
            goto L_0x0021
        L_0x009e:
            if (r3 == 0) goto L_0x00a1
            goto L_0x0115
        L_0x00a1:
            X.0xq r0 = r2.A0D
            r10 = -1
            r0.A08(r4, r10)
            X.16R r1 = r2.A08
            if (r1 == 0) goto L_0x011b
            X.12E r0 = r2.A06
            X.1yO r3 = r0.A00()
            X.0sj r6 = r2.A0B
            boolean r0 = r6.A05()
            if (r0 != 0) goto L_0x00d6
            X.1Vw r0 = r4.A11
            X.0rv r0 = r0.A00
            boolean r0 = r3.A01(r0)
            if (r0 == 0) goto L_0x011b
            X.1yP r5 = r3.A00()
            android.app.Activity r5 = (android.app.Activity) r5
            r8 = 2131890640(0x7f1211d0, float:1.9415978E38)
            r9 = 2131890639(0x7f1211cf, float:1.9415975E38)
            java.lang.String[] r7 = X.AnonymousClass1GE.A07
            r11 = 0
            com.obwhatsapp.RequestPermissionActivity.A0U(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x011b
        L_0x00d6:
            boolean r0 = r1.A07()
            if (r0 != 0) goto L_0x011b
            X.1Vw r0 = r4.A11
            X.0rv r1 = r0.A00
            boolean r0 = r3.A01(r1)
            if (r0 == 0) goto L_0x00f0
            X.1yP r0 = r3.A00()
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass29T.A01(r0, r5)
            goto L_0x011b
        L_0x00f0:
            java.util.ArrayList r0 = X.AnonymousClass4B0.A01
            X.AnonymousClass00B.A06(r1)
            r0.add(r1)
            goto L_0x011b
        L_0x00f9:
            boolean r0 = X.C16030sJ.A0G(r3)
            if (r0 == 0) goto L_0x0123
            java.lang.String r1 = "LocationSharingManager/setShareLocation/can't share location with broadcast remote_resource; messageKey="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0110:
            r0 = r23
            r5.A0N(r0)
        L_0x0115:
            X.0t6 r1 = r2.A0C
            r0 = 4
            r1.A0e(r4, r0)
        L_0x011b:
            X.16R r0 = r2.A08
            if (r0 == 0) goto L_0x0122
            r0.A04(r2)
        L_0x0122:
            return
        L_0x0123:
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r3)
            r13.add(r0)
        L_0x012a:
            java.lang.Object r9 = r5.A0S
            monitor-enter(r9)
            java.util.Map r10 = r5.A0A()     // Catch:{ all -> 0x0220 }
            java.lang.Object r1 = r10.get(r3)     // Catch:{ all -> 0x0220 }
            X.28s r1 = (X.C454628s) r1     // Catch:{ all -> 0x0220 }
            if (r1 == 0) goto L_0x0172
            X.1Vw r14 = r1.A02     // Catch:{ all -> 0x0220 }
            boolean r0 = r14.equals(r12)     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x0157
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0220 }
            r1.<init>()     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = "LocationSharingManager/setShareLocation/already enabled for this message; messageKey="
            r1.append(r0)     // Catch:{ all -> 0x0220 }
            r1.append(r12)     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0220 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0220 }
            monitor-exit(r9)     // Catch:{ all -> 0x0220 }
            goto L_0x0110
        L_0x0157:
            r10.remove(r3)     // Catch:{ all -> 0x0220 }
            X.1rV r0 = r5.A06(r14)     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x0163
            r5.A0W(r0)     // Catch:{ all -> 0x0220 }
        L_0x0163:
            X.1Rv r15 = r5.A0N     // Catch:{ all -> 0x0220 }
            java.util.List r14 = java.util.Collections.singletonList(r1)     // Catch:{ all -> 0x0220 }
            X.0t3 r0 = r5.A0G     // Catch:{ all -> 0x0220 }
            long r0 = r0.A00()     // Catch:{ all -> 0x0220 }
            r15.A06(r14, r0)     // Catch:{ all -> 0x0220 }
        L_0x0172:
            long r0 = r5.A02()     // Catch:{ all -> 0x0220 }
            r8.A01 = r0     // Catch:{ all -> 0x0220 }
            X.28s r0 = new X.28s     // Catch:{ all -> 0x0220 }
            r0.<init>(r12, r13, r6)     // Catch:{ all -> 0x0220 }
            r10.put(r3, r0)     // Catch:{ all -> 0x0220 }
            X.1Rv r15 = r5.A0N     // Catch:{ all -> 0x0220 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x0220 }
            java.lang.String r14 = r12.A01     // Catch:{ all -> 0x0220 }
            int r0 = r13.size()     // Catch:{ all -> 0x0220 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0220 }
            r10.<init>(r0)     // Catch:{ all -> 0x0220 }
            java.util.Iterator r16 = r13.iterator()     // Catch:{ all -> 0x0220 }
        L_0x0194:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r13 = r16.next()     // Catch:{ all -> 0x0220 }
            X.AnonymousClass00B.A06(r13)     // Catch:{ all -> 0x0220 }
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13     // Catch:{ all -> 0x0220 }
            r0 = 1
            X.1Vw r1 = new X.1Vw     // Catch:{ all -> 0x0220 }
            r1.<init>(r3, r14, r0)     // Catch:{ all -> 0x0220 }
            X.28r r0 = new X.28r     // Catch:{ all -> 0x0220 }
            r19 = r13
            r20 = r1
            r21 = r6
            r17 = r0
            r18 = r3
            r17.<init>(r18, r19, r20, r21)     // Catch:{ all -> 0x0220 }
            r10.add(r0)     // Catch:{ all -> 0x0220 }
            goto L_0x0194
        L_0x01bc:
            r15.A07(r10)     // Catch:{ all -> 0x0220 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0220 }
            r10.<init>()     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = "LocationSharingManager/setShareLocation; saved sharing; message.key="
            r10.append(r0)     // Catch:{ all -> 0x0220 }
            r10.append(r12)     // Catch:{ all -> 0x0220 }
            r10.append(r11)     // Catch:{ all -> 0x0220 }
            r10.append(r6)     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = "; sequenceNumber="
            r10.append(r0)     // Catch:{ all -> 0x0220 }
            long r0 = r8.A01     // Catch:{ all -> 0x0220 }
            r10.append(r0)     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x0220 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0220 }
            monitor-exit(r9)     // Catch:{ all -> 0x0220 }
            X.01D r0 = r5.A0d
            java.lang.Object r0 = r0.get()
            X.0t6 r0 = (X.C16460t6) r0
            r0.A0a(r8)
            r5.A0M()
            X.0tz r0 = r5.A0H
            android.content.Context r0 = r0.A00
            com.obwhatsapp.location.LocationSharingService.A01(r0, r5)
            java.util.List r0 = r5.A0W
            java.util.Iterator r1 = r0.iterator()
        L_0x01ff:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0212
            java.lang.Object r0 = r1.next()
            X.28t r0 = (X.C454728t) r0
            X.AnonymousClass00B.A06(r3)
            r0.AXX(r3)
            goto L_0x01ff
        L_0x0212:
            android.os.Handler r3 = r5.A08
            r1 = 18
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r0 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r0.<init>(r5, r1, r8)
            r3.post(r0)
            goto L_0x0110
        L_0x0220:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0220 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2K4.A0A(java.lang.Object):void");
    }

    public void onLocationChanged(Location location) {
        System.currentTimeMillis();
        location.getTime();
        location.getAccuracy();
        if (AnonymousClass1GE.A01(location, this.A02)) {
            this.A02 = location;
        }
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 >= 2 || location.getAccuracy() < 80.0f) {
            this.A03 = location;
            this.A05 = true;
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}
