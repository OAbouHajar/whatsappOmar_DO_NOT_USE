package X;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0sf  reason: invalid class name and case insensitive filesystem */
public class C16220sf implements C16230sg, C16240sh {
    public C16970ty A00;
    public C40991v1 A01;
    public final C16300so A02;
    public final C14870pt A03;
    public final C16040sK A04;
    public final C15900s5 A05;
    public final C16200sd A06;
    public final AnonymousClass127 A07;
    public final C17760vb A08;
    public final C16000sG A09;
    public final C17140ub A0A;
    public final C16080sP A0B;
    public final C16190sc A0C;
    public final AnonymousClass12W A0D;
    public final AnonymousClass01V A0E;
    public final C16440t3 A0F;
    public final C16980tz A0G;
    public final C16260sj A0H;
    public final C15860rz A0I;
    public final C18790xG A0J;
    public final C15810rt A0K;
    public final C216114t A0L;
    public final AnonymousClass11A A0M;
    public final C206911f A0N;
    public final C14710pd A0O;
    public final AnonymousClass12X A0P;
    public final AnonymousClass18R A0Q;
    public final C210112l A0R;
    public final AnonymousClass18W A0S;
    public final C16990u0 A0T;
    public final AnonymousClass12V A0U;
    public final C18060w5 A0V;
    public final String A0W;
    public final Map A0X = new ConcurrentHashMap();
    public final boolean A0Y;

    public C16220sf(C16300so r2, C14870pt r3, C16040sK r4, C15900s5 r5, C16200sd r6, AnonymousClass127 r7, C17760vb r8, C16000sG r9, C17140ub r10, C16080sP r11, C16190sc r12, AnonymousClass12W r13, AnonymousClass01V r14, C16440t3 r15, C16980tz r16, C16260sj r17, C15860rz r18, C18790xG r19, C15810rt r20, C216114t r21, AnonymousClass11A r22, C206911f r23, C14710pd r24, AnonymousClass12X r25, AnonymousClass18R r26, C210112l r27, AnonymousClass18W r28, C16990u0 r29, AnonymousClass12V r30, C18060w5 r31, String str, boolean z2) {
        this.A0G = r16;
        this.A0F = r15;
        this.A0O = r24;
        this.A03 = r3;
        this.A02 = r2;
        this.A0U = r30;
        this.A04 = r4;
        this.A0K = r20;
        this.A0C = r12;
        this.A05 = r5;
        this.A0N = r23;
        this.A09 = r9;
        this.A0E = r14;
        this.A0B = r11;
        this.A0J = r19;
        this.A08 = r8;
        this.A0A = r10;
        this.A06 = r6;
        this.A0D = r13;
        this.A07 = r7;
        this.A0S = r28;
        this.A0H = r17;
        this.A0I = r18;
        this.A0M = r22;
        this.A0V = r31;
        this.A0T = r29;
        this.A0R = r27;
        this.A0L = r21;
        this.A0Q = r26;
        this.A0P = r25;
        this.A0W = str;
        this.A0Y = z2;
        A0E();
    }

    public static final boolean A00(AnonymousClass1WS r6) {
        String str = r6.A0D;
        if ("group_chat_defaults".equals(str) || "individual_chat_defaults".equals(str) || r6.A03 != 0 || r6.A0J || r6.A0I) {
            return false;
        }
        AnonymousClass1WS A022 = r6.A02();
        return TextUtils.equals(r6.A07(), A022.A07()) && TextUtils.equals(r6.A08(), A022.A08()) && TextUtils.equals(r6.A06(), A022.A06()) && TextUtils.equals(r6.A05(), A022.A05()) && TextUtils.equals(r6.A03(), A022.A03()) && TextUtils.equals(r6.A04(), A022.A04()) && r6.A0B() == A022.A0B() && r6.A01 == 0 && r6.A02().A0F == A022.A02().A0F && r6.A06 == null && r6.A05 == null && !r6.A0G && r6.A00 == 0;
    }

    public static C16220sf A21() {
        return (C16220sf) yo.mSingletonC.A3y.get();
    }

    public final synchronized C16970ty A01() {
        if (this.A00 == null) {
            C16970ty r2 = new C16970ty(this.A02, this.A0G, this.A0N, this.A0O, this.A0W);
            this.A00 = r2;
            if (this.A0Y) {
                C40991v1 r1 = this.A01;
                AnonymousClass1UY r0 = r2.A02;
                AnonymousClass00B.A06(r1);
                r0.A01.add(r1);
            }
        }
        return this.A00;
    }

    public AnonymousClass1WS A02() {
        AnonymousClass1WS A072 = A07("group_chat_defaults");
        if (A072.A0B == null) {
            A072.A0B = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A072.A0C)) {
            A072.A0C = "1";
        }
        if (TextUtils.isEmpty(A072.A0A)) {
            A072.A0A = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A072.A09)) {
            A072.A09 = "FFFFFF";
        }
        return A072;
    }

    public AnonymousClass1WS A03() {
        AnonymousClass1WS A072 = A07("individual_chat_defaults");
        if (A072.A0B == null) {
            A072.A0B = Settings.System.DEFAULT_NOTIFICATION_URI.toString();
        }
        if (TextUtils.isEmpty(A072.A0C)) {
            A072.A0C = "1";
        }
        if (TextUtils.isEmpty(A072.A0A)) {
            A072.A0A = Integer.toString(0);
        }
        if (TextUtils.isEmpty(A072.A09)) {
            A072.A09 = "FFFFFF";
        }
        if (A072.A07 == null) {
            A072.A07 = Settings.System.DEFAULT_RINGTONE_URI.toString();
        }
        if (TextUtils.isEmpty(A072.A08)) {
            A072.A08 = "1";
        }
        return A072;
    }

    public final AnonymousClass1WS A04() {
        int i2 = Build.VERSION.SDK_INT;
        C16440t3 r4 = this.A0F;
        C15900s5 r2 = this.A05;
        AnonymousClass01V r3 = this.A0E;
        C16260sj r5 = this.A0H;
        return i2 >= 26 ? new C41001v2(r2, r3, r4, r5, this, this.A01) : new AnonymousClass1WS(r2, r3, r4, r5, this);
    }

    public final AnonymousClass1WS A05(Cursor cursor) {
        AnonymousClass1WS A042 = A04();
        A042.A0D = cursor.getString(cursor.getColumnIndexOrThrow("jid"));
        A042.A03 = cursor.getLong(cursor.getColumnIndexOrThrow("mute_end"));
        boolean z2 = true;
        boolean z3 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("muted_notifications")) == 1) {
            z3 = true;
        }
        A042.A0H = z3;
        boolean z4 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("use_custom_notifications")) == 1) {
            z4 = true;
        }
        A042.A0J = z4;
        A042.A0B = cursor.getString(cursor.getColumnIndexOrThrow("message_tone"));
        A042.A0C = cursor.getString(cursor.getColumnIndexOrThrow("message_vibrate"));
        A042.A0A = cursor.getString(cursor.getColumnIndexOrThrow("message_popup"));
        A042.A09 = cursor.getString(cursor.getColumnIndexOrThrow("message_light"));
        A042.A07 = cursor.getString(cursor.getColumnIndexOrThrow("call_tone"));
        A042.A08 = cursor.getString(cursor.getColumnIndexOrThrow("call_vibrate"));
        boolean z5 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("status_muted")) == 1) {
            z5 = true;
        }
        A042.A0I = z5;
        boolean z6 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("pinned")) == 1) {
            z6 = true;
        }
        A042.A0G = z6;
        A042.A04 = cursor.getLong(cursor.getColumnIndexOrThrow("pinned_time"));
        boolean z7 = false;
        if (cursor.getInt(cursor.getColumnIndexOrThrow("low_pri_notifications")) == 1) {
            z7 = true;
        }
        A042.A0E = z7;
        A042.A01 = cursor.getInt(cursor.getColumnIndexOrThrow("media_visibility"));
        if (cursor.getInt(cursor.getColumnIndexOrThrow("mute_reactions")) != 1) {
            z2 = false;
        }
        A042.A0F = z2;
        if ("0".equals(A042.A09)) {
            A042.A09 = "000000";
        }
        String string = cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_light_type"));
        if (string != null) {
            A042.A06 = new C40931uv(0, string, cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_light_value")));
        }
        String string2 = cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_dark_type"));
        if (string2 != null) {
            A042.A05 = new C40931uv(Integer.valueOf(cursor.getInt(cursor.getColumnIndexOrThrow("wallpaper_dark_opacity"))), string2, cursor.getString(cursor.getColumnIndexOrThrow("wallpaper_dark_value")));
        }
        A042.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("notifications_auto_muted"));
        return A042;
    }

    public AnonymousClass1WS A06(C15830rv r2) {
        return A07(r2.getRawString());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0043 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x004c */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0044=Splitter:B:22:0x0044, B:27:0x004c=Splitter:B:27:0x004c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass1WS A07(java.lang.String r13) {
        /*
            r12 = this;
            java.util.Map r3 = r12.A0X
            java.lang.Object r0 = r3.get(r13)
            X.1WS r0 = (X.AnonymousClass1WS) r0
            if (r0 != 0) goto L_0x0062
            X.0ty r0 = r12.A01()     // Catch:{ SQLiteDatabaseCorruptException -> 0x004d }
            X.0tf r2 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x004d }
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x0048 }
            java.lang.String r5 = "settings"
            java.lang.String[] r6 = X.C40941uw.A00     // Catch:{ all -> 0x0048 }
            java.lang.String r7 = "jid = ?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0048 }
            r0 = 0
            r8[r0] = r13     // Catch:{ all -> 0x0048 }
            r9 = 0
            r11 = r9
            r10 = r9
            android.database.Cursor r1 = r4.A09(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0044
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003b
            X.1WS r0 = r12.A05(r1)     // Catch:{ all -> 0x003f }
            r1.close()     // Catch:{ all -> 0x0048 }
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x004d }
            goto L_0x005d
        L_0x003b:
            r1.close()     // Catch:{ all -> 0x0048 }
            goto L_0x0044
        L_0x003f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0043 }
        L_0x0043:
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0044:
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x004d }
            goto L_0x0059
        L_0x0048:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x004d }
        L_0x004d:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/get"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0057 }
            r12.A0C()     // Catch:{ all -> 0x0057 }
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            throw r0
        L_0x0059:
            X.1WS r0 = r12.A04()
        L_0x005d:
            r0.A0D = r13
            r3.put(r13, r0)
        L_0x0062:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16220sf.A07(java.lang.String):X.1WS");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0084 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0071=Splitter:B:17:0x0071, B:25:0x0084=Splitter:B:25:0x0084} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Long A08(X.C15830rv r15, long r16, boolean r18) {
        /*
            r14 = this;
            r0 = r16
            r9 = r18
            if (r18 == 0) goto L_0x000c
            X.0vb r3 = r14.A08
            r2 = 7
            r3.A00(r15, r2)
        L_0x000c:
            java.lang.String r2 = r15.getRawString()
            X.1WS r8 = r14.A07(r2)
            boolean r2 = r8.A0G
            long r3 = r8.A04
            X.0ty r5 = r14.A01()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0085 }
            X.0tf r7 = r5.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0085 }
            r8.A0G = r9     // Catch:{ all -> 0x0080 }
            if (r18 != 0) goto L_0x0026
            r0 = 0
        L_0x0026:
            r8.A04 = r0     // Catch:{ all -> 0x0080 }
            r0 = 2
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x0080 }
            r10.<init>(r0)     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = "pinned"
            boolean r0 = r8.A0G     // Catch:{ all -> 0x0080 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0080 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0080 }
            java.lang.String r5 = "pinned_time"
            long r0 = r8.A04     // Catch:{ all -> 0x0080 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0080 }
            r10.put(r5, r0)     // Catch:{ all -> 0x0080 }
            X.0tg r12 = r7.A02     // Catch:{ all -> 0x0080 }
            java.lang.String r11 = "settings"
            java.lang.String r13 = "jid =?"
            r6 = 1
            java.lang.String[] r5 = new java.lang.String[r6]     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = r15.getRawString()     // Catch:{ all -> 0x0080 }
            r0 = 0
            r5[r0] = r1     // Catch:{ all -> 0x0080 }
            int r0 = r12.A00(r11, r10, r13, r5)     // Catch:{ all -> 0x0080 }
            r5 = 0
            if (r0 != 0) goto L_0x0068
            java.lang.String r1 = "jid"
            java.lang.String r0 = r15.getRawString()     // Catch:{ all -> 0x0080 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0080 }
            r12.A02(r10, r11)     // Catch:{ all -> 0x0080 }
        L_0x0068:
            if (r2 != r9) goto L_0x0071
            long r1 = r8.A04     // Catch:{ all -> 0x0080 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0071
            r6 = 0
        L_0x0071:
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0085 }
            X.11A r0 = r14.A0M
            r0.A04()
            if (r6 == 0) goto L_0x007f
            java.lang.Long r5 = java.lang.Long.valueOf(r3)
        L_0x007f:
            return r5
        L_0x0080:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0084 }
        L_0x0084:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0085 }
        L_0x0085:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/set-pin"
            com.whatsapp.util.Log.i(r0, r1)
            r14.A0C()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16220sf.A08(X.0rv, long, boolean):java.lang.Long");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0057 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0065 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:26:0x0065=Splitter:B:26:0x0065, B:20:0x005d=Splitter:B:20:0x005d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A09() {
        /*
            r15 = this;
            java.lang.String r1 = "pinned_time"
            java.lang.String r2 = "jid"
            r0 = 100
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r0)
            X.0ty r0 = r15.A01()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0066 }
            X.0tf r4 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0066 }
            X.0tg r7 = r4.A02     // Catch:{ all -> 0x0061 }
            java.lang.String r8 = "settings"
            r0 = 2
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0061 }
            r0 = 0
            r9[r0] = r2     // Catch:{ all -> 0x0061 }
            r0 = 1
            r9[r0] = r1     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = "pinned != 0"
            r11 = 0
            java.lang.String r13 = "pinned_time DESC"
            r14 = r11
            r12 = r11
            android.database.Cursor r7 = r7.A09(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0061 }
            if (r7 == 0) goto L_0x0058
            int r5 = r7.getColumnIndex(r2)     // Catch:{ all -> 0x0053 }
            int r3 = r7.getColumnIndex(r1)     // Catch:{ all -> 0x0053 }
        L_0x0037:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = r7.getString(r5)     // Catch:{ all -> 0x0053 }
            X.0rv r2 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0053 }
            long r0 = r7.getLong(r3)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0037
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0053 }
            r6.put(r2, r0)     // Catch:{ all -> 0x0053 }
            goto L_0x0037
        L_0x0053:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0057 }
        L_0x0057:
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0058:
            if (r7 == 0) goto L_0x005d
            r7.close()     // Catch:{ all -> 0x0061 }
        L_0x005d:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0066 }
            return r6
        L_0x0061:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0065 }
        L_0x0065:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/get-pinned-jids"
            com.whatsapp.util.Log.i(r0, r1)
            r15.A0C()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16220sf.A09():java.util.Map");
    }

    public Set A0A() {
        return new LinkedHashSet(A09().keySet());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Set A0B() {
        /*
            r13 = this;
            java.lang.String r1 = "jid"
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            X.0ty r0 = r13.A01()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0050 }
            X.0tf r3 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0050 }
            X.0tg r5 = r3.A02     // Catch:{ all -> 0x004b }
            java.lang.String r6 = "settings"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x004b }
            r0 = 0
            r7[r0] = r1     // Catch:{ all -> 0x004b }
            java.lang.String r8 = "use_custom_notifications != 0"
            r9 = 0
            r11 = r9
            r12 = r9
            r10 = r9
            android.database.Cursor r2 = r5.A09(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x004b }
            int r1 = r2.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0044 }
        L_0x0029:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r2.getString(r1)     // Catch:{ all -> 0x0044 }
            X.0rv r0 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0029
            r4.add(r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0029
        L_0x003d:
            r2.close()     // Catch:{ all -> 0x004b }
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0050 }
            return r4
        L_0x0044:
            r0 = move-exception
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/get-pinned-jids"
            com.whatsapp.util.Log.i(r0, r1)
            r13.A0C()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16220sf.A0B():java.util.Set");
    }

    public void A0C() {
        this.A0X.clear();
        A01().A04();
        A0F();
        A0E();
    }

    public void A0D() {
        String A012;
        if (C40981v0.A00) {
            C16800tf A022 = A01().A02();
            try {
                NotificationManager A082 = this.A0E.A08();
                AnonymousClass00B.A06(A082);
                for (NotificationChannel notificationChannel : AnonymousClass1v6.A01(A082)) {
                    if (!C41041v8.A01.contains(notificationChannel.getId()) && !"miscellaneous".equals(notificationChannel.getId()) && this.A01.A0L(notificationChannel, A022) && (A012 = C40991v1.A0M.A01(notificationChannel.getId())) != null) {
                        this.A0X.remove(A012);
                    }
                }
                A022.close();
                return;
            } catch (Throwable unused) {
            }
        } else {
            return;
        }
        throw th;
    }

    public final void A0E() {
        C16440t3 r6 = this.A0F;
        C14870pt r1 = this.A03;
        C16980tz r7 = this.A0G;
        C15810rt r10 = this.A0K;
        C15900s5 r2 = this.A05;
        AnonymousClass01V r5 = this.A0E;
        C16080sP r4 = this.A0B;
        this.A01 = new C40991v1(r1, r2, this.A0A, r4, r5, r6, r7, this.A0H, this.A0I, r10, this.A0L, this.A0M, this.A0Q, this.A0V);
    }

    public synchronized void A0F() {
        C16970ty r0 = this.A00;
        if (r0 != null) {
            r0.close();
            if (this.A0Y) {
                C16970ty r02 = this.A00;
                C40991v1 r1 = this.A01;
                AnonymousClass1UY r03 = r02.A02;
                AnonymousClass00B.A06(r1);
                r03.A01.remove(r1);
            }
            this.A00 = null;
        }
    }

    public void A0G(C19740yv r6, C15860rz r7) {
        if (Build.VERSION.SDK_INT >= 30 && ((SharedPreferences) r7.A01.get()).getInt("notification_channel_upgrade_version", 0) != 1) {
            for (C15830rv r1 : A0B()) {
                r6.A06(r1);
                A0K(A07(r1.getRawString()));
                C16010sH A082 = this.A09.A08(r1);
                if (A082 != null) {
                    r6.A03(this.A0G.A00, A082);
                }
            }
            r7.A0K().putInt("notification_channel_upgrade_version", 1).apply();
        }
    }

    public void A0H(C15830rv r3, int i2) {
        AnonymousClass1WS A072 = A07(r3.getRawString());
        if (i2 != A072.A00) {
            A072.A00 = i2;
            A0K(A072);
        }
    }

    public void A0I(C15830rv r10, boolean z2) {
        AnonymousClass1WS A072 = A07(r10.getRawString());
        if (C40981v0.A00 && A072.A0J) {
            this.A01.A0K(r10.getRawString());
        }
        C16800tf A022 = A01().A02();
        if (z2) {
            try {
                if (A072.A0J) {
                    A072.A02 = System.currentTimeMillis();
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("deleted", Long.valueOf(A072.A02));
                    A022.A02.A00("settings", contentValues, "jid = ?", new String[]{r10.getRawString()});
                } else {
                    this.A0X.remove(r10.getRawString());
                    A022.A02.A01("settings", "jid = ?", new String[]{r10.getRawString()});
                }
            } catch (Throwable unused) {
            }
        }
        A022.close();
        return;
        throw th;
    }

    public void A0J(AnonymousClass1WS r3) {
        if (!r3.A0J) {
            r3 = r3.A02();
        }
        A0N(r3.A0D, Settings.System.DEFAULT_NOTIFICATION_URI.toString());
        Log.i("chat-settings-store/set-underlying-message-tone-to-default updated message tone to default");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00f8, code lost:
        if (r12.A01() == 0) goto L_0x00fa;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x01ca */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K(X.AnonymousClass1WS r12) {
        /*
            r11 = this;
            r0 = 8
            android.content.ContentValues r8 = new android.content.ContentValues
            r8.<init>(r0)
            boolean r0 = r12.A0J
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "use_custom_notifications"
            r8.put(r0, r1)
            java.lang.String r1 = r12.A07()
            java.lang.String r0 = "message_tone"
            r8.put(r0, r1)
            java.lang.String r1 = r12.A08()
            java.lang.String r0 = "message_vibrate"
            r8.put(r0, r1)
            java.lang.String r1 = r12.A06()
            java.lang.String r0 = "message_popup"
            r8.put(r0, r1)
            java.lang.String r1 = r12.A05()
            java.lang.String r0 = "message_light"
            r8.put(r0, r1)
            java.lang.String r1 = r12.A03()
            java.lang.String r0 = "call_tone"
            r8.put(r0, r1)
            java.lang.String r1 = r12.A04()
            java.lang.String r0 = "call_vibrate"
            r8.put(r0, r1)
            boolean r0 = r12.A0G
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "pinned"
            r8.put(r0, r1)
            long r0 = r12.A04
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "pinned_time"
            r8.put(r0, r1)
            boolean r0 = r12.A0I
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "status_muted"
            r8.put(r0, r1)
            boolean r0 = r12.A0B()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "low_pri_notifications"
            r8.put(r0, r1)
            int r0 = r12.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "media_visibility"
            r8.put(r0, r1)
            X.1WS r0 = r12.A02()
            boolean r0 = r0.A0F
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "mute_reactions"
            r8.put(r0, r1)
            int r0 = r12.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "notifications_auto_muted"
            r8.put(r0, r1)
            X.1uv r0 = r12.A06
            java.lang.String r2 = "wallpaper_light_value"
            java.lang.String r1 = "wallpaper_light_type"
            r4 = 0
            if (r0 == 0) goto L_0x010f
            java.lang.String r0 = r0.A01
            r8.put(r1, r0)
            X.1uv r0 = r12.A06
            java.lang.String r0 = r0.A02
            r8.put(r2, r0)
        L_0x00b4:
            X.1uv r0 = r12.A05
            java.lang.String r3 = "wallpaper_dark_opacity"
            java.lang.String r2 = "wallpaper_dark_value"
            java.lang.String r1 = "wallpaper_dark_type"
            if (r0 == 0) goto L_0x0105
            java.lang.String r0 = r0.A01
            r8.put(r1, r0)
            X.1uv r0 = r12.A05
            java.lang.String r0 = r0.A02
            r8.put(r2, r0)
            X.1uv r0 = r12.A05
            java.lang.Integer r0 = r0.A00
            r8.put(r3, r0)
        L_0x00d4:
            long r3 = r12.A01()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0116
            long r0 = r12.A01()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "mute_end"
            r8.put(r0, r1)
            boolean r0 = r12.A0H
            if (r0 != 0) goto L_0x00fa
            long r4 = r12.A01()
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x00fb
        L_0x00fa:
            r0 = 1
        L_0x00fb:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "muted_notifications"
            r8.put(r0, r1)
            goto L_0x0116
        L_0x0105:
            r8.put(r1, r4)
            r8.put(r2, r4)
            r8.put(r3, r4)
            goto L_0x00d4
        L_0x010f:
            r8.put(r1, r4)
            r8.put(r2, r4)
            goto L_0x00b4
        L_0x0116:
            X.0ty r0 = r11.A01()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01cb }
            X.0tf r2 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01cb }
            boolean r0 = A00(r12)     // Catch:{ all -> 0x01c6 }
            java.lang.String r5 = "settings"
            r7 = 0
            r6 = 1
            if (r0 == 0) goto L_0x0163
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c6 }
            r1.<init>()     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = "chat-settings-store/save-chat-settings deleting row for id:"
            r1.append(r0)     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r12.A0D     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = X.C16030sJ.A04(r0)     // Catch:{ all -> 0x01c6 }
            r1.append(r0)     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01c6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x01c6 }
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x01c6 }
            java.lang.String r3 = "jid = ?"
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r12.A0D     // Catch:{ all -> 0x01c6 }
            r1[r7] = r0     // Catch:{ all -> 0x01c6 }
            r4.A01(r5, r3, r1)     // Catch:{ all -> 0x01c6 }
            boolean r0 = X.C40981v0.A00     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x015b
            X.1v1 r1 = r11.A01     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r12.A0D     // Catch:{ all -> 0x01c6 }
            r1.A0K(r0)     // Catch:{ all -> 0x01c6 }
        L_0x015b:
            java.util.Map r1 = r11.A0X     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r12.A0D     // Catch:{ all -> 0x01c6 }
            r1.remove(r0)     // Catch:{ all -> 0x01c6 }
            goto L_0x01c2
        L_0x0163:
            X.0tg r4 = r2.A02     // Catch:{ all -> 0x01c6 }
            java.lang.String r3 = "jid = ?"
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r12.A0D     // Catch:{ all -> 0x01c6 }
            r1[r7] = r0     // Catch:{ all -> 0x01c6 }
            int r0 = r4.A00(r5, r8, r3, r1)     // Catch:{ all -> 0x01c6 }
            if (r0 != 0) goto L_0x017d
            java.lang.String r1 = "jid"
            java.lang.String r0 = r12.A0D     // Catch:{ all -> 0x01c6 }
            r8.put(r1, r0)     // Catch:{ all -> 0x01c6 }
            r4.A02(r8, r5)     // Catch:{ all -> 0x01c6 }
        L_0x017d:
            boolean r0 = X.C40981v0.A00     // Catch:{ all -> 0x01c6 }
            if (r0 == 0) goto L_0x015b
            java.lang.String r0 = "individual_chat_defaults"
            java.lang.String r6 = r12.A0D     // Catch:{ all -> 0x01c6 }
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x01c6 }
            if (r0 != 0) goto L_0x01a2
            java.lang.String r0 = "group_chat_defaults"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x01c6 }
            if (r0 != 0) goto L_0x01a2
            boolean r0 = r12.A0J     // Catch:{ all -> 0x01c6 }
            if (r0 != 0) goto L_0x01a2
            X.C16030sJ.A04(r6)     // Catch:{ all -> 0x01c6 }
            X.1v1 r1 = r11.A01     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r12.A0D     // Catch:{ all -> 0x01c6 }
            r1.A0K(r0)     // Catch:{ all -> 0x01c6 }
            goto L_0x015b
        L_0x01a2:
            X.1v1 r3 = r11.A01     // Catch:{ all -> 0x01c6 }
            java.lang.CharSequence r5 = r3.A06(r6)     // Catch:{ all -> 0x01c6 }
            java.lang.String r7 = r12.A05()     // Catch:{ all -> 0x01c6 }
            java.lang.String r8 = r12.A08()     // Catch:{ all -> 0x01c6 }
            java.lang.String r0 = r12.A07()     // Catch:{ all -> 0x01c6 }
            android.net.Uri r4 = android.net.Uri.parse(r0)     // Catch:{ all -> 0x01c6 }
            boolean r9 = r12.A0B()     // Catch:{ all -> 0x01c6 }
            boolean r10 = r12.A0J     // Catch:{ all -> 0x01c6 }
            r3.A0G(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x01c6 }
            goto L_0x015b
        L_0x01c2:
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01cb }
            return
        L_0x01c6:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x01ca }
        L_0x01ca:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x01cb }
        L_0x01cb:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/save"
            com.whatsapp.util.Log.i(r0, r1)
            r11.A0C()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16220sf.A0K(X.1WS):void");
    }

    public final void A0L(String str, String str2) {
        AnonymousClass1WS A072 = A07(str);
        if (!TextUtils.equals(str2, A072.A09)) {
            A072.A09 = str2;
            A0K(A072);
        }
    }

    public final void A0M(String str, String str2) {
        AnonymousClass1WS A072 = A07(str);
        if (!TextUtils.equals(str2, A072.A0A)) {
            A072.A0A = str2;
            A0K(A072);
        }
    }

    public final void A0N(String str, String str2) {
        AnonymousClass1WS A072 = A07(str);
        if (!TextUtils.equals(str2, A072.A0B)) {
            A072.A0B = str2;
            A0K(A072);
        }
    }

    public final void A0O(String str, String str2) {
        AnonymousClass1WS A072 = A07(str);
        if (!TextUtils.equals(str2, A072.A0C)) {
            A072.A0C = str2;
            A0K(A072);
        }
    }

    public boolean A0P(C15830rv r7) {
        boolean z2;
        NotificationChannel A032;
        AnonymousClass1WS A072 = A07(r7.getRawString());
        if (!C40981v0.A00 || !A072.A0J || (A032 = this.A01.A03(r7.getRawString())) == null || A032.getImportance() >= 3) {
            z2 = false;
        } else {
            Log.i("chat-settings-store//cancelMute unmuting channel");
            this.A01.A0F(A032, r7.getRawString(), C40991v1.A00(A072.A0B()));
            z2 = true;
        }
        boolean A0S2 = A0S(r7, 0, A072.A0H);
        StringBuilder sb = new StringBuilder("chat-settings-store//cancelMute for jid:");
        sb.append(r7);
        sb.append(" channelChanged:");
        sb.append(z2);
        sb.append(" dbchanged:");
        sb.append(A0S2);
        Log.i(sb.toString());
        return z2 || A0S2;
    }

    public boolean A0Q(C15830rv r2) {
        return A07(r2.getRawString()).A09();
    }

    public boolean A0R(C15830rv r2) {
        return A07(r2.getRawString()).A0I;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0S(X.C15830rv r10, long r11, boolean r13) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getRawString()
            X.1WS r3 = r9.A07(r0)
            long r1 = r3.A03
            r8 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0014
            boolean r0 = r3.A0H
            if (r13 != r0) goto L_0x0014
            return r8
        L_0x0014:
            X.0ty r0 = r9.A01()     // Catch:{ SQLiteDatabaseCorruptException -> 0x008e }
            X.0tf r6 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x008e }
            r3.A03 = r11     // Catch:{ all -> 0x0089 }
            boolean r0 = A00(r3)     // Catch:{ all -> 0x0089 }
            java.lang.String r7 = "settings"
            r4 = 1
            if (r0 == 0) goto L_0x0041
            X.0tg r3 = r6.A02     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = "jid = ?"
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x0089 }
            r1[r8] = r0     // Catch:{ all -> 0x0089 }
            r3.A01(r7, r2, r1)     // Catch:{ all -> 0x0089 }
            java.util.Map r1 = r9.A0X     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x0089 }
            r1.remove(r0)     // Catch:{ all -> 0x0089 }
            goto L_0x0079
        L_0x0041:
            r3.A0H = r13     // Catch:{ all -> 0x0089 }
            r0 = 2
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0089 }
            r5.<init>(r0)     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "mute_end"
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0089 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "muted_notifications"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x0089 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0089 }
            X.0tg r3 = r6.A02     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = "jid = ?"
            java.lang.String[] r1 = new java.lang.String[r4]     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x0089 }
            r1[r8] = r0     // Catch:{ all -> 0x0089 }
            int r0 = r3.A00(r7, r5, r2, r1)     // Catch:{ all -> 0x0089 }
            if (r0 != 0) goto L_0x0079
            java.lang.String r1 = "jid"
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x0089 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0089 }
            r3.A02(r5, r7)     // Catch:{ all -> 0x0089 }
        L_0x0079:
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x008e }
            X.0pt r2 = r9.A03
            r1 = 30
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8
            r0.<init>(r9, r1, r10)
            r2.A0K(r0)
            return r4
        L_0x0089:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x008d }
        L_0x008d:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x008e }
        L_0x008e:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/setmute"
            com.whatsapp.util.Log.i(r0, r1)
            r9.A0C()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16220sf.A0S(X.0rv, long, boolean):boolean");
    }

    public boolean A0T(UserJid userJid) {
        AnonymousClass1WS A072 = A07(userJid.getRawString());
        if (!A072.A0I) {
            return false;
        }
        A072.A0I = false;
        A0K(A072);
        this.A03.A0K(new RunnableRunnableShape10S0200000_I0_8(this, 31, userJid));
        return true;
    }

    public boolean A0U(UserJid userJid) {
        AnonymousClass1WS A072 = A07(userJid.getRawString());
        if (A072.A0I) {
            return false;
        }
        A072.A0I = true;
        A0K(A072);
        this.A03.A0K(new RunnableRunnableShape10S0200000_I0_8(this, 31, userJid));
        return true;
    }

    public final boolean A0V(String str) {
        if (!C40981v0.A00) {
            return false;
        }
        C16800tf A022 = A01().A02();
        try {
            AnonymousClass1v5 r3 = C40991v1.A0M;
            String A002 = r3.A00(str);
            if (A002 != null) {
                NotificationManager A082 = this.A0E.A08();
                AnonymousClass00B.A06(A082);
                if (this.A01.A0L(AnonymousClass1v6.A00(A082, A002), A022)) {
                    this.A0X.remove(r3.A01(A002));
                    A022.close();
                    return true;
                }
            }
            A022.close();
            return false;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0243, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        com.whatsapp.util.Log.e("chat-settings-store/copy", r2);
        com.whatsapp.util.Log.e("chat-settings-store/backup/failed-to-copy");
        r14.A01().close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0256, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        com.whatsapp.util.Log.e("chat-settings-store/backup failed", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0268, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0269, code lost:
        r14.A01().A04();
        r13.unlock();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0273, code lost:
        throw r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0152 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0238 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x023d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0242 */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0256 A[ExcHandler: IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r2v4 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x00ab] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0158=Splitter:B:29:0x0158, B:61:0x0238=Splitter:B:61:0x0238} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A5J() {
        /*
            r51 = this;
            r11 = r51
            X.0sd r0 = r11.A06
            r50 = r0
            X.0tx r10 = X.C40691uX.A06(r50)
            X.0tz r9 = r11.A0G
            X.0t3 r0 = r11.A0F
            r28 = r0
            X.0pd r0 = r11.A0O
            r37 = r0
            X.0pt r0 = r11.A03
            r49 = r0
            X.0so r0 = r11.A02
            r48 = r0
            X.12V r0 = r11.A0U
            r43 = r0
            X.0sK r0 = r11.A04
            r47 = r0
            X.0rt r0 = r11.A0K
            r33 = r0
            X.0sc r0 = r11.A0C
            r25 = r0
            X.0s5 r0 = r11.A05
            r20 = r0
            X.11f r0 = r11.A0N
            r19 = r0
            X.0sG r0 = r11.A09
            r18 = r0
            X.01V r0 = r11.A0E
            r17 = r0
            X.0sP r0 = r11.A0B
            r16 = r0
            X.0xG r0 = r11.A0J
            r32 = r0
            X.0vb r15 = r11.A08
            X.0ub r14 = r11.A0A
            X.12W r0 = r11.A0D
            r26 = r0
            X.127 r13 = r11.A07
            X.18W r12 = r11.A0S
            X.0sj r8 = r11.A0H
            X.0rz r7 = r11.A0I
            X.11A r6 = r11.A0M
            X.0w5 r5 = r11.A0V
            X.0u0 r0 = r11.A0T
            r42 = r0
            X.12l r4 = r11.A0R
            X.14t r3 = r11.A0L
            X.18R r2 = r11.A0Q
            X.12X r0 = r11.A0P
            r38 = r0
            java.lang.String r1 = "chatsettingsbackup.db"
            r46 = 0
            X.0sf r0 = new X.0sf
            r21 = r15
            r22 = r18
            r23 = r14
            r24 = r16
            r27 = r17
            r29 = r9
            r30 = r8
            r31 = r7
            r34 = r3
            r35 = r6
            r36 = r19
            r39 = r2
            r40 = r4
            r41 = r12
            r44 = r5
            r45 = r1
            r14 = r0
            r15 = r48
            r16 = r49
            r17 = r47
            r18 = r20
            r19 = r50
            r20 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            X.0ty r2 = r11.A01()
            java.util.concurrent.locks.ReentrantReadWriteLock r2 = r2.A05
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r2.writeLock()
            r13.lock()
            java.lang.String r2 = "chat-settings-store/copy "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            r5.<init>(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            X.0ty r4 = r11.A01()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            X.0tz r2 = r4.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            android.content.Context r3 = r2.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.lang.String r2 = r4.A03     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.io.File r2 = r3.getDatabasePath(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            r5.append(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.lang.String r2 = " -> "
            r5.append(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            X.0ty r4 = r0.A01()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            X.0tz r2 = r4.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            android.content.Context r3 = r2.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.lang.String r2 = r4.A03     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.io.File r2 = r3.getDatabasePath(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            r5.append(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.lang.String r2 = r5.toString()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            X.0ty r2 = r0.A01()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0243, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            X.0tf r12 = r2.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0243, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            X.1cj r8 = r12.A00()     // Catch:{ all -> 0x023e }
            X.0ty r2 = r11.A01()     // Catch:{ all -> 0x0239 }
            X.0tf r5 = r2.get()     // Catch:{ all -> 0x0239 }
            X.0tg r14 = r5.A02     // Catch:{ all -> 0x0234 }
            java.lang.String r15 = "settings"
            java.lang.String[] r16 = X.C40941uw.A00     // Catch:{ all -> 0x0234 }
            r4 = 0
            r18 = r4
            r19 = r4
            r20 = r4
            r21 = r4
            r17 = r4
            android.database.Cursor r6 = r14.A09(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x0234 }
            if (r6 == 0) goto L_0x0148
            r6.getCount()     // Catch:{ all -> 0x014c }
        L_0x010d:
            boolean r2 = r6.moveToNext()     // Catch:{ all -> 0x014c }
            if (r2 == 0) goto L_0x0148
            X.1WS r7 = r11.A05(r6)     // Catch:{ all -> 0x014c }
            java.lang.String r2 = r7.A0D     // Catch:{ all -> 0x014c }
            if (r2 == 0) goto L_0x0133
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x014c }
            r3.<init>()     // Catch:{ all -> 0x014c }
            java.lang.String r2 = "chat-settings-store/copy-chat-settings "
            r3.append(r2)     // Catch:{ all -> 0x014c }
            r3.append(r7)     // Catch:{ all -> 0x014c }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x014c }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x014c }
            r0.A0K(r7)     // Catch:{ all -> 0x014c }
            goto L_0x010d
        L_0x0133:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x014c }
            r3.<init>()     // Catch:{ all -> 0x014c }
            java.lang.String r2 = "chat-settings-store/backup/null-jid/skipped "
            r3.append(r2)     // Catch:{ all -> 0x014c }
            r3.append(r7)     // Catch:{ all -> 0x014c }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x014c }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x014c }
            goto L_0x010d
        L_0x0148:
            r8.A00()     // Catch:{ all -> 0x014c }
            goto L_0x0153
        L_0x014c:
            r1 = move-exception
            if (r6 == 0) goto L_0x0152
            r6.close()     // Catch:{ all -> 0x0152 }
        L_0x0152:
            throw r1     // Catch:{ all -> 0x0234 }
        L_0x0153:
            if (r6 == 0) goto L_0x0158
            r6.close()     // Catch:{ all -> 0x0234 }
        L_0x0158:
            r5.close()     // Catch:{ all -> 0x0239 }
            r8.close()     // Catch:{ all -> 0x023e }
            r12.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0243, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.lang.String r2 = "chat-settings-store/backup/close-backup-db"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            X.0ty r2 = r0.A01()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            r2.A03()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            X.0ty r2 = r0.A01()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            r2.close()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            boolean r2 = r26.A02()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            if (r2 == 0) goto L_0x0181
            java.lang.String r1 = "chat-settings-store/backup/skip no media or read-only media"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            goto L_0x025c
        L_0x0181:
            X.0tx r7 = X.C16960tx.A05     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.io.File r6 = r25.A02()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            if (r10 != r7) goto L_0x01cd
            java.lang.String r2 = "chatsettingsbackup.db.crypt1"
        L_0x018b:
            java.io.File r5 = new java.io.File     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            r5.<init>(r6, r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            X.0tx r2 = X.C16960tx.A00()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.util.List r6 = X.C40691uX.A08(r7, r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.lang.String r2 = ".crypt1"
            r6.add(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.io.File r3 = r25.A02()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.io.File r2 = new java.io.File     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            r2.<init>(r3, r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.util.ArrayList r1 = X.C40691uX.A07(r2, r6)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            X.C40691uX.A0D(r2, r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
        L_0x01b1:
            boolean r1 = r3.hasNext()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            if (r1 == 0) goto L_0x01de
            java.lang.Object r2 = r3.next()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            boolean r1 = r2.equals(r5)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            if (r1 != 0) goto L_0x01b1
            boolean r1 = r2.exists()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            if (r1 == 0) goto L_0x01b1
            r2.delete()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            goto L_0x01b1
        L_0x01cd:
            java.lang.String r2 = "chatsettingsbackup.db.crypt"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            r3.<init>(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            int r2 = r10.version     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            r3.append(r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.lang.String r2 = r3.toString()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            goto L_0x018b
        L_0x01de:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            r2.<init>()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.lang.String r1 = "chat-settings-store/backup/to "
            r2.append(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            r2.append(r5)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            r14 = r47
            r15 = r4
            r16 = r50
            r17 = r26
            r18 = r32
            r19 = r38
            r20 = r42
            r21 = r10
            r22 = r43
            r23 = r5
            X.1uz r5 = X.C40951ux.A01(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            android.content.Context r1 = r9.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            boolean r1 = r5.A04(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            if (r1 != 0) goto L_0x0217
            java.lang.String r1 = "chat-settings-store/backup/prepare for backup failed"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            goto L_0x025c
        L_0x0217:
            X.0ty r3 = r0.A01()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            X.0tz r1 = r3.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            android.content.Context r2 = r1.A00     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.lang.String r1 = r3.A03     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.io.File r1 = r2.getDatabasePath(r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            r5.A03(r4, r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            X.0ty r0 = r0.A01()
            r0.A04()
            r13.unlock()
            r0 = 1
            return r0
        L_0x0234:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0238 }
        L_0x0238:
            throw r1     // Catch:{ all -> 0x0239 }
        L_0x0239:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x023d }
        L_0x023d:
            throw r1     // Catch:{ all -> 0x023e }
        L_0x023e:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0242 }
        L_0x0242:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0243, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256, IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
        L_0x0243:
            r2 = move-exception
            java.lang.String r1 = "chat-settings-store/copy"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            java.lang.String r1 = "chat-settings-store/backup/failed-to-copy"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            X.0ty r1 = r0.A01()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            r1.close()     // Catch:{ IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0256 }
            goto L_0x025c
        L_0x0256:
            r2 = move-exception
            java.lang.String r1 = "chat-settings-store/backup failed"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0268 }
        L_0x025c:
            X.0ty r0 = r0.A01()
            r0.A04()
            r13.unlock()
            r0 = 0
            return r0
        L_0x0268:
            r1 = move-exception
            X.0ty r0 = r0.A01()
            r0.A04()
            r13.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16220sf.A5J():boolean");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x006d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x007b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A9v() {
        /*
            r14 = this;
            java.lang.String r4 = "wallpaper_light_value"
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            X.1WS r2 = r14.A03()
            X.1uv r1 = r2.A05
            java.lang.String r5 = "USER_PROVIDED"
            if (r1 == 0) goto L_0x0021
            java.lang.String r0 = r1.A01
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x0021
            r3.add(r0)
        L_0x0021:
            X.1uv r1 = r2.A06
            if (r1 == 0) goto L_0x0034
            java.lang.String r0 = r1.A01
            boolean r0 = r5.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x0034
            r3.add(r0)
        L_0x0034:
            X.0ty r0 = r14.A01()     // Catch:{ SQLiteDatabaseCorruptException -> 0x007c }
            X.0tf r2 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x007c }
            X.0tg r6 = r2.A02     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = "settings"
            r1 = 1
            java.lang.String[] r8 = new java.lang.String[r1]     // Catch:{ all -> 0x0077 }
            r0 = 0
            r8[r0] = r4     // Catch:{ all -> 0x0077 }
            java.lang.String r9 = "wallpaper_light_type = ?"
            java.lang.String[] r10 = new java.lang.String[r1]     // Catch:{ all -> 0x0077 }
            r10[r0] = r5     // Catch:{ all -> 0x0077 }
            r11 = 0
            r13 = r11
            r12 = r11
            android.database.Cursor r1 = r6.A09(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0077 }
            if (r1 == 0) goto L_0x006e
        L_0x0057:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x006e
            int r0 = r1.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0069 }
            r3.add(r0)     // Catch:{ all -> 0x0069 }
            goto L_0x0057
        L_0x0069:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x006d }
        L_0x006d:
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x006e:
            if (r1 == 0) goto L_0x0073
            r1.close()     // Catch:{ all -> 0x0077 }
        L_0x0073:
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x007c }
            return r3
        L_0x0077:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x007b }
        L_0x007b:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x007c }
        L_0x007c:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/get-wallpaper-files"
            com.whatsapp.util.Log.e(r0, r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16220sf.A9v():java.util.Set");
    }

    public String AA3() {
        return "chat-settings";
    }

    public C40931uv AH3(C15830rv r2, boolean z2) {
        AnonymousClass1WS A032 = r2 == null ? A03() : A07(r2.getRawString());
        return z2 ? A032.A05 : A032.A06;
    }

    public synchronized boolean Aca(Context context) {
        synchronized (this) {
            C16960tx r13 = C16960tx.A05;
            List A082 = C40691uX.A08(r13, C16960tx.A00());
            A082.add(".crypt1");
            File file = new File(this.A0C.A02(), "chatsettingsbackup.db");
            ArrayList A072 = C40691uX.A07(file, A082);
            C40691uX.A0D(file, A072);
            if (A072.isEmpty()) {
                return false;
            }
            File file2 = (File) A072.get(0);
            A0F();
            C16980tz r2 = this.A0G;
            Context context2 = r2.A00;
            File databasePath = context2.getDatabasePath("chatsettings.db");
            boolean z2 = false;
            if (!file2.exists()) {
                File databasePath2 = context2.getDatabasePath("chatsettingsbackup.db");
                if (databasePath2.exists()) {
                    Log.i("chat-settings-store/restore/plain text backup");
                    z2 = AnonymousClass1XI.A0M(this.A0P, databasePath2, databasePath);
                    if (!databasePath2.delete()) {
                        Log.w("chat-settings-store/restore/unable to delete temp backup file");
                    }
                    if (z2) {
                    }
                }
            } else {
                try {
                    int A012 = C40691uX.A01(file2.getName(), "chatsettingsbackup.db");
                    if (A012 <= 0 || (A012 >= r13.version && (r13 = C16960tx.A02(A012)) == null)) {
                        r13 = C16960tx.A08;
                    }
                    AnonymousClass12V r14 = this.A0U;
                    C16040sK r6 = this.A04;
                    C18790xG r10 = this.A0J;
                    C40951ux.A01(r6, (C40961uy) null, this.A06, this.A0D, r10, this.A0P, this.A0T, r13, r14, file2).A01((C41011v3) null, r2, databasePath, 0, 0, false);
                    z2 = true;
                } catch (Exception e2) {
                    Log.e("chat-settings-store/restore failed", e2);
                    return z2;
                }
            }
            if (C40981v0.A00) {
                this.A01.A0B();
            }
        }
    }
}
