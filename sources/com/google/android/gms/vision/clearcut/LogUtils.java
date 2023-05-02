package com.google.android.gms.vision.clearcut;

import X.AnonymousClass000;
import X.AnonymousClass3K4;
import X.AnonymousClass45N;
import X.C105895Bp;
import X.C110025Us;
import X.C13680ns;
import X.C15560rQ;
import X.C15570rR;
import X.C66133Xx;
import X.C67133b3;
import X.C67163b6;
import X.C67203bA;
import X.C67223bC;
import X.C67233bD;
import X.C67283bI;
import X.C67293bJ;
import X.C98484sU;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;

public class LogUtils {
    public static C67163b6 zza(Context context) {
        C67133b3 A00 = C67293bJ.A00(C67163b6.zzf);
        String packageName = context.getPackageName();
        C67133b3.A00(A00);
        C67163b6 r1 = (C67163b6) A00.A00;
        r1.zzc |= 1;
        r1.zzd = packageName;
        String zzb = zzb(context);
        if (zzb != null) {
            C67133b3.A00(A00);
            C67163b6 r12 = (C67163b6) A00.A00;
            r12.zzc |= 2;
            r12.zze = zzb;
        }
        return (C67163b6) ((C67293bJ) A00.A01());
    }

    public static C67233bD zza(long j2, int i2, String str, String str2, List list, C66133Xx r12) {
        C67133b3 r3 = (C67133b3) C67203bA.zzg.A08(5);
        C67133b3 r5 = (C67133b3) C67283bI.zzl.A08(5);
        C67133b3.A00(r5);
        C67283bI r4 = (C67283bI) r5.A00;
        int i3 = r4.zzc | 1;
        r4.zzc = i3;
        r4.zzd = str2;
        int i4 = i3 | 16;
        r4.zzc = i4;
        r4.zzi = j2;
        r4.zzc = i4 | 32;
        r4.zzj = (long) i2;
        C110025Us r1 = r4.zzk;
        if (!((C105895Bp) r1).A00) {
            r1 = r1.Aim(AnonymousClass3K4.A0A(r1));
            r4.zzk = r1;
        }
        C98484sU.A08(list, r1);
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(r5.A01());
        C67133b3.A00(r3);
        C67203bA r2 = (C67203bA) r3.A00;
        C110025Us r13 = r2.zzf;
        if (!((C105895Bp) r13).A00) {
            r13 = r13.Aim(AnonymousClass3K4.A0A(r13));
            r2.zzf = r13;
        }
        C98484sU.A08(A0u, r13);
        C67133b3 A00 = C67293bJ.A00(C67223bC.zzi);
        C67133b3.A00(A00);
        C67223bC r52 = (C67223bC) A00.A00;
        int i5 = r52.zzc | 4;
        r52.zzc = i5;
        r52.zzf = (long) r12.A01;
        int i6 = i5 | 2;
        r52.zzc = i6;
        r52.zze = (long) r12.A00;
        long j3 = (long) r12.A02;
        int i7 = i6 | 8;
        r52.zzc = i7;
        r52.zzg = j3;
        long j4 = r12.A04;
        r52.zzc = i7 | 16;
        r52.zzh = j4;
        C67133b3.A00(r3);
        C67203bA r14 = (C67203bA) r3.A00;
        r14.zzd = (C67223bC) ((C67293bJ) A00.A01());
        r14.zzc |= 1;
        C67133b3 A002 = C67293bJ.A00(C67233bD.zzi);
        C67133b3.A00(A002);
        C67233bD r15 = (C67233bD) A002.A00;
        r15.zzf = (C67203bA) ((C67293bJ) r3.A01());
        r15.zzc |= 4;
        return (C67233bD) ((C67293bJ) A002.A01());
    }

    public static String zzb(Context context) {
        try {
            C15570rR A00 = C15560rQ.A00(context);
            return A00.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e2) {
            Object[] A1b = C13680ns.A1b();
            A1b[0] = context.getPackageName();
            AnonymousClass45N.A00("Unable to find calling package info for %s", e2, A1b);
            return null;
        }
    }
}
