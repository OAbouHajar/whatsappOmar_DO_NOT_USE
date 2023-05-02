package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass19X;
import X.C16800tf;
import X.C25961Lu;
import X.C25991Lx;
import android.content.ContentValues;

public class RunnableRunnableShape0S1100100_I0 implements Runnable {
    public long A00;
    public Object A01;
    public String A02;
    public final int A03;

    public RunnableRunnableShape0S1100100_I0(Object obj, String str, int i2, long j2) {
        this.A03 = i2;
        this.A01 = obj;
        this.A00 = j2;
        this.A02 = str;
    }

    public final void run() {
        int i2 = this.A03;
        Object obj = this.A01;
        if (i2 != 0) {
            String str = this.A02;
            long j2 = this.A00;
            C25991Lx r0 = ((C25961Lu) obj).A00;
            AnonymousClass00B.A00();
            C16800tf A022 = r0.A00.A02();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("chat_jid", str);
                contentValues.put("page_number", Long.valueOf(j2));
                A022.A02.A04(contentValues, "draft_voice_note_metadata");
                A022.close();
                return;
            } catch (Throwable unused) {
            }
        } else {
            long j3 = this.A00;
            ((AnonymousClass19X) obj).A01.put(Long.valueOf(j3), this.A02);
            return;
        }
        throw th;
    }
}
