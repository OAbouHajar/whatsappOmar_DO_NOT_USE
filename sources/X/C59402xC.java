package X;

import android.support.v4.view.GravityCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import java.util.Map;

/* renamed from: X.2xC  reason: invalid class name and case insensitive filesystem */
public class C59402xC extends AnonymousClass2G5 {
    public Boolean A00;
    public Long A01;

    public C59402xC(C16040sK r1, AnonymousClass2G2 r2, C40961uy r3, C16200sd r4, AnonymousClass12W r5, C18790xG r6, AnonymousClass12X r7, C16990u0 r8, AnonymousClass12V r9, Boolean bool, Long l2) {
        super(r1, r2, r3, r4, r5, r6, r7, r8, r9);
        this.A00 = bool;
        this.A01 = l2;
    }

    public static boolean A00(C28581Wr r1, Object obj, Map map) {
        Object obj2 = map.get(obj);
        AnonymousClass00B.A06(obj2);
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        r1.A03();
        return booleanValue;
    }

    public AnonymousClass2G7 A0E() {
        String A0D = A0D();
        String substring = A0D != null ? A0D.substring(A0D.length() - 2) : null;
        C28581Wr A0U = AnonymousClass2G7.A0f.A0U();
        AnonymousClass2G7 r1 = (AnonymousClass2G7) C28581Wr.A00(A0U);
        r1.A01 |= 1;
        r1.A04 = "2.23.1.76";
        if (substring != null) {
            AnonymousClass2G7 r12 = (AnonymousClass2G7) C28581Wr.A00(A0U);
            r12.A01 |= 4;
            r12.A06 = substring;
        }
        Long l2 = this.A01;
        if (l2 != null) {
            long longValue = l2.longValue();
            AnonymousClass2G7 r13 = (AnonymousClass2G7) C28581Wr.A00(A0U);
            r13.A02 |= 32;
            r13.A03 = longValue;
        }
        Boolean bool = this.A00;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            AnonymousClass2G7 r14 = (AnonymousClass2G7) C28581Wr.A00(A0U);
            r14.A02 |= 64;
            r14.A0C = booleanValue;
        }
        C40961uy r0 = this.A01;
        if (r0 != null) {
            Map A02 = r0.A02();
            int A012 = r0.A01(A02);
            AnonymousClass2G7 r15 = (AnonymousClass2G7) C28581Wr.A00(A0U);
            r15.A01 |= 8;
            r15.A00 = A012;
            boolean A002 = A00(A0U, "call_log", A02);
            AnonymousClass2G7 r16 = (AnonymousClass2G7) A0U.A00;
            r16.A01 |= 16;
            r16.A0B = A002;
            boolean A003 = A00(A0U, "labeled_jid", A02);
            AnonymousClass2G7 r17 = (AnonymousClass2G7) A0U.A00;
            r17.A01 |= 32;
            r17.A0D = A003;
            boolean A004 = A00(A0U, "message_fts", A02);
            AnonymousClass2G7 r18 = (AnonymousClass2G7) A0U.A00;
            r18.A01 |= 64;
            r18.A0G = A004;
            boolean A005 = A00(A0U, "blank_me_jid", A02);
            AnonymousClass2G7 r19 = (AnonymousClass2G7) A0U.A00;
            r19.A01 |= 128;
            r19.A09 = A005;
            boolean A006 = A00(A0U, "message_link", A02);
            AnonymousClass2G7 r110 = (AnonymousClass2G7) A0U.A00;
            r110.A01 |= 256;
            r110.A0I = A006;
            boolean A007 = A00(A0U, "message_main", A02);
            AnonymousClass2G7 r111 = (AnonymousClass2G7) A0U.A00;
            r111.A01 |= 512;
            r111.A0K = A007;
            boolean A008 = A00(A0U, "message_text", A02);
            AnonymousClass2G7 r112 = (AnonymousClass2G7) A0U.A00;
            r112.A01 |= 1024;
            r112.A0S = A008;
            boolean A009 = A00(A0U, "missed_calls", A02);
            AnonymousClass2G7 r113 = (AnonymousClass2G7) A0U.A00;
            r113.A01 |= 2048;
            r113.A0X = A009;
            boolean A0010 = A00(A0U, "receipt_user", A02);
            AnonymousClass2G7 r114 = (AnonymousClass2G7) A0U.A00;
            r114.A01 |= 4096;
            r114.A0e = A0010;
            boolean A0011 = A00(A0U, "message_media", A02);
            AnonymousClass2G7 r115 = (AnonymousClass2G7) A0U.A00;
            r115.A01 |= 8192;
            r115.A0M = A0011;
            boolean A0012 = A00(A0U, "message_vcard", A02);
            AnonymousClass2G7 r116 = (AnonymousClass2G7) A0U.A00;
            r116.A01 |= 16384;
            r116.A0U = A0012;
            boolean A0013 = A00(A0U, "message_future", A02);
            AnonymousClass2G7 r2 = (AnonymousClass2G7) A0U.A00;
            r2.A01 |= 32768;
            r2.A0H = A0013;
            boolean A0014 = A00(A0U, "message_quoted", A02);
            AnonymousClass2G7 r22 = (AnonymousClass2G7) A0U.A00;
            r22.A01 |= AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
            r22.A0O = A0014;
            boolean A0015 = A00(A0U, "message_system", A02);
            AnonymousClass2G7 r23 = (AnonymousClass2G7) A0U.A00;
            r23.A01 |= 131072;
            r23.A0R = A0015;
            boolean A0016 = A00(A0U, "receipt_device", A02);
            AnonymousClass2G7 r24 = (AnonymousClass2G7) A0U.A00;
            r24.A01 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START;
            r24.A0d = A0016;
            boolean A0017 = A00(A0U, "message_mention", A02);
            AnonymousClass2G7 r25 = (AnonymousClass2G7) A0U.A00;
            r25.A01 |= AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END;
            r25.A0N = A0017;
            boolean A0018 = A00(A0U, "message_revoked", A02);
            AnonymousClass2G7 r26 = (AnonymousClass2G7) A0U.A00;
            r26.A01 |= AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_START;
            r26.A0P = A0018;
            boolean A0019 = A00(A0U, "broadcast_me_jid", A02);
            AnonymousClass2G7 r27 = (AnonymousClass2G7) A0U.A00;
            r27.A01 |= AccessibilityEventCompat.TYPE_TOUCH_INTERACTION_END;
            r27.A0A = A0019;
            boolean A0020 = A00(A0U, "message_frequent", A02);
            AnonymousClass2G7 r28 = (AnonymousClass2G7) A0U.A00;
            r28.A01 |= 4194304;
            r28.A0F = A0020;
            boolean A0021 = A00(A0U, "message_location", A02);
            AnonymousClass2G7 r29 = (AnonymousClass2G7) A0U.A00;
            r29.A01 |= GravityCompat.RELATIVE_LAYOUT_DIRECTION;
            r29.A0J = A0021;
            boolean A0022 = A00(A0U, "participant_user", A02);
            AnonymousClass2G7 r210 = (AnonymousClass2G7) A0U.A00;
            r210.A01 |= 16777216;
            r210.A0Y = A0022;
            boolean A0023 = A00(A0U, "message_thumbnail", A02);
            AnonymousClass2G7 r211 = (AnonymousClass2G7) A0U.A00;
            r211.A01 |= 33554432;
            r211.A0T = A0023;
            boolean A0024 = A00(A0U, "message_send_count", A02);
            AnonymousClass2G7 r212 = (AnonymousClass2G7) A0U.A00;
            r212.A01 |= 67108864;
            r212.A0Q = A0024;
            boolean A0025 = A00(A0U, "migration_jid_store", A02);
            AnonymousClass2G7 r213 = (AnonymousClass2G7) A0U.A00;
            r213.A01 |= 134217728;
            r213.A0W = A0025;
            boolean A0026 = A00(A0U, "payment_transaction", A02);
            AnonymousClass2G7 r214 = (AnonymousClass2G7) A0U.A00;
            r214.A01 |= 268435456;
            r214.A0Z = A0026;
            boolean A0027 = A00(A0U, "migration_chat_store", A02);
            AnonymousClass2G7 r215 = (AnonymousClass2G7) A0U.A00;
            r215.A01 |= 536870912;
            r215.A0V = A0027;
            boolean A0028 = A00(A0U, "quoted_order_message", A02);
            AnonymousClass2G7 r216 = (AnonymousClass2G7) A0U.A00;
            r216.A01 |= 1073741824;
            r216.A0a = A0028;
            boolean A0029 = A00(A0U, "media_migration_fixer", A02);
            AnonymousClass2G7 r217 = (AnonymousClass2G7) A0U.A00;
            r217.A01 |= Integer.MIN_VALUE;
            r217.A0E = A0029;
            boolean A0030 = A00(A0U, "quoted_order_message_v2", A02);
            AnonymousClass2G7 r117 = (AnonymousClass2G7) A0U.A00;
            r117.A02 |= 1;
            r117.A0b = A0030;
            boolean A0031 = A00(A0U, "message_main_verification", A02);
            AnonymousClass2G7 r118 = (AnonymousClass2G7) A0U.A00;
            r118.A02 |= 2;
            r118.A0L = A0031;
            boolean A0032 = A00(A0U, "quoted_ui_elements_reply_message", A02);
            AnonymousClass2G7 r119 = (AnonymousClass2G7) A0U.A00;
            r119.A02 |= 4;
            r119.A0c = A0032;
            AnonymousClass2G7 r120 = (AnonymousClass2G7) C28581Wr.A00(A0U);
            r120.A02 |= 8;
            r120.A08 = true;
            AnonymousClass2G7 r121 = (AnonymousClass2G7) C28581Wr.A00(A0U);
            r121.A02 |= 16;
            r121.A07 = true;
        }
        return (AnonymousClass2G7) A0U.A02();
    }
}
