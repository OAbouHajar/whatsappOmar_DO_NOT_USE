package X;

import android.content.SharedPreferences;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.14q  reason: invalid class name and case insensitive filesystem */
public class C215814q {
    public SharedPreferences A00;
    public final C17020u3 A01;

    public C215814q(C17020u3 r1) {
        this.A01 = r1;
    }

    public static String A00(int i2, int i3, int i4, long j2, boolean z2) {
        if (!(i2 == 2 || i2 == 3 || i2 == 5)) {
            i2 = 1;
        }
        return String.format(Locale.US, "%d_%d_%d_%d_%b", new Object[]{Long.valueOf(j2), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Boolean.valueOf(z2)});
    }

    public AnonymousClass25Q A01(int i2, int i3, int i4, long j2, boolean z2) {
        AnonymousClass25Q A002;
        int i5 = i3;
        int i6 = i4;
        long j3 = j2;
        boolean z3 = z2;
        int i7 = i2;
        String A003 = A00(i7, i5, i6, j3, z3);
        SharedPreferences sharedPreferences = this.A00;
        if (sharedPreferences == null) {
            sharedPreferences = this.A01.A00("media_daily_usage_preferences_v1");
            this.A00 = sharedPreferences;
        }
        String string = sharedPreferences.getString(A003, (String) null);
        if (string != null && !string.isEmpty() && (A002 = AnonymousClass25Q.A00(string)) != null) {
            return A002;
        }
        if (!(i2 == 2 || i2 == 3 || i2 == 5)) {
            i7 = 1;
        }
        return new AnonymousClass25Q(i7, i5, i6, j3, z3);
    }

    public void A02(AnonymousClass25Q r7, int i2, int i3, int i4, long j2, boolean z2) {
        String A002 = A00(i2, i3, i4, j2, z2);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bytesSent", r7.A01);
            jSONObject.put("bytesReceived", r7.A00);
            jSONObject.put("countMessageSent", r7.A05);
            jSONObject.put("countMessageReceived", r7.A04);
            jSONObject.put("countUploaded", r7.A07);
            jSONObject.put("countDownloaded", r7.A02);
            jSONObject.put("countForward", r7.A03);
            jSONObject.put("countShared", r7.A06);
            jSONObject.put("countViewed", r7.A08);
            jSONObject.put("transferDate", r7.A0C);
            jSONObject.put("mediaType", r7.A0A);
            jSONObject.put("transferRadio", r7.A0B);
            jSONObject.put("mediaTransferOrigin", r7.A09);
            jSONObject.put("isAutoDownload", r7.A0D);
            String obj = jSONObject.toString();
            SharedPreferences sharedPreferences = this.A00;
            if (sharedPreferences == null) {
                sharedPreferences = this.A01.A00("media_daily_usage_preferences_v1");
                this.A00 = sharedPreferences;
            }
            sharedPreferences.edit().putString(A002, obj).apply();
        } catch (JSONException e2) {
            e2.getMessage();
        }
    }
}
