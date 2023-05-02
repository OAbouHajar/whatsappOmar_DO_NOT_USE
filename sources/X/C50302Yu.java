package X;

import java.io.File;

/* renamed from: X.2Yu  reason: invalid class name and case insensitive filesystem */
public final class C50302Yu {
    public C38451qo A00;
    public final C14870pt A01;
    public final C17130ua A02;
    public final C100164vC A03;
    public final C16980tz A04;

    public C50302Yu(C14870pt r11, C17130ua r12, C16980tz r13, C19950zG r14) {
        C18450wi.A0H(r11, 1);
        C18450wi.A0H(r13, 2);
        C18450wi.A0H(r12, 3);
        C18450wi.A0H(r14, 4);
        this.A01 = r11;
        this.A04 = r13;
        this.A02 = r12;
        C100164vC r4 = new C100164vC();
        this.A03 = r4;
        this.A00 = new C59462yK(r11, r12, r4, r14, new File(r13.A00.getCacheDir(), "biz_directory_cache"), "directory-image", 16777216);
    }

    public final void A00(C109245Rg r4, String str, int i2) {
        C18450wi.A0H(str, 0);
        C18450wi.A0H(r4, 2);
        this.A00.A01(new C100184vE(r4, str, i2, i2), false);
    }
}
