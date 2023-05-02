package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: X.0z3  reason: invalid class name and case insensitive filesystem */
public class C19820z3 {
    public C41251vU A00;
    public C41251vU A01;
    public C14710pd A02;
    public final C16440t3 A03;

    public C19820z3(C16440t3 r3, C14710pd r4, C17020u3 r5) {
        this.A02 = r4;
        this.A03 = r3;
        this.A01 = new C41251vU(r5, "entry_point_conversions_for_sending");
        this.A00 = new C41251vU(r5, "entry_point_conversions_for_logging");
    }

    public void A00(C41261vV r10) {
        String str;
        C41261vV A002;
        C41251vU r0 = this.A01;
        UserJid userJid = r10.A04;
        C17020u3 r6 = r0.A00;
        String string = r6.A00("entry_point_conversions_for_sending").getString(userJid.getRawString(), (String) null);
        if (string == null || (A002 = C41251vU.A00(string)) == null) {
            try {
                r6.A00("entry_point_conversions_for_sending").edit().putString(userJid.getRawString(), r10.A00()).apply();
            } catch (JSONException e2) {
                e = e2;
                str = "CTWA: EntryPointConversionStore/storeConversion/json error";
                StringBuilder sb = new StringBuilder(str);
                sb.append(e);
                Log.e(sb.toString());
            }
        } else if (System.currentTimeMillis() - A002.A03 > TimeUnit.DAYS.toMillis((long) this.A02.A03(C16620tM.A02, 3017))) {
            try {
                r6.A00("entry_point_conversions_for_sending").edit().putString(userJid.getRawString(), r10.A00()).apply();
            } catch (JSONException e3) {
                e = e3;
                str = "CTWA: EntryPointConversionStore/updateConversion/json error";
                StringBuilder sb2 = new StringBuilder(str);
                sb2.append(e);
                Log.e(sb2.toString());
            }
        }
    }

    public final void A01(C41251vU r11) {
        ArrayList arrayList = new ArrayList();
        C17020u3 r3 = r11.A00;
        String str = r11.A01;
        Map<String, ?> all = r3.A00(str).getAll();
        for (Map.Entry next : all.entrySet()) {
            Object obj = all.get(next.getKey());
            if (obj != null) {
                C41261vV A002 = C41251vU.A00(obj.toString());
                if (A002 != null) {
                    arrayList.add(A002);
                }
            } else {
                StringBuilder sb = new StringBuilder("CTWA: EntryPointConversionStore/getAllConversions/ null pref value for key=");
                sb.append(next);
                Log.e(sb.toString());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C41261vV r6 = (C41261vV) it.next();
            if (System.currentTimeMillis() - r6.A03 > TimeUnit.DAYS.toMillis((long) this.A02.A03(C16620tM.A02, 3017))) {
                r3.A00(str).edit().remove(r6.A04.getRawString()).apply();
            }
        }
    }
}
