package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import com.google.android.gms.internal.gtm.zzav;
import com.google.android.gms.internal.gtm.zzaw;
import com.google.android.gms.internal.gtm.zzax;
import com.google.android.gms.internal.gtm.zzay;
import com.google.android.gms.internal.gtm.zzaz;
import com.google.android.gms.internal.gtm.zzba;
import com.google.android.gms.internal.gtm.zzbb;
import com.google.android.gms.internal.gtm.zzbc;
import com.google.android.gms.internal.gtm.zzbd;
import com.google.android.gms.internal.gtm.zzbe;
import com.google.android.gms.internal.gtm.zzbf;
import com.google.android.gms.internal.gtm.zzbg;
import com.google.android.gms.internal.gtm.zzbh;
import com.google.android.gms.internal.gtm.zzbq;
import com.google.android.gms.internal.gtm.zzbr;
import com.google.android.gms.internal.gtm.zzbt;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.android.gms.internal.gtm.zzbx;
import com.google.android.gms.internal.gtm.zzce;
import com.google.android.gms.internal.gtm.zzck;
import com.google.android.gms.internal.gtm.zzex;
import com.google.android.gms.internal.gtm.zzfa;
import com.google.android.gms.internal.gtm.zzfb;
import com.google.android.gms.internal.gtm.zzfs;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2sV  reason: invalid class name and case insensitive filesystem */
public final class C58072sV extends zzbr implements AnonymousClass5RD {
    public static DecimalFormat A03;
    public final Uri A00;
    public final zzbv A01;
    public final String A02;

    public C58072sV(zzbv zzbv, String str) {
        super(zzbv);
        C13710nw.A05(str);
        this.A01 = zzbv;
        this.A02 = str;
        C13710nw.A05(str);
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("uri");
        builder.authority("google-analytics.com");
        builder.path(str);
        this.A00 = builder.build();
    }

    public static String A00(int i2, String str) {
        if (i2 > 0) {
            return C13680ns.A0i(str, C13690nt.A0g(str.length() + 11), i2);
        }
        zzfa.zzb("index out of range for prefix", str);
        return "";
    }

    public static Map A01(AnonymousClass3BD r10) {
        String str;
        HashMap A0x = AnonymousClass000.A0x();
        Map map = r10.A0A;
        zzaz zzaz = (zzaz) ((C32381gG) map.get(zzaz.class));
        if (zzaz != null) {
            Iterator A0y = AnonymousClass000.A0y(Collections.unmodifiableMap(zzaz.zza));
            while (A0y.hasNext()) {
                Map.Entry A0z = AnonymousClass000.A0z(A0y);
                Object value = A0z.getValue();
                if (value != null) {
                    if (value instanceof String) {
                        str = (String) value;
                        if (TextUtils.isEmpty(str)) {
                        }
                    } else if (value instanceof Double) {
                        double doubleValue = ((Number) value).doubleValue();
                        if (doubleValue != 0.0d) {
                            DecimalFormat decimalFormat = A03;
                            if (decimalFormat == null) {
                                decimalFormat = new DecimalFormat("0.######");
                                A03 = decimalFormat;
                            }
                            str = decimalFormat.format(doubleValue);
                        }
                    } else if (!(value instanceof Boolean)) {
                        str = String.valueOf(value);
                    } else if (value != Boolean.FALSE) {
                        str = "1";
                        A0x.put(A0z.getKey(), str);
                    }
                    if (str == null) {
                    }
                    A0x.put(A0z.getKey(), str);
                }
            }
        }
        zzbe zzbe = (zzbe) ((C32381gG) map.get(zzbe.class));
        if (zzbe != null) {
            A02(A0x, "t", zzbe.zza);
            A02(A0x, "cid", zzbe.zzb);
            A02(A0x, "uid", zzbe.zzc);
            A02(A0x, "sc", (String) null);
            if (zzbe.zzf) {
                A0x.put("ni", "1");
            }
            A02(A0x, "adid", zzbe.zzd);
            if (zzbe.zze) {
                A0x.put("ate", "1");
            }
        }
        zzbf zzbf = (zzbf) ((C32381gG) map.get(zzbf.class));
        if (zzbf != null) {
            A02(A0x, "cd", (String) null);
            double d2 = (double) zzbf.zza;
            if (d2 != 0.0d) {
                DecimalFormat decimalFormat2 = A03;
                if (decimalFormat2 == null) {
                    decimalFormat2 = new DecimalFormat("0.######");
                    A03 = decimalFormat2;
                }
                A0x.put("a", decimalFormat2.format(d2));
            }
            A02(A0x, "dr", (String) null);
        }
        if (map.get(zzbc.class) != null) {
            A02(A0x, "ec", (String) null);
            A02(A0x, "ea", (String) null);
            A02(A0x, "el", (String) null);
        }
        zzaw zzaw = (zzaw) ((C32381gG) map.get(zzaw.class));
        if (zzaw != null) {
            A02(A0x, "cn", zzaw.zza);
            A02(A0x, "cs", zzaw.zzb);
            A02(A0x, "cm", zzaw.zzc);
            A02(A0x, "ck", zzaw.zzd);
            A02(A0x, "cc", zzaw.zze);
            A02(A0x, "ci", zzaw.zzf);
            A02(A0x, "anid", zzaw.zzg);
            A02(A0x, "gclid", zzaw.zzh);
            A02(A0x, "dclid", zzaw.zzi);
            A02(A0x, "aclid", zzaw.zzj);
        }
        if (map.get(zzbd.class) != null) {
            A02(A0x, "exd", (String) null);
        }
        if (map.get(zzbg.class) != null) {
            A02(A0x, "sn", (String) null);
            A02(A0x, "sa", (String) null);
            A02(A0x, "st", (String) null);
        }
        if (map.get(zzbh.class) != null) {
            A02(A0x, "utv", (String) null);
            A02(A0x, "utc", (String) null);
            A02(A0x, "utl", (String) null);
        }
        zzax zzax = (zzax) ((C32381gG) map.get(zzax.class));
        if (zzax != null) {
            Iterator A0y2 = AnonymousClass000.A0y(Collections.unmodifiableMap(zzax.zza));
            while (A0y2.hasNext()) {
                Map.Entry A0z2 = AnonymousClass000.A0z(A0y2);
                String A002 = A00(AnonymousClass000.A0D(A0z2.getKey()), "cd");
                if (!TextUtils.isEmpty(A002)) {
                    A0x.put(A002, A0z2.getValue());
                }
            }
        }
        zzay zzay = (zzay) ((C32381gG) map.get(zzay.class));
        if (zzay != null) {
            Iterator A0y3 = AnonymousClass000.A0y(Collections.unmodifiableMap(zzay.zza));
            while (A0y3.hasNext()) {
                Map.Entry A0z3 = AnonymousClass000.A0z(A0y3);
                String A003 = A00(AnonymousClass000.A0D(A0z3.getKey()), "cm");
                if (!TextUtils.isEmpty(A003)) {
                    double doubleValue2 = ((Number) A0z3.getValue()).doubleValue();
                    DecimalFormat decimalFormat3 = A03;
                    if (decimalFormat3 == null) {
                        decimalFormat3 = new DecimalFormat("0.######");
                        A03 = decimalFormat3;
                    }
                    A0x.put(A003, decimalFormat3.format(doubleValue2));
                }
            }
        }
        zzbb zzbb = (zzbb) ((C32381gG) map.get(zzbb.class));
        if (zzbb != null) {
            int i2 = 1;
            for (AnonymousClass4Pu r1 : Collections.unmodifiableList(zzbb.zzb)) {
                String A004 = A00(i2, "promo");
                HashMap A0x2 = AnonymousClass000.A0x();
                Iterator A0y4 = AnonymousClass000.A0y(r1.A00);
                while (A0y4.hasNext()) {
                    Map.Entry A0z4 = AnonymousClass000.A0z(A0y4);
                    A0x2.put(C13680ns.A0g(String.valueOf(A0z4.getKey()), String.valueOf(A004)), A0z4.getValue());
                }
                A0x.putAll(A0x2);
                i2++;
            }
            int i3 = 1;
            for (C86304Sc A005 : Collections.unmodifiableList(zzbb.zza)) {
                A0x.putAll(A005.A00(A00(i3, "pr")));
                i3++;
            }
            Iterator A0y5 = AnonymousClass000.A0y(zzbb.zzc);
            int i4 = 1;
            while (A0y5.hasNext()) {
                Map.Entry A0z5 = AnonymousClass000.A0z(A0y5);
                String A006 = A00(i4, "il");
                int i5 = 1;
                for (C86304Sc A007 : (List) A0z5.getValue()) {
                    A0x.putAll(A007.A00(C13680ns.A0g(String.valueOf(A00(i5, "pi")), String.valueOf(A006))));
                    i5++;
                }
                if (!TextUtils.isEmpty((CharSequence) A0z5.getKey())) {
                    A0x.put(String.valueOf(A006).concat("nm"), A0z5.getKey());
                }
                i4++;
            }
        }
        zzba zzba = (zzba) ((C32381gG) map.get(zzba.class));
        if (zzba != null) {
            A02(A0x, "ul", zzba.zzc);
            int i6 = zzba.zza;
            int i7 = zzba.zzb;
            if (i6 > 0 && i7 > 0) {
                StringBuilder A0g = C13690nt.A0g(23);
                A0g.append(i6);
                A0x.put("sr", C13680ns.A0i("x", A0g, i7));
            }
        }
        zzav zzav = (zzav) ((C32381gG) map.get(zzav.class));
        if (zzav != null) {
            A02(A0x, "an", zzav.zza);
            A02(A0x, "aid", zzav.zzc);
            A02(A0x, "aiid", zzav.zzd);
            A02(A0x, "av", zzav.zzb);
        }
        return A0x;
    }

    public static void A02(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public final Uri Aj2() {
        return this.A00;
    }

    public final void AjL(AnonymousClass3BD r24) {
        long j2;
        zzfb A0P;
        Map A012;
        String str;
        AnonymousClass3BD r6 = r24;
        C13710nw.A01(r6);
        C13710nw.A03("Can't deliver not submitted measurement", r6.A05);
        C13710nw.A06("deliver should be called on worker thread");
        AnonymousClass3BD r1 = new AnonymousClass3BD(r6);
        zzbe zzbe = (zzbe) r1.A01(zzbe.class);
        if (TextUtils.isEmpty(zzbe.zza)) {
            A0P = C13690nt.A0P(this);
            A012 = A01(r1);
            str = "Ignoring measurement without type";
        } else if (TextUtils.isEmpty(zzbe.zzb)) {
            A0P = C13690nt.A0P(this);
            A012 = A01(r1);
            str = "Ignoring measurement without client id";
        } else {
            zzbv zzbv = this.A01;
            C65653Vp r0 = zzbv.zzl;
            C13710nw.A01(r0);
            C13710nw.A03("Analytics instance not initialized", AnonymousClass000.A1O(r0.A01 ? 1 : 0));
            Map A013 = A01(r1);
            A013.put("v", "1");
            A013.put("_v", zzbt.zzb);
            String str2 = this.A02;
            A013.put("tid", str2);
            C65653Vp r02 = zzbv.zzl;
            C13710nw.A01(r02);
            C13710nw.A03("Analytics instance not initialized", AnonymousClass000.A1O(r02.A01 ? 1 : 0));
            if (zzbv.zzl.A02) {
                StringBuilder A0o = AnonymousClass000.A0o();
                Iterator A0y = AnonymousClass000.A0y(A013);
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass000.A0z(A0y);
                    if (A0o.length() != 0) {
                        A0o.append(", ");
                    }
                    A0o.append(C13690nt.A0f(A0z));
                    A0o.append("=");
                    A0o.append((String) A0z.getValue());
                }
                zzN("Dry run is enabled. GoogleAnalytics would have sent", A0o.toString());
                return;
            }
            HashMap A0x = AnonymousClass000.A0x();
            zzfs.zzg(A0x, "uid", zzbe.zzc);
            zzav zzav = (zzav) ((C32381gG) r6.A0A.get(zzav.class));
            if (zzav != null) {
                zzfs.zzg(A0x, "an", zzav.zza);
                zzfs.zzg(A0x, "aid", zzav.zzc);
                zzfs.zzg(A0x, "av", zzav.zzb);
                zzfs.zzg(A0x, "aiid", zzav.zzd);
            }
            zzbx zzbx = new zzbx(0, zzbe.zzb, str2, !TextUtils.isEmpty(zzbe.zzd), 0, A0x);
            zzbv zzbv2 = this.zza;
            zzbv.zzs(zzbv2.zzh);
            zzbq zzbq = zzbv2.zzh;
            zzbq.zzW();
            C15000qA.A00();
            zzck zzck = zzbq.zza;
            zzck.zzW();
            C15000qA.A00();
            try {
                zzce zzce = zzck.zzb;
                zzce.zzW();
                zzce.zzf().beginTransaction();
                zzce zzce2 = zzck.zzb;
                String str3 = zzbx.zza;
                C13710nw.A05(str3);
                zzce2.zzW();
                C15000qA.A00();
                SQLiteDatabase zzf = zzce2.zzf();
                String[] strArr = new String[2];
                C13690nt.A1L("0", str3, strArr);
                int delete = zzf.delete("properties", "app_uid=? AND cid<>?", strArr);
                if (delete > 0) {
                    zzce2.zzP("Deleted property records", Integer.valueOf(delete));
                }
                j2 = zzck.zzb.zze(0, zzbx.zza, zzbx.zzb);
                zzbx.zzd = 1 + j2;
                zzce zzce3 = zzck.zzb;
                zzce3.zzW();
                C15000qA.A00();
                SQLiteDatabase zzf2 = zzce3.zzf();
                Map map = zzbx.zze;
                C13710nw.A01(map);
                Uri.Builder builder = new Uri.Builder();
                Iterator A0y2 = AnonymousClass000.A0y(map);
                while (A0y2.hasNext()) {
                    Map.Entry A0z2 = AnonymousClass000.A0z(A0y2);
                    builder.appendQueryParameter(C13690nt.A0f(A0z2), (String) A0z2.getValue());
                }
                String encodedQuery = builder.build().getEncodedQuery();
                if (encodedQuery == null) {
                    encodedQuery = "";
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_uid", 0L);
                contentValues.put("cid", zzbx.zza);
                contentValues.put("tid", zzbx.zzb);
                contentValues.put("adid", Integer.valueOf(zzbx.zzc ? 1 : 0));
                contentValues.put("hits_count", Long.valueOf(zzbx.zzd));
                contentValues.put("params", encodedQuery);
                try {
                    if (zzf2.insertWithOnConflict("properties", (String) null, contentValues, 5) == -1) {
                        zzce3.zzJ("Failed to insert/update a property (got -1)");
                    }
                } catch (SQLiteException e2) {
                    zzce3.zzK("Error storing a property", e2);
                }
                zzck.zzb.zzab();
                try {
                    zzck.zzb.zzaa();
                } catch (SQLiteException e3) {
                    zzck.zzK("Failed to end transaction", e3);
                }
                if (j2 == 0) {
                    zzbq.zza.zzk(zzbx);
                }
            } catch (SQLiteException e4) {
                zzck.zzK("Failed to update Analytics property", e4);
                try {
                    zzck.zzb.zzaa();
                } catch (SQLiteException e5) {
                    zzck.zzK("Failed to end transaction", e5);
                }
                j2 = -1;
            } catch (Throwable th) {
                try {
                    zzck.zzb.zzaa();
                    throw th;
                } catch (SQLiteException e6) {
                    zzck.zzK("Failed to end transaction", e6);
                    throw th;
                }
            }
            A013.put("_s", String.valueOf(j2));
            zzex zzex = new zzex(C13690nt.A0P(this), A013, r6.A00, true, 0, 0, (List) null);
            zzbv zzbv3 = this.zza;
            zzbv.zzs(zzbv3.zzh);
            zzbq zzbq2 = zzbv3.zzh;
            zzbq2.zzW();
            zzbq2.zzG("Hit delivery requested", zzex);
            C15000qA r2 = zzbq2.zza.zzg;
            C13710nw.A01(r2);
            r2.A03.submit(new RunnableRunnableShape2S0200000_I0(zzbq2, 5, zzex));
            return;
        }
        StringBuilder A0o2 = AnonymousClass000.A0o();
        Iterator A0y3 = AnonymousClass000.A0y(A012);
        while (A0y3.hasNext()) {
            Map.Entry A0z3 = AnonymousClass000.A0z(A0y3);
            if (A0o2.length() > 0) {
                A0o2.append(',');
            }
            A0o2.append(C13690nt.A0f(A0z3));
            A0o2.append('=');
            A0o2.append((String) A0z3.getValue());
        }
        A0P.zzS(C13680ns.A0g(str, "Discarding hit. "), A0o2.toString());
    }
}
