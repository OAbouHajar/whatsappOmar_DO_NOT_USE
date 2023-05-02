package com.obwhatsapp.net.tls13;

import X.C32311g7;
import java.io.Serializable;
import java.util.Arrays;

public class WtCachedPsk implements Serializable {
    public static final long serialVersionUID = 84430101;
    public final byte certsID;
    public final String cipher;
    public final long maxEarlyDataSize;
    public final byte[] pskVal;
    public final String sni;
    public final byte[] ticket;
    public final long ticketAgeAdd;
    public final long ticketIssuedTime;
    public final long ticketLifetime;
    public boolean useTestTime = false;

    public WtCachedPsk(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte b2, long j2) {
        this.pskVal = bArr;
        this.cipher = "TLS_AES_128_GCM_SHA256";
        this.maxEarlyDataSize = j2;
        this.ticketAgeAdd = C32311g7.A02(bArr2);
        long A02 = C32311g7.A02(bArr3);
        this.ticketLifetime = (A02 > 172800 ? 172800 : A02) * 1000;
        this.ticket = bArr4;
        this.ticketIssuedTime = System.currentTimeMillis();
        this.sni = str;
        this.certsID = b2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.ticket, ((WtCachedPsk) obj).ticket);
    }

    public int hashCode() {
        return Arrays.hashCode(this.ticket);
    }
}
