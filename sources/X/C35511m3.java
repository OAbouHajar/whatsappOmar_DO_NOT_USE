package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1m3  reason: invalid class name and case insensitive filesystem */
public class C35511m3 extends AnonymousClass1W3 {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(32);
    public int A00;
    public long A01 = -1;
    public C39831t8 A02;
    public C39951tK A03;
    public C35501m2 A04;
    public UserJid A05;
    public String A06;
    public boolean A07;

    public C35511m3() {
    }

    public C35511m3(Parcel parcel) {
        this.A05 = UserJid.getNullable(parcel.readString());
        this.A07 = parcel.readInt() != 1 ? false : true;
        this.A00 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A02 = new C39831t8(parcel);
        this.A04 = (C35501m2) parcel.readParcelable(C35501m2.class.getClassLoader());
        this.A03 = new C39951tK(parcel);
    }

    public static int A00(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case 116014:
                    if (str.equals("upi")) {
                        return 3;
                    }
                    break;
                case 3387444:
                    if (str.equals("novi")) {
                        return 2;
                    }
                    break;
                case 97229420:
                    if (str.equals("fbpay")) {
                        return 1;
                    }
                    break;
            }
        }
        return 0;
    }

    public static int A01(String str) {
        switch (str.hashCode()) {
            case -1422950650:
                if (str.equals("active")) {
                    return 3;
                }
                break;
            case -309833220:
                if (str.equals("ineligible")) {
                    return 1;
                }
                break;
            case 100743639:
                if (str.equals("eligible")) {
                    return 2;
                }
                break;
        }
        return 0;
    }

    public static String A02(int i2) {
        if (i2 == 1) {
            return "fbpay";
        }
        if (i2 == 3) {
            return "upi";
        }
        StringBuilder sb = new StringBuilder("PAY: getPaymentServiceEnumName/invalid service enum: ");
        sb.append(i2);
        throw new AssertionError(sb.toString());
    }

    public String A03() {
        try {
            JSONObject jSONObject = new JSONObject();
            C39831t8 A062 = A06();
            HashMap hashMap = new HashMap();
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry : A062.A01.entrySet()) {
                hashMap.put(A02(((Number) entry.getKey()).intValue()), entry.getValue());
                try {
                    jSONObject2.putOpt(A02(((Number) entry.getKey()).intValue()), entry.getValue());
                } catch (JSONException e2) {
                    StringBuilder sb = new StringBuilder("PAY: ConsumerStatusData/getDataHashesDbString/exception: ");
                    sb.append(e2);
                    Log.e(sb.toString());
                }
            }
            jSONObject.putOpt("consumer_status", new JSONObject(hashMap));
            C35501m2 r0 = this.A04;
            if (r0 == null) {
                r0 = new C35501m2();
                this.A04 = r0;
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                HashMap hashMap2 = r0.A00;
                for (String str : hashMap2.keySet()) {
                    AbstractCollection abstractCollection = (AbstractCollection) hashMap2.get(str);
                    if (abstractCollection != null) {
                        JSONArray jSONArray = new JSONArray();
                        Iterator it = abstractCollection.iterator();
                        while (it.hasNext()) {
                            jSONArray.put(it.next());
                        }
                        jSONObject3.put(str, jSONArray);
                    }
                }
            } catch (JSONException unused) {
                Log.e("PAY: PaymentContactInfoCountryData/IncentiveTransactions/toJson/ failed to build json");
            }
            jSONObject.putOpt("incentive", jSONObject3);
            C39951tK r9 = this.A03;
            if (r9 == null) {
                r9 = new C39951tK();
                this.A03 = r9;
            }
            JSONObject jSONObject4 = new JSONObject();
            try {
                HashMap hashMap3 = new HashMap();
                JSONObject jSONObject5 = new JSONObject();
                for (Map.Entry entry2 : r9.A01.entrySet()) {
                    hashMap3.put(A02(((Number) entry2.getKey()).intValue()), entry2.getValue());
                    try {
                        jSONObject5.putOpt(A02(((Number) entry2.getKey()).intValue()), entry2.getValue());
                    } catch (JSONException e3) {
                        StringBuilder sb2 = new StringBuilder("PAY: EligibleOfferData/getOfferIdsForDbJson/exception: ");
                        sb2.append(e3);
                        Log.e(sb2.toString());
                    }
                }
                jSONObject4.putOpt("dhash", new JSONObject(hashMap3));
                HashMap hashMap4 = new HashMap();
                JSONObject jSONObject6 = new JSONObject();
                for (Map.Entry entry3 : r9.A00.entrySet()) {
                    hashMap4.put(A02(((Number) entry3.getKey()).intValue()), entry3.getValue());
                    try {
                        jSONObject6.putOpt(A02(((Number) entry3.getKey()).intValue()), entry3.getValue());
                    } catch (JSONException e4) {
                        StringBuilder sb3 = new StringBuilder("PAY: EligibleOfferData/getOfferIdsForDbJson/exception: ");
                        sb3.append(e4);
                        Log.e(sb3.toString());
                    }
                }
                jSONObject4.putOpt("offers", new JSONObject(hashMap4));
            } catch (JSONException e5) {
                StringBuilder sb4 = new StringBuilder("PAY: EligibleOfferData/getOfferIdsForDbJson/exception: ");
                sb4.append(e5);
                Log.e(sb4.toString());
            }
            jSONObject.putOpt("eligible_offers", jSONObject4);
            return jSONObject.toString();
        } catch (JSONException e6) {
            StringBuilder sb5 = new StringBuilder("PAY: PaymentContactInfoCountryData/toDBString/exception: ");
            sb5.append(e6);
            Log.e(sb5.toString());
            return null;
        }
    }

    public void A04(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                C39831t8 A062 = A06();
                JSONObject optJSONObject = jSONObject.optJSONObject("consumer_status");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        int A002 = A00(next);
                        if (A002 != 0) {
                            A062.A01.put(Integer.valueOf(A002), optJSONObject.optString(next));
                        }
                    }
                }
                C35501m2 r9 = this.A04;
                if (r9 == null) {
                    r9 = new C35501m2();
                    this.A04 = r9;
                }
                JSONObject optJSONObject2 = jSONObject.optJSONObject("incentive");
                if (optJSONObject2 != null) {
                    try {
                        Iterator<String> keys2 = optJSONObject2.keys();
                        while (keys2.hasNext()) {
                            String next2 = keys2.next();
                            JSONArray optJSONArray = optJSONObject2.optJSONArray(next2);
                            if (optJSONArray != null) {
                                HashSet hashSet = new HashSet();
                                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                    hashSet.add(Long.valueOf(optJSONArray.getLong(i2)));
                                }
                                r9.A00.put(next2, hashSet);
                            }
                        }
                    } catch (JSONException e2) {
                        Log.e("PAY: PaymentContactInfoCountryData/IncentiveTransactions/setIdTransactionMapfromJSON/failed to parse idJSON array", e2);
                    }
                }
                C39951tK r5 = this.A03;
                if (r5 == null) {
                    r5 = new C39951tK();
                    this.A03 = r5;
                }
                JSONObject optJSONObject3 = jSONObject.optJSONObject("eligible_offers");
                if (optJSONObject3 != null) {
                    try {
                        JSONObject jSONObject2 = optJSONObject3.getJSONObject("dhash");
                        Iterator<String> keys3 = jSONObject2.keys();
                        while (keys3.hasNext()) {
                            String next3 = keys3.next();
                            int A003 = A00(next3);
                            if (A003 != 0) {
                                r5.A01.put(Integer.valueOf(A003), jSONObject2.optString(next3));
                            }
                        }
                        JSONObject jSONObject3 = optJSONObject3.getJSONObject("offers");
                        Iterator<String> keys4 = jSONObject3.keys();
                        while (keys4.hasNext()) {
                            String next4 = keys4.next();
                            int A004 = A00(next4);
                            if (A004 != 0) {
                                r5.A00.put(Integer.valueOf(A004), jSONObject3.optString(next4));
                            }
                        }
                    } catch (JSONException e3) {
                        StringBuilder sb = new StringBuilder("PAY: PaymentContactInfoCountryData/fromDbString/exception: ");
                        sb.append(e3);
                        Log.e(sb.toString());
                    }
                }
            } catch (JSONException e4) {
                StringBuilder sb2 = new StringBuilder("PAY: PaymentContactInfoCountryData/fromDbString/exception: ");
                sb2.append(e4);
                Log.e(sb2.toString());
            }
        }
    }

    public int A05() {
        return this.A00;
    }

    public final C39831t8 A06() {
        C39831t8 r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C39831t8 r02 = new C39831t8();
        this.A02 = r02;
        return r02;
    }

    public String A07() {
        return "";
    }

    public void A08(int i2) {
        this.A00 = i2;
    }

    public void A09(String str) {
    }

    public void A0A(boolean z2) {
        this.A07 = z2;
    }

    public boolean A0B() {
        return this.A07;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(C16030sJ.A03(this.A05));
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A01);
        C39831t8 A062 = A06();
        parcel.writeLong(A062.A00);
        Map map = A062.A01;
        parcel.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            parcel.writeInt(((Number) entry.getKey()).intValue());
            parcel.writeString((String) entry.getValue());
        }
        parcel.writeParcelable(this.A04, i2);
        C39951tK r3 = this.A03;
        if (r3 == null) {
            r3 = new C39951tK();
            this.A03 = r3;
        }
        Map map2 = r3.A01;
        parcel.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            parcel.writeInt(((Number) entry2.getKey()).intValue());
            parcel.writeString((String) entry2.getValue());
        }
        Map map3 = r3.A00;
        parcel.writeInt(map3.size());
        for (Map.Entry entry3 : map3.entrySet()) {
            parcel.writeInt(((Number) entry3.getKey()).intValue());
            parcel.writeString((String) entry3.getValue());
        }
    }
}
