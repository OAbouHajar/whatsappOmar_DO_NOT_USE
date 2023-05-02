package com.google.android.gms.internal.gtm;

public final class zzfb extends zzbs {
    public static zzfb zza;

    public zzfb(zzbv zzbv) {
        super(zzbv);
    }

    public static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Number) obj).intValue());
        }
        String str = "-";
        if (obj instanceof Long) {
            long abs = Math.abs(((Number) obj).longValue());
            if (abs >= 100) {
                if (String.valueOf(obj).charAt(0) != '-') {
                    str = "";
                }
                String valueOf = String.valueOf(abs);
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                int length = valueOf.length();
                sb.append(Math.round(Math.pow(10.0d, (double) (length - 1))));
                sb.append("...");
                sb.append(str);
                sb.append(Math.round(Math.pow(10.0d, (double) length) - 4.0d));
                return sb.toString();
            }
        } else if (!(obj instanceof Boolean)) {
            return obj instanceof Throwable ? obj.getClass().getCanonicalName() : str;
        }
        return String.valueOf(obj);
    }

    public final void zzb(zzex zzex, String str) {
        zzS(str.length() != 0 ? "Discarding hit. ".concat(str) : new String("Discarding hit. "), zzex != null ? zzex.toString() : "no hit data");
    }

    public final void zzd() {
        synchronized (zzfb.class) {
            zza = this;
        }
    }
}
