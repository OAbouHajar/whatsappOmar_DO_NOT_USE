package X;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import org.json.JSONObject;

/* renamed from: X.1Vz  reason: invalid class name and case insensitive filesystem */
public interface C28411Vz extends Parcelable {
    CharSequence A9E(Context context, String str);

    String A9F(AnonymousClass013 r1, C28401Vy r2);

    String A9G(AnonymousClass013 r1, BigDecimal bigDecimal);

    String A9H(AnonymousClass013 r1, C28401Vy r2, int i2);

    String A9I(AnonymousClass013 r1, BigDecimal bigDecimal, int i2);

    BigDecimal A9K(AnonymousClass013 r1, String str);

    CharSequence ABE(Context context);

    CharSequence ABF(Context context, int i2);

    String ABH(AnonymousClass013 r1);

    C28401Vy ADP();

    C28401Vy ADn();

    int AGN(AnonymousClass013 r1);

    JSONObject Ags();

    void writeToParcel(Parcel parcel, int i2);
}
