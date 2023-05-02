package com.obwhatsapp.jobqueue.job;

import com.whatsapp.jid.DeviceJid;

public class E2eMessageEncryptor$EncryptionFailException extends Exception {
    public final int encryptionRetryCount;
    public final DeviceJid jid;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public E2eMessageEncryptor$EncryptionFailException(com.whatsapp.jid.DeviceJid r3, int r4) {
        /*
            r2 = this;
            java.lang.String r1 = "Unable to encrypt message for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            r2.jid = r3
            r2.encryptionRetryCount = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.jobqueue.job.E2eMessageEncryptor$EncryptionFailException.<init>(com.whatsapp.jid.DeviceJid, int):void");
    }
}
