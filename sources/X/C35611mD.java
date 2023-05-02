package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1mD  reason: invalid class name and case insensitive filesystem */
public class C35611mD implements Parcelable {
    public static final String[] A0O = {"category_id", "category_name"};
    public static final String[] A0P = {"time_zone", "hours_note", "day_of_week", "mode", "open_time", "close_time", "wa_biz_profiles_hours._id"};
    public static final String[] A0Q = {"area_description", "radius", "center_latitude", "center_longitude"};
    public static final String[] A0R = {"account_id", "account_type", "account_display_name", "account_fan_count", "account_has_media_post"};
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(17);
    public final C35621mE A00;
    public final C35581mA A01;
    public final C35561m8 A02;
    public final C35551m7 A03;
    public final UserJid A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final List A0G;
    public final List A0H;
    public final List A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;

    public C35611mD(C35621mE r2, C35581mA r3, C35561m8 r4, C35551m7 r5, UserJid userJid, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, List list2, List list3, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A04 = userJid;
        this.A0E = str;
        this.A0G = Collections.unmodifiableList(list);
        this.A0I = Collections.unmodifiableList(list2);
        this.A0B = str2;
        this.A0A = str3;
        this.A03 = r5;
        this.A00 = r2;
        this.A0L = z2;
        this.A05 = str4;
        this.A0D = str5;
        this.A06 = str6;
        this.A0J = z3;
        this.A0F = str7;
        this.A0K = z4;
        this.A0N = z5;
        this.A02 = r4;
        this.A09 = str8;
        this.A08 = str9;
        this.A0M = z6;
        this.A01 = r3;
        this.A0H = Collections.unmodifiableList(list3);
        this.A07 = str10;
        this.A0C = str11;
    }

    public C35611mD(Parcel parcel) {
        this.A04 = (UserJid) parcel.readParcelable(UserJid.class.getClassLoader());
        this.A0E = parcel.readString();
        this.A0G = Collections.unmodifiableList(parcel.createTypedArrayList(C31241dn.CREATOR));
        this.A0I = Collections.unmodifiableList(parcel.createStringArrayList());
        this.A0B = parcel.readString();
        this.A0A = parcel.readString();
        C35551m7 r0 = (C35551m7) parcel.readParcelable(C35551m7.class.getClassLoader());
        this.A03 = r0 == null ? C35551m7.A04 : r0;
        this.A00 = (C35621mE) parcel.readParcelable(C35621mE.class.getClassLoader());
        boolean z2 = true;
        this.A0L = parcel.readByte() != 0;
        this.A0F = parcel.readString();
        this.A05 = parcel.readString();
        this.A0D = parcel.readString();
        this.A06 = parcel.readString();
        this.A0J = parcel.readByte() != 0;
        this.A0K = parcel.readByte() != 0;
        this.A0N = parcel.readByte() != 0;
        this.A02 = (C35561m8) parcel.readParcelable(C35561m8.class.getClassLoader());
        this.A09 = parcel.readString();
        this.A08 = parcel.readString();
        this.A0M = parcel.readByte() == 0 ? false : z2;
        this.A01 = (C35581mA) parcel.readParcelable(C35581mA.class.getClassLoader());
        this.A0H = Collections.unmodifiableList(parcel.createTypedArrayList(C35601mC.CREATOR));
        this.A07 = parcel.readString();
        this.A0C = parcel.readString();
    }

    public boolean A00() {
        Iterator it = this.A0I.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!TextUtils.isEmpty((String) it.next())) {
                    break;
                }
            } else {
                return TextUtils.isEmpty(this.A0A) && TextUtils.isEmpty(this.A0B) && this.A03.equals(C35551m7.A04) && this.A00 == null;
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C35611mD)) {
            return false;
        }
        C35611mD r9 = (C35611mD) obj;
        if (!C34901l3.A00(this.A04, r9.A04) || !AnonymousClass1ZW.A0F(this.A0E, r9.A0E) || !this.A0G.equals(r9.A0G)) {
            return false;
        }
        List list = this.A0I;
        List list2 = r9.A0I;
        ArrayList arrayList = new ArrayList(list);
        ArrayList arrayList2 = new ArrayList(list2);
        arrayList.removeAll(Arrays.asList(new String[]{"", null}));
        arrayList2.removeAll(Arrays.asList(new String[]{"", null}));
        return arrayList.equals(arrayList2) && AnonymousClass1ZW.A0F(this.A0B, r9.A0B) && AnonymousClass1ZW.A0F(this.A0A, r9.A0A) && C34901l3.A00(this.A03, r9.A03) && C34901l3.A00(this.A00, r9.A00) && this.A0L == r9.A0L && AnonymousClass1ZW.A0F(this.A05, r9.A05) && AnonymousClass1ZW.A0F(this.A0D, r9.A0D) && this.A0J == r9.A0J && AnonymousClass1ZW.A0F(this.A0F, r9.A0F) && AnonymousClass1ZW.A0F(this.A06, r9.A06) && this.A0K == r9.A0K && this.A0N == r9.A0N && C34901l3.A00(this.A02, r9.A02) && AnonymousClass1ZW.A0F(this.A08, r9.A08) && AnonymousClass1ZW.A0F(this.A09, r9.A09) && this.A0M == r9.A0M && C34901l3.A00(this.A01, r9.A01) && C34901l3.A00(this.A0H, r9.A0H) && AnonymousClass1ZW.A0F(this.A07, r9.A07) && AnonymousClass1ZW.A0F(this.A0C, r9.A0C);
    }

    public int hashCode() {
        UserJid userJid = this.A04;
        int i2 = 0;
        int hashCode = (userJid != null ? userJid.hashCode() : 0) * 31;
        String str = this.A0E;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.A0F;
        int hashCode3 = (((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.A0G.hashCode()) * 31) + this.A0I.hashCode()) * 31;
        String str3 = this.A0B;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.A0A;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        C35551m7 r0 = this.A03;
        int hashCode6 = (hashCode5 + (r0 != null ? r0.hashCode() : 0)) * 31;
        C35621mE r02 = this.A00;
        int hashCode7 = (((hashCode6 + (r02 != null ? r02.hashCode() : 0)) * 31) + (this.A0L ? 1 : 0)) * 31;
        String str5 = this.A05;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.A0D;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.A06;
        int hashCode10 = (((((((hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 31) + (this.A0J ? 1 : 0)) * 31) + (this.A0K ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31;
        C35561m8 r03 = this.A02;
        int hashCode11 = (hashCode10 + (r03 != null ? r03.hashCode() : 0)) * 31;
        String str8 = this.A09;
        int hashCode12 = (hashCode11 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.A08;
        int hashCode13 = (((hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31) + (this.A0M ? 1 : 0)) * 31;
        C35581mA r04 = this.A01;
        int hashCode14 = (((hashCode13 + (r04 != null ? r04.hashCode() : 0)) * 31) + this.A0H.hashCode()) * 31;
        String str10 = this.A07;
        int hashCode15 = (hashCode14 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.A0C;
        if (str11 != null) {
            i2 = str11.hashCode();
        }
        return hashCode15 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BusinessProfile{jid='");
        sb.append(this.A04);
        sb.append('\'');
        sb.append(", tag='");
        sb.append(this.A0E);
        sb.append('\'');
        sb.append(", websites=");
        sb.append(this.A0I);
        sb.append(", email='");
        sb.append(this.A0B);
        sb.append('\'');
        sb.append(", description='");
        sb.append(this.A0A);
        sb.append('\'');
        sb.append(", address='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append(", vertical='");
        sb.append(this.A0F);
        sb.append('\'');
        sb.append(", categories='");
        sb.append(this.A0G.toString());
        sb.append('\'');
        sb.append(", hours='");
        sb.append(this.A00);
        sb.append('\'');
        sb.append(", has_catalog='");
        sb.append(this.A0L);
        sb.append('\'');
        sb.append(", commerceExperience='");
        sb.append(this.A05);
        sb.append('\'');
        sb.append(", shopUrl='");
        sb.append(this.A0D);
        sb.append('\'');
        sb.append(", commerceManagerUrl='");
        sb.append(this.A06);
        sb.append('\'');
        sb.append(", cart_enabled='");
        sb.append(this.A0J);
        sb.append('\'');
        sb.append(", directConnectionEnabled='");
        sb.append(this.A0K);
        sb.append('\'');
        sb.append(", shopBanned='");
        sb.append(this.A0N);
        sb.append('\'');
        sb.append(", isGalaxyBusiness='");
        sb.append(this.A0M);
        sb.append(", coverPhoto='");
        C35581mA r1 = this.A01;
        String str = "null";
        if (r1 != null) {
            str = r1.toString();
        }
        sb.append(str);
        sb.append('\'');
        sb.append(", serviceAreas='");
        sb.append(this.A0H.toString());
        sb.append('\'');
        sb.append(", customUrl='");
        sb.append(this.A07);
        sb.append('\'');
        sb.append(", memberSince='");
        sb.append(this.A0C);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A04, i2);
        parcel.writeString(this.A0E);
        parcel.writeTypedList(this.A0G);
        parcel.writeStringList(this.A0I);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A03, i2);
        parcel.writeParcelable(this.A00, i2);
        parcel.writeByte(this.A0L ? (byte) 1 : 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A06);
        parcel.writeByte(this.A0J ? (byte) 1 : 0);
        parcel.writeByte(this.A0K ? (byte) 1 : 0);
        parcel.writeByte(this.A0N ? (byte) 1 : 0);
        parcel.writeParcelable(this.A02, i2);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeByte(this.A0M ? (byte) 1 : 0);
        parcel.writeParcelable(this.A01, i2);
        parcel.writeTypedList(this.A0H);
        parcel.writeString(this.A07);
        parcel.writeString(this.A0C);
    }
}
