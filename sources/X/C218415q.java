package X;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import androidx.core.app.NotificationCompat$BigTextStyle;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.view.ViewCompat;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.obwhatsapp.R;
import com.obwhatsapp.notification.AndroidWear;
import com.obwhatsapp.yo.Conversation;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

/* renamed from: X.15q  reason: invalid class name and case insensitive filesystem */
public final class C218415q {
    public static final HashMap A0L = new HashMap();
    public static final String[] A0M = {"_id"};
    public AnonymousClass04K A00;
    public final C16180sb A01;
    public final C16040sK A02;
    public final AnonymousClass15Z A03;
    public final C17160ud A04;
    public final C16000sG A05;
    public final C16080sP A06;
    public final C17200uh A07;
    public final AnonymousClass01V A08;
    public final C16980tz A09;
    public final AnonymousClass013 A0A;
    public final C16460t6 A0B;
    public final C16070sO A0C;
    public final AnonymousClass15B A0D;
    public final C14710pd A0E;
    public final C19990zK A0F;
    public final C218315p A0G;
    public final C17020u3 A0H;
    public final C16220sf A0I;
    public final C18840xL A0J;
    public final HashMap A0K = new HashMap();

    public C218415q(C16180sb r2, C16040sK r3, AnonymousClass15Z r4, C17160ud r5, C16000sG r6, C16080sP r7, C17200uh r8, AnonymousClass01V r9, C16980tz r10, AnonymousClass013 r11, C16460t6 r12, C16070sO r13, AnonymousClass15B r14, C14710pd r15, C19990zK r16, C218315p r17, C17020u3 r18, C16220sf r19, C18840xL r20) {
        this.A09 = r10;
        this.A0E = r15;
        this.A0F = r16;
        this.A02 = r3;
        this.A01 = r2;
        this.A0D = r14;
        this.A07 = r8;
        this.A0G = r17;
        this.A04 = r5;
        this.A05 = r6;
        this.A08 = r9;
        this.A06 = r7;
        this.A0A = r11;
        this.A0J = r20;
        this.A0B = r12;
        this.A0I = r19;
        this.A0C = r13;
        this.A0H = r18;
        this.A03 = r4;
    }

    public static C007503l A00(Context context) {
        C007503l r1 = new C007503l(context, (String) null);
        int A002 = AnonymousClass00T.A00(context, R.color.color065e);
        r1.A00 = yo.getUniversalColor();
        return r1;
    }

    public static C007503l A01(Context context, CharSequence charSequence, CharSequence charSequence2) {
        C007503l A002 = A00(context);
        A002.A0J = "other_notifications@1";
        A002.A0B(charSequence);
        A002.A0A(charSequence);
        A002.A09(charSequence2);
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.companiondevice.LinkedDevicesActivity");
        A002.A09 = C42341xd.A00(context, 0, intent, 0);
        NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
        notificationCompat$BigTextStyle.A09(charSequence2);
        A002.A08(notificationCompat$BigTextStyle);
        return A002;
    }

    public static CharSequence A02(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, charSequence.length(), 0);
        return spannableStringBuilder;
    }

    public static CharSequence A03(CharSequence charSequence, boolean z2) {
        if (!z2) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.setSpan(new StyleSpan(2), 0, charSequence.length(), 0);
        return spannableStringBuilder;
    }

    public static Integer A04(String str) {
        int i2;
        if (str == null) {
            return null;
        }
        try {
            i2 = Integer.parseInt(str, 16);
        } catch (NumberFormatException unused) {
            i2 = ViewCompat.MEASURED_SIZE_MASK;
        }
        int i3 = i2 | -16777216;
        if (i3 != -16777216) {
            return Integer.valueOf(i3);
        }
        return null;
    }

    public static String A05(Context context, AnonymousClass013 r8, C39021rn r9) {
        int i2 = r9.A00;
        Object[] objArr = {Integer.valueOf(i2)};
        String A0J2 = r8.A0J(objArr, R.plurals.plurals016f, (long) i2);
        if (TextUtils.isEmpty(r9.A05)) {
            return A0J2;
        }
        return context.getString(R.string.str0d44, new Object[]{A0J2, r9.A05});
    }

    public static String A06(Context context, C16740tZ r4) {
        C16730tY r42;
        if (r4 instanceof C16840tj) {
            C42101xE A012 = C42091xD.A01((C16840tj) r4);
            if (A012 != null) {
                return A012.A05(context);
            }
            return null;
        } else if ((r4 instanceof C38991rk) || (r4 instanceof C39011rm) || (r4 instanceof C30591cd)) {
            return null;
        } else {
            if (r4 instanceof C38891ra) {
                C38891ra r43 = (C38891ra) r4;
                String str = r43.A09;
                String str2 = r43.A02;
                if (!TextUtils.isEmpty(str2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" ");
                    sb.append(str2);
                    str = sb.toString();
                }
                String str3 = r43.A05;
                if (TextUtils.isEmpty(str3)) {
                    return str;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" ");
                sb2.append(str3);
                return sb2.toString();
            } else if (r4 instanceof C39021rn) {
                return null;
            } else {
                if (r4 instanceof C38681rF) {
                    C16730tY r1 = (C16730tY) r4;
                    boolean A042 = C42551xz.A04(r4);
                    r42 = r4;
                    if (!A042) {
                        return r1.A13();
                    }
                } else if (r4 instanceof C38701rH) {
                    return null;
                } else {
                    if (r4 instanceof C38801rR) {
                        return ((C16730tY) r4).A13();
                    }
                    if (r4 instanceof C38711rI) {
                        C16730tY r44 = (C16730tY) r4;
                        boolean A043 = C42551xz.A04(r44);
                        r42 = r44;
                        if (!A043) {
                            return r44.A13();
                        }
                    } else if (r4 instanceof C38631rA) {
                        boolean A022 = C42941yx.A02(r4);
                        r42 = r4;
                        if (A022) {
                            return null;
                        }
                    } else if ((r4 instanceof C38641rB) || (r4 instanceof C30071bh) || (r4 instanceof C38811rS) || (r4 instanceof C38741rL)) {
                        return null;
                    } else {
                        boolean z2 = r4 instanceof C38751rM;
                        r42 = r4;
                        if (!z2) {
                            if (r4 instanceof C38841rV) {
                                return ((C38841rV) r4).A03;
                            }
                            return null;
                        }
                    }
                }
                return C42551xz.A00(r42);
            }
        }
    }

    public static String A07(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return context.getString(R.string.str15c8);
        }
        Ringtone ringtone = RingtoneManager.getRingtone(context, Uri.parse(str));
        if (ringtone == null) {
            return null;
        }
        try {
            return ringtone.getTitle(context);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String A08(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ");
        if (!TextUtils.isEmpty(str)) {
            if (((long) str.length()) > FileUtils.ONE_KB) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.subSequence(0, 1020));
                sb2.append("…");
                str = sb2.toString();
            }
            str3 = str;
        }
        sb.append(str3);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0.booleanValue() != false) goto L_0x0023;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x007e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(android.content.Context r10, android.net.Uri r11, X.C007503l r12, X.AnonymousClass01V r13, X.AnonymousClass15N r14, X.AnonymousClass15O r15) {
        /*
            r5 = r11
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r3 >= r0) goto L_0x0023
            r0 = 21
            if (r3 != r0) goto L_0x0055
            android.net.Uri r0 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x0023
            java.util.HashMap r2 = A0L
            java.lang.Object r0 = r2.get(r11)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0045
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0055
        L_0x0023:
            boolean r0 = r14.A00
            if (r0 != 0) goto L_0x0058
            r0 = 26
            if (r3 >= r0) goto L_0x0058
            java.io.File r1 = X.AnonymousClass1XI.A03(r11)
            if (r1 == 0) goto L_0x003f
            r0 = 24
            if (r3 < r0) goto L_0x003f
            android.net.Uri r5 = X.AnonymousClass1XI.A01(r10, r1)     // Catch:{ IllegalArgumentException -> 0x007f }
            java.lang.String r1 = "com.android.systemui"
            r0 = 1
            r10.grantUriPermission(r1, r5, r0)     // Catch:{ IllegalArgumentException -> 0x007f }
        L_0x003f:
            if (r5 == 0) goto L_0x0058
            r12.A07(r5)
            return
        L_0x0045:
            android.content.ContentResolver r4 = r13.A0C()
            if (r4 != 0) goto L_0x0059
            java.lang.String r0 = "messagenotification/is-notification-tone cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0050:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.put(r11, r0)
        L_0x0055:
            r15.A01(r11)
        L_0x0058:
            return
        L_0x0059:
            java.lang.String[] r6 = A0M     // Catch:{ Exception -> 0x0050 }
            java.lang.String r7 = "is_notification=1"
            r8 = 0
            java.lang.String r9 = "title_key"
            android.database.Cursor r1 = r4.query(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0050 }
            if (r1 == 0) goto L_0x0050
            int r0 = r1.getCount()     // Catch:{ all -> 0x007a }
            if (r0 <= 0) goto L_0x0076
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x007a }
            r2.put(r11, r0)     // Catch:{ all -> 0x007a }
            r1.close()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0023
        L_0x0076:
            r1.close()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0050
        L_0x007a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x007e }
        L_0x007e:
            throw r0     // Catch:{ Exception -> 0x0050 }
        L_0x007f:
            r1 = move-exception
            java.lang.String r0 = "notification/"
            com.whatsapp.util.Log.w(r0, r1)
            r15.A01(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218415q.A09(android.content.Context, android.net.Uri, X.03l, X.01V, X.15N, X.15O):void");
    }

    public static long[] A0A(String str) {
        int i2;
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    i2 = 0;
                    break;
                } else {
                    return null;
                }
            case SearchActionVerificationClientService.TIME_TO_SLEEP_IN_MS /*50*/:
                if (str.equals("2")) {
                    i2 = 1;
                    break;
                } else {
                    return null;
                }
            case 51:
                if (str.equals("3")) {
                    i2 = 2;
                    break;
                } else {
                    return null;
                }
            default:
                return null;
        }
        long[] jArr = {0, 750, 250, 750, 250};
        if (2 - i2 != 0) {
            // fill-array-data instruction
            jArr[0] = 0;
            jArr[1] = 300;
            jArr[2] = 200;
            jArr[3] = 300;
            jArr[4] = 200;
            return jArr;
        }
        return jArr;
    }

    public int A0B(int i2, int i3) {
        Point point = new Point();
        this.A08.A0O().getDefaultDisplay().getSize(point);
        int i4 = point.x;
        int i5 = point.y / 3;
        int i6 = 1;
        if (i2 != 0 && i3 != 0) {
            while (true) {
                if (i3 <= i5 && i2 <= i4) {
                    break;
                }
                i6 <<= 1;
                i3 = (i3 + 1) >> 1;
                i2 = (i2 + 1) >> 1;
            }
        }
        return i6;
    }

    public Bitmap A0C(C16010sH r5) {
        Context context = this.A09.A00;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(17104901);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(17104902);
        Bitmap A022 = this.A07.A02(context, r5, dimensionPixelSize, dimensionPixelSize2);
        if (A022 != null) {
            return A022;
        }
        C17160ud r3 = this.A04;
        return r3.A04(r5, yo.setSQPC(r3.A01.A00.getResources().getDimension(R.dimen.dimen0748)), Math.min(dimensionPixelSize, dimensionPixelSize2));
    }

    public AnonymousClass04K A0D() {
        AnonymousClass04K r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass04L r3 = new AnonymousClass04L();
        r3.A01 = this.A09.A00.getString(R.string.str0b13);
        C16040sK r02 = this.A02;
        r02.A0B();
        C28881Zb r03 = r02.A01;
        AnonymousClass00B.A06(r03);
        Bitmap A0C2 = A0C(r03);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.A06 = A0C2;
        r3.A00 = iconCompat;
        AnonymousClass04K r04 = new AnonymousClass04K(r3);
        this.A00 = r04;
        return r04;
    }

    public CharSequence A0E(C16010sH r13, C16740tZ r14, boolean z2, boolean z3) {
        CharSequence A0H2;
        C28381Vw r9 = r14.A11;
        int i2 = 2;
        if (C16030sJ.A0L(r9.A00)) {
            i2 = 1;
        }
        byte b2 = r14.A10;
        if (b2 != 0 && b2 != 7) {
            CharSequence A0F2 = A0F(r14);
            boolean z4 = false;
            if (b2 == 12) {
                z4 = true;
            }
            if (!r13.A0J()) {
                if (!z2) {
                    if (!z3) {
                        A0H2 = A03(A0F2, z4);
                    } else if (!r9.A02) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.A06.A0G(r13, i2, false));
                        sb.append(" ");
                        A0H2 = TextUtils.concat(new CharSequence[]{A02(C40651uT.A03(sb.toString())), A03(C40651uT.A03(A0F2), z4)});
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.A06.A0G(r13, i2, false));
                sb2.append(": ");
                sb2.append(A03(A0F2, z4));
                A0H2 = sb2.toString();
            } else if (z2) {
                if (!r9.A02) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(A0I(r14.A0B(), i2));
                    sb3.append(" @ ");
                    sb3.append(this.A06.A0G(r13, i2, false));
                    sb3.append(": ");
                    sb3.append(A03(A0F2, z4));
                    A0H2 = sb3.toString();
                }
                StringBuilder sb22 = new StringBuilder();
                sb22.append(this.A06.A0G(r13, i2, false));
                sb22.append(": ");
                sb22.append(A03(A0F2, z4));
                A0H2 = sb22.toString();
            } else if (!z3) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(A0I(r14.A0B(), i2));
                sb4.append(": ");
                A0H2 = TextUtils.concat(new CharSequence[]{A02(sb4.toString()), A03(A0F2, z4)});
            } else if (!r9.A02) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(A0I(r14.A0B(), i2));
                sb5.append(" ");
                A0H2 = TextUtils.concat(new CharSequence[]{A02(C40651uT.A03(sb5.toString())), A03(C40651uT.A03(A0F2), z4)});
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append(this.A09.A00.getString(R.string.str1ba8));
            sb6.append(" ");
            A0H2 = TextUtils.concat(new CharSequence[]{A02(sb6.toString()), A03(C40651uT.A03(A0F2), z4)});
        } else if (!(r14 instanceof AnonymousClass1WU)) {
            AnonymousClass1Vt r0 = r14.A0L;
            A0H2 = r0 == null ? A0H(r14.A0I()) : r0.A03 != 5 ? this.A0G.A0V(r14, false) : this.A09.A00.getString(R.string.str0e30);
            if (r13.A0J()) {
                boolean z5 = r9.A02;
                if (z2) {
                    if (!z5) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append(A0I(r14.A0B(), i2));
                        sb7.append(" @ ");
                        sb7.append(this.A06.A0G(r13, i2, false));
                        sb7.append(": ");
                        sb7.append(A0H2);
                        A0H2 = sb7.toString();
                    }
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(this.A06.A0G(r13, i2, false));
                    sb8.append(": ");
                    sb8.append(A0H2);
                    A0H2 = sb8.toString();
                } else if (z3) {
                    if (!z5) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(A0I(r14.A0B(), i2));
                        sb9.append(" ");
                        A0H2 = TextUtils.concat(new CharSequence[]{A02(C40651uT.A03(sb9.toString())), A0H2});
                    }
                } else if (!z5) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(A0I(r14.A0B(), i2));
                    sb10.append(": ");
                    A0H2 = TextUtils.concat(new CharSequence[]{A02(sb10.toString()), A0H2});
                } else {
                    StringBuilder sb11 = new StringBuilder("messagePreview/missing_rmt_src:");
                    sb11.append(C38621r6.A0J(r14));
                    Log.e(sb11.toString());
                    StringBuilder sb12 = new StringBuilder();
                    sb12.append(this.A09.A00.getString(R.string.str0541));
                    sb12.append(": ");
                    sb12.append(A0H2);
                    A0H2 = sb12.toString();
                }
            } else {
                if (!z2) {
                    if (z3) {
                        if (!r9.A02) {
                            StringBuilder sb13 = new StringBuilder();
                            sb13.append(C40651uT.A03(this.A06.A0G(r13, i2, false)));
                            sb13.append(" ");
                            A0H2 = TextUtils.concat(new CharSequence[]{A02(sb13.toString()), A0H2});
                        }
                    }
                }
                StringBuilder sb82 = new StringBuilder();
                sb82.append(this.A06.A0G(r13, i2, false));
                sb82.append(": ");
                sb82.append(A0H2);
                A0H2 = sb82.toString();
            }
            StringBuilder sb14 = new StringBuilder();
            sb14.append(this.A09.A00.getString(R.string.str1ba8));
            sb14.append(" ");
            A0H2 = TextUtils.concat(new CharSequence[]{A02(sb14.toString()), A0H2});
        } else if (z2) {
            StringBuilder sb15 = new StringBuilder();
            sb15.append(this.A06.A0G(r13, i2, false));
            sb15.append(": ");
            sb15.append(this.A03.A0C((AnonymousClass1WU) r14, false));
            A0H2 = sb15.toString();
        } else {
            A0H2 = this.A03.A0C((AnonymousClass1WU) r14, false);
        }
        return Conversation.pNotifi(r14, this.A0F.A00(A0H2, r14.A0q));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01fa, code lost:
        if (r0 == 1) goto L_0x01fc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence A0F(X.C16740tZ r11) {
        /*
            r10 = this;
            X.0tz r3 = r10.A09
            android.content.Context r1 = r3.A00
            java.lang.String r4 = A06(r1, r11)
            boolean r0 = r11 instanceof X.C38991rk
            java.lang.String r5 = "①"
            if (r0 == 0) goto L_0x0023
            r0 = 2131892729(0x7f1219f9, float:1.9420215E38)
        L_0x0012:
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = A08(r4, r5, r0)
        L_0x001a:
            java.lang.CharSequence r0 = r10.A0H(r4)
            java.lang.CharSequence r0 = X.AnonymousClass1ZW.A02(r0)
            return r0
        L_0x0023:
            boolean r0 = r11 instanceof X.C39011rm
            if (r0 == 0) goto L_0x002b
            r0 = 2131892749(0x7f121a0d, float:1.9420255E38)
            goto L_0x0012
        L_0x002b:
            boolean r0 = r11 instanceof X.C39241s9
            if (r0 == 0) goto L_0x0033
            r0 = 2131887591(0x7f1205e7, float:1.9409793E38)
            goto L_0x0012
        L_0x0033:
            boolean r0 = r11 instanceof X.C30591cd
            if (r0 == 0) goto L_0x0040
            X.1cd r11 = (X.C30591cd) r11
            X.013 r0 = r10.A0A
            java.lang.String r4 = r11.ADz(r0)
            goto L_0x001a
        L_0x0040:
            boolean r0 = r11 instanceof X.C38891ra
            java.lang.String r5 = "🛒"
            if (r0 == 0) goto L_0x004b
            r0 = 2131887589(0x7f1205e5, float:1.940979E38)
            goto L_0x0012
        L_0x004b:
            boolean r0 = r11 instanceof X.C39021rn
            if (r0 == 0) goto L_0x0063
            X.1rn r11 = (X.C39021rn) r11
            X.013 r0 = r10.A0A
            java.lang.String r2 = A05(r1, r0, r11)
            r0 = 2131887576(0x7f1205d8, float:1.9409763E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = A08(r2, r5, r0)
            goto L_0x001a
        L_0x0063:
            boolean r0 = r11 instanceof X.C38681rF
            if (r0 == 0) goto L_0x0076
            r0 = 2131887584(0x7f1205e0, float:1.940978E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "📷"
            java.lang.String r4 = A08(r4, r0, r1)
            goto L_0x001a
        L_0x0076:
            boolean r0 = r11 instanceof X.C38701rH
            java.lang.String r6 = ")"
            java.lang.String r8 = " ("
            r7 = 1
            if (r0 == 0) goto L_0x00ce
            X.0tY r11 = (X.C16730tY) r11
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r2 = r11.A08
            if (r2 != r7) goto L_0x00ca
            java.lang.String r0 = "🎤"
        L_0x008d:
            r3.append(r0)
            java.lang.String r0 = " "
            r3.append(r0)
            r0 = 2131887573(0x7f1205d5, float:1.9409757E38)
            if (r2 != r7) goto L_0x009d
            r0 = 2131887597(0x7f1205ed, float:1.9409806E38)
        L_0x009d:
            java.lang.String r0 = r1.getString(r0)
            r3.append(r0)
            java.lang.String r4 = r3.toString()
        L_0x00a8:
            int r0 = r11.A00
            if (r0 == 0) goto L_0x001a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r8)
            X.013 r2 = r10.A0A
            long r0 = (long) r0
            java.lang.String r0 = X.C28961Zl.A04(r2, r0)
            r3.append(r0)
            r3.append(r6)
            java.lang.String r4 = r3.toString()
            goto L_0x001a
        L_0x00ca:
            java.lang.String r0 = "🎵"
            goto L_0x008d
        L_0x00ce:
            boolean r0 = r11 instanceof X.C38801rR
            if (r0 == 0) goto L_0x00e2
            r0 = 2131887580(0x7f1205dc, float:1.9409771E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "👾"
            java.lang.String r4 = A08(r4, r0, r1)
            goto L_0x001a
        L_0x00e2:
            boolean r0 = r11 instanceof X.C38711rI
            if (r0 == 0) goto L_0x00f7
            X.0tY r11 = (X.C16730tY) r11
            r0 = 2131887593(0x7f1205e9, float:1.9409797E38)
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "🎥"
            java.lang.String r4 = A08(r4, r0, r1)
            goto L_0x00a8
        L_0x00f7:
            boolean r0 = r11 instanceof X.C38631rA
            r2 = 128(0x80, float:1.794E-43)
            r9 = 0
            java.lang.String r5 = "👤 "
            if (r0 == 0) goto L_0x017a
            X.1rA r11 = (X.C38631rA) r11
            boolean r0 = X.C42941yx.A02(r11)
            if (r0 == 0) goto L_0x0128
            java.lang.String r3 = r11.A14()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x01f4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = X.AnonymousClass1ZW.A04(r2, r3)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            goto L_0x001a
        L_0x0128:
            java.lang.String r0 = r11.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r3 = "📄"
            if (r0 != 0) goto L_0x0142
            java.lang.String r2 = r11.A01
            r0 = 2131887579(0x7f1205db, float:1.940977E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = A08(r2, r3, r0)
            goto L_0x001a
        L_0x0142:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x014c
            java.lang.String r4 = r11.A14()
        L_0x014c:
            r0 = 2131887579(0x7f1205db, float:1.940977E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r4 = A08(r4, r3, r0)
            int r3 = r11.A00
            if (r3 == 0) goto L_0x001a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r8)
            X.013 r1 = r10.A0A
            java.lang.String r0 = r11.A06
            java.lang.String r0 = X.C18820xJ.A05(r1, r0, r3)
            r2.append(r0)
            r2.append(r6)
            java.lang.String r4 = r2.toString()
            goto L_0x001a
        L_0x017a:
            boolean r0 = r11 instanceof X.C38641rB
            if (r0 == 0) goto L_0x0196
            java.lang.String r0 = "💟 "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = 2131887590(0x7f1205e6, float:1.9409791E38)
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            goto L_0x001a
        L_0x0196:
            boolean r0 = r11 instanceof X.C30071bh
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = "👥 "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = 2131887581(0x7f1205dd, float:1.9409773E38)
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            goto L_0x001a
        L_0x01b2:
            boolean r0 = r11 instanceof X.C38811rS
            if (r0 == 0) goto L_0x01cf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            X.013 r0 = r10.A0A
            X.1rS r11 = (X.C38811rS) r11
            java.lang.String r0 = X.C41061vA.A08(r0, r11)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            goto L_0x001a
        L_0x01cf:
            boolean r0 = r11 instanceof X.C38741rL
            if (r0 == 0) goto L_0x0238
            X.1rL r11 = (X.C38741rL) r11
            java.lang.String r0 = r11.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01fc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r0 = r11.A00
            java.lang.String r0 = X.AnonymousClass1ZW.A04(r2, r0)
            r1.append(r0)
            java.lang.String r4 = r1.toString()
            goto L_0x001a
        L_0x01f4:
            X.0ta r0 = r11.A02
            if (r0 == 0) goto L_0x0214
            int r0 = r0.A01
            if (r0 != r7) goto L_0x0215
        L_0x01fc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r0 = 2131887577(0x7f1205d9, float:1.9409765E38)
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            goto L_0x001a
        L_0x0214:
            r0 = 0
        L_0x0215:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            X.013 r5 = r10.A0A
            r4 = 2131755224(0x7f1000d8, float:1.9141321E38)
            long r2 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r9] = r0
            java.lang.String r0 = r5.A0J(r1, r4, r2)
            r6.append(r0)
            java.lang.String r4 = r6.toString()
            goto L_0x001a
        L_0x0238:
            boolean r0 = r11 instanceof X.C38751rM
            java.lang.String r5 = "📌"
            if (r0 == 0) goto L_0x024e
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x0249
            X.1rM r11 = (X.C38751rM) r11
            java.lang.String r4 = r11.A01
        L_0x0249:
            r0 = 2131887586(0x7f1205e2, float:1.9409783E38)
            goto L_0x0012
        L_0x024e:
            boolean r0 = r11 instanceof X.C38841rV
            if (r0 == 0) goto L_0x0257
            r0 = 2131887585(0x7f1205e1, float:1.9409781E38)
            goto L_0x0012
        L_0x0257:
            boolean r0 = r11 instanceof X.C38771rO
            if (r0 == 0) goto L_0x027b
            X.1rO r11 = (X.C38771rO) r11
            int r2 = r11.A15()
            if (r2 == 0) goto L_0x0277
            r3 = 2131887595(0x7f1205eb, float:1.9409802E38)
            if (r2 == r7) goto L_0x0271
            r0 = 2
            r3 = 2131887583(0x7f1205df, float:1.9409777E38)
            if (r2 == r0) goto L_0x0271
            r3 = 2131887582(0x7f1205de, float:1.9409775E38)
        L_0x0271:
            java.lang.String r4 = r1.getString(r3)
            goto L_0x001a
        L_0x0277:
            r3 = 2131887599(0x7f1205ef, float:1.940981E38)
            goto L_0x0271
        L_0x027b:
            boolean r0 = X.C41061vA.A0I(r11)
            r2 = 5
            if (r0 == 0) goto L_0x0291
            X.1Vt r0 = r11.A0L
            if (r0 == 0) goto L_0x02d9
            int r0 = r0.A03
            r3 = 2131889712(0x7f120e30, float:1.9414095E38)
            if (r0 == r2) goto L_0x0271
            r3 = 2131889972(0x7f120f34, float:1.9414623E38)
            goto L_0x0271
        L_0x0291:
            boolean r0 = r11 instanceof X.C38791rQ
            if (r0 == 0) goto L_0x02a6
            X.1Vt r0 = r11.A0L
            if (r0 == 0) goto L_0x02e2
            int r0 = r0.A03
            if (r0 == r2) goto L_0x02e2
            r0 = 2131889972(0x7f120f34, float:1.9414623E38)
            java.lang.String r4 = r1.getString(r0)
            goto L_0x001a
        L_0x02a6:
            boolean r0 = r11 instanceof X.C38831rU
            if (r0 == 0) goto L_0x02b7
            X.1Vw r0 = r11.A11
            boolean r0 = r0.A02
            r3 = 2131891317(0x7f121475, float:1.941735E38)
            if (r0 == 0) goto L_0x0271
            r3 = 2131891318(0x7f121476, float:1.9417353E38)
            goto L_0x0271
        L_0x02b7:
            boolean r0 = r11 instanceof X.C38861rX
            if (r0 == 0) goto L_0x02c8
            X.1Vw r0 = r11.A11
            boolean r0 = r0.A02
            r3 = 2131890053(0x7f120f85, float:1.9414787E38)
            if (r0 == 0) goto L_0x0271
            r3 = 2131890080(0x7f120fa0, float:1.9414842E38)
            goto L_0x0271
        L_0x02c8:
            boolean r0 = r11 instanceof X.C38881rZ
            if (r0 == 0) goto L_0x02eb
            X.1Vw r0 = r11.A11
            boolean r0 = r0.A02
            r3 = 2131890078(0x7f120f9e, float:1.9414838E38)
            if (r0 == 0) goto L_0x0271
            r3 = 2131890079(0x7f120f9f, float:1.941484E38)
            goto L_0x0271
        L_0x02d9:
            r0 = 2131887578(0x7f1205da, float:1.9409767E38)
            java.lang.String r4 = r1.getString(r0)
            goto L_0x001a
        L_0x02e2:
            r0 = 2131889711(0x7f120e2f, float:1.9414093E38)
            java.lang.String r4 = r1.getString(r0)
            goto L_0x001a
        L_0x02eb:
            boolean r0 = r11 instanceof X.C39061rr
            if (r0 == 0) goto L_0x02f8
            r0 = 2131890380(0x7f1210cc, float:1.941545E38)
            java.lang.String r4 = r1.getString(r0)
            goto L_0x001a
        L_0x02f8:
            boolean r0 = r11 instanceof X.C16830ti
            if (r0 == 0) goto L_0x0301
            if (r4 != 0) goto L_0x001a
            java.lang.String r0 = ""
            return r0
        L_0x0301:
            boolean r0 = r11 instanceof X.C39171s2
            if (r0 == 0) goto L_0x0312
            X.1s2 r11 = (X.C39171s2) r11
            java.lang.String r1 = r11.A03
            java.lang.String r0 = "📊"
            java.lang.String r4 = A08(r4, r0, r1)
            goto L_0x001a
        L_0x0312:
            boolean r0 = r11 instanceof X.C39221s7
            if (r0 == 0) goto L_0x031f
            r0 = 2131890871(0x7f1212b7, float:1.9416446E38)
            java.lang.String r4 = r3.A02(r0)
            goto L_0x001a
        L_0x031f:
            boolean r0 = r11 instanceof X.C39211s6
            if (r0 == 0) goto L_0x032c
            r0 = 2131890886(0x7f1212c6, float:1.9416476E38)
            java.lang.String r4 = r3.A02(r0)
            goto L_0x001a
        L_0x032c:
            r0 = 2131887592(0x7f1205e8, float:1.9409795E38)
            java.lang.String r4 = r1.getString(r0)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218415q.A0F(X.0tZ):java.lang.CharSequence");
    }

    public CharSequence A0G(C16740tZ r4) {
        CharSequence A002;
        byte b2 = r4.A10;
        if (b2 == 0 || b2 == 7 || (r4 instanceof C39041rp) || ((r4 instanceof C38641rB) && r4.A0L != null)) {
            AnonymousClass1Vt r0 = r4.A0L;
            if (r0 != null) {
                A002 = r0.A03 != 5 ? this.A0G.A0V(r4, true) : this.A09.A00.getString(R.string.str0e30);
            } else if (C42551xz.A04(r4)) {
                String A003 = C42551xz.A00(r4);
                if (TextUtils.isEmpty(A003)) {
                    A003 = "";
                }
                if (!TextUtils.isEmpty(r4.A0I())) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(r4.A0I());
                    sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                    sb.append(A003);
                    A003 = sb.toString();
                }
                A002 = A0H(A003);
            } else {
                A002 = this.A0F.A00(A0H(r4.A0I()), r4.A0q);
            }
            CharSequence A022 = AnonymousClass1ZW.A02(A002);
            return (!TextUtils.isEmpty(A022) || !(r4 instanceof AnonymousClass1WU)) ? A022 : this.A03.A0C((AnonymousClass1WU) r4, false);
        }
        CharSequence A0F2 = A0F(r4);
        if (b2 == 27) {
            A0F2 = C45922Bq.A03(this.A08, this.A0H, A0F2);
        }
        return this.A0F.A00(A0F2, r4.A0q);
    }

    public final CharSequence A0H(String str) {
        if (str == null) {
            return "";
        }
        AnonymousClass01V r6 = this.A08;
        C17020u3 r5 = this.A0H;
        if (((long) str.length()) > FileUtils.ONE_KB) {
            StringBuilder sb = new StringBuilder();
            sb.append(str.subSequence(0, 1020));
            sb.append("…");
            str = sb.toString();
        }
        return C45922Bq.A03(r6, r5, C40651uT.A03(str));
    }

    public String A0I(C15830rv r4, int i2) {
        if (r4 == null) {
            Log.w("notification/messagepreview/getname remote_resource null");
            return "";
        }
        C16080sP r2 = this.A06;
        C16010sH A0A2 = this.A05.A0A(r4);
        return yo.HNotifTitle(A0A2, r2.A0G(A0A2, i2, false));
    }

    public void A0J(C007503l r6, C16010sH r7) {
        Context context = this.A09.A00;
        Intent A032 = C14750ph.A03(context);
        A032.putExtra("show_mute", true);
        A032.putExtra("mute_jid", C16030sJ.A03(r7.A0E));
        r6.A0N.add(new AnonymousClass04E(R.drawable.ic_notif_mute, context.getString(R.string.str0da3), C42341xd.A00(context, 4, A032, 134217728)));
    }

    public void A0K(C007503l r27, C16010sH r28, C37871ps r29, boolean z2, boolean z3, boolean z4, boolean z5) {
        Context context = this.A09.A00;
        C14710pd r25 = this.A0E;
        AnonymousClass15B r9 = this.A0D;
        C16080sP r24 = this.A06;
        AnonymousClass013 r23 = this.A0A;
        C16460t6 r15 = this.A0B;
        C16010sH r4 = r28;
        Bitmap A022 = (!z4 || !z3) ? null : this.A07.A02(context, r4, 400, 400);
        AnonymousClass04F r3 = new AnonymousClass04F();
        C37871ps r10 = r29;
        if (z2) {
            C16740tZ r2 = r10.A00;
            if ((r2 instanceof C38681rF) && ((C16730tY) r2).A02 != null) {
                AnonymousClass04F r7 = new AnonymousClass04F();
                r7.A05 = 4 | r7.A05;
                C007503l r1 = new C007503l(context, (String) null);
                r7.A01(r1);
                r3.A0D.add(r1.A01());
            }
        }
        if (z4) {
            Class<C15830rv> cls = C15830rv.class;
            C34651kc A0C2 = r15.A0C((C15830rv) r4.A08(cls), 20, 1, -1, true);
            Cursor cursor = A0C2.A00;
            CharSequence charSequence = "";
            if (cursor != null) {
                try {
                    if (cursor.moveToLast()) {
                        CharSequence concat = r9.A06((C15830rv) r4.A08(cls), A0C2.A02) ? TextUtils.concat(new CharSequence[]{charSequence, "…"}) : charSequence;
                        do {
                            C15830rv r12 = (C15830rv) r4.A08(cls);
                            AnonymousClass00B.A06(r12);
                            C16740tZ A0G2 = r15.A0G(cursor, r12);
                            CharSequence A0E2 = A0G2 != null ? A0E(r4, A0G2, false, true) : charSequence;
                            if (A0E2 != charSequence) {
                                if (concat != charSequence) {
                                    concat = TextUtils.concat(new CharSequence[]{concat, "\n\n"});
                                }
                                concat = TextUtils.concat(new CharSequence[]{concat, A0E2});
                            }
                        } while (cursor.moveToPrevious());
                        charSequence = concat;
                    }
                } finally {
                    cursor.close();
                }
            }
            C007503l r72 = new C007503l(context, (String) null);
            NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
            notificationCompat$BigTextStyle.A09(charSequence);
            r72.A08(notificationCompat$BigTextStyle);
            AnonymousClass04F r5 = new AnonymousClass04F();
            r5.A05 = 8 | r5.A05;
            r5.A01(r72);
            r3.A0D.add(r72.A01());
        }
        if (z5) {
            AnonymousClass04G r11 = new AnonymousClass04G(new Bundle(), context.getString(R.string.str1406, new Object[]{yo.HNotifTitle(r4, r24.A08(r4))}), "android_wear_voice_input", new HashSet(), r23.A0U(AndroidWear.A0D));
            Intent intent = new Intent(AndroidWear.A0C, ContentUris.withAppendedId(C45912Bp.A00, r4.A05()), context, AndroidWear.class);
            int i2 = 134217728;
            if (C42341xd.A01) {
                i2 = 167772160;
            }
            PendingIntent service = PendingIntent.getService(context, 0, intent, i2);
            CharSequence charSequence2 = r11.A01;
            AnonymousClass04G[] r13 = null;
            IconCompat A023 = IconCompat.A02((Resources) null, "", R.drawable.ic_full_reply);
            Bundle bundle = new Bundle();
            CharSequence A002 = C007503l.A00(charSequence2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(r11);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.add(it.next());
            }
            AnonymousClass04G[] r22 = null;
            if (!arrayList2.isEmpty()) {
                r13 = (AnonymousClass04G[]) arrayList2.toArray(new AnonymousClass04G[arrayList2.size()]);
            }
            if (!arrayList3.isEmpty()) {
                r22 = (AnonymousClass04G[]) arrayList3.toArray(new AnonymousClass04G[arrayList3.size()]);
            }
            r3.A0C.add(new AnonymousClass04E(service, bundle, A023, A002, r22, r13, 0, true, true));
            if (r25.A0E(C16620tM.A02, 2773)) {
                r3.A0C.add(AndroidWear.A01(context, r4, r10.A00, "👍", R.drawable.ic_notif_thumbs_up));
                r3.A0C.add(AndroidWear.A01(context, r4, r10.A00, "❤️", R.drawable.ic_notif_heart));
            }
        }
        r3.A0C.add(AndroidWear.A00(context, r4));
        if (A022 != null) {
            r3.A09 = A022;
        }
        r3.A01(r27);
    }

    public boolean A0L(UserJid userJid) {
        int currentInterruptionFilter;
        Cursor query;
        AnonymousClass00B.A00();
        C16000sG r4 = this.A05;
        C16010sH A0A2 = r4.A0A(userJid);
        NotificationManager A082 = this.A08.A08();
        if (!(A082 == null || Build.VERSION.SDK_INT < 28 || (currentInterruptionFilter = A082.getCurrentInterruptionFilter()) == 1 || currentInterruptionFilter == 0)) {
            NotificationManager.Policy notificationPolicy = A082.getNotificationPolicy();
            if (notificationPolicy == null) {
                Log.i("NotificationUtils/shouldCallBeSilencedByDNDMode NotificationManager policy is null");
            } else {
                StringBuilder sb = new StringBuilder("NotificationUtils/shouldCallBeSilencedByDNDMode NotificationManager policy ");
                sb.append(notificationPolicy);
                Log.i(sb.toString());
                if ((notificationPolicy.priorityCategories & 8) == 0) {
                    Log.i("NotificationUtils/shouldCallBeSilencedByDNDMode Calls not allowed in DND");
                    return true;
                }
                int i2 = notificationPolicy.priorityCallSenders;
                if (i2 == 1) {
                    if (A0A2.A0D == null) {
                        return true;
                    }
                } else if (i2 == 2) {
                    ContentResolver contentResolver = this.A09.A00.getContentResolver();
                    AnonymousClass00B.A00();
                    Uri A042 = r4.A04(contentResolver, A0A2);
                    boolean z2 = false;
                    if (A042 == null || (query = contentResolver.query(A042, (String[]) null, "starred==1", (String[]) null, (String) null)) == null) {
                        return true;
                    }
                    try {
                        if (query.moveToNext()) {
                            z2 = true;
                        }
                        query.close();
                        if (!z2) {
                            return true;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return false;
        throw th;
    }

    public StatusBarNotification[] A0M() {
        NotificationManager A082 = this.A08.A08();
        if (A082 != null) {
            try {
                return A082.getActiveNotifications();
            } catch (Exception e2) {
                Log.w("notification-utils/failed to get active notifications: ", e2);
            }
        }
        return new StatusBarNotification[0];
    }
}
