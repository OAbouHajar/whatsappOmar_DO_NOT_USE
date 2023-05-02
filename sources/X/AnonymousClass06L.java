package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.06L  reason: invalid class name */
public final class AnonymousClass06L {
    public static AnonymousClass06L A07;
    public static final PorterDuff.Mode A08 = PorterDuff.Mode.SRC_IN;
    public static final AnonymousClass06M A09 = new AnonymousClass06M();
    public TypedValue A00;
    public AnonymousClass06T A01;
    public AnonymousClass00O A02;
    public AnonymousClass07U A03;
    public WeakHashMap A04;
    public boolean A05;
    public final WeakHashMap A06 = new WeakHashMap(0);

    public static synchronized PorterDuffColorFilter A00(PorterDuff.Mode mode, int i2) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (AnonymousClass06L.class) {
            AnonymousClass06M r3 = A09;
            int i3 = (i2 + 31) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) r3.A02(Integer.valueOf(mode.hashCode() + i3));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i2, mode);
                r3.A06(Integer.valueOf(i3 + mode.hashCode()), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static Drawable A01(Context context, int i2) {
        return A02().A05(context, i2);
    }

    public static synchronized AnonymousClass06L A02() {
        AnonymousClass06L r0;
        synchronized (AnonymousClass06L.class) {
            if (A07 == null) {
                AnonymousClass06L r2 = new AnonymousClass06L();
                A07 = r2;
                if (Build.VERSION.SDK_INT < 24) {
                    r2.A09(new AnonymousClass06N(), "vector");
                    r2.A09(new AnonymousClass06P(), "animated-vector");
                    r2.A09(new AnonymousClass06Q(), "animated-selector");
                    r2.A09(new AnonymousClass06R(), "drawable");
                }
            }
            r0 = A07;
        }
        return r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(android.graphics.drawable.Drawable r3, X.AnonymousClass08Y r4, int[] r5) {
        /*
            boolean r0 = X.C015307j.A03(r3)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r0 = r3.mutate()
            if (r0 == r3) goto L_0x0014
            java.lang.String r1 = "ResourceManagerInternal"
            java.lang.String r0 = "Mutated drawable is not the same instance as the input."
            android.util.Log.d(r1, r0)
        L_0x0013:
            return
        L_0x0014:
            boolean r0 = r4.A02
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x0042
            r2 = 0
        L_0x001d:
            boolean r0 = r4.A03
            if (r0 == 0) goto L_0x003f
            android.graphics.PorterDuff$Mode r1 = r4.A01
        L_0x0023:
            if (r2 == 0) goto L_0x003d
            if (r1 == 0) goto L_0x003d
            r0 = 0
            int r0 = r2.getColorForState(r5, r0)
            android.graphics.PorterDuffColorFilter r0 = A00(r1, r0)
        L_0x0030:
            r3.setColorFilter(r0)
        L_0x0033:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 > r0) goto L_0x0013
            r3.invalidateSelf()
            return
        L_0x003d:
            r0 = 0
            goto L_0x0030
        L_0x003f:
            android.graphics.PorterDuff$Mode r1 = A08
            goto L_0x0023
        L_0x0042:
            r3.clearColorFilter()
            goto L_0x0033
        L_0x0046:
            android.content.res.ColorStateList r2 = r4.A00
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06L.A03(android.graphics.drawable.Drawable, X.08Y, int[]):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.content.res.ColorStateList A04(android.content.Context r9, int r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.WeakHashMap r0 = r8.A04     // Catch:{ all -> 0x011e }
            r3 = 0
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x011e }
            X.07U r0 = (X.AnonymousClass07U) r0     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x0014
            java.lang.Object r3 = r0.A01(r10)     // Catch:{ all -> 0x011e }
            android.content.res.ColorStateList r3 = (android.content.res.ColorStateList) r3     // Catch:{ all -> 0x011e }
        L_0x0014:
            if (r3 != 0) goto L_0x011c
            X.06T r2 = r8.A01     // Catch:{ all -> 0x011e }
            if (r2 == 0) goto L_0x00f9
            X.06S r2 = (X.AnonymousClass06S) r2     // Catch:{ all -> 0x011e }
            r0 = 2131230786(0x7f080042, float:1.8077635E38)
            r1 = 2131099669(0x7f060015, float:1.7811698E38)
            if (r10 == r0) goto L_0x00f4
            r0 = 2131230832(0x7f080070, float:1.8077728E38)
            r1 = 2131099672(0x7f060018, float:1.7811704E38)
            if (r10 == r0) goto L_0x00f4
            r0 = 2131230831(0x7f08006f, float:1.8077726E38)
            if (r10 != r0) goto L_0x0092
            r0 = 3
            int[][] r2 = new int[r0][]     // Catch:{ all -> 0x011e }
            int[] r1 = new int[r0]     // Catch:{ all -> 0x011e }
            r6 = 2130968820(0x7f0400f4, float:1.7546304E38)
            android.content.res.ColorStateList r5 = X.AnonymousClass08P.A02(r9, r6)     // Catch:{ all -> 0x011e }
            r7 = 2
            r4 = 1
            r3 = 0
            if (r5 == 0) goto L_0x0072
            boolean r0 = r5.isStateful()     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x0072
            int[] r0 = X.AnonymousClass08P.A02     // Catch:{ all -> 0x011e }
            r2[r3] = r0     // Catch:{ all -> 0x011e }
            r0 = r2[r3]     // Catch:{ all -> 0x011e }
            int r0 = r5.getColorForState(r0, r3)     // Catch:{ all -> 0x011e }
            r1[r3] = r0     // Catch:{ all -> 0x011e }
            int[] r0 = X.AnonymousClass08P.A01     // Catch:{ all -> 0x011e }
            r2[r4] = r0     // Catch:{ all -> 0x011e }
            r0 = 2130968810(0x7f0400ea, float:1.7546284E38)
            int r0 = X.AnonymousClass08P.A01(r9, r0)     // Catch:{ all -> 0x011e }
            r1[r4] = r0     // Catch:{ all -> 0x011e }
            int[] r0 = X.AnonymousClass08P.A03     // Catch:{ all -> 0x011e }
            r2[r7] = r0     // Catch:{ all -> 0x011e }
            int r0 = r5.getDefaultColor()     // Catch:{ all -> 0x011e }
        L_0x0069:
            r1[r7] = r0     // Catch:{ all -> 0x011e }
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList     // Catch:{ all -> 0x011e }
            r3.<init>(r2, r1)     // Catch:{ all -> 0x011e }
            goto L_0x00fa
        L_0x0072:
            int[] r0 = X.AnonymousClass08P.A02     // Catch:{ all -> 0x011e }
            r2[r3] = r0     // Catch:{ all -> 0x011e }
            int r0 = X.AnonymousClass08P.A00(r9, r6)     // Catch:{ all -> 0x011e }
            r1[r3] = r0     // Catch:{ all -> 0x011e }
            int[] r0 = X.AnonymousClass08P.A01     // Catch:{ all -> 0x011e }
            r2[r4] = r0     // Catch:{ all -> 0x011e }
            r0 = 2130968810(0x7f0400ea, float:1.7546284E38)
            int r0 = X.AnonymousClass08P.A01(r9, r0)     // Catch:{ all -> 0x011e }
            r1[r4] = r0     // Catch:{ all -> 0x011e }
            int[] r0 = X.AnonymousClass08P.A03     // Catch:{ all -> 0x011e }
            r2[r7] = r0     // Catch:{ all -> 0x011e }
            int r0 = X.AnonymousClass08P.A01(r9, r6)     // Catch:{ all -> 0x011e }
            goto L_0x0069
        L_0x0092:
            r0 = 2131230774(0x7f080036, float:1.807761E38)
            r1 = 2130968808(0x7f0400e8, float:1.754628E38)
            if (r10 == r0) goto L_0x00eb
            r0 = 2131230768(0x7f080030, float:1.8077598E38)
            if (r10 != r0) goto L_0x00a5
            r0 = 0
            android.content.res.ColorStateList r3 = X.AnonymousClass06S.A00(r9, r0)     // Catch:{ all -> 0x011e }
            goto L_0x00fa
        L_0x00a5:
            r0 = 2131230773(0x7f080035, float:1.8077608E38)
            r1 = 2130968806(0x7f0400e6, float:1.7546276E38)
            if (r10 == r0) goto L_0x00eb
            r0 = 2131230827(0x7f08006b, float:1.8077718E38)
            if (r10 == r0) goto L_0x00e7
            r0 = 2131230828(0x7f08006c, float:1.807772E38)
            if (r10 == r0) goto L_0x00e7
            int[] r0 = r2.A04     // Catch:{ all -> 0x011e }
            boolean r0 = X.AnonymousClass06S.A02(r0, r10)     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x00c7
            r0 = 2130968812(0x7f0400ec, float:1.7546288E38)
            android.content.res.ColorStateList r3 = X.AnonymousClass08P.A02(r9, r0)     // Catch:{ all -> 0x011e }
            goto L_0x00fa
        L_0x00c7:
            int[] r0 = r2.A05     // Catch:{ all -> 0x011e }
            boolean r0 = X.AnonymousClass06S.A02(r0, r10)     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x00d3
            r1 = 2131099668(0x7f060014, float:1.7811696E38)
            goto L_0x00f4
        L_0x00d3:
            int[] r0 = r2.A03     // Catch:{ all -> 0x011e }
            boolean r0 = X.AnonymousClass06S.A02(r0, r10)     // Catch:{ all -> 0x011e }
            r1 = 2131099667(0x7f060013, float:1.7811694E38)
            if (r0 != 0) goto L_0x00f4
            r0 = 2131230824(0x7f080068, float:1.8077712E38)
            if (r10 != r0) goto L_0x00f9
            r1 = 2131099670(0x7f060016, float:1.78117E38)
            goto L_0x00f4
        L_0x00e7:
            r1 = 2131099671(0x7f060017, float:1.7811702E38)
            goto L_0x00f4
        L_0x00eb:
            int r0 = X.AnonymousClass08P.A01(r9, r1)     // Catch:{ all -> 0x011e }
            android.content.res.ColorStateList r3 = X.AnonymousClass06S.A00(r9, r0)     // Catch:{ all -> 0x011e }
            goto L_0x00fa
        L_0x00f4:
            android.content.res.ColorStateList r3 = X.AnonymousClass08E.A00(r9, r1)     // Catch:{ all -> 0x011e }
            goto L_0x00fa
        L_0x00f9:
            r3 = 0
        L_0x00fa:
            if (r3 == 0) goto L_0x011c
            java.util.WeakHashMap r0 = r8.A04     // Catch:{ all -> 0x011e }
            if (r0 != 0) goto L_0x0107
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x011e }
            r0.<init>()     // Catch:{ all -> 0x011e }
            r8.A04 = r0     // Catch:{ all -> 0x011e }
        L_0x0107:
            java.lang.Object r1 = r0.get(r9)     // Catch:{ all -> 0x011e }
            X.07U r1 = (X.AnonymousClass07U) r1     // Catch:{ all -> 0x011e }
            if (r1 != 0) goto L_0x0119
            X.07U r1 = new X.07U     // Catch:{ all -> 0x011e }
            r1.<init>()     // Catch:{ all -> 0x011e }
            java.util.WeakHashMap r0 = r8.A04     // Catch:{ all -> 0x011e }
            r0.put(r9, r1)     // Catch:{ all -> 0x011e }
        L_0x0119:
            r1.A02(r10, r3)     // Catch:{ all -> 0x011e }
        L_0x011c:
            monitor-exit(r8)
            return r3
        L_0x011e:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06L.A04(android.content.Context, int):android.content.res.ColorStateList");
    }

    public synchronized Drawable A05(Context context, int i2) {
        return A06(context, i2, false);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098 A[Catch:{ Exception -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be A[Catch:{ Exception -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01bb A[Catch:{ Exception -> 0x00c6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.drawable.Drawable A06(android.content.Context r11, int r12, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.A05     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x0025
            r0 = 1
            r10.A05 = r0     // Catch:{ all -> 0x02a4 }
            r0 = 2131230844(0x7f08007c, float:1.8077752E38)
            android.graphics.drawable.Drawable r1 = r10.A05(r11, r0)     // Catch:{ all -> 0x02a4 }
            if (r1 == 0) goto L_0x0299
            boolean r0 = r1 instanceof X.AnonymousClass07V     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x0025
            java.lang.Class r0 = r1.getClass()     // Catch:{ all -> 0x02a4 }
            java.lang.String r1 = r0.getName()     // Catch:{ all -> 0x02a4 }
            java.lang.String r0 = "android.graphics.drawable.VectorDrawable"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x02a4 }
            if (r0 == 0) goto L_0x0299
        L_0x0025:
            X.00O r2 = r10.A02     // Catch:{ all -> 0x02a4 }
            r3 = 0
            if (r2 == 0) goto L_0x00d5
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x00d5
            X.07U r0 = r10.A03     // Catch:{ all -> 0x02a4 }
            java.lang.String r4 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x004a
            java.lang.Object r1 = r0.A01(r12)     // Catch:{ all -> 0x02a4 }
            boolean r0 = r4.equals(r1)     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x00d5
            if (r1 == 0) goto L_0x0051
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x0051
            goto L_0x00d5
        L_0x004a:
            X.07U r0 = new X.07U     // Catch:{ all -> 0x02a4 }
            r0.<init>()     // Catch:{ all -> 0x02a4 }
            r10.A03 = r0     // Catch:{ all -> 0x02a4 }
        L_0x0051:
            android.util.TypedValue r6 = r10.A00     // Catch:{ all -> 0x02a4 }
            if (r6 != 0) goto L_0x005c
            android.util.TypedValue r6 = new android.util.TypedValue     // Catch:{ all -> 0x02a4 }
            r6.<init>()     // Catch:{ all -> 0x02a4 }
            r10.A00 = r6     // Catch:{ all -> 0x02a4 }
        L_0x005c:
            android.content.res.Resources r7 = r11.getResources()     // Catch:{ all -> 0x02a4 }
            r9 = 1
            r7.getValue(r12, r6, r9)     // Catch:{ all -> 0x02a4 }
            int r0 = r6.assetCookie     // Catch:{ all -> 0x02a4 }
            long r0 = (long) r0     // Catch:{ all -> 0x02a4 }
            r2 = 32
            long r0 = r0 << r2
            int r2 = r6.data     // Catch:{ all -> 0x02a4 }
            long r2 = (long) r2     // Catch:{ all -> 0x02a4 }
            long r0 = r0 | r2
            android.graphics.drawable.Drawable r3 = r10.A07(r11, r0)     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x00d5
            java.lang.CharSequence r2 = r6.string     // Catch:{ all -> 0x02a4 }
            if (r2 == 0) goto L_0x00ce
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x02a4 }
            java.lang.String r2 = ".xml"
            boolean r2 = r5.endsWith(r2)     // Catch:{ all -> 0x02a4 }
            if (r2 == 0) goto L_0x00ce
            android.content.res.XmlResourceParser r8 = r7.getXml(r12)     // Catch:{ Exception -> 0x00c6 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r8)     // Catch:{ Exception -> 0x00c6 }
        L_0x008c:
            int r5 = r8.next()     // Catch:{ Exception -> 0x00c6 }
            r2 = 2
            if (r5 == r2) goto L_0x0096
            if (r5 == r9) goto L_0x0096
            goto L_0x008c
        L_0x0096:
            if (r5 != r2) goto L_0x00be
            java.lang.String r5 = r8.getName()     // Catch:{ Exception -> 0x00c6 }
            X.07U r2 = r10.A03     // Catch:{ Exception -> 0x00c6 }
            r2.A02(r12, r5)     // Catch:{ Exception -> 0x00c6 }
            X.00O r2 = r10.A02     // Catch:{ Exception -> 0x00c6 }
            java.lang.Object r5 = r2.get(r5)     // Catch:{ Exception -> 0x00c6 }
            X.06O r5 = (X.AnonymousClass06O) r5     // Catch:{ Exception -> 0x00c6 }
            if (r5 == 0) goto L_0x00b3
            android.content.res.Resources$Theme r2 = r11.getTheme()     // Catch:{ Exception -> 0x00c6 }
            android.graphics.drawable.Drawable r3 = r5.A7O(r11, r2, r7, r8)     // Catch:{ Exception -> 0x00c6 }
        L_0x00b3:
            if (r3 == 0) goto L_0x00ce
            int r2 = r6.changingConfigurations     // Catch:{ Exception -> 0x00c6 }
            r3.setChangingConfigurations(r2)     // Catch:{ Exception -> 0x00c6 }
            r10.A08(r11, r3, r0)     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00ce
        L_0x00be:
            java.lang.String r1 = "No start tag found"
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00c6 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00c6 }
            throw r0     // Catch:{ Exception -> 0x00c6 }
        L_0x00c6:
            r2 = move-exception
            java.lang.String r1 = "ResourceManagerInternal"
            java.lang.String r0 = "Exception while inflating drawable"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x02a4 }
        L_0x00ce:
            if (r3 != 0) goto L_0x00d5
            X.07U r0 = r10.A03     // Catch:{ all -> 0x02a4 }
            r0.A02(r12, r4)     // Catch:{ all -> 0x02a4 }
        L_0x00d5:
            if (r3 != 0) goto L_0x01e2
            android.util.TypedValue r4 = r10.A00     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x00e2
            android.util.TypedValue r4 = new android.util.TypedValue     // Catch:{ all -> 0x02a4 }
            r4.<init>()     // Catch:{ all -> 0x02a4 }
            r10.A00 = r4     // Catch:{ all -> 0x02a4 }
        L_0x00e2:
            android.content.res.Resources r1 = r11.getResources()     // Catch:{ all -> 0x02a4 }
            r0 = 1
            r1.getValue(r12, r4, r0)     // Catch:{ all -> 0x02a4 }
            int r0 = r4.assetCookie     // Catch:{ all -> 0x02a4 }
            long r0 = (long) r0     // Catch:{ all -> 0x02a4 }
            r2 = 32
            long r0 = r0 << r2
            int r2 = r4.data     // Catch:{ all -> 0x02a4 }
            long r2 = (long) r2     // Catch:{ all -> 0x02a4 }
            long r0 = r0 | r2
            android.graphics.drawable.Drawable r3 = r10.A07(r11, r0)     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x01e2
            X.06T r2 = r10.A01     // Catch:{ all -> 0x02a4 }
            if (r2 != 0) goto L_0x0100
            goto L_0x01e1
        L_0x0100:
            r2 = 2131230782(0x7f08003e, float:1.8077626E38)
            if (r12 != r2) goto L_0x0107
            goto L_0x01bc
        L_0x0107:
            r2 = 2131230817(0x7f080061, float:1.8077697E38)
            if (r12 != r2) goto L_0x0110
            r3 = 2131165243(0x7f07003b, float:1.7944698E38)
            goto L_0x0122
        L_0x0110:
            r2 = 2131230816(0x7f080060, float:1.8077695E38)
            if (r12 != r2) goto L_0x0119
            r3 = 2131165244(0x7f07003c, float:1.79447E38)
            goto L_0x0122
        L_0x0119:
            r2 = 2131230818(0x7f080062, float:1.80777E38)
            r3 = 0
            if (r12 != r2) goto L_0x01b9
            r3 = 2131165245(0x7f07003d, float:1.7944702E38)
        L_0x0122:
            android.content.res.Resources r2 = r11.getResources()     // Catch:{ all -> 0x02a4 }
            int r8 = r2.getDimensionPixelSize(r3)     // Catch:{ all -> 0x02a4 }
            r2 = 2131230829(0x7f08006d, float:1.8077722E38)
            android.graphics.drawable.Drawable r7 = r10.A05(r11, r2)     // Catch:{ all -> 0x02a4 }
            r2 = 2131230830(0x7f08006e, float:1.8077724E38)
            android.graphics.drawable.Drawable r5 = r10.A05(r11, r2)     // Catch:{ all -> 0x02a4 }
            boolean r2 = r7 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x02a4 }
            r6 = 0
            if (r2 == 0) goto L_0x01a2
            int r2 = r7.getIntrinsicWidth()     // Catch:{ all -> 0x02a4 }
            if (r2 != r8) goto L_0x01a2
            int r2 = r7.getIntrinsicHeight()     // Catch:{ all -> 0x02a4 }
            if (r2 != r8) goto L_0x01a2
            android.graphics.drawable.BitmapDrawable r7 = (android.graphics.drawable.BitmapDrawable) r7     // Catch:{ all -> 0x02a4 }
            android.graphics.Bitmap r3 = r7.getBitmap()     // Catch:{ all -> 0x02a4 }
        L_0x014f:
            android.graphics.drawable.BitmapDrawable r9 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x02a4 }
            r9.<init>(r3)     // Catch:{ all -> 0x02a4 }
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT     // Catch:{ all -> 0x02a4 }
            r9.setTileModeX(r2)     // Catch:{ all -> 0x02a4 }
            boolean r2 = r5 instanceof android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x02a4 }
            if (r2 == 0) goto L_0x018b
            int r2 = r5.getIntrinsicWidth()     // Catch:{ all -> 0x02a4 }
            if (r2 != r8) goto L_0x018b
            int r2 = r5.getIntrinsicHeight()     // Catch:{ all -> 0x02a4 }
            if (r2 != r8) goto L_0x018b
        L_0x0169:
            r2 = 3
            android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]     // Catch:{ all -> 0x02a4 }
            r2[r6] = r7     // Catch:{ all -> 0x02a4 }
            r7 = 1
            r2[r7] = r5     // Catch:{ all -> 0x02a4 }
            r5 = 2
            r2[r5] = r9     // Catch:{ all -> 0x02a4 }
            android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable     // Catch:{ all -> 0x02a4 }
            r3.<init>(r2)     // Catch:{ all -> 0x02a4 }
            r2 = 16908288(0x1020000, float:2.387723E-38)
            r3.setId(r6, r2)     // Catch:{ all -> 0x02a4 }
            r2 = 16908303(0x102000f, float:2.387727E-38)
            r3.setId(r7, r2)     // Catch:{ all -> 0x02a4 }
            r2 = 16908301(0x102000d, float:2.3877265E-38)
            r3.setId(r5, r2)     // Catch:{ all -> 0x02a4 }
            goto L_0x01b9
        L_0x018b:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x02a4 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r8, r8, r2)     // Catch:{ all -> 0x02a4 }
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch:{ all -> 0x02a4 }
            r2.<init>(r3)     // Catch:{ all -> 0x02a4 }
            r5.setBounds(r6, r6, r8, r8)     // Catch:{ all -> 0x02a4 }
            r5.draw(r2)     // Catch:{ all -> 0x02a4 }
            android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x02a4 }
            r5.<init>(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x0169
        L_0x01a2:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x02a4 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r8, r8, r2)     // Catch:{ all -> 0x02a4 }
            android.graphics.Canvas r2 = new android.graphics.Canvas     // Catch:{ all -> 0x02a4 }
            r2.<init>(r3)     // Catch:{ all -> 0x02a4 }
            r7.setBounds(r6, r6, r8, r8)     // Catch:{ all -> 0x02a4 }
            r7.draw(r2)     // Catch:{ all -> 0x02a4 }
            android.graphics.drawable.BitmapDrawable r7 = new android.graphics.drawable.BitmapDrawable     // Catch:{ all -> 0x02a4 }
            r7.<init>(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x014f
        L_0x01b9:
            if (r3 == 0) goto L_0x01e2
            goto L_0x01d8
        L_0x01bc:
            r2 = 2
            android.graphics.drawable.Drawable[] r5 = new android.graphics.drawable.Drawable[r2]     // Catch:{ all -> 0x02a4 }
            r3 = 0
            r2 = 2131230781(0x7f08003d, float:1.8077624E38)
            android.graphics.drawable.Drawable r2 = r10.A05(r11, r2)     // Catch:{ all -> 0x02a4 }
            r5[r3] = r2     // Catch:{ all -> 0x02a4 }
            r3 = 1
            r2 = 2131230783(0x7f08003f, float:1.8077629E38)
            android.graphics.drawable.Drawable r2 = r10.A05(r11, r2)     // Catch:{ all -> 0x02a4 }
            r5[r3] = r2     // Catch:{ all -> 0x02a4 }
            android.graphics.drawable.LayerDrawable r3 = new android.graphics.drawable.LayerDrawable     // Catch:{ all -> 0x02a4 }
            r3.<init>(r5)     // Catch:{ all -> 0x02a4 }
        L_0x01d8:
            int r2 = r4.changingConfigurations     // Catch:{ all -> 0x02a4 }
            r3.setChangingConfigurations(r2)     // Catch:{ all -> 0x02a4 }
            r10.A08(r11, r3, r0)     // Catch:{ all -> 0x02a4 }
            goto L_0x01e2
        L_0x01e1:
            r3 = 0
        L_0x01e2:
            if (r3 != 0) goto L_0x01e8
            android.graphics.drawable.Drawable r3 = X.AnonymousClass00T.A04(r11, r12)     // Catch:{ all -> 0x02a4 }
        L_0x01e8:
            if (r3 == 0) goto L_0x0292
            android.content.res.ColorStateList r1 = r10.A04(r11, r12)     // Catch:{ all -> 0x02a4 }
            if (r1 == 0) goto L_0x0211
            boolean r0 = X.C015307j.A03(r3)     // Catch:{ all -> 0x02a4 }
            if (r0 == 0) goto L_0x01fa
            android.graphics.drawable.Drawable r3 = r3.mutate()     // Catch:{ all -> 0x02a4 }
        L_0x01fa:
            android.graphics.drawable.Drawable r3 = X.C018208n.A03(r3)     // Catch:{ all -> 0x02a4 }
            X.C018208n.A04(r1, r3)     // Catch:{ all -> 0x02a4 }
            X.06T r0 = r10.A01     // Catch:{ all -> 0x02a4 }
            if (r0 == 0) goto L_0x0292
            r0 = 2131230831(0x7f08006f, float:1.8077726E38)
            if (r12 != r0) goto L_0x0292
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch:{ all -> 0x02a4 }
            X.C018208n.A07(r0, r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x0292
        L_0x0211:
            X.06T r0 = r10.A01     // Catch:{ all -> 0x02a4 }
            if (r0 == 0) goto L_0x0289
            r0 = 2131230826(0x7f08006a, float:1.8077716E38)
            r5 = 16908301(0x102000d, float:2.3877265E-38)
            r2 = 16908303(0x102000f, float:2.387727E-38)
            r1 = 16908288(0x1020000, float:2.387723E-38)
            if (r12 != r0) goto L_0x0223
            goto L_0x025c
        L_0x0223:
            r0 = 2131230817(0x7f080061, float:1.8077697E38)
            if (r12 == r0) goto L_0x0232
            r0 = 2131230816(0x7f080060, float:1.8077695E38)
            if (r12 == r0) goto L_0x0232
            r0 = 2131230818(0x7f080062, float:1.80777E38)
            if (r12 != r0) goto L_0x0289
        L_0x0232:
            r4 = r3
            android.graphics.drawable.LayerDrawable r4 = (android.graphics.drawable.LayerDrawable) r4     // Catch:{ all -> 0x02a4 }
            android.graphics.drawable.Drawable r1 = r4.findDrawableByLayerId(r1)     // Catch:{ all -> 0x02a4 }
            r0 = 2130968812(0x7f0400ec, float:1.7546288E38)
            int r0 = X.AnonymousClass08P.A00(r11, r0)     // Catch:{ all -> 0x02a4 }
            android.graphics.PorterDuff$Mode r6 = X.AnonymousClass06K.A02     // Catch:{ all -> 0x02a4 }
            X.AnonymousClass06S.A01(r6, r1, r0)     // Catch:{ all -> 0x02a4 }
            android.graphics.drawable.Drawable r2 = r4.findDrawableByLayerId(r2)     // Catch:{ all -> 0x02a4 }
            r1 = 2130968810(0x7f0400ea, float:1.7546284E38)
            int r0 = X.AnonymousClass08P.A01(r11, r1)     // Catch:{ all -> 0x02a4 }
            X.AnonymousClass06S.A01(r6, r2, r0)     // Catch:{ all -> 0x02a4 }
            android.graphics.drawable.Drawable r2 = r4.findDrawableByLayerId(r5)     // Catch:{ all -> 0x02a4 }
            int r0 = X.AnonymousClass08P.A01(r11, r1)     // Catch:{ all -> 0x02a4 }
            goto L_0x0285
        L_0x025c:
            r7 = r3
            android.graphics.drawable.LayerDrawable r7 = (android.graphics.drawable.LayerDrawable) r7     // Catch:{ all -> 0x02a4 }
            android.graphics.drawable.Drawable r1 = r7.findDrawableByLayerId(r1)     // Catch:{ all -> 0x02a4 }
            r4 = 2130968812(0x7f0400ec, float:1.7546288E38)
            int r0 = X.AnonymousClass08P.A01(r11, r4)     // Catch:{ all -> 0x02a4 }
            android.graphics.PorterDuff$Mode r6 = X.AnonymousClass06K.A02     // Catch:{ all -> 0x02a4 }
            X.AnonymousClass06S.A01(r6, r1, r0)     // Catch:{ all -> 0x02a4 }
            android.graphics.drawable.Drawable r1 = r7.findDrawableByLayerId(r2)     // Catch:{ all -> 0x02a4 }
            int r0 = X.AnonymousClass08P.A01(r11, r4)     // Catch:{ all -> 0x02a4 }
            X.AnonymousClass06S.A01(r6, r1, r0)     // Catch:{ all -> 0x02a4 }
            android.graphics.drawable.Drawable r2 = r7.findDrawableByLayerId(r5)     // Catch:{ all -> 0x02a4 }
            r0 = 2130968810(0x7f0400ea, float:1.7546284E38)
            int r0 = X.AnonymousClass08P.A01(r11, r0)     // Catch:{ all -> 0x02a4 }
        L_0x0285:
            X.AnonymousClass06S.A01(r6, r2, r0)     // Catch:{ all -> 0x02a4 }
            goto L_0x0292
        L_0x0289:
            boolean r0 = r10.A0A(r11, r3, r12)     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x0292
            if (r13 == 0) goto L_0x0292
            r3 = 0
        L_0x0292:
            if (r3 == 0) goto L_0x0297
            X.C015307j.A02(r3)     // Catch:{ all -> 0x02a4 }
        L_0x0297:
            monitor-exit(r10)
            return r3
        L_0x0299:
            r0 = 0
            r10.A05 = r0     // Catch:{ all -> 0x02a4 }
            java.lang.String r1 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x02a4 }
            r0.<init>(r1)     // Catch:{ all -> 0x02a4 }
            throw r0     // Catch:{ all -> 0x02a4 }
        L_0x02a4:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06L.A06(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable A07(android.content.Context r5, long r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.WeakHashMap r0 = r4.A06     // Catch:{ all -> 0x002b }
            java.lang.Object r3 = r0.get(r5)     // Catch:{ all -> 0x002b }
            X.03G r3 = (X.AnonymousClass03G) r3     // Catch:{ all -> 0x002b }
            r2 = 0
            if (r3 == 0) goto L_0x0029
            java.lang.Object r0 = r3.A04(r6, r2)     // Catch:{ all -> 0x002b }
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0029
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x002b }
            android.graphics.drawable.Drawable$ConstantState r1 = (android.graphics.drawable.Drawable.ConstantState) r1     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0026
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ all -> 0x002b }
            android.graphics.drawable.Drawable r0 = r1.newDrawable(r0)     // Catch:{ all -> 0x002b }
            monitor-exit(r4)
            return r0
        L_0x0026:
            r3.A07(r6)     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r4)
            return r2
        L_0x002b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06L.A07(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    public final synchronized void A08(Context context, Drawable drawable, long j2) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            WeakHashMap weakHashMap = this.A06;
            AnonymousClass03G r1 = (AnonymousClass03G) weakHashMap.get(context);
            if (r1 == null) {
                r1 = new AnonymousClass03G();
                weakHashMap.put(context, r1);
            }
            r1.A09(j2, new WeakReference(constantState));
        }
    }

    public final void A09(AnonymousClass06O r2, String str) {
        AnonymousClass00O r0 = this.A02;
        if (r0 == null) {
            r0 = new AnonymousClass00O();
            this.A02 = r0;
        }
        r0.put(str, r2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0A(android.content.Context r6, android.graphics.drawable.Drawable r7, int r8) {
        /*
            r5 = this;
            X.06T r1 = r5.A01
            if (r1 == 0) goto L_0x0061
            X.06S r1 = (X.AnonymousClass06S) r1
            android.graphics.PorterDuff$Mode r3 = X.AnonymousClass06K.A02
            int[] r0 = r1.A02
            boolean r0 = X.AnonymousClass06S.A02(r0, r8)
            r4 = 16842801(0x1010031, float:2.3693695E-38)
            r2 = -1
            if (r0 == 0) goto L_0x0034
            r4 = 2130968812(0x7f0400ec, float:1.7546288E38)
        L_0x0017:
            r1 = -1
        L_0x0018:
            boolean r0 = X.C015307j.A03(r7)
            if (r0 == 0) goto L_0x0022
            android.graphics.drawable.Drawable r7 = r7.mutate()
        L_0x0022:
            int r0 = X.AnonymousClass08P.A01(r6, r4)
            android.graphics.PorterDuffColorFilter r0 = X.AnonymousClass06K.A00(r3, r0)
            r7.setColorFilter(r0)
            if (r1 == r2) goto L_0x0032
            r7.setAlpha(r1)
        L_0x0032:
            r0 = 1
            return r0
        L_0x0034:
            int[] r0 = r1.A01
            boolean r0 = X.AnonymousClass06S.A02(r0, r8)
            if (r0 == 0) goto L_0x0040
            r4 = 2130968810(0x7f0400ea, float:1.7546284E38)
            goto L_0x0017
        L_0x0040:
            int[] r0 = r1.A00
            boolean r0 = X.AnonymousClass06S.A02(r0, r8)
            if (r0 == 0) goto L_0x004b
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0017
        L_0x004b:
            r0 = 2131230803(0x7f080053, float:1.807767E38)
            if (r8 != r0) goto L_0x005b
            r4 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r1 = java.lang.Math.round(r0)
            goto L_0x0018
        L_0x005b:
            r0 = 2131230785(0x7f080041, float:1.8077633E38)
            if (r8 != r0) goto L_0x0061
            goto L_0x0017
        L_0x0061:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass06L.A0A(android.content.Context, android.graphics.drawable.Drawable, int):boolean");
    }
}
