package X;

import android.content.ContentValues;

/* renamed from: X.1y7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42621y7 implements C39541se {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass10G A01;
    public final /* synthetic */ C16740tZ A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C42621y7(AnonymousClass10G r1, C16740tZ r2, long j2, boolean z2) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = z2;
        this.A00 = j2;
    }

    public final void AhJ(C16740tZ r10) {
        AnonymousClass10G r3 = this.A01;
        C16740tZ r0 = this.A02;
        boolean z2 = this.A03;
        long j2 = this.A00;
        if (r10.A11.equals(r0.A11)) {
            r10.A0x = z2;
            AnonymousClass17F r32 = r3.A06;
            if (j2 != 1) {
                C16800tf A022 = r32.A0D.A02();
                try {
                    ContentValues contentValues = new ContentValues(1);
                    contentValues.put("fts_namespace", r32.A0F(r10));
                    A022.A02.A00("message_ftsv2", contentValues, "docid = ?", new String[]{String.valueOf(r10.A13)});
                    A022.close();
                    return;
                } catch (Throwable unused) {
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
    }
}
