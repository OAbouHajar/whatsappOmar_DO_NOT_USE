package X;

import android.app.NotificationChannel;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.1v2  reason: invalid class name and case insensitive filesystem */
public class C41001v2 extends AnonymousClass1WS {
    public final C40991v1 A00;

    public C41001v2(C15900s5 r1, AnonymousClass01V r2, C16440t3 r3, C16260sj r4, C16220sf r5, C40991v1 r6) {
        super(r1, r2, r3, r4, r5);
        this.A00 = r6;
    }

    public long A00() {
        NotificationChannel A03;
        if (!this.A0J || (A03 = this.A00.A03(this.A0D)) == null || A03.getImportance() >= 3) {
            return A01();
        }
        StringBuilder sb = new StringBuilder("chat-settings-store/getMuteEndTime notification channel muted for:");
        sb.append(C16030sJ.A04(this.A0D));
        Log.i(sb.toString());
        return -1;
    }

    public boolean A0A() {
        NotificationChannel A03;
        if (Build.VERSION.SDK_INT < 26 || (A03 = this.A00.A03(this.A0D)) == null || A03.getImportance() != 0) {
            return super.A0A();
        }
        StringBuilder sb = new StringBuilder("chat-settings-store/getShowNotifications notification channel disabled for:");
        sb.append(C16030sJ.A04(this.A0D));
        Log.i(sb.toString());
        return false;
    }

    public String A0C() {
        AnonymousClass1v5 r1 = C40991v1.A0M;
        String A002 = r1.A00(this.A0D);
        if (TextUtils.isEmpty(A002)) {
            if (this.A0J) {
                StringBuilder sb = new StringBuilder("chat-settings-store/getNotificationChannelId missing channel for chat with custom notifications:");
                sb.append(C16030sJ.A04(this.A0D));
                Log.i(sb.toString());
                C40991v1 r4 = this.A00;
                String str = this.A0D;
                CharSequence A06 = r4.A06(str);
                int i2 = 4;
                if (A0B()) {
                    i2 = 3;
                }
                String str2 = this.A09;
                String str3 = this.A0C;
                String str4 = this.A0B;
                Uri parse = str4 == null ? Uri.EMPTY : Uri.parse(str4);
                if (!TextUtils.isEmpty(str4) && !AnonymousClass1XI.A0J(parse, r4.A09, r4.A0C, true)) {
                    parse = Settings.System.DEFAULT_NOTIFICATION_URI;
                }
                r4.A07(parse, A06, str, str2, str3, "channel_group_chats", i2);
                return r1.A00(this.A0D);
            }
            A002 = r1.A00(C16030sJ.A0L(C15830rv.A02(this.A0D)) ? "group_chat_defaults" : "individual_chat_defaults");
            if (!this.A0K.A05(C15910s6.A0f)) {
                C40991v1 r12 = this.A00;
                int i3 = 4;
                if (A0B()) {
                    i3 = 3;
                }
                return r12.A0A(A002, A05(), A08(), A07(), i3);
            }
        }
        return A002;
    }

    public String A0D() {
        return this.A00.A08(C40991v1.A0M.A00("silent_notifications"));
    }

    public String A0E() {
        String A002 = C40991v1.A0M.A00("voip_notification");
        C40991v1 r1 = this.A00;
        return A002 == null ? r1.A07((Uri) null, r1.A06("voip_notification"), "voip_notification", (String) null, (String) null, (String) null, 4) : r1.A09(A002);
    }
}
