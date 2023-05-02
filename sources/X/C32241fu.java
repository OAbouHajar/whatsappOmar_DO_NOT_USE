package X;

import android.content.Context;
import android.content.DialogInterface;

/* renamed from: X.1fu  reason: invalid class name and case insensitive filesystem */
public class C32241fu extends C005302h {
    public AnonymousClass013 A00;
    public C14710pd A01;
    public final C91254fc A02 = new C91254fc();
    public final C91504g1 A03 = new C91504g1();

    public C32241fu(Context context) {
        super(context);
        AnonymousClass01F r1 = (AnonymousClass01F) AnonymousClass01I.A00(this.A01.A0O, AnonymousClass01F.class);
        this.A01 = r1.A1G();
        this.A00 = r1.Ai9();
    }

    public C32241fu(Context context, int i2) {
        super(context, i2);
        AnonymousClass01F r1 = (AnonymousClass01F) AnonymousClass01I.A00(this.A01.A0O, AnonymousClass01F.class);
        this.A01 = r1.A1G();
        this.A00 = r1.Ai9();
    }

    public static C32241fu A00(Context context) {
        return new C32241fu(context);
    }

    @Deprecated
    public C005302h A08(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        super.A08(onClickListener, A0A(charSequence));
        return this;
    }

    @Deprecated
    public C005302h A09(DialogInterface.OnClickListener onClickListener, CharSequence charSequence) {
        super.A09(onClickListener, A0A(charSequence));
        return this;
    }

    public final CharSequence A0A(CharSequence charSequence) {
        C14710pd r2 = this.A01;
        return (r2 == null || r2.A0E(C16620tM.A02, 1963)) ? charSequence : charSequence.toString().toUpperCase(AnonymousClass013.A00(this.A00.A00));
    }

    @Deprecated
    public void A0B(DialogInterface.OnClickListener onClickListener, int i2) {
        AnonymousClass0PG r1 = this.A01;
        r1.A0G = A0A(r1.A0O.getString(i2));
        r1.A04 = onClickListener;
    }

    public void A0C(DialogInterface.OnDismissListener onDismissListener) {
        this.A01.A07 = onDismissListener;
    }

    public void A0D(C001300o r2, AnonymousClass023 r3) {
        C91504g1 r0 = this.A03;
        super.A03(r0);
        r0.A00.A0A(r2, r3);
    }

    public void A0E(C001300o r3, AnonymousClass023 r4, int i2) {
        CharSequence A0A = A0A(this.A01.A0O.getString(i2));
        C91254fc r0 = this.A02;
        super.A08(r0, A0A);
        if (r4 != null) {
            r0.A00.A0A(r3, r4);
        }
    }

    public void A0F(C001300o r3, AnonymousClass023 r4, int i2) {
        CharSequence A0A = A0A(this.A01.A0O.getString(i2));
        C91254fc r0 = this.A02;
        super.A09(r0, A0A);
        if (r4 != null) {
            r0.A02.A0A(r3, r4);
        }
    }

    public void A0G(C001300o r3, AnonymousClass023 r4, CharSequence charSequence) {
        CharSequence A0A = A0A(charSequence);
        C91254fc r0 = this.A02;
        super.A08(r0, A0A);
        r0.A00.A0A(r3, r4);
    }

    public void A0H(C001300o r3, AnonymousClass023 r4, CharSequence charSequence) {
        CharSequence A0A = A0A(charSequence);
        C91254fc r0 = this.A02;
        super.A09(r0, A0A);
        r0.A02.A0A(r3, r4);
    }

    public C005702l create() {
        if (this.A03.A01.A02.A00 <= 0) {
            this.A01.A07 = null;
        }
        return super.create();
    }

    @Deprecated
    public C005302h setNegativeButton(int i2, DialogInterface.OnClickListener onClickListener) {
        super.A08(onClickListener, A0A(this.A01.A0O.getString(i2)));
        return this;
    }

    @Deprecated
    public C005302h setPositiveButton(int i2, DialogInterface.OnClickListener onClickListener) {
        super.A09(onClickListener, A0A(this.A01.A0O.getString(i2)));
        return this;
    }
}
