package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.15p  reason: invalid class name and case insensitive filesystem */
public class C218315p {
    public final C16040sK A00;
    public final C16000sG A01;
    public final C17030uP A02;
    public final C16080sP A03;
    public final C16440t3 A04;
    public final C16980tz A05;
    public final AnonymousClass013 A06;
    public final C16070sO A07;
    public final AnonymousClass173 A08;
    public final C14710pd A09;
    public final AnonymousClass174 A0A;
    public final C18090w8 A0B;
    public final C18290wS A0C;
    public final AnonymousClass1Vo A0D = AnonymousClass1Vo.A00("PaymentsUtils", "infra", "COMMON");

    public C218315p(C16040sK r4, C16000sG r5, C17030uP r6, C16080sP r7, C16440t3 r8, C16980tz r9, AnonymousClass013 r10, C16070sO r11, AnonymousClass173 r12, C14710pd r13, AnonymousClass174 r14, C18090w8 r15, C18290wS r16) {
        this.A05 = r9;
        this.A04 = r8;
        this.A09 = r13;
        this.A00 = r4;
        this.A01 = r5;
        this.A03 = r7;
        this.A06 = r10;
        this.A0C = r16;
        this.A02 = r6;
        this.A0B = r15;
        this.A08 = r12;
        this.A0A = r14;
        this.A07 = r11;
    }

    public static int A00(C28411Vz r2) {
        String str = ((C35491m1) r2).A04;
        switch (str.hashCode()) {
            case 66044:
                if (str.equals("BRL")) {
                    return R.drawable.ic_attachment_payment_brl;
                }
                break;
            case 70916:
                if (str.equals("GTQ")) {
                    return R.drawable.ic_attachment_payment_gtq;
                }
                break;
            case 72653:
                if (str.equals("INR")) {
                    return R.drawable.ic_attachment_payment_inr;
                }
                break;
            case 84326:
                if (str.equals("USD")) {
                    return R.drawable.ic_attachment_payment_usd;
                }
                break;
        }
        return 0;
    }

    public static int A01(AnonymousClass1Vt r1) {
        int i2 = r1.A02;
        if (i2 == 802 || i2 == 804 || i2 == 902 || i2 == 904) {
            return R.color.color0617;
        }
        switch (i2) {
            case 11:
            case 12:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
                return R.color.color0616;
            case 13:
            case 14:
                return R.color.color0618;
            case 17:
                return R.color.color0617;
            default:
                switch (i2) {
                    case 101:
                    case 102:
                    case 103:
                    case 104:
                    case 109:
                    case 112:
                        return R.color.color0616;
                    case 105:
                    case 107:
                    case AnonymousClass2EA.A03 /*108*/:
                    case 110:
                    case 111:
                        return R.color.color0618;
                    case 106:
                        return R.color.color0617;
                    default:
                        switch (i2) {
                            case 401:
                            case 402:
                            case 403:
                            case 410:
                            case 415:
                            case 417:
                            case 418:
                                return R.color.color0616;
                            case 404:
                            case 406:
                            case 407:
                            case 408:
                            case 409:
                            case 411:
                            case 412:
                            case 413:
                            case 414:
                            case 416:
                                return R.color.color0618;
                            case 405:
                                return R.color.color0617;
                            default:
                                switch (i2) {
                                    case 420:
                                    case 421:
                                        return R.color.color0616;
                                    case 422:
                                    case 423:
                                    case 424:
                                        return R.color.color0618;
                                    default:
                                        switch (i2) {
                                            case 601:
                                            case 602:
                                            case 603:
                                            case 606:
                                            case 607:
                                            case 608:
                                                return R.color.color0616;
                                            case 604:
                                                return R.color.color0617;
                                            case 605:
                                                return R.color.color0618;
                                            default:
                                                switch (i2) {
                                                    case 703:
                                                        return R.color.color0617;
                                                    case 704:
                                                        return R.color.color0618;
                                                    default:
                                                        return R.color.color0616;
                                                }
                                        }
                                }
                        }
                }
        }
    }

    public static Drawable A02(Context context, C28411Vz r6, int i2, int i3) {
        return new C42671yD(AnonymousClass00X.A02(context), r6.ABE(context), context.getResources().getColor(i2), context.getResources().getDimensionPixelSize(i3));
    }

    public static SpannableStringBuilder A03(Context context, AnonymousClass013 r2, C28411Vz r3, C28401Vy r4) {
        return A04(context, r2, r3, r4, true);
    }

    public static SpannableStringBuilder A04(Context context, AnonymousClass013 r7, C28411Vz r8, C28401Vy r9, boolean z2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A07(r7, r8, r9, z2));
        if (C39791t4.A00 == null) {
            try {
                C39791t4.A00 = AnonymousClass00X.A02(context);
            } catch (Resources.NotFoundException unused) {
                Log.e("PAY: PaymentsTypeface/loadTypefaceSync could not load font R.font.payment_icons_regular");
            }
        }
        Map map = C39791t4.A01;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            if (map.get(str) != null) {
                String str2 = (String) map.get(str);
                if (str2 != null && str != null) {
                    if (C39791t4.A00 != null) {
                        int indexOf = spannableStringBuilder.toString().indexOf(str);
                        if (indexOf >= 0) {
                            spannableStringBuilder.replace(indexOf, str.length() + indexOf, str2);
                            spannableStringBuilder.setSpan(new C39771t2(C39791t4.A00), indexOf, indexOf + 1, 0);
                        }
                    } else {
                        Log.e("PAY: PaymentsTypeface/format Could not load payment_icons_regular typeface, call loadTypeface() before applying font.");
                        return spannableStringBuilder;
                    }
                }
            }
        }
        return spannableStringBuilder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return X.AnonymousClass1yE.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        return X.AnonymousClass1yE.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        return X.AnonymousClass1yE.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass1yE A05(X.AnonymousClass1Vt r0) {
        /*
            int r0 = r0.A02
            switch(r0) {
                case 11: goto L_0x0014;
                case 12: goto L_0x0014;
                case 13: goto L_0x001a;
                case 14: goto L_0x001a;
                case 15: goto L_0x0014;
                case 16: goto L_0x0014;
                case 17: goto L_0x0017;
                case 18: goto L_0x0014;
                case 19: goto L_0x0014;
                case 20: goto L_0x0014;
                default: goto L_0x0005;
            }
        L_0x0005:
            switch(r0) {
                case 101: goto L_0x0014;
                case 102: goto L_0x0014;
                case 103: goto L_0x0014;
                case 104: goto L_0x0014;
                case 105: goto L_0x001a;
                case 106: goto L_0x0017;
                case 107: goto L_0x001a;
                case 108: goto L_0x001a;
                case 109: goto L_0x0014;
                case 110: goto L_0x001a;
                case 111: goto L_0x001a;
                case 112: goto L_0x0014;
                default: goto L_0x0008;
            }
        L_0x0008:
            switch(r0) {
                case 401: goto L_0x0014;
                case 402: goto L_0x0014;
                case 403: goto L_0x0014;
                case 404: goto L_0x001a;
                case 405: goto L_0x0017;
                case 406: goto L_0x001a;
                case 407: goto L_0x001a;
                case 408: goto L_0x001a;
                case 409: goto L_0x001a;
                case 410: goto L_0x0014;
                case 411: goto L_0x001a;
                case 412: goto L_0x001a;
                case 413: goto L_0x001a;
                case 414: goto L_0x001a;
                case 415: goto L_0x0014;
                case 416: goto L_0x001a;
                case 417: goto L_0x0014;
                case 418: goto L_0x0014;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r0) {
                case 420: goto L_0x0014;
                case 421: goto L_0x0014;
                case 422: goto L_0x001a;
                case 423: goto L_0x001a;
                case 424: goto L_0x001a;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r0) {
                case 601: goto L_0x0014;
                case 602: goto L_0x0014;
                case 603: goto L_0x0014;
                case 604: goto L_0x0017;
                case 605: goto L_0x001a;
                case 606: goto L_0x0014;
                case 607: goto L_0x0014;
                case 608: goto L_0x0014;
                default: goto L_0x0011;
            }
        L_0x0011:
            switch(r0) {
                case 703: goto L_0x0017;
                case 704: goto L_0x001a;
                default: goto L_0x0014;
            }
        L_0x0014:
            X.1yE r0 = X.AnonymousClass1yE.PENDING_ICON
            return r0
        L_0x0017:
            X.1yE r0 = X.AnonymousClass1yE.SUCCESS_ICON
            return r0
        L_0x001a:
            X.1yE r0 = X.AnonymousClass1yE.FAILED_ICON
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218315p.A05(X.1Vt):X.1yE");
    }

    public static CharSequence A06(Context context, AnonymousClass1Vt r3) {
        C28411Vz A002 = r3.A00();
        return A002 != C35481m0.A06 ? A002.ABF(context, r3.A0E() ? 1 : 0) : "";
    }

    public static String A07(AnonymousClass013 r3, C28411Vz r4, C28401Vy r5, boolean z2) {
        String A9H = r4.A9H(r3, r5, 0);
        String A9F = r4.A9F(r3, r5);
        BigDecimal bigDecimal = r5.A00;
        int scale = bigDecimal.scale();
        StringBuilder sb = new StringBuilder(A9H);
        int indexOf = A9H.indexOf(A9F);
        int length = A9F.length();
        int i2 = scale + 1;
        if (scale <= 0) {
            i2 = 0;
        }
        int i3 = (length - i2) + indexOf;
        int i4 = indexOf + length;
        if ((bigDecimal.signum() == 0 || bigDecimal.scale() <= 0 || bigDecimal.stripTrailingZeros().scale() <= 0) && z2) {
            sb.delete(i3, i4);
        }
        return sb.toString();
    }

    public static String A08(C28401Vy r2, String str) {
        if (r2 == null) {
            return "";
        }
        return TextUtils.join(";", Arrays.asList(new String[]{str, Long.toString(r2.A00.scaleByPowerOfTen(3).longValue())}));
    }

    public static boolean A09(AnonymousClass1Vt r2) {
        int i2 = r2.A02;
        return i2 == 405 || i2 == 106 || i2 == 604;
    }

    public int A0A(C30681cm r5) {
        C28411Vz r1;
        if (r5 == null) {
            return 0;
        }
        LinkedHashSet linkedHashSet = r5.A05;
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            C28411Vz r12 = (C28411Vz) it.next();
            if (((C35491m1) r12).A00 == 0) {
                if (r12 == null) {
                    return 0;
                }
                Iterator it2 = linkedHashSet.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        r1 = null;
                        break;
                    }
                    r1 = (C28411Vz) it2.next();
                    if (((C35491m1) r1).A00 == 0) {
                        break;
                    }
                }
                return A00(r1);
            }
        }
        return 0;
    }

    public int A0B(C15830rv r7) {
        C18090w8 r3 = this.A0B;
        if (!r3.A0C(0)) {
            return 0;
        }
        C16040sK r4 = this.A00;
        if (r4.A0I(r7) || C16030sJ.A0G(r7)) {
            return 0;
        }
        if (!C16030sJ.A0L(r7)) {
            return r3.A00(UserJid.of(r7));
        }
        r3.A06.A01();
        int i2 = 4;
        C28031Ub it = this.A07.A07.A04((C16060sN) r7).A04().iterator();
        while (it.hasNext()) {
            UserJid userJid = ((C30661ck) it.next()).A03;
            if (!r4.A0I(userJid)) {
                i2 = 3;
                if (r3.A00(userJid) == 2) {
                    return 4;
                }
            }
        }
        return i2;
    }

    public Pair A0C(long j2) {
        Integer valueOf;
        AnonymousClass013 r1;
        int i2;
        if (j2 <= 0) {
            return null;
        }
        int i3 = (int) (j2 / 86400000);
        if (i3 > 0) {
            valueOf = Integer.valueOf(i3);
            r1 = this.A06;
            i2 = 3;
        } else {
            i3 = (int) (j2 / 3600000);
            if (i3 > 0) {
                valueOf = Integer.valueOf(i3);
                r1 = this.A06;
                i2 = 2;
            } else {
                i3 = (int) (j2 / 60000);
                if (i3 <= 0) {
                    return null;
                }
                valueOf = Integer.valueOf(i3);
                r1 = this.A06;
                i2 = 1;
            }
        }
        return new Pair(valueOf, C28961Zl.A02(r1, i3, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004f, code lost:
        if (r2 != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A0D(X.AnonymousClass1Vt r9) {
        /*
            r8 = this;
            java.lang.String r7 = r8.A0O(r9)
            java.lang.String r6 = r8.A0P(r9)
            X.013 r0 = r8.A06
            java.lang.String r1 = r0.A06()
            java.lang.String r0 = "en"
            boolean r2 = r0.equals(r1)
            X.0sK r1 = r8.A00
            com.whatsapp.jid.UserJid r0 = r9.A0D
            boolean r0 = r1.A0I(r0)
            r5 = 0
            r4 = 1
            java.lang.String r3 = ""
            if (r0 == 0) goto L_0x0039
            if (r2 != 0) goto L_0x0039
            X.0tz r0 = r8.A05
            android.content.Context r2 = r0.A00
            r1 = 2131890342(0x7f1210a6, float:1.9415373E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r7
        L_0x002f:
            java.lang.String r1 = r2.getString(r1, r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r3, r1)
            return r0
        L_0x0039:
            com.whatsapp.jid.UserJid r0 = r9.A0E
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x004f
            if (r2 != 0) goto L_0x0051
            X.0tz r0 = r8.A05
            android.content.Context r2 = r0.A00
            r1 = 2131890341(0x7f1210a5, float:1.9415371E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r5] = r6
            goto L_0x002f
        L_0x004f:
            if (r2 == 0) goto L_0x0052
        L_0x0051:
            r3 = r6
        L_0x0052:
            X.0tz r0 = r8.A05
            android.content.Context r2 = r0.A00
            r1 = 2131890340(0x7f1210a4, float:1.941537E38)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r5] = r6
            r0[r4] = r7
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218315p.A0D(X.1Vt):android.util.Pair");
    }

    public CharSequence A0E(Context context, int i2) {
        C28411Vz r0;
        if (i2 == 1) {
            C16040sK r02 = this.A00;
            r02.A0B();
            AnonymousClass1ZT r03 = r02.A05;
            AnonymousClass00B.A06(r03);
            r0 = C30681cm.A00(C30681cm.A01(C39851tA.A02(C24561Gk.A04(r03))).A03).A02;
        } else if (i2 != 3) {
            return null;
        } else {
            r0 = C35481m0.A05;
        }
        return r0.ABE(context);
    }

    public Long A0F(AnonymousClass1Vt r5) {
        AnonymousClass1W2 r0 = r5.A0A;
        if (r0 == null) {
            return null;
        }
        return Long.valueOf(r0.A09() - this.A04.A00());
    }

    public String A0G(long j2) {
        int i2 = 2;
        if (j2 <= 86400000) {
            i2 = 1;
        }
        return A0H(j2, i2);
    }

    public final String A0H(long j2, int i2) {
        AnonymousClass013 r2;
        String str = "";
        if (j2 > 0) {
            long j3 = 86400000;
            int i3 = (int) (j2 / 86400000);
            if (i3 > 0) {
                r2 = this.A06;
                str = C28961Zl.A02(r2, i3, 3);
            } else {
                j3 = 3600000;
                int i4 = (int) (j2 / 3600000);
                if (i4 > 0) {
                    r2 = this.A06;
                    str = C28961Zl.A02(r2, i4, 2);
                } else {
                    int i5 = (int) (j2 / 60000);
                    if (i5 > 0) {
                        return C28961Zl.A02(this.A06, i5, 1);
                    }
                }
            }
            long j4 = j2 % j3;
            if (!(i2 == 1 || j4 == 0)) {
                return r2.A0B(243, str, A0H(j4, 1));
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r1 != 200) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0I(X.AnonymousClass1Vt r22) {
        /*
            r21 = this;
            r9 = r21
            X.1Vo r3 = r9.A0D
            java.lang.String r0 = "getStatusChangeNotifStringWithoutMessage status:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = r22
            int r0 = r2.A02
            r1.append(r0)
            java.lang.String r0 = " type:"
            r1.append(r0)
            int r0 = r2.A03
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.A06(r0)
            X.1Vy r0 = r2.A08
            r5 = 1
            if (r0 != 0) goto L_0x00b1
            r15 = 1
        L_0x0029:
            X.1Vy r0 = r2.A08
            if (r0 != 0) goto L_0x00ac
            X.0tz r0 = r9.A05
            android.content.Context r1 = r0.A00
            r0 = 2131892363(0x7f12188b, float:1.9419472E38)
            java.lang.String r6 = r1.getString(r0)
        L_0x0038:
            int r1 = r2.A03
            r8 = 0
            if (r1 == r5) goto L_0x00f4
            r7 = 2
            if (r1 == r7) goto L_0x00d3
            r0 = 9
            if (r1 == r0) goto L_0x00b9
            r0 = 10
            java.lang.String r3 = ""
            if (r1 == r0) goto L_0x0076
            r0 = 20
            if (r1 == r0) goto L_0x0057
            r0 = 100
            if (r1 == r0) goto L_0x00f4
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00d3
        L_0x0056:
            return r3
        L_0x0057:
            int r1 = r2.A02
            r0 = 12
            if (r1 != r0) goto L_0x0056
            X.0wS r1 = r9.A0C
            X.19r r0 = r1.A03()
            X.1yG r0 = r0.AAi()
            if (r0 == 0) goto L_0x0056
            X.19r r0 = r1.A03()
            X.1yG r0 = r0.AAi()
            java.lang.String r0 = r0.A00(r2, r6)
            return r0
        L_0x0076:
            int r1 = r2.A02
            r0 = 13
            if (r1 == r0) goto L_0x00a4
            r0 = 14
            if (r1 == r0) goto L_0x00a4
            r0 = 16
            if (r1 != r0) goto L_0x0098
            X.0tz r0 = r9.A05
            android.content.Context r4 = r0.A00
            r3 = 2131890333(0x7f12109d, float:1.9415355E38)
        L_0x008b:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r0 = r9.A0Q(r2)
            r1[r8] = r0
            java.lang.String r0 = r4.getString(r3, r1)
            return r0
        L_0x0098:
            r0 = 15
            if (r1 != r0) goto L_0x0056
            X.0tz r0 = r9.A05
            android.content.Context r4 = r0.A00
            r3 = 2131890335(0x7f12109f, float:1.9415359E38)
            goto L_0x008b
        L_0x00a4:
            X.0tz r0 = r9.A05
            android.content.Context r4 = r0.A00
            r3 = 2131890334(0x7f12109e, float:1.9415357E38)
            goto L_0x008b
        L_0x00ac:
            java.lang.String r6 = r9.A0J(r2)
            goto L_0x0038
        L_0x00b1:
            java.math.BigDecimal r0 = r0.A00
            int r15 = r0.intValue()
            goto L_0x0029
        L_0x00b9:
            X.0tz r0 = r9.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131755281(0x7f100111, float:1.9141437E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r9.A0Q(r2)
            r1[r8] = r0
            r1[r5] = r6
            java.lang.String r0 = r4.getQuantityString(r3, r15, r1)
            return r0
        L_0x00d3:
            X.0tz r0 = r9.A05
            android.content.Context r0 = r0.A00
            android.content.res.Resources r4 = r0.getResources()
            r3 = 2131755278(0x7f10010e, float:1.914143E38)
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r9.A0Q(r2)
            r1[r8] = r0
            r1[r5] = r6
            java.lang.String r0 = r9.A0N(r2)
            r1[r7] = r0
            java.lang.String r0 = r4.getQuantityString(r3, r15, r1)
            return r0
        L_0x00f4:
            java.lang.String r10 = r9.A0N(r2)
            java.lang.String r11 = r9.A0Q(r2)
            int r13 = r2.A02
            X.1W2 r0 = r2.A0A
            if (r0 != 0) goto L_0x0114
            r14 = 0
        L_0x0103:
            r16 = 0
            long r0 = r2.A06
            java.lang.String r12 = r9.A0J(r2)
            r20 = 1
            r18 = r0
            java.lang.String r0 = r9.A0Y(r10, r11, r12, r13, r14, r15, r16, r18, r20)
            return r0
        L_0x0114:
            int r14 = r0.A06()
            goto L_0x0103
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218315p.A0I(X.1Vt):java.lang.String");
    }

    public String A0J(AnonymousClass1Vt r5) {
        return (AnonymousClass1W1.A08(r5) || TextUtils.isEmpty(r5.A0I) || r5.A08 == null) ? "" : r5.A00().A9H(this.A06, r5.A08, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        return r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1 = r4.A05.A00;
        r0 = com.obwhatsapp.R.string.str112e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r1 = r4.A05.A00;
        r0 = com.obwhatsapp.R.string.str1122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        r1 = r4.A05.A00;
        r0 = com.obwhatsapp.R.string.str1129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        r1 = r4.A05.A00;
        r0 = com.obwhatsapp.R.string.str112a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        r1 = r4.A05.A00;
        r0 = com.obwhatsapp.R.string.str111f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        r1 = r4.A05.A00;
        r0 = com.obwhatsapp.R.string.str1123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r1 = r4.A05.A00;
        r0 = com.obwhatsapp.R.string.str112d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0K(X.AnonymousClass1Vt r5) {
        /*
            r4 = this;
            int r0 = r5.A02
            if (r0 == 0) goto L_0x0095
            switch(r0) {
                case 11: goto L_0x004d;
                case 12: goto L_0x0045;
                case 13: goto L_0x005d;
                case 14: goto L_0x005d;
                case 15: goto L_0x006d;
                case 16: goto L_0x003d;
                case 17: goto L_0x0055;
                case 18: goto L_0x0065;
                case 19: goto L_0x0080;
                case 20: goto L_0x0045;
                default: goto L_0x0007;
            }
        L_0x0007:
            switch(r0) {
                case 101: goto L_0x004d;
                case 102: goto L_0x0045;
                case 103: goto L_0x004d;
                case 104: goto L_0x004d;
                case 105: goto L_0x005d;
                case 106: goto L_0x0055;
                case 107: goto L_0x003d;
                case 108: goto L_0x005d;
                case 109: goto L_0x004d;
                case 110: goto L_0x0045;
                case 111: goto L_0x005d;
                case 112: goto L_0x0065;
                case 113: goto L_0x004d;
                case 114: goto L_0x004d;
                case 115: goto L_0x0045;
                default: goto L_0x000a;
            }
        L_0x000a:
            switch(r0) {
                case 401: goto L_0x004d;
                case 402: goto L_0x0045;
                case 403: goto L_0x004d;
                case 404: goto L_0x005d;
                case 405: goto L_0x0055;
                case 406: goto L_0x005d;
                case 407: goto L_0x005d;
                case 408: goto L_0x005d;
                case 409: goto L_0x005d;
                case 410: goto L_0x004d;
                case 411: goto L_0x005d;
                case 412: goto L_0x005d;
                case 413: goto L_0x005d;
                case 414: goto L_0x005d;
                case 415: goto L_0x0065;
                case 416: goto L_0x003d;
                case 417: goto L_0x0075;
                case 418: goto L_0x0035;
                case 419: goto L_0x0045;
                case 420: goto L_0x004d;
                case 421: goto L_0x0065;
                case 422: goto L_0x005d;
                case 423: goto L_0x005d;
                case 424: goto L_0x005d;
                case 425: goto L_0x0045;
                default: goto L_0x000d;
            }
        L_0x000d:
            switch(r0) {
                case 601: goto L_0x004d;
                case 602: goto L_0x004d;
                case 603: goto L_0x002d;
                case 604: goto L_0x0055;
                case 605: goto L_0x005d;
                case 606: goto L_0x0065;
                case 607: goto L_0x003d;
                case 608: goto L_0x0045;
                default: goto L_0x0010;
            }
        L_0x0010:
            switch(r0) {
                case 701: goto L_0x004d;
                case 702: goto L_0x002d;
                case 703: goto L_0x0055;
                case 704: goto L_0x005d;
                case 705: goto L_0x0065;
                default: goto L_0x0013;
            }
        L_0x0013:
            switch(r0) {
                case 801: goto L_0x004d;
                case 802: goto L_0x0055;
                case 803: goto L_0x004d;
                case 804: goto L_0x0055;
                default: goto L_0x0016;
            }
        L_0x0016:
            switch(r0) {
                case 901: goto L_0x0025;
                case 902: goto L_0x0055;
                case 903: goto L_0x0025;
                case 904: goto L_0x0055;
                default: goto L_0x0019;
            }
        L_0x0019:
            X.0tz r0 = r4.A05
            android.content.Context r1 = r0.A00
            r0 = 2131890475(0x7f12112b, float:1.9415643E38)
        L_0x0020:
            java.lang.String r0 = r1.getString(r0)
            return r0
        L_0x0025:
            X.0tz r0 = r4.A05
            android.content.Context r1 = r0.A00
            r0 = 2131890476(0x7f12112c, float:1.9415645E38)
            goto L_0x0020
        L_0x002d:
            X.0tz r0 = r4.A05
            android.content.Context r1 = r0.A00
            r0 = 2131890478(0x7f12112e, float:1.9415649E38)
            goto L_0x0020
        L_0x0035:
            X.0tz r0 = r4.A05
            android.content.Context r1 = r0.A00
            r0 = 2131890462(0x7f12111e, float:1.9415616E38)
            goto L_0x0020
        L_0x003d:
            X.0tz r0 = r4.A05
            android.content.Context r1 = r0.A00
            r0 = 2131890466(0x7f121122, float:1.9415625E38)
            goto L_0x0020
        L_0x0045:
            X.0tz r0 = r4.A05
            android.content.Context r1 = r0.A00
            r0 = 2131890473(0x7f121129, float:1.9415639E38)
            goto L_0x0020
        L_0x004d:
            X.0tz r0 = r4.A05
            android.content.Context r1 = r0.A00
            r0 = 2131890474(0x7f12112a, float:1.941564E38)
            goto L_0x0020
        L_0x0055:
            X.0tz r0 = r4.A05
            android.content.Context r1 = r0.A00
            r0 = 2131890463(0x7f12111f, float:1.9415619E38)
            goto L_0x0020
        L_0x005d:
            X.0tz r0 = r4.A05
            android.content.Context r1 = r0.A00
            r0 = 2131890467(0x7f121123, float:1.9415627E38)
            goto L_0x0020
        L_0x0065:
            X.0tz r0 = r4.A05
            android.content.Context r1 = r0.A00
            r0 = 2131890477(0x7f12112d, float:1.9415647E38)
            goto L_0x0020
        L_0x006d:
            X.0tz r0 = r4.A05
            android.content.Context r1 = r0.A00
            r0 = 2131890349(0x7f1210ad, float:1.9415387E38)
            goto L_0x0020
        L_0x0075:
            X.0wS r0 = r4.A0C
            X.19r r0 = r0.A03()
            java.lang.String r0 = r0.AFi(r5)
            return r0
        L_0x0080:
            X.0tz r0 = r4.A05
            android.content.Context r3 = r0.A00
            int r2 = r5.A03
            r1 = 10
            r0 = 2131890352(0x7f1210b0, float:1.9415393E38)
            if (r2 != r1) goto L_0x0090
            r0 = 2131890360(0x7f1210b8, float:1.941541E38)
        L_0x0090:
            java.lang.String r0 = r3.getString(r0)
            return r0
        L_0x0095:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218315p.A0K(X.1Vt):java.lang.String");
    }

    public final String A0L(AnonymousClass1Vt r6) {
        boolean A0I = this.A00.A0I(r6.A0D);
        C16980tz r0 = this.A05;
        if (A0I) {
            return r0.A00.getString(R.string.str0f51);
        }
        return r0.A00.getString(R.string.str0f52, new Object[]{A0N(r6)});
    }

    public synchronized String A0M(AnonymousClass1Vt r2) {
        return A0T(r2, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        if (r3 != 1000) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0044, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008e, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0N(X.AnonymousClass1Vt r8) {
        /*
            r7 = this;
            r6 = r7
            monitor-enter(r6)
            com.whatsapp.jid.UserJid r1 = r8.A0D     // Catch:{ all -> 0x008f }
            if (r1 == 0) goto L_0x001d
            X.0sG r0 = r7.A01     // Catch:{ all -> 0x008f }
            X.0sH r5 = r0.A0A(r1)     // Catch:{ all -> 0x008f }
        L_0x000c:
            X.0tz r0 = r7.A05     // Catch:{ all -> 0x008f }
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x008f }
            r0 = 2131892366(0x7f12188e, float:1.9419478E38)
            java.lang.String r4 = r2.getString(r0)     // Catch:{ all -> 0x008f }
            int r3 = r8.A03     // Catch:{ all -> 0x008f }
            r1 = 1
            if (r3 == r1) goto L_0x001f
            goto L_0x0029
        L_0x001d:
            r5 = 0
            goto L_0x000c
        L_0x001f:
            if (r5 == 0) goto L_0x0022
            goto L_0x0045
        L_0x0022:
            java.lang.String r0 = r7.A0S(r8, r1)     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x0043
            goto L_0x008d
        L_0x0029:
            r0 = 2
            if (r3 == r0) goto L_0x0086
            r0 = 3
            if (r3 == r0) goto L_0x004c
            r0 = 10
            if (r3 == r0) goto L_0x0086
            r0 = 20
            if (r3 == r0) goto L_0x001f
            r0 = 100
            if (r3 == r0) goto L_0x001f
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == r0) goto L_0x0086
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 == r0) goto L_0x0055
        L_0x0043:
            monitor-exit(r6)
            return r4
        L_0x0045:
            X.0sP r0 = r7.A03     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.A0E(r5)     // Catch:{ all -> 0x008f }
            goto L_0x008d
        L_0x004c:
            if (r5 == 0) goto L_0x0055
            X.0sP r0 = r7.A03     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.A0E(r5)     // Catch:{ all -> 0x008f }
            goto L_0x008d
        L_0x0055:
            X.0sK r1 = r7.A00     // Catch:{ all -> 0x0084 }
            com.whatsapp.jid.UserJid r0 = r8.A0D     // Catch:{ all -> 0x0084 }
            boolean r0 = r1.A0I(r0)     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0067
            r0 = 2131893160(0x7f121ba8, float:1.9421089E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0084 }
            goto L_0x008d
        L_0x0067:
            com.whatsapp.jid.UserJid r1 = r8.A0D     // Catch:{ all -> 0x0084 }
            if (r1 == 0) goto L_0x0072
            X.0sG r0 = r7.A01     // Catch:{ all -> 0x0084 }
            X.0sH r1 = r0.A0A(r1)     // Catch:{ all -> 0x0084 }
            goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            if (r1 == 0) goto L_0x007c
            X.0sP r0 = r7.A03     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = r0.A0E(r1)     // Catch:{ all -> 0x0084 }
            goto L_0x008d
        L_0x007c:
            r0 = 2131892366(0x7f12188e, float:1.9419478E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0084 }
            goto L_0x008d
        L_0x0084:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x008f }
        L_0x0086:
            r0 = 2131893160(0x7f121ba8, float:1.9421089E38)
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x008f }
        L_0x008d:
            monitor-exit(r6)
            return r0
        L_0x008f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218315p.A0N(X.1Vt):java.lang.String");
    }

    public synchronized String A0O(AnonymousClass1Vt r4) {
        String str;
        AnonymousClass00B.A0G(r4.A0E());
        UserJid userJid = r4.A0E;
        C16010sH A0A2 = userJid != null ? this.A01.A0A(userJid) : null;
        if (A0A2 != null) {
            str = this.A00.A0I(A0A2.A0E) ? this.A05.A00.getString(R.string.str1ba8) : this.A03.A0E(A0A2);
        } else {
            str = A0S(r4, false);
            if (str == null) {
                str = this.A05.A00.getString(R.string.str188a);
            }
        }
        return str;
    }

    public synchronized String A0P(AnonymousClass1Vt r4) {
        String str;
        AnonymousClass00B.A0G(r4.A0E());
        UserJid userJid = r4.A0D;
        C16010sH A0A2 = userJid != null ? this.A01.A0A(userJid) : null;
        if (A0A2 != null) {
            str = this.A00.A0I(A0A2.A0E) ? this.A05.A00.getString(R.string.str1ba8) : this.A03.A0E(A0A2);
        } else {
            str = A0S(r4, true);
            if (str == null) {
                str = this.A05.A00.getString(R.string.str188a);
            }
        }
        return str;
    }

    public synchronized String A0Q(AnonymousClass1Vt r3) {
        String str;
        UserJid userJid = r3.A0E;
        C16010sH A0A2 = userJid != null ? this.A01.A0A(userJid) : null;
        if (A0A2 != null) {
            str = this.A03.A0E(A0A2);
        } else {
            str = A0S(r3, false);
            if (str == null) {
                str = this.A05.A00.getString(R.string.str188a);
            }
        }
        return str;
    }

    public synchronized String A0R(AnonymousClass1Vt r8, C16740tZ r9) {
        String str;
        C16000sG r1 = this.A01;
        UserJid A0C2 = r9.A0C();
        AnonymousClass00B.A06(A0C2);
        C16010sH A0A2 = r1.A0A(A0C2);
        if (r9 instanceof C38861rX) {
            if (r8.A08 != null) {
                Context context = this.A05.A00;
                boolean z2 = r9.A11.A02;
                int i2 = R.string.str0fbf;
                if (z2) {
                    i2 = R.string.str0fc5;
                }
                str = context.getString(i2, new Object[]{this.A03.A08(A0A2), A0J(r8)});
            } else {
                Context context2 = this.A05.A00;
                boolean z3 = r9.A11.A02;
                int i3 = R.string.str0fc0;
                if (z3) {
                    i3 = R.string.str0fc6;
                }
                str = context2.getString(i3, new Object[]{this.A03.A08(A0A2), A0J(r8)});
            }
        } else if (!(r9 instanceof C38881rZ)) {
            throw new IllegalStateException(AnonymousClass1Vo.A01("PaymentsUtils", "Request message is not cancelled or rejected"));
        } else if (r8.A08 != null) {
            Context context3 = this.A05.A00;
            boolean z4 = r9.A11.A02;
            int i4 = R.string.str0fc1;
            if (z4) {
                i4 = R.string.str0fc2;
            }
            str = context3.getString(i4, new Object[]{this.A03.A08(A0A2), A0J(r8)});
        } else {
            Context context4 = this.A05.A00;
            boolean z5 = r9.A11.A02;
            int i5 = R.string.str0fc4;
            if (z5) {
                i5 = R.string.str0fc3;
            }
            str = context4.getString(i5, new Object[]{this.A03.A08(A0A2), A0J(r8)});
        }
        return str;
    }

    public final String A0S(AnonymousClass1Vt r5, boolean z2) {
        boolean z3;
        if (r5.A0A == null) {
            return null;
        }
        C14710pd r2 = this.A09;
        C16620tM r1 = C16620tM.A02;
        if (r2.A0E(r1, 1611)) {
            AnonymousClass1W2 r0 = r5.A0A;
            C35301lh A0D2 = z2 ? r0.A0D() : r0.A0E();
            String str = (String) (A0D2 == null ? null : A0D2.A00);
            if (str != null) {
                if (!AnonymousClass1ZW.A0E(str)) {
                    try {
                        JSONArray jSONArray = new JSONArray(r2.A06(r1, 1940));
                        int i2 = 0;
                        while (true) {
                            if (i2 >= jSONArray.length()) {
                                break;
                            } else if (str.equalsIgnoreCase(jSONArray.getString(i2))) {
                                z3 = false;
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } catch (JSONException unused) {
                        Log.e("PaymentsUtils failed to parse json in abprop");
                    }
                }
                z3 = true;
                if (z3) {
                    return str;
                }
            }
        }
        AnonymousClass1W2 r02 = r5.A0A;
        return z2 ? r02.A0I() : r02.A0J();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0T(X.AnonymousClass1Vt r5, boolean r6) {
        /*
            r4 = this;
            r3 = r4
            monitor-enter(r3)
            int r1 = r5.A03     // Catch:{ all -> 0x00e1 }
            r0 = 20
            if (r1 == r0) goto L_0x00b2
            r0 = 30
            if (r1 == r0) goto L_0x0079
            r0 = 40
            if (r1 == r0) goto L_0x00b2
            r0 = 100
            if (r1 == r0) goto L_0x00b2
            r0 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r1 == r0) goto L_0x0058
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r0) goto L_0x0079
            switch(r1) {
                case 1: goto L_0x00b2;
                case 2: goto L_0x0058;
                case 3: goto L_0x0079;
                case 4: goto L_0x0079;
                case 5: goto L_0x0079;
                case 6: goto L_0x004b;
                case 7: goto L_0x0037;
                case 8: goto L_0x002a;
                case 9: goto L_0x0022;
                case 10: goto L_0x0058;
                default: goto L_0x0020;
            }     // Catch:{ all -> 0x00e1 }
        L_0x0020:
            goto L_0x00d4
        L_0x0022:
            java.lang.String r0 = r4.A0S(r5, r2)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00d4
            goto L_0x00df
        L_0x002a:
            X.0tz r0 = r4.A05     // Catch:{ all -> 0x00e1 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00e1 }
            r0 = 2131890121(0x7f120fc9, float:1.9414925E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x00df
        L_0x0037:
            X.0tz r0 = r4.A05     // Catch:{ all -> 0x00e1 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00e1 }
            X.0wS r0 = r4.A0C     // Catch:{ all -> 0x00e1 }
            X.19r r0 = r0.A03()     // Catch:{ all -> 0x00e1 }
            int r0 = r0.AEW()     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x00df
        L_0x004b:
            X.0tz r0 = r4.A05     // Catch:{ all -> 0x00e1 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00e1 }
            r0 = 2131890120(0x7f120fc8, float:1.9414923E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x00df
        L_0x0058:
            com.whatsapp.jid.UserJid r1 = r5.A0E     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x0072
            X.0sG r0 = r4.A01     // Catch:{ all -> 0x00e1 }
            X.0sH r1 = r0.A0A(r1)     // Catch:{ all -> 0x00e1 }
            if (r6 == 0) goto L_0x006b
            X.0sP r0 = r4.A03     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r0.A0E(r1)     // Catch:{ all -> 0x00e1 }
            goto L_0x00df
        L_0x006b:
            X.0sP r0 = r4.A03     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r0.A08(r1)     // Catch:{ all -> 0x00e1 }
            goto L_0x00df
        L_0x0072:
            java.lang.String r0 = r4.A0S(r5, r2)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00d4
            goto L_0x00df
        L_0x0079:
            com.whatsapp.jid.UserJid r1 = r5.A0D     // Catch:{ all -> 0x00b0 }
            if (r1 == 0) goto L_0x00a4
            com.whatsapp.jid.UserJid r0 = r5.A0E     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00a4
            X.0sK r0 = r4.A00     // Catch:{ all -> 0x00b0 }
            boolean r0 = r0.A0I(r1)     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x009a
            com.whatsapp.jid.UserJid r1 = r5.A0E     // Catch:{ all -> 0x00b0 }
        L_0x008b:
            X.0sG r0 = r4.A01     // Catch:{ all -> 0x00b0 }
            X.0sH r1 = r0.A0A(r1)     // Catch:{ all -> 0x00b0 }
            if (r6 == 0) goto L_0x009d
            X.0sP r0 = r4.A03     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = r0.A0E(r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x00df
        L_0x009a:
            com.whatsapp.jid.UserJid r1 = r5.A0D     // Catch:{ all -> 0x00b0 }
            goto L_0x008b
        L_0x009d:
            X.0sP r0 = r4.A03     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = r0.A08(r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x00df
        L_0x00a4:
            X.0tz r0 = r4.A05     // Catch:{ all -> 0x00b0 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00b0 }
            r0 = 2131892362(0x7f12188a, float:1.941947E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00b0 }
            goto L_0x00df
        L_0x00b0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00b2:
            com.whatsapp.jid.UserJid r1 = r5.A0D     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x00cc
            X.0sG r0 = r4.A01     // Catch:{ all -> 0x00e1 }
            X.0sH r1 = r0.A0A(r1)     // Catch:{ all -> 0x00e1 }
            if (r6 == 0) goto L_0x00c5
            X.0sP r0 = r4.A03     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r0.A0E(r1)     // Catch:{ all -> 0x00e1 }
            goto L_0x00df
        L_0x00c5:
            X.0sP r0 = r4.A03     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r0.A08(r1)     // Catch:{ all -> 0x00e1 }
            goto L_0x00df
        L_0x00cc:
            r0 = 1
            java.lang.String r0 = r4.A0S(r5, r0)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x00d4
            goto L_0x00df
        L_0x00d4:
            X.0tz r0 = r4.A05     // Catch:{ all -> 0x00e1 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x00e1 }
            r0 = 2131892362(0x7f12188a, float:1.941947E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x00e1 }
        L_0x00df:
            monitor-exit(r3)
            return r0
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218315p.A0T(X.1Vt, boolean):java.lang.String");
    }

    public String A0U(C227319b r7, C16740tZ r8) {
        Context context;
        int i2;
        long j2;
        Context context2;
        int i3;
        Context context3;
        int i4;
        String str = null;
        if (!AnonymousClass1W1.A08(r8.A0L)) {
            AnonymousClass1Vt r2 = r8.A0L;
            int i5 = r2.A02;
            if (i5 != 12) {
                if (i5 != 102) {
                    if (i5 != 105) {
                        if (i5 != 402) {
                            if (i5 == 406 || i5 == 407) {
                                String str2 = r2.A0J;
                                if (!(str2 == null || r7 == null)) {
                                    int A002 = C29501aj.A00(str2, -1);
                                    if (r7.AJm(A002) || r7.AJ0(A002) || r7.AJ4(A002)) {
                                        context2 = this.A05.A00;
                                        i3 = R.string.str1065;
                                    } else {
                                        if (r7.AIz(A002)) {
                                            context3 = this.A05.A00;
                                            i4 = R.string.str1113;
                                        } else if (r7.AIy(A002)) {
                                            context2 = this.A05.A00;
                                            i3 = R.string.str1114;
                                        } else if (r7.AJE(A002)) {
                                            context3 = this.A05.A00;
                                            i4 = R.string.str1117;
                                        }
                                        return context3.getString(i4, new Object[]{context3.getString(this.A0C.A03().AEl())});
                                    }
                                    return r7.AC1(A002, context2.getString(i3));
                                }
                            } else {
                                if (i5 != 420) {
                                    if (i5 != 421) {
                                        switch (i5) {
                                            case AnonymousClass2EA.A03 /*108*/:
                                                break;
                                            case 109:
                                                context = this.A05.A00;
                                                i2 = R.string.str1dd0;
                                                break;
                                            case 110:
                                                context = this.A05.A00;
                                                i2 = R.string.str1dce;
                                                break;
                                            case 111:
                                                context = this.A05.A00;
                                                i2 = R.string.str1dcf;
                                                break;
                                            case 112:
                                                break;
                                        }
                                    }
                                    context = this.A05.A00;
                                    i2 = R.string.str1068;
                                } else {
                                    context = this.A05.A00;
                                    i2 = R.string.str1815;
                                }
                                return context.getString(i2);
                            }
                        }
                    }
                    String str3 = r2.A0J;
                    if (!(str3 == null || r7 == null || !r7.AJW(C29501aj.A00(str3, -1)))) {
                        context = this.A05.A00;
                        i2 = R.string.str180d;
                        return context.getString(i2);
                    }
                }
                Long A0F = A0F(r2);
                if (A0F == null) {
                    return "";
                }
                j2 = A0F.longValue();
                str = A0G(j2);
            } else {
                int i6 = r2.A03;
                if (i6 == 10 || i6 == 20) {
                    Long A0F2 = A0F(r2);
                    if (A0F2 == null) {
                        return "";
                    }
                    j2 = A0F2.longValue();
                    Pair A0C2 = A0C(j2);
                    if (A0C2 != null) {
                        str = (String) A0C2.second;
                    }
                }
            }
            if (!TextUtils.isEmpty(str)) {
                return this.A05.A00.getResources().getQuantityString(R.plurals.plurals0106, 1, new Object[]{str});
            }
            int i7 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            context = this.A05.A00;
            i2 = R.string.str1067;
            if (i7 > 0) {
                i2 = R.string.str1066;
            }
            return context.getString(i2);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0153, code lost:
        if (r17 == false) goto L_0x0155;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.String A0V(X.C16740tZ r16, boolean r17) {
        /*
            r15 = this;
            monitor-enter(r15)
            r2 = r16
            X.1Vt r1 = r2.A0L     // Catch:{ all -> 0x0288 }
            r14 = 0
            r5 = 1
            r0 = 0
            if (r1 == 0) goto L_0x000b
            r0 = 1
        L_0x000b:
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x0288 }
            X.1Vy r0 = r1.A08     // Catch:{ all -> 0x0288 }
            if (r0 == 0) goto L_0x006f
            java.math.BigDecimal r0 = r0.A00     // Catch:{ all -> 0x0288 }
            int r4 = r0.intValue()     // Catch:{ all -> 0x0288 }
            X.1Vt r0 = r2.A0L     // Catch:{ all -> 0x0288 }
            java.lang.String r13 = r15.A0J(r0)     // Catch:{ all -> 0x0288 }
        L_0x001e:
            X.0sK r1 = r15.A00     // Catch:{ all -> 0x0288 }
            X.1Vt r0 = r2.A0L     // Catch:{ all -> 0x0288 }
            com.whatsapp.jid.UserJid r0 = r0.A0E     // Catch:{ all -> 0x0288 }
            boolean r12 = r1.A0I(r0)     // Catch:{ all -> 0x0288 }
            X.1Vt r0 = r2.A0L     // Catch:{ all -> 0x0288 }
            com.whatsapp.jid.UserJid r0 = r0.A0D     // Catch:{ all -> 0x0288 }
            boolean r11 = r1.A0I(r0)     // Catch:{ all -> 0x0288 }
            X.1Vt r0 = r2.A0L     // Catch:{ all -> 0x0288 }
            boolean r0 = r0.A0E()     // Catch:{ all -> 0x0288 }
            r8 = 3
            r6 = 2
            if (r0 == 0) goto L_0x00f7
            X.1Vt r0 = r2.A0L     // Catch:{ all -> 0x0288 }
            java.lang.String r3 = r15.A0P(r0)     // Catch:{ all -> 0x0288 }
            X.1Vt r0 = r2.A0L     // Catch:{ all -> 0x0288 }
            java.lang.String r7 = r15.A0O(r0)     // Catch:{ all -> 0x0288 }
            X.1Vo r9 = r15.A0D     // Catch:{ all -> 0x0288 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0288 }
            r1.<init>()     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = "payment request: "
            r1.append(r0)     // Catch:{ all -> 0x0288 }
            X.1Vw r0 = r2.A11     // Catch:{ all -> 0x0288 }
            r1.append(r0)     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = " requester: "
            r1.append(r0)     // Catch:{ all -> 0x0288 }
            r1.append(r3)     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = " requestee: "
            r1.append(r0)     // Catch:{ all -> 0x0288 }
            r1.append(r7)     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0288 }
            r9.A06(r0)     // Catch:{ all -> 0x0288 }
            goto L_0x007c
        L_0x006f:
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r1 = r0.A00     // Catch:{ all -> 0x0288 }
            r0 = 2131892363(0x7f12188b, float:1.9419472E38)
            java.lang.String r13 = r1.getString(r0)     // Catch:{ all -> 0x0288 }
            r4 = 1
            goto L_0x001e
        L_0x007c:
            if (r17 != 0) goto L_0x00ac
            if (r12 == 0) goto L_0x0095
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0288 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x0288 }
            r1 = 2131755276(0x7f10010c, float:1.9141427E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0288 }
            r0[r14] = r13     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x0095:
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0288 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x0288 }
            r1 = 2131755275(0x7f10010b, float:1.9141425E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0288 }
            r0[r14] = r13     // Catch:{ all -> 0x0288 }
            r0[r5] = r7     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x00ac:
            if (r11 == 0) goto L_0x00c5
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0288 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x0288 }
            r1 = 2131755273(0x7f100109, float:1.914142E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0288 }
            r0[r14] = r13     // Catch:{ all -> 0x0288 }
            r0[r5] = r7     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x00c5:
            if (r12 == 0) goto L_0x00de
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0288 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x0288 }
            r1 = 2131755274(0x7f10010a, float:1.9141423E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0288 }
            r0[r14] = r3     // Catch:{ all -> 0x0288 }
            r0[r5] = r13     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x00de:
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0288 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x0288 }
            r1 = 2131755272(0x7f100108, float:1.9141419E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ all -> 0x0288 }
            r0[r14] = r3     // Catch:{ all -> 0x0288 }
            r0[r5] = r13     // Catch:{ all -> 0x0288 }
            r0[r6] = r7     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x00f7:
            X.1Vw r10 = r2.A11     // Catch:{ all -> 0x0288 }
            X.0rv r3 = r10.A00     // Catch:{ all -> 0x0288 }
            if (r3 == 0) goto L_0x011a
            X.0rv r1 = r2.A0B()     // Catch:{ all -> 0x0288 }
            boolean r0 = X.C16030sJ.A0L(r3)     // Catch:{ all -> 0x0288 }
            if (r0 == 0) goto L_0x010a
            if (r1 == 0) goto L_0x010a
            r3 = r1
        L_0x010a:
            X.0sP r1 = r15.A03     // Catch:{ all -> 0x0288 }
            X.0sG r0 = r15.A01     // Catch:{ all -> 0x0288 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x0288 }
            X.0sH r0 = r0.A0A(r3)     // Catch:{ all -> 0x0288 }
            java.lang.String r3 = r1.A0E(r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0120
        L_0x011a:
            X.1Vt r0 = r2.A0L     // Catch:{ all -> 0x0288 }
            java.lang.String r3 = r15.A0Q(r0)     // Catch:{ all -> 0x0288 }
        L_0x0120:
            X.1Vt r0 = r2.A0L     // Catch:{ all -> 0x0288 }
            java.lang.String r7 = r15.A0N(r0)     // Catch:{ all -> 0x0288 }
            X.1Vo r9 = r15.A0D     // Catch:{ all -> 0x0288 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0288 }
            r1.<init>()     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = "payment message: "
            r1.append(r0)     // Catch:{ all -> 0x0288 }
            r1.append(r10)     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = " sender: "
            r1.append(r0)     // Catch:{ all -> 0x0288 }
            r1.append(r3)     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = " receiver: "
            r1.append(r0)     // Catch:{ all -> 0x0288 }
            r1.append(r7)     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0288 }
            r9.A06(r0)     // Catch:{ all -> 0x0288 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0288 }
            if (r0 != 0) goto L_0x0155
            r10 = 0
            if (r17 != 0) goto L_0x0156
        L_0x0155:
            r10 = 1
        L_0x0156:
            X.1Vt r9 = r2.A0L     // Catch:{ all -> 0x0288 }
            int r2 = r9.A03     // Catch:{ all -> 0x0288 }
            if (r2 == r6) goto L_0x0160
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 != r0) goto L_0x01e0
        L_0x0160:
            int r1 = r9.A02     // Catch:{ all -> 0x0288 }
            r0 = 102(0x66, float:1.43E-43)
            if (r1 != r0) goto L_0x01e0
            java.lang.Long r0 = r15.A0F(r9)     // Catch:{ all -> 0x0288 }
            if (r0 == 0) goto L_0x0175
            long r0 = r0.longValue()     // Catch:{ all -> 0x0288 }
            java.lang.String r7 = r15.A0G(r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0176
        L_0x0175:
            r7 = 0
        L_0x0176:
            if (r10 == 0) goto L_0x01aa
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0288 }
            if (r0 == 0) goto L_0x0193
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0288 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x0288 }
            r1 = 2131755283(0x7f100113, float:1.914144E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0288 }
            r0[r14] = r13     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x0193:
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0288 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x0288 }
            r1 = 2131890447(0x7f12110f, float:1.9415586E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0288 }
            r0[r14] = r13     // Catch:{ all -> 0x0288 }
            r0[r5] = r7     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x01aa:
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0288 }
            if (r0 == 0) goto L_0x01c7
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0288 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x0288 }
            r1 = 2131755286(0x7f100116, float:1.9141447E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0288 }
            r0[r14] = r3     // Catch:{ all -> 0x0288 }
            r0[r5] = r13     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x01c7:
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0288 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x0288 }
            r1 = 2131890448(0x7f121110, float:1.9415588E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ all -> 0x0288 }
            r0[r14] = r3     // Catch:{ all -> 0x0288 }
            r0[r5] = r13     // Catch:{ all -> 0x0288 }
            r0[r6] = r7     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x01e0:
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r0) goto L_0x0211
            if (r10 == 0) goto L_0x01ec
            java.lang.String r0 = r15.A0L(r9)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x01ec:
            if (r11 == 0) goto L_0x01ff
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x0288 }
            r1 = 2131889999(0x7f120f4f, float:1.9414677E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0288 }
            r0[r14] = r3     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x01ff:
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r2 = r0.A00     // Catch:{ all -> 0x0288 }
            r1 = 2131890000(0x7f120f50, float:1.941468E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0288 }
            r0[r14] = r3     // Catch:{ all -> 0x0288 }
            r0[r5] = r7     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getString(r1, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x0211:
            if (r10 == 0) goto L_0x023f
            if (r11 == 0) goto L_0x0229
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0288 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x0288 }
            r1 = 2131755285(0x7f100115, float:1.9141445E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0288 }
            r0[r14] = r13     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x0229:
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0288 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x0288 }
            r1 = 2131755284(0x7f100114, float:1.9141443E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0288 }
            r0[r14] = r13     // Catch:{ all -> 0x0288 }
            r0[r5] = r7     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x023f:
            if (r12 == 0) goto L_0x0257
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0288 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x0288 }
            r1 = 2131755279(0x7f10010f, float:1.9141433E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0288 }
            r0[r14] = r13     // Catch:{ all -> 0x0288 }
            r0[r5] = r7     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x0257:
            if (r11 == 0) goto L_0x026f
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0288 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x0288 }
            r1 = 2131755280(0x7f100110, float:1.9141435E38)
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ all -> 0x0288 }
            r0[r14] = r3     // Catch:{ all -> 0x0288 }
            r0[r5] = r13     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x0288 }
            goto L_0x0286
        L_0x026f:
            X.0tz r0 = r15.A05     // Catch:{ all -> 0x0288 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0288 }
            android.content.res.Resources r2 = r0.getResources()     // Catch:{ all -> 0x0288 }
            r1 = 2131755278(0x7f10010e, float:1.914143E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ all -> 0x0288 }
            r0[r14] = r3     // Catch:{ all -> 0x0288 }
            r0[r5] = r13     // Catch:{ all -> 0x0288 }
            r0[r6] = r7     // Catch:{ all -> 0x0288 }
            java.lang.String r0 = r2.getQuantityString(r1, r4, r0)     // Catch:{ all -> 0x0288 }
        L_0x0286:
            monitor-exit(r15)
            return r0
        L_0x0288:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218315p.A0V(X.0tZ, boolean):java.lang.String");
    }

    public String A0W(String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(";");
            if (split.length == 2) {
                C28411Vz A012 = this.A08.A01(split[0]);
                try {
                    return A012.A9H(this.A06, new C28401Vy(new BigDecimal(split[1]).movePointLeft(3), ((C35491m1) A012).A01), 0);
                } catch (NumberFormatException unused) {
                    return "";
                }
            }
        }
        return "";
    }

    public final String A0X(String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, long j2) {
        int i13 = i10;
        long j3 = j2;
        if (j2 <= 0) {
            return this.A05.A00.getString(i2, new Object[]{str});
        }
        int A002 = C42681yF.A00(this.A04.A00(), j3);
        if (A002 == 0) {
            return this.A05.A00.getString(i3, new Object[]{str});
        } else if (A002 == 1) {
            return this.A05.A00.getString(i4, new Object[]{str});
        } else if (A002 < 7) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j3);
            switch (instance.get(7)) {
                case 1:
                    i13 = i11;
                    break;
                case 2:
                    i13 = i5;
                    break;
                case 3:
                    i13 = i6;
                    break;
                case 4:
                    i13 = i7;
                    break;
                case 5:
                    i13 = i8;
                    break;
                case 6:
                    i13 = i9;
                    break;
                case 7:
                    break;
                default:
                    i13 = 0;
                    break;
            }
            return this.A05.A00.getString(i13, new Object[]{str});
        } else {
            return this.A05.A00.getString(i12, new Object[]{str, C28891Zc.A01(this.A06, j3)});
        }
    }

    public String A0Y(String str, String str2, String str3, int i2, int i3, int i4, long j2, long j3, boolean z2) {
        int i5;
        Object[] objArr;
        int i6 = i2;
        long j4 = j2;
        if (z2) {
            String str4 = str;
            if (i6 == 406 || i6 == 407 || i6 == 412) {
                return A0X(str4, R.string.str1130, R.string.str1138, R.string.str1139, R.string.str1132, R.string.str1136, R.string.str1137, R.string.str1135, R.string.str1131, R.string.str1133, R.string.str1134, R.string.str112f, j4);
            }
            if (i6 == 408 || i6 == 404 || i6 == 411) {
                return A0X(str4, R.string.str113d, R.string.str1145, R.string.str1146, R.string.str113f, R.string.str1143, R.string.str1144, R.string.str1142, R.string.str113e, R.string.str1140, R.string.str1141, R.string.str113a, j3);
            }
            if (i6 == 409) {
                int i7 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                Context context = this.A05.A00;
                if (i7 > 0) {
                    i5 = R.string.str113b;
                    objArr = new Object[]{str, context.getString(R.string.str1824, new Object[]{C28891Zc.A03(this.A06, j4)})};
                } else {
                    i5 = R.string.str113c;
                    objArr = new Object[]{str};
                }
                return context.getString(i5, objArr);
            } else if (i6 == 421) {
                return this.A05.A00.getString(R.string.str1811, new Object[]{str, str3});
            }
        } else {
            String str5 = str2;
            if (i6 == 102) {
                return this.A05.A00.getResources().getQuantityString(R.plurals.plurals0116, i4, new Object[]{str2, str3});
            } else if (i6 == 106) {
                int i8 = i3;
                if (i8 == 104 || i8 == 103 || i8 == 102) {
                    return A0X(str5, R.string.str1149, R.string.str1151, R.string.str1152, R.string.str114b, R.string.str114f, R.string.str1150, R.string.str114e, R.string.str114a, R.string.str114c, R.string.str114d, R.string.str1148, j4);
                }
            } else if (i6 == 420) {
                return this.A05.A00.getString(R.string.str1815);
            } else {
                if (i6 == 112) {
                    return this.A05.A00.getString(R.string.str1810, new Object[]{str2, str3});
                }
            }
        }
        return "";
    }

    public void A0Z(View view, C16010sH r7) {
        String A0E = this.A03.A0E(r7);
        C32291fz.A01(view, this.A05.A00.getString(R.string.str0f69, new Object[]{A0E}), 0).A03();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r0 = r2.A0A.A00();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0a(android.content.Context r3, com.whatsapp.jid.UserJid r4, int r5) {
        /*
            r2 = this;
            r1 = 0
            if (r5 == 0) goto L_0x000d
            if (r4 == 0) goto L_0x000e
            X.0uP r0 = r2.A02
            boolean r0 = r0.A02(r4)
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            return r1
        L_0x000e:
            X.0sK r0 = r2.A00
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x000d
            X.174 r0 = r2.A0A
            X.1Vz r0 = r0.A00()
            if (r0 == 0) goto L_0x000d
            java.lang.CharSequence r0 = r0.ABE(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000d
            r1 = 1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218315p.A0a(android.content.Context, com.whatsapp.jid.UserJid, int):boolean");
    }

    public boolean A0b(AnonymousClass1Vt r4) {
        return r4.A03 == 1 && r4.A02 == 402 && this.A00.A0I(r4.A0E);
    }

    public boolean A0c(AnonymousClass1Vt r6, C227319b r7, AnonymousClass1GQ r8, int i2) {
        int i3;
        int A002 = C29501aj.A00(r6.A0J, -1);
        int i4 = r6.A03;
        if (i4 != 1 && i4 != 100) {
            return false;
        }
        AnonymousClass1W2 r0 = r6.A0A;
        if ((r0 != null && r0.A02 != null && (!this.A0B.A06() || r8 == null)) || !this.A00.A0I(r6.A0E) || !r6.A0A() || (i3 = r6.A02) == 419 || i3 == 420 || i3 == 409) {
            return false;
        }
        if (i3 != 405) {
            if (i3 == 407 || i3 == 0) {
                return false;
            }
        } else if (!(r6.A03 == 1 && this.A0B.A03.A0E(C16620tM.A02, 2381) && i2 == 1)) {
            return false;
        }
        if (A002 == 441 || A002 == 410 || A002 == 11455 || A002 == 2826008) {
            return false;
        }
        return r7 == null || r7.AfO(A002);
    }

    public boolean A0d(C15830rv r6) {
        if (r6 != null) {
            String str = r6.user;
            try {
                JSONArray jSONArray = new JSONArray(this.A09.A06(C16620tM.A02, 2462));
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    if (str.equals(jSONArray.getString(i2))) {
                        return true;
                    }
                }
            } catch (JSONException unused) {
                Log.e("PaymentsUtils/isMessageBusinessSupported: Unable to parse allowed_message_merchants");
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = r6.A09;
        r2 = X.C16620tM.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0e(X.C15830rv r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L_0x0030
            X.0pd r3 = r6.A09
            r0 = 2435(0x983, float:3.412E-42)
            X.0tM r2 = X.C16620tM.A02
            java.lang.String r1 = r3.A06(r2, r0)
            if (r1 == 0) goto L_0x0030
            r0 = 2221(0x8ad, float:3.112E-42)
            boolean r0 = r3.A0E(r2, r0)
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = ","
            java.lang.String[] r4 = r1.split(r0)
            java.lang.String r3 = r7.user
            int r2 = r4.length
            r1 = 0
        L_0x0021:
            if (r1 >= r2) goto L_0x0030
            r0 = r4[r1]
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002d
            r0 = 1
            return r0
        L_0x002d:
            int r1 = r1 + 1
            goto L_0x0021
        L_0x0030:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C218315p.A0e(X.0rv):boolean");
    }
}
