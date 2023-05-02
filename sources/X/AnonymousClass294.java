package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.Jid;

/* renamed from: X.294  reason: invalid class name */
public class AnonymousClass294 {
    public static Message A00(Jid jid, String str, long j2, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putString("msgId", str);
        bundle.putBoolean("isValid", z2);
        bundle.putParcelable("toJid", jid);
        bundle.putLong("loggableStanzaId", j2);
        return Message.obtain((Handler) null, 0, 42, 0, bundle);
    }

    public static Message A01(String str, String str2, String str3, int i2) {
        Message obtain = Message.obtain((Handler) null, 0, 27, 0);
        obtain.getData().putString("lg", str);
        obtain.getData().putString("lc", str2);
        obtain.getData().putString("userFeedback", str3);
        obtain.getData().putInt("deleteReason", i2);
        return obtain;
    }

    public static Message A02(String str, byte[] bArr, boolean z2) {
        Message obtain = Message.obtain((Handler) null, 0, 35, 0);
        obtain.getData().putByteArray("rc", bArr);
        obtain.getData().putString("rcJid", str);
        obtain.getData().putBoolean("saveRecoveryToken", z2);
        return obtain;
    }
}
