package com.google.android.gms.flags.impl;

import X.AnonymousClass000;
import X.AnonymousClass3K3;
import X.AnonymousClass44Y;
import X.AnonymousClass580;
import X.AnonymousClass581;
import X.AnonymousClass582;
import X.AnonymousClass583;
import X.C1049957s;
import X.C109785Tq;
import X.C13680ns;
import X.C31371e2;
import X.C58032sR;
import X.C63673Lb;
import X.C92154h6;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Callable;

public class FlagProviderImpl extends C63673Lb implements C109785Tq {
    public boolean zzu;
    public SharedPreferences zzv;

    public FlagProviderImpl() {
        super("com.google.android.gms.flags.IFlagProvider");
        this.zzu = false;
    }

    public FlagProviderImpl(int i2) {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    /* JADX INFO: finally extract failed */
    public static Object A00(Callable callable) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        try {
            StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
            Object call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    public static C109785Tq asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        return queryLocalInterface instanceof C109785Tq ? (C109785Tq) queryLocalInterface : new C92154h6(iBinder);
    }

    public final boolean dispatchTransaction(int i2, Parcel parcel, Parcel parcel2, int i3) {
        int i4;
        if (i2 != 1) {
            if (i2 == 2) {
                i4 = getBooleanFlagValue(parcel.readString(), AnonymousClass000.A1O(parcel.readInt()), parcel.readInt());
            } else if (i2 == 3) {
                i4 = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            } else if (i2 == 4) {
                long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeLong(longFlagValue);
                return true;
            } else if (i2 != 5) {
                return false;
            } else {
                String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(stringFlagValue);
                return true;
            }
            parcel2.writeNoException();
            parcel2.writeInt(i4);
            return true;
        }
        init(C31371e2.A00(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }

    public boolean getBooleanFlagValue(String str, boolean z2, int i2) {
        Boolean bool;
        if (!this.zzu) {
            return z2;
        }
        SharedPreferences sharedPreferences = this.zzv;
        Boolean valueOf = Boolean.valueOf(z2);
        try {
            bool = (Boolean) A00(new AnonymousClass580(sharedPreferences, valueOf, str));
        } catch (Exception e2) {
            Log.w("FlagDataUtils", C13680ns.A0g(AnonymousClass3K3.A0q(e2), "Flag value not available, returning default: "));
            bool = valueOf;
        }
        return bool.booleanValue();
    }

    public int getIntFlagValue(String str, int i2, int i3) {
        Integer num;
        if (!this.zzu) {
            return i2;
        }
        SharedPreferences sharedPreferences = this.zzv;
        Integer valueOf = Integer.valueOf(i2);
        try {
            num = (Integer) A00(new AnonymousClass581(sharedPreferences, valueOf, str));
        } catch (Exception e2) {
            Log.w("FlagDataUtils", C13680ns.A0g(AnonymousClass3K3.A0q(e2), "Flag value not available, returning default: "));
            num = valueOf;
        }
        return num.intValue();
    }

    public long getLongFlagValue(String str, long j2, int i2) {
        Long l2;
        if (!this.zzu) {
            return j2;
        }
        SharedPreferences sharedPreferences = this.zzv;
        Long valueOf = Long.valueOf(j2);
        try {
            l2 = (Long) A00(new AnonymousClass582(sharedPreferences, valueOf, str));
        } catch (Exception e2) {
            Log.w("FlagDataUtils", C13680ns.A0g(AnonymousClass3K3.A0q(e2), "Flag value not available, returning default: "));
            l2 = valueOf;
        }
        return l2.longValue();
    }

    public String getStringFlagValue(String str, String str2, int i2) {
        if (!this.zzu) {
            return str2;
        }
        try {
            return (String) A00(new AnonymousClass583(this.zzv, str, str2));
        } catch (Exception e2) {
            Log.w("FlagDataUtils", C13680ns.A0g(AnonymousClass3K3.A0q(e2), "Flag value not available, returning default: "));
            return str2;
        }
    }

    public void init(IObjectWrapper iObjectWrapper) {
        SharedPreferences sharedPreferences;
        Context context = (Context) C58032sR.A01(iObjectWrapper);
        if (!this.zzu) {
            try {
                Context createPackageContext = context.createPackageContext("com.google.android.gms", 0);
                synchronized (SharedPreferences.class) {
                    sharedPreferences = AnonymousClass44Y.A00;
                    if (sharedPreferences == null) {
                        sharedPreferences = (SharedPreferences) A00(new C1049957s(createPackageContext));
                        AnonymousClass44Y.A00 = sharedPreferences;
                    }
                }
                this.zzv = sharedPreferences;
                this.zzu = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e2) {
                Log.w("FlagProviderImpl", C13680ns.A0g(AnonymousClass3K3.A0q(e2), "Could not retrieve sdk flags, continuing with defaults: "));
            }
        }
    }
}
