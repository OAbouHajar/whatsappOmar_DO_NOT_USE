package X;

import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import java.util.Locale;

/* renamed from: X.1WS  reason: invalid class name */
public class AnonymousClass1WS {
    public int A00 = 0;
    public int A01 = 0;
    public long A02;
    public long A03;
    public long A04;
    public C40931uv A05;
    public C40931uv A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final C15900s5 A0K;
    public final AnonymousClass01V A0L;
    public final C16440t3 A0M;
    public final C16260sj A0N;
    public final C16220sf A0O;

    public AnonymousClass1WS(C15900s5 r2, AnonymousClass01V r3, C16440t3 r4, C16260sj r5, C16220sf r6) {
        this.A0M = r4;
        this.A0K = r2;
        this.A0L = r3;
        this.A0O = r6;
        this.A0N = r5;
    }

    public long A00() {
        return A01();
    }

    public long A01() {
        long j2 = this.A03;
        if (j2 == -1) {
            return j2;
        }
        if (j2 > this.A0M.A00()) {
            return this.A03;
        }
        return 0;
    }

    public AnonymousClass1WS A02() {
        String str = this.A0D;
        if ("group_chat_defaults".equals(str) || "individual_chat_defaults".equals(str)) {
            return this;
        }
        GroupJid nullable = GroupJid.getNullable(str);
        C16220sf r0 = this.A0O;
        return nullable != null ? r0.A02() : r0.A03();
    }

    public String A03() {
        String str;
        if ((this.A0J && (str = this.A07) != null) || (str = A02().A07) != null) {
            if (AnonymousClass1XI.A0J(Uri.parse(str), this.A0L, this.A0N, false)) {
                return str;
            }
        }
        return Settings.System.DEFAULT_NOTIFICATION_URI.toString();
    }

    public String A04() {
        return (!this.A0J || TextUtils.isEmpty(this.A08)) ? A02().A08 : this.A08;
    }

    public String A05() {
        return (!this.A0J || TextUtils.isEmpty(this.A09)) ? A02().A09 : this.A09;
    }

    public String A06() {
        return Build.VERSION.SDK_INT >= 29 ? Integer.toString(0) : (!this.A0J || TextUtils.isEmpty(this.A0A)) ? A02().A0A : this.A0A;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (X.AnonymousClass1XI.A0J(android.net.Uri.parse(r4), r5.A0L, r5.A0N, false) != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A07() {
        /*
            r5 = this;
            boolean r0 = r5.A0J
            if (r0 == 0) goto L_0x0008
            java.lang.String r4 = r5.A0B
            if (r4 != 0) goto L_0x0010
        L_0x0008:
            X.1WS r0 = r5.A02()
            java.lang.String r4 = r0.A0B
            if (r4 == 0) goto L_0x0026
        L_0x0010:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 >= r0) goto L_0x0025
            X.01V r3 = r5.A0L
            X.0sj r2 = r5.A0N
            android.net.Uri r1 = android.net.Uri.parse(r4)
            r0 = 0
            boolean r0 = X.AnonymousClass1XI.A0J(r1, r3, r2, r0)
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            return r4
        L_0x0026:
            android.net.Uri r0 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            java.lang.String r4 = r0.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WS.A07():java.lang.String");
    }

    public String A08() {
        return (!this.A0J || TextUtils.isEmpty(this.A0C)) ? A02().A0C : this.A0C;
    }

    public boolean A09() {
        return A00() != 0;
    }

    public boolean A0A() {
        return this.A0H || !A09();
    }

    public boolean A0B() {
        return !this.A0J ? A02().A0E : this.A0E;
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "jid: %s deleted:%d muteEndTime:%d showNotificationWhenMuted:%b useCustomNotification:%b messageTone:%s messageVibrate:%s messagePopup:%s messageLight:%s callTone:%s callVibrate:%s statusMuted:%b pinned:%b pinned_time:%d lowPriorityNotifications:%b mediaVisibility:%d muteReactions:%b autoMutedStatus: %d", new Object[]{C16030sJ.A04(this.A0D), Long.valueOf(this.A02), Long.valueOf(this.A03), Boolean.valueOf(this.A0H), Boolean.valueOf(this.A0J), this.A0B, this.A0C, this.A0A, this.A09, this.A07, this.A08, Boolean.valueOf(this.A0I), Boolean.valueOf(this.A0G), Long.valueOf(this.A04), Boolean.valueOf(this.A0E), Integer.valueOf(this.A01), Boolean.valueOf(this.A0F), Integer.valueOf(this.A00)});
    }
}
