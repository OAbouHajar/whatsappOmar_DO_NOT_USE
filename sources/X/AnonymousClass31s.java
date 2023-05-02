package X;

import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.JsonReader;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.Me;
import com.whatsapp.util.Log;

/* renamed from: X.31s  reason: invalid class name */
public class AnonymousClass31s extends C19970zI {
    public final C16040sK A00;
    public final C15860rz A01;
    public final AnonymousClass013 A02;
    public final C18250wO A03;
    public final C18490wm A04;
    public final C16320sq A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass31s(X.C16040sK r9, X.C17130ua r10, X.C16980tz r11, X.C15860rz r12, X.AnonymousClass013 r13, X.C18250wO r14, X.C19950zG r15, X.C18490wm r16, X.C17670vS r17, X.C16320sq r18) {
        /*
            r8 = this;
            r0 = 14
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r15
            r5 = r17
            r6 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8.A05 = r6
            r8.A00 = r9
            r8.A02 = r13
            r8.A01 = r12
            r8.A03 = r14
            r0 = r16
            r8.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass31s.<init>(X.0sK, X.0ua, X.0tz, X.0rz, X.013, X.0wO, X.0zG, X.0wm, X.0vS, X.0sq):void");
    }

    public static C35361lo A00(JsonReader jsonReader) {
        jsonReader.beginObject();
        long j2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            switch (nextName.hashCode()) {
                case -1724546052:
                    if (!nextName.equals(FacebookFacade.RequestParameter.DESCRIPTION)) {
                        break;
                    } else {
                        str4 = jsonReader.nextString();
                        break;
                    }
                case -1391167122:
                    if (!nextName.equals("mimetype")) {
                        break;
                    } else {
                        str2 = jsonReader.nextString();
                        break;
                    }
                case -1362486862:
                    if (!nextName.equals("file-size")) {
                        break;
                    } else {
                        j2 = jsonReader.nextLong();
                        break;
                    }
                case -1221029593:
                    if (!nextName.equals("height")) {
                        break;
                    } else {
                        i3 = jsonReader.nextInt();
                        break;
                    }
                case -718200573:
                    if (!nextName.equals("subtext-color")) {
                        break;
                    } else {
                        i6 = Color.parseColor(jsonReader.nextString());
                        break;
                    }
                case -342731470:
                    if (!nextName.equals("fullsize-url")) {
                        break;
                    } else {
                        str3 = jsonReader.nextString();
                        break;
                    }
                case 3355:
                    if (!nextName.equals("id")) {
                        break;
                    } else {
                        str = jsonReader.nextString();
                        break;
                    }
                case 113126854:
                    if (!nextName.equals("width")) {
                        break;
                    } else {
                        i2 = jsonReader.nextInt();
                        break;
                    }
                case 748171971:
                    if (!nextName.equals("text-color")) {
                        break;
                    } else {
                        i5 = Color.parseColor(jsonReader.nextString());
                        break;
                    }
                case 2018420361:
                    if (!nextName.equals("placeholder-color")) {
                        break;
                    } else {
                        i4 = Color.parseColor(jsonReader.nextString());
                        break;
                    }
            }
        }
        jsonReader.endObject();
        if (str == null || j2 == 0 || ((long) i2) == 0 || ((long) i3) == 0 || str2 == null || str3 == null || i4 == 0 || i5 == 0 || i6 == 0) {
            StringBuilder A0r = AnonymousClass000.A0r("PAY: PaymentBackgroundMetadataNetworkClient/parseMetadata/missing field/id=");
            A0r.append(str);
            A0r.append(", fileSize=");
            A0r.append(j2);
            A0r.append(", width=");
            A0r.append(i2);
            A0r.append(", height=");
            A0r.append(i3);
            A0r.append(", mimetype=");
            A0r.append(str2);
            A0r.append(", fullsizeUrl=");
            A0r.append(str3);
            A0r.append(", placeholderColor=");
            A0r.append(i4);
            A0r.append(", textColor=");
            A0r.append(i5);
            Log.e(C13680ns.A0i(", subtextColor=", A0r, i6));
            return null;
        }
        return new C35361lo(str, str2, str3, str4, (String) null, i2, i3, i4, i5, i6, j2);
    }

    public void A0A(C440622p r10, String str) {
        String A0h;
        String str2;
        C16040sK r0 = this.A00;
        r0.A0B();
        Me me = r0.A00;
        AnonymousClass4IL r6 = new AnonymousClass4IL(str, me != null ? C18160wF.A01(me.cc, me.number) : this.A02.A05());
        if (TextUtils.isEmpty("")) {
            A0h = null;
        } else {
            StringBuilder A0r = AnonymousClass000.A0r("https://www.");
            A0r.append("");
            A0h = AnonymousClass000.A0h(".facebook.com/cdn/cacheable/whatsapp", A0r);
        }
        Uri.Builder buildUpon = Uri.parse(!TextUtils.isEmpty(A0h) ? AnonymousClass000.A0h("/payments/background", AnonymousClass000.A0q(A0h)) : "https://static.whatsapp.net/payments/background").buildUpon();
        String str3 = r6.A01;
        if (!TextUtils.isEmpty(str3)) {
            str2 = "id";
        } else {
            str3 = r6.A00;
            str2 = "country";
        }
        buildUpon.appendQueryParameter(str2, str3);
        super.A03(r10, (C108005Mh) null, r6, buildUpon.toString(), (String) null);
    }
}
