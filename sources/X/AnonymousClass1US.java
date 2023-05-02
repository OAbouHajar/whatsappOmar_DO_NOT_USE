package X;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1US  reason: invalid class name */
public class AnonymousClass1US implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(23);
    public double A00;
    public int A01 = 0;
    public Double A02;
    public String A03;
    public List A04;
    public final int A05;
    public final int A06;
    public final Double A07;
    public final Double A08;
    public final Double A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final List A0J;
    public final boolean A0K;
    public final boolean A0L;

    public AnonymousClass1US(Parcel parcel) {
        boolean z2 = false;
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A0B = readString;
        this.A0A = parcel.readString();
        String readString2 = parcel.readString();
        AnonymousClass00B.A06(readString2);
        this.A0F = readString2;
        Double valueOf = Double.valueOf(parcel.readDouble());
        AnonymousClass00B.A06(valueOf);
        this.A08 = valueOf;
        Double valueOf2 = Double.valueOf(parcel.readDouble());
        AnonymousClass00B.A06(valueOf2);
        this.A09 = valueOf2;
        ArrayList arrayList = new ArrayList();
        this.A0H = arrayList;
        parcel.readStringList(arrayList);
        String readString3 = parcel.readString();
        AnonymousClass00B.A06(readString3);
        this.A0E = readString3;
        int readInt = parcel.readInt();
        AnonymousClass00B.A06(Integer.valueOf(readInt));
        this.A05 = readInt;
        this.A0C = parcel.readString();
        this.A07 = Double.valueOf(parcel.readDouble());
        this.A0D = parcel.readString();
        ArrayList arrayList2 = new ArrayList();
        this.A0J = arrayList2;
        parcel.readList(arrayList2, C35571m9.class.getClassLoader());
        this.A0L = parcel.readInt() == 1;
        ArrayList arrayList3 = new ArrayList();
        this.A0G = arrayList3;
        parcel.readList(arrayList3, C35601mC.class.getClassLoader());
        this.A0K = parcel.readInt() == 1 ? true : z2;
        ArrayList arrayList4 = new ArrayList();
        this.A04 = arrayList4;
        parcel.readStringList(arrayList4);
        this.A06 = parcel.readInt();
        this.A01 = parcel.readInt();
        ArrayList arrayList5 = new ArrayList();
        this.A0I = arrayList5;
        parcel.readList(arrayList5, C93414j9.class.getClassLoader());
    }

    public AnonymousClass1US(Double d2, Double d3, Double d4, Double d5, Double d6, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, List list4, int i2, int i3, boolean z2, boolean z3) {
        this.A0B = str;
        this.A0A = str2;
        this.A0F = str3;
        this.A08 = d2;
        this.A09 = d3;
        this.A0L = z2;
        this.A0H = list;
        this.A0K = z3;
        this.A0E = str4;
        this.A0I = list2;
        this.A05 = i2;
        this.A0C = str5;
        this.A07 = d5;
        this.A0J = list3;
        this.A0D = str6;
        this.A06 = i3;
        this.A0G = list4;
        this.A00 = d4 == null ? 0.0d : d4.doubleValue();
        this.A02 = d6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007d, code lost:
        if (r0 != 2) goto L_0x007f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass1US A00(org.json.JSONObject r34) {
        /*
            java.lang.String r0 = "jid"
            r4 = r34
            java.lang.String r21 = r4.getString(r0)
            java.lang.String r0 = "verified_name"
            java.lang.String r24 = r4.getString(r0)
            java.lang.String r0 = "profile_pic_url"
            java.lang.String r25 = r4.optString(r0)
            java.lang.String r0 = "address"
            java.lang.String r22 = r4.optString(r0)
            java.lang.String r0 = "vertical"
            java.lang.String r23 = r4.optString(r0)
            java.lang.String r12 = "latitude"
            double r0 = r4.optDouble(r12)
            java.lang.Double r16 = java.lang.Double.valueOf(r0)
            java.lang.String r11 = "longitude"
            double r0 = r4.optDouble(r11)
            java.lang.Double r17 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "responsive"
            boolean r33 = r4.optBoolean(r0)
            java.lang.String r1 = "categories"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x0066
            org.json.JSONArray r2 = r4.getJSONArray(r1)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r1 = 0
        L_0x004e:
            int r0 = r2.length()
            if (r1 >= r0) goto L_0x006a
            java.lang.Object r0 = r2.get(r1)
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.getString(r1)
            r14.add(r0)
        L_0x0063:
            int r1 = r1 + 1
            goto L_0x004e
        L_0x0066:
            java.util.List r14 = java.util.Collections.emptyList()
        L_0x006a:
            java.lang.String r1 = "business_operating"
            boolean r0 = r4.has(r1)
            if (r0 == 0) goto L_0x007f
            int r0 = r4.optInt(r1)
            r1 = 0
            if (r0 == 0) goto L_0x0080
            r1 = 1
            if (r0 == r1) goto L_0x0080
            r1 = 2
            if (r0 == r1) goto L_0x0080
        L_0x007f:
            r1 = 3
        L_0x0080:
            java.lang.String r0 = "verified_level"
            int r2 = r4.optInt(r0)
            r0 = 1
            if (r2 == r0) goto L_0x008e
            r0 = 2
            if (r2 == r0) goto L_0x008e
            r0 = 0
        L_0x008e:
            java.lang.String r2 = "biz_pre_rank_score"
            double r2 = r4.optDouble(r2)
            java.lang.Double r19 = java.lang.Double.valueOf(r2)
            java.lang.String r2 = "ranking_result_id"
            java.lang.String r26 = r4.optString(r2)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.String r2 = "linked_accounts"
            boolean r3 = r4.has(r2)
            if (r3 == 0) goto L_0x00fe
            org.json.JSONArray r6 = r4.getJSONArray(r2)
            X.AnonymousClass00B.A06(r6)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            if (r6 == 0) goto L_0x00fe
            r5 = 0
        L_0x00ba:
            int r2 = r6.length()
            if (r5 >= r2) goto L_0x00fe
            org.json.JSONObject r3 = r6.getJSONObject(r5)     // Catch:{ JSONException -> 0x00f5 }
            java.lang.String r2 = "id"
            java.lang.String r9 = r3.getString(r2)     // Catch:{ JSONException -> 0x00f5 }
            X.AnonymousClass00B.A05(r9)     // Catch:{ JSONException -> 0x00f5 }
            java.lang.String r2 = "type"
            boolean r7 = r3.has(r2)     // Catch:{ JSONException -> 0x00f5 }
            if (r7 == 0) goto L_0x00fb
            int r2 = r3.getInt(r2)     // Catch:{ JSONException -> 0x00f5 }
            java.lang.String r7 = "fanCount"
            int r8 = r3.optInt(r7)     // Catch:{ JSONException -> 0x00f5 }
            r7 = 0
            if (r2 == 0) goto L_0x00e7
            r3 = 1
            if (r2 != r3) goto L_0x00fb
            goto L_0x00ea
        L_0x00e7:
            java.lang.String r3 = "facebook"
            goto L_0x00ec
        L_0x00ea:
            java.lang.String r3 = "instagram"
        L_0x00ec:
            X.1m9 r2 = new X.1m9     // Catch:{ JSONException -> 0x00f5 }
            r2.<init>(r9, r3, r8, r7)     // Catch:{ JSONException -> 0x00f5 }
            r13.add(r2)     // Catch:{ JSONException -> 0x00f5 }
            goto L_0x00fb
        L_0x00f5:
            r3 = move-exception
            java.lang.String r2 = "MinifiedBusinessProfile/readLinkedAccountsArray: could not parse one of the LinkedAccount json object"
            com.whatsapp.util.Log.e(r2, r3)
        L_0x00fb:
            int r5 = r5 + 1
            goto L_0x00ba
        L_0x00fe:
            r2 = 0
            java.lang.String r3 = "service_areas"
            boolean r5 = r4.has(r3)
            if (r5 == 0) goto L_0x014a
            org.json.JSONArray r10 = r4.getJSONArray(r3)
            X.AnonymousClass00B.A06(r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = 0
        L_0x0115:
            int r3 = r10.length()
            if (r5 >= r3) goto L_0x014a
            org.json.JSONObject r3 = r10.getJSONObject(r5)
            double r6 = r3.getDouble(r12)
            java.lang.Double r9 = java.lang.Double.valueOf(r6)
            double r6 = r3.getDouble(r11)
            java.lang.Double r8 = java.lang.Double.valueOf(r6)
            java.lang.String r6 = "radius"
            int r6 = r3.getInt(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r6 = "description"
            java.lang.String r6 = r3.getString(r6)
            X.1mC r3 = new X.1mC
            r3.<init>(r9, r8, r7, r6)
            r2.add(r3)
            int r5 = r5 + 1
            goto L_0x0115
        L_0x014a:
            java.lang.String r3 = "has_catalog"
            boolean r34 = r4.optBoolean(r3)
            r18 = 0
            java.util.ArrayList r28 = new java.util.ArrayList
            r28.<init>()
            X.1US r15 = new X.1US
            r20 = r18
            r27 = r14
            r29 = r13
            r30 = r2
            r31 = r1
            r32 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1US.A00(org.json.JSONObject):X.1US");
    }

    public AnonymousClass1US A01(List list) {
        boolean z2 = this.A0L;
        boolean z3 = this.A0K;
        String str = this.A0B;
        String str2 = this.A0A;
        String str3 = this.A0F;
        Double d2 = this.A08;
        Double d3 = this.A09;
        Double valueOf = Double.valueOf(this.A00);
        String str4 = this.A0E;
        List list2 = this.A0H;
        String str5 = this.A0C;
        int i2 = this.A05;
        Double d4 = this.A07;
        String str6 = this.A0D;
        Double d5 = this.A02;
        int i3 = this.A06;
        List list3 = this.A0I;
        boolean z4 = z2;
        boolean z5 = z3;
        String str7 = str4;
        String str8 = str5;
        String str9 = str6;
        List list4 = list2;
        List list5 = list3;
        Double d6 = d5;
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        Double d7 = d2;
        Double d8 = d3;
        Double d9 = d4;
        AnonymousClass1US r13 = new AnonymousClass1US(d7, d8, valueOf, d9, d6, str10, str11, str12, str7, str8, str9, list4, list5, this.A0J, this.A0G, i2, i3, z4, z5);
        r13.A04 = list;
        r13.A01 = 1;
        return r13;
    }

    public String A02() {
        List list = this.A0I;
        return list.isEmpty() ? "" : ((C93414j9) list.get(0)).A00;
    }

    public void A03(Location location) {
        double d2;
        Double d3;
        Location location2 = new Location("");
        if (A04()) {
            location2.setLatitude(this.A08.doubleValue());
            d3 = this.A09;
        } else if (A05()) {
            List list = this.A0G;
            location2.setLatitude(((C35601mC) list.get(0)).A00.doubleValue());
            d3 = ((C35601mC) list.get(0)).A01;
        } else {
            d2 = 0.0d;
            this.A00 = d2;
        }
        location2.setLongitude(d3.doubleValue());
        d2 = (double) location.distanceTo(location2);
        this.A00 = d2;
    }

    public boolean A04() {
        Double d2 = this.A08;
        Double valueOf = Double.valueOf(Double.NaN);
        if (!d2.equals(valueOf)) {
            Double d3 = this.A09;
            return (d3.equals(valueOf) || d2.doubleValue() == 0.0d || d3.doubleValue() == 0.0d) ? false : true;
        }
    }

    public boolean A05() {
        List list = this.A0G;
        return list != null && !list.isEmpty() && TextUtils.isEmpty(this.A0A);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass1US r5 = (AnonymousClass1US) obj;
            if (this.A05 != r5.A05 || !this.A0B.equals(r5.A0B) || !C34901l3.A00(this.A0A, r5.A0A) || !this.A08.equals(r5.A08) || !this.A09.equals(r5.A09) || !this.A0E.equals(r5.A0E) || !this.A0H.equals(r5.A0H) || !C34901l3.A00(this.A0C, r5.A0C) || this.A0K != r5.A0K || !C34901l3.A00(this.A04, r5.A04) || this.A01 != r5.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0B, this.A08, this.A09, this.A0E, this.A0H, Integer.valueOf(this.A05), Boolean.valueOf(this.A0K), this.A04, Integer.valueOf(this.A01)});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0F);
        parcel.writeDouble(this.A08.doubleValue());
        parcel.writeDouble(this.A09.doubleValue());
        parcel.writeStringList(this.A0H);
        parcel.writeString(this.A0E);
        parcel.writeInt(this.A05);
        parcel.writeString(this.A0C);
        parcel.writeDouble(this.A07.doubleValue());
        parcel.writeString(this.A0D);
        parcel.writeList(this.A0J);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeList(this.A0G);
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeStringList(this.A04);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeList(this.A0I);
    }
}
