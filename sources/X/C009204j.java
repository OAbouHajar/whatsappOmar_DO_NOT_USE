package X;

import android.app.Notification;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.util.List;

/* renamed from: X.04j  reason: invalid class name and case insensitive filesystem */
public final class C009204j {
    public Uri A00;
    public Bundle A01 = new Bundle();
    public String A02;
    public final long A03;
    public final AnonymousClass04K A04;
    public final CharSequence A05;

    public C009204j(AnonymousClass04K r2, CharSequence charSequence, long j2) {
        this.A05 = charSequence;
        this.A03 = j2;
        this.A04 = r2;
    }

    public static Bundle[] A00(List list) {
        Bundle[] bundleArr = new Bundle[list.size()];
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            C009204j r6 = (C009204j) list.get(i2);
            Bundle bundle = new Bundle();
            CharSequence charSequence = r6.A05;
            if (charSequence != null) {
                bundle.putCharSequence("text", charSequence);
            }
            bundle.putLong("time", r6.A03);
            AnonymousClass04K r7 = r6.A04;
            bundle.putCharSequence("sender", r7.A01);
            if (Build.VERSION.SDK_INT >= 28) {
                bundle.putParcelable("sender_person", r7.A01());
            } else {
                bundle.putBundle("person", r7.A02());
            }
            String str = r6.A02;
            if (str != null) {
                bundle.putString("type", str);
            }
            Uri uri = r6.A00;
            if (uri != null) {
                bundle.putParcelable("uri", uri);
            }
            bundle.putBundle("extras", r6.A01);
            bundleArr[i2] = bundle;
        }
        return bundleArr;
    }

    public Notification.MessagingStyle.Message A01() {
        AnonymousClass04K r5 = this.A04;
        int i2 = Build.VERSION.SDK_INT;
        CharSequence charSequence = this.A05;
        long j2 = this.A03;
        Notification.MessagingStyle.Message message = i2 >= 28 ? new Notification.MessagingStyle.Message(charSequence, j2, r5.A01()) : new Notification.MessagingStyle.Message(charSequence, j2, r5.A01);
        String str = this.A02;
        if (str != null) {
            message.setData(str, this.A00);
        }
        return message;
    }
}
