package X;

import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.1L1  reason: invalid class name */
public class AnonymousClass1L1 {
    public C47482Jd A00;
    public C47502Jf A01;
    public final C19050xg A02;
    public final C16000sG A03;
    public final C16440t3 A04;
    public final AnonymousClass128 A05;
    public final AnonymousClass184 A06;
    public final AnonymousClass11G A07;
    public final C14710pd A08;
    public final C16490t9 A09;
    public final C215914r A0A;
    public final AnonymousClass17S A0B;
    public final C23141Aq A0C;
    public final C27701Su A0D;
    public final C27691St A0E;
    public final C16320sq A0F;
    public final LinkedHashMap A0G = new AnonymousClass2JZ(this);
    public final Map A0H;
    public final Map A0I;
    public final Random A0J = new Random();
    public final boolean A0K;

    public AnonymousClass1L1(C16570tH r4, C16000sG r5, C16440t3 r6, AnonymousClass128 r7, AnonymousClass184 r8, AnonymousClass11G r9, C14710pd r10, C16490t9 r11, C215914r r12, AnonymousClass17S r13, C23141Aq r14, C27701Su r15, C27691St r16, C16320sq r17) {
        C47452Ja r1 = new C47452Ja(this);
        this.A02 = r1;
        this.A0I = new HashMap();
        this.A0H = new HashMap();
        this.A04 = r6;
        this.A08 = r10;
        this.A0F = r17;
        this.A09 = r11;
        this.A07 = r9;
        this.A03 = r5;
        this.A05 = r7;
        this.A0A = r12;
        this.A0C = r14;
        this.A06 = r8;
        this.A0D = r15;
        this.A0E = r16;
        this.A0B = r13;
        this.A0K = r10.A0E(C16620tM.A01, 815);
        r4.A02(r1);
    }

    public static int A00(UserJid userJid, List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (userJid.equals(((C30991dI) list.get(i2)).A0B)) {
                return i2;
            }
        }
        return -1;
    }

    public static UserJid A01(C16740tZ r1) {
        return r1.A11.A02 ? C34091jg.A00 : UserJid.of(r1.A0B());
    }

    public static Integer A02(int i2) {
        int i3 = 3;
        if (i2 != 3) {
            i3 = 4;
            if (i2 != 4) {
                switch (i2) {
                    case 10:
                        break;
                    case 11:
                        break;
                    case 12:
                        i3 = 2;
                        break;
                    default:
                        return null;
                }
            }
            i3 = 1;
        }
        return Integer.valueOf(i3);
    }

    public static String A03(Map map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z2 = true;
        for (Map.Entry entry : map.entrySet()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(z2 ? "" : ",");
            sb2.append((String) entry.getKey());
            sb2.append(":");
            sb2.append(entry.getValue());
            sb.append(sb2.toString());
            z2 = false;
        }
        return sb.toString();
    }

    public void A04() {
        C27701Su r2 = this.A0D;
        if (r2.A04.A00()) {
            C47462Jb A012 = r2.A01();
            A012.A03 = 27;
            r2.A02.A05(A012);
        }
    }

    public void A05() {
        C27701Su r2 = this.A0D;
        if (r2.A04.A00()) {
            C47462Jb A012 = r2.A01();
            A012.A03 = 24;
            A012.A02 = 3;
            r2.A02.A05(A012);
        }
    }

    public void A06() {
        C27701Su r2 = this.A0D;
        if (r2.A04.A00()) {
            C47462Jb A012 = r2.A01();
            A012.A03 = 23;
            A012.A02 = 4;
            r2.A02.A05(A012);
        }
    }

    public void A07() {
        this.A0C.A00 = null;
        C47482Jd r4 = this.A00;
        if (r4 != null && r4.A07) {
            AnonymousClass2Jg r2 = new AnonymousClass2Jg();
            r2.A02 = Long.valueOf(r4.A05);
            r2.A04 = Long.valueOf(SystemClock.elapsedRealtime() - r4.A06);
            r2.A05 = Long.valueOf((long) r4.A03);
            r2.A03 = Long.valueOf((long) r4.A02);
            int i2 = r4.A00;
            if (i2 != 0) {
                r2.A01 = Integer.valueOf(i2);
            }
            int i3 = r4.A01;
            if (i3 != 0) {
                r2.A00 = Integer.valueOf(i3);
            }
            this.A09.A05(r2);
            this.A00 = null;
        }
    }

    public void A08(UserJid userJid, Integer num, Integer num2, String str, List list, List list2, List list3, Map map) {
        int intValue;
        int intValue2;
        if (this.A00 != null) {
            boolean z2 = true;
            Integer num3 = num;
            if (!(num == null || (intValue2 = num3.intValue()) == 4 || intValue2 == 1 || intValue2 == 3 || intValue2 == 2)) {
                z2 = false;
            }
            UserJid userJid2 = userJid;
            List list4 = list;
            List list5 = list2;
            List list6 = list3;
            if (num2 == null) {
                if (z2 && userJid2 != C34091jg.A00) {
                    Iterator it = Arrays.asList(new List[]{list, list2, list3}).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            intValue = -1;
                            break;
                        }
                        intValue = A00(userJid2, (List) it.next());
                        if (intValue >= 0) {
                            break;
                        }
                    }
                } else {
                    intValue = 0;
                }
            } else {
                intValue = num2.intValue();
            }
            String str2 = str;
            Map map2 = map;
            this.A01 = new C47502Jf(this.A04, userJid2, num3, str2, list4, list5, list6, map2, this.A0G, intValue, this.A00.A05, this.A0J.nextLong());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        if (r2 == 5) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r2 == 10) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r2 == 11) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        r3.A05 = java.lang.Integer.valueOf(r1);
        r3.A06 = java.lang.Integer.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r5.A0K == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        r3.A00 = java.lang.Boolean.valueOf(r11);
        r3.A01 = java.lang.Boolean.valueOf(r12);
        r2 = r5.A07.A02();
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005b, code lost:
        if (r2 == 0) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r2 == 1) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r2 != 2) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        r0 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        r3.A02 = r0;
        r0 = r6.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r0 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r2 = r0.A00;
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r2 == 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        if (r2 == 1) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0077, code lost:
        if (r2 != 2) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007a, code lost:
        r0 = java.lang.Integer.valueOf(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
        r3.A04 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        r5.A09.A05(r3);
        r5.A0D.A03(r6, r7, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = new X.C47472Jc();
        r0 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0097, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        r0 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        r0 = r7.equals(r0);
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        if (r0 != null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        r3.A08 = java.lang.Long.valueOf(r0);
        r3.A03 = java.lang.Integer.valueOf(r8);
        r3.A07 = java.lang.Long.valueOf(r9);
        r2 = r6.A08;
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0190, code lost:
        if (r0 != false) goto L_0x0008;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        if (r2 == 3) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002a, code lost:
        r1 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002b, code lost:
        if (r2 == 4) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.C16740tZ r6, java.lang.String r7, int r8, long r9, boolean r11, boolean r12) {
        /*
            r5 = this;
            int r0 = r7.hashCode()
            switch(r0) {
                case -2101465844: goto L_0x00a7;
                case -1911610141: goto L_0x00b1;
                case -1892291233: goto L_0x00bb;
                case -1867169789: goto L_0x00c8;
                case -1735489987: goto L_0x00d2;
                case -1597391554: goto L_0x00db;
                case -1412796971: goto L_0x00e5;
                case -1302125668: goto L_0x00ef;
                case -962621161: goto L_0x00f9;
                case -678813737: goto L_0x0103;
                case -678811828: goto L_0x010d;
                case -678803141: goto L_0x0116;
                case -678799174: goto L_0x011e;
                case -678797283: goto L_0x0127;
                case -621954360: goto L_0x0130;
                case -383881924: goto L_0x0139;
                case -379366874: goto L_0x0142;
                case -160901288: goto L_0x014b;
                case 431581758: goto L_0x0154;
                case 476588369: goto L_0x015d;
                case 1086481592: goto L_0x0165;
                case 1095692943: goto L_0x00c5;
                case 1354954699: goto L_0x016d;
                case 1380799384: goto L_0x0176;
                case 1465774270: goto L_0x017f;
                case 1643533646: goto L_0x0188;
                case 1744829935: goto L_0x009d;
                default: goto L_0x0007;
            }
        L_0x0007:
            r4 = 3
        L_0x0008:
            X.2Jc r3 = new X.2Jc
            r3.<init>()
            X.2Jd r0 = r5.A00
            if (r0 != 0) goto L_0x0099
            r0 = 0
        L_0x0013:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A08 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r3.A03 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r3.A07 = r0
            int r2 = r6.A08
            r1 = 3
            if (r2 == r1) goto L_0x0038
            r1 = 4
            if (r2 == r1) goto L_0x0097
            r0 = 5
            if (r2 == r0) goto L_0x0095
            r0 = 10
            if (r2 == r0) goto L_0x0095
            r0 = 11
            if (r2 == r0) goto L_0x0095
        L_0x0038:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A05 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r3.A06 = r0
            boolean r0 = r5.A0K
            if (r0 == 0) goto L_0x0080
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            r3.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r3.A01 = r0
            X.11G r0 = r5.A07
            int r2 = r0.A02()
            r1 = 3
            if (r2 == 0) goto L_0x0064
            r0 = 2
            r1 = 1
            if (r2 == r1) goto L_0x0090
            if (r2 != r0) goto L_0x0064
            r1 = 4
        L_0x0064:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x0068:
            r3.A02 = r0
            X.1m6 r0 = r6.A0K
            if (r0 == 0) goto L_0x0080
            int r2 = r0.A00
            r1 = 3
            if (r2 == 0) goto L_0x007a
            r0 = 2
            r1 = 1
            if (r2 == r1) goto L_0x008b
            if (r2 != r0) goto L_0x007a
            r1 = 4
        L_0x007a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x007e:
            r3.A04 = r0
        L_0x0080:
            X.0t9 r0 = r5.A09
            r0.A05(r3)
            X.1Su r0 = r5.A0D
            r0.A03(r6, r7, r9)
            return
        L_0x008b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x007e
        L_0x0090:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0068
        L_0x0095:
            r1 = 2
            goto L_0x0038
        L_0x0097:
            r1 = 1
            goto L_0x0038
        L_0x0099:
            long r0 = r0.A05
            goto L_0x0013
        L_0x009d:
            java.lang.String r0 = "media_switch_required"
            boolean r0 = r7.equals(r0)
            r4 = 23
            goto L_0x0190
        L_0x00a7:
            java.lang.String r0 = "failed_insufficient_space"
            boolean r0 = r7.equals(r0)
            r4 = 10
            goto L_0x0190
        L_0x00b1:
            java.lang.String r0 = "media_error_no_such_algorithm"
            boolean r0 = r7.equals(r0)
            r4 = 28
            goto L_0x0190
        L_0x00bb:
            java.lang.String r0 = "media_error_request_timeout"
            boolean r0 = r7.equals(r0)
            r4 = 14
            goto L_0x0190
        L_0x00c5:
            java.lang.String r0 = "request"
            goto L_0x00cb
        L_0x00c8:
            java.lang.String r0 = "success"
        L_0x00cb:
            boolean r0 = r7.equals(r0)
            r4 = 1
            goto L_0x0190
        L_0x00d2:
            java.lang.String r0 = "media_error_request"
            boolean r0 = r7.equals(r0)
            r4 = 4
            goto L_0x0190
        L_0x00db:
            java.lang.String r0 = "media_error_file_format_unsupported"
            boolean r0 = r7.equals(r0)
            r4 = 31
            goto L_0x0190
        L_0x00e5:
            java.lang.String r0 = "media_error_server"
            boolean r0 = r7.equals(r0)
            r4 = 13
            goto L_0x0190
        L_0x00ef:
            java.lang.String r0 = "media_error_wamsys"
            boolean r0 = r7.equals(r0)
            r4 = 25
            goto L_0x0190
        L_0x00f9:
            java.lang.String r0 = "media_error_optimistic_network_unsafe"
            boolean r0 = r7.equals(r0)
            r4 = 29
            goto L_0x0190
        L_0x0103:
            java.lang.String r0 = "media_error_dns"
            boolean r0 = r7.equals(r0)
            r4 = 18
            goto L_0x0190
        L_0x010d:
            java.lang.String r0 = "media_error_fnf"
            boolean r0 = r7.equals(r0)
            r4 = 11
            goto L_0x0190
        L_0x0116:
            java.lang.String r0 = "media_error_oom"
            boolean r0 = r7.equals(r0)
            r4 = 6
            goto L_0x0190
        L_0x011e:
            java.lang.String r0 = "media_error_ssl"
            boolean r0 = r7.equals(r0)
            r4 = 20
            goto L_0x0190
        L_0x0127:
            java.lang.String r0 = "media_error_url"
            boolean r0 = r7.equals(r0)
            r4 = 27
            goto L_0x0190
        L_0x0130:
            java.lang.String r0 = "media_error_not_finalized"
            boolean r0 = r7.equals(r0)
            r4 = 15
            goto L_0x0190
        L_0x0139:
            java.lang.String r0 = "media_error_throttle"
            boolean r0 = r7.equals(r0)
            r4 = 19
            goto L_0x0190
        L_0x0142:
            java.lang.String r0 = "media_error_no_client_network"
            boolean r0 = r7.equals(r0)
            r4 = 21
            goto L_0x0190
        L_0x014b:
            java.lang.String r0 = "media_error_bad_media"
            boolean r0 = r7.equals(r0)
            r4 = 9
            goto L_0x0190
        L_0x0154:
            java.lang.String r0 = "media_error_conn"
            boolean r0 = r7.equals(r0)
            r4 = 26
            goto L_0x0190
        L_0x015d:
            java.lang.String r0 = "cancelled"
            boolean r0 = r7.equals(r0)
            r4 = 2
            goto L_0x0190
        L_0x0165:
            java.lang.String r0 = "media_error_io"
            boolean r0 = r7.equals(r0)
            r4 = 7
            goto L_0x0190
        L_0x016d:
            java.lang.String r0 = "media_error_transcoding_unknown"
            boolean r0 = r7.equals(r0)
            r4 = 30
            goto L_0x0190
        L_0x0176:
            java.lang.String r0 = "media_error_no_permissions"
            boolean r0 = r7.equals(r0)
            r4 = 8
            goto L_0x0190
        L_0x017f:
            java.lang.String r0 = "media_error_too_large"
            boolean r0 = r7.equals(r0)
            r4 = 24
            goto L_0x0190
        L_0x0188:
            java.lang.String r0 = "media_error_optimistic_hash"
            boolean r0 = r7.equals(r0)
            r4 = 16
        L_0x0190:
            if (r0 != 0) goto L_0x0008
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1L1.A09(X.0tZ, java.lang.String, int, long, boolean, boolean):void");
    }

    public void A0A(Boolean bool) {
        C23141Aq r1 = this.A0C;
        long nextLong = r1.A01.nextLong();
        Long valueOf = Long.valueOf(nextLong);
        r1.A00 = valueOf;
        if (valueOf != null) {
            this.A00 = new C47482Jd(nextLong, bool.booleanValue());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r1 != 4) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(java.lang.Byte r8, java.lang.Integer r9, java.lang.Integer r10) {
        /*
            r7 = this;
            X.1Su r6 = r7.A0D
            X.0vx r0 = r6.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0052
            X.2Jb r5 = r6.A01()
            r4 = 0
            if (r10 == 0) goto L_0x0021
            int r1 = r10.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0053
            r0 = 2
            if (r1 == r0) goto L_0x0053
            r0 = 3
            if (r1 == r0) goto L_0x0053
            r0 = 4
            if (r1 == r0) goto L_0x0053
        L_0x0021:
            r3 = r4
        L_0x0022:
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A03 = r0
            java.lang.Integer r0 = X.C27701Su.A00(r9)
            r5.A02 = r0
            if (r8 == 0) goto L_0x0049
            byte r2 = r8.byteValue()
            r1 = 2
            if (r2 == 0) goto L_0x0045
            r1 = 1
            if (r2 == r1) goto L_0x0045
            r0 = 3
            r1 = 4
            if (r2 == r0) goto L_0x0045
            r0 = 13
            if (r2 != r0) goto L_0x0049
            r1 = 5
        L_0x0045:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
        L_0x0049:
            r5.A01 = r4
            r5.A00 = r3
            X.0t9 r0 = r6.A02
            r0.A05(r5)
        L_0x0052:
            return
        L_0x0053:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1L1.A0B(java.lang.Byte, java.lang.Integer, java.lang.Integer):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r0 == false) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(java.util.Map r4, int r5) {
        /*
            r3 = this;
            X.2Jd r1 = r3.A00
            if (r1 == 0) goto L_0x000d
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x000d
            boolean r0 = r1.A07
            r1 = 1
            if (r0 != 0) goto L_0x000e
        L_0x000d:
            r1 = 0
        L_0x000e:
            java.lang.String r0 = "Report tab open only once per session"
            X.AnonymousClass00B.A0B(r0, r1)
            X.2Je r2 = new X.2Je
            r2.<init>()
            X.2Jd r0 = r3.A00
            if (r0 != 0) goto L_0x003e
            r0 = 0
        L_0x001e:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A01 = r0
            long r0 = (long) r5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00 = r0
            java.lang.String r0 = A03(r4)
            r2.A02 = r0
            X.0t9 r0 = r3.A09
            r0.A05(r2)
            X.2Jd r1 = r3.A00
            if (r1 == 0) goto L_0x003d
            r0 = 1
            r1.A04 = r0
        L_0x003d:
            return
        L_0x003e:
            long r0 = r0.A05
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1L1.A0C(java.util.Map, int):void");
    }
}
