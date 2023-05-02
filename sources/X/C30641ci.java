package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1ci  reason: invalid class name and case insensitive filesystem */
public class C30641ci implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(96);
    public final long A00;
    public final Jid A01;
    public final Jid A02;
    public final UserJid A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;

    public C30641ci(C30641ci r3) {
        this.A01 = r3.A01;
        this.A05 = "call";
        this.A07 = r3.A07;
        this.A08 = r3.A08;
        this.A04 = null;
        this.A02 = r3.A02;
        this.A03 = r3.A03;
        this.A06 = null;
        this.A00 = r3.A00;
        List list = r3.A09;
        this.A09 = list != null ? new ArrayList(list) : null;
    }

    public C30641ci(Parcel parcel) {
        Class<Jid> cls = Jid.class;
        this.A01 = (Jid) parcel.readParcelable(cls.getClassLoader());
        this.A05 = parcel.readString();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A02 = (Jid) parcel.readParcelable(cls.getClassLoader());
        this.A03 = (UserJid) parcel.readParcelable(UserJid.class.getClassLoader());
        this.A06 = parcel.readString();
        this.A09 = parcel.createTypedArrayList(C35081lL.CREATOR);
        this.A04 = parcel.readString();
        this.A00 = parcel.readLong();
    }

    public C30641ci(Jid jid, Jid jid2, UserJid userJid, String str, String str2, String str3, String str4, String str5, List list, long j2) {
        this.A01 = jid;
        this.A05 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A04 = str4;
        this.A02 = jid2;
        this.A03 = userJid;
        this.A06 = str5;
        this.A00 = j2;
        this.A09 = list;
    }

    public UserJid A00() {
        return UserJid.of(C16030sJ.A00(this.A02));
    }

    public C28371Vv A01() {
        return null;
    }

    public C34481kL A02() {
        C34481kL r4 = new C34481kL();
        r4.A01 = this.A01;
        r4.A05 = this.A05;
        r4.A07 = this.A07;
        r4.A08 = this.A08;
        r4.A04 = this.A04;
        r4.A02 = this.A02;
        r4.A03 = this.A03;
        r4.A06 = this.A06;
        r4.A00 = this.A00;
        List<C35081lL> list = this.A09;
        if (list != null) {
            for (C35081lL r2 : list) {
                r4.A09.put(r2.A02, r2);
            }
        }
        return r4;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r0 != null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L_0x0004
            r0 = 1
            return r0
        L_0x0004:
            r2 = 0
            if (r4 == 0) goto L_0x001b
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r0 = r4.getClass()
            if (r1 != r0) goto L_0x001b
            X.1ci r4 = (X.C30641ci) r4
            java.lang.String r1 = r3.A05
            java.lang.String r0 = r4.A05
            if (r1 != 0) goto L_0x001c
            if (r0 == 0) goto L_0x0023
        L_0x001b:
            return r2
        L_0x001c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0023
            return r2
        L_0x0023:
            com.whatsapp.jid.Jid r1 = r3.A01
            com.whatsapp.jid.Jid r0 = r4.A01
            if (r1 != 0) goto L_0x002c
            if (r0 == 0) goto L_0x0033
            return r2
        L_0x002c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0033
            return r2
        L_0x0033:
            java.lang.String r1 = r3.A07
            java.lang.String r0 = r4.A07
            if (r1 != 0) goto L_0x003c
            if (r0 == 0) goto L_0x0043
            return r2
        L_0x003c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0043
            return r2
        L_0x0043:
            com.whatsapp.jid.Jid r1 = r3.A02
            com.whatsapp.jid.Jid r0 = r4.A02
            if (r1 != 0) goto L_0x004c
            if (r0 == 0) goto L_0x0053
            return r2
        L_0x004c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0053
            return r2
        L_0x0053:
            com.whatsapp.jid.UserJid r1 = r3.A03
            com.whatsapp.jid.UserJid r0 = r4.A03
            if (r1 != 0) goto L_0x005c
            if (r0 == 0) goto L_0x0063
            return r2
        L_0x005c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0063
            return r2
        L_0x0063:
            java.lang.String r1 = r3.A08
            java.lang.String r0 = r4.A08
            if (r1 != 0) goto L_0x006c
            if (r0 == 0) goto L_0x0073
            return r2
        L_0x006c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0073
            return r2
        L_0x0073:
            java.lang.String r1 = r3.A06
            java.lang.String r0 = r4.A06
            if (r1 != 0) goto L_0x007c
            if (r0 == 0) goto L_0x0083
            return r2
        L_0x007c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0083
            return r2
        L_0x0083:
            java.util.List r1 = r3.A09
            java.util.List r0 = r4.A09
            if (r1 != 0) goto L_0x008c
            if (r0 == 0) goto L_0x0093
            return r2
        L_0x008c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0093
            return r2
        L_0x0093:
            java.lang.String r1 = r3.A04
            java.lang.String r0 = r4.A04
            boolean r0 = X.C34901l3.A00(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30641ci.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.A05;
        int i2 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        Jid jid = this.A01;
        int hashCode2 = (hashCode + (jid == null ? 0 : jid.hashCode())) * 31;
        String str2 = this.A07;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Jid jid2 = this.A02;
        int hashCode4 = (hashCode3 + (jid2 == null ? 0 : jid2.hashCode())) * 31;
        UserJid userJid = this.A03;
        int hashCode5 = (hashCode4 + (userJid == null ? 0 : userJid.hashCode())) * 31;
        String str3 = this.A08;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.A09;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.A04;
        if (str5 != null) {
            i2 = str5.hashCode();
        }
        return hashCode8 + i2;
    }

    public String toString() {
        String obj;
        String obj2;
        String obj3;
        String obj4;
        String obj5;
        String obj6;
        String obj7;
        StringBuilder sb = new StringBuilder("[StanzaKey");
        Jid jid = this.A01;
        String str = "";
        if (jid == null) {
            obj = str;
        } else {
            StringBuilder sb2 = new StringBuilder(" from=");
            sb2.append(jid);
            obj = sb2.toString();
        }
        sb.append(obj);
        String str2 = this.A05;
        if (str2 == null) {
            obj2 = str;
        } else {
            StringBuilder sb3 = new StringBuilder(" cls=");
            sb3.append(str2);
            obj2 = sb3.toString();
        }
        sb.append(obj2);
        String str3 = this.A07;
        if (str3 == null) {
            obj3 = str;
        } else {
            StringBuilder sb4 = new StringBuilder(" id=");
            sb4.append(str3);
            obj3 = sb4.toString();
        }
        sb.append(obj3);
        String str4 = this.A08;
        if (str4 == null) {
            obj4 = str;
        } else {
            StringBuilder sb5 = new StringBuilder(" type=");
            sb5.append(str4);
            obj4 = sb5.toString();
        }
        sb.append(obj4);
        String str5 = this.A04;
        if (str5 == null) {
            obj5 = str;
        } else {
            StringBuilder sb6 = new StringBuilder(" category=");
            sb6.append(str5);
            obj5 = sb6.toString();
        }
        sb.append(obj5);
        Jid jid2 = this.A02;
        if (jid2 == null) {
            obj6 = str;
        } else {
            StringBuilder sb7 = new StringBuilder(" participant=");
            sb7.append(jid2.getRawString());
            obj6 = sb7.toString();
        }
        sb.append(obj6);
        UserJid userJid = this.A03;
        if (userJid == null) {
            obj7 = str;
        } else {
            StringBuilder sb8 = new StringBuilder(" recipient=");
            sb8.append(userJid);
            obj7 = sb8.toString();
        }
        sb.append(obj7);
        String str6 = this.A06;
        if (str6 != null) {
            StringBuilder sb9 = new StringBuilder(" editVersion=");
            sb9.append(str6);
            str = sb9.toString();
        }
        sb.append(str);
        sb.append(" loggableStanzaId=");
        sb.append(this.A00);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A01, i2);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A02, i2);
        parcel.writeParcelable(this.A03, i2);
        parcel.writeString(this.A06);
        parcel.writeTypedList(this.A09);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A00);
    }
}
