package X;

import android.content.res.ColorStateList;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: X.0Qg  reason: invalid class name */
public class AnonymousClass0Qg {
    public float A00 = Float.MAX_VALUE;
    public float A01;
    public float A02;
    public float A03;
    public float A04 = 0.0f;
    public float A05 = 1.0f;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public ColorStateList A0D;
    public Layout.Alignment A0E;
    public TextPaint A0F = new TextPaint(1);
    public TextUtils.TruncateAt A0G;
    public AnonymousClass02F A0H;
    public CharSequence A0I;
    public boolean A0J = true;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;

    public AnonymousClass0Qg() {
        boolean z2 = true;
        this.A0N = Build.VERSION.SDK_INT < 28 ? false : z2;
        this.A0L = false;
        this.A0G = null;
        this.A0M = false;
        this.A0A = Integer.MAX_VALUE;
        this.A0E = Layout.Alignment.ALIGN_NORMAL;
        this.A0H = AnonymousClass02G.A01;
        this.A06 = 0;
        this.A07 = 0;
        this.A08 = 0;
        this.A0K = false;
    }

    public void A00() {
        if (this.A0K) {
            TextPaint textPaint = new TextPaint(this.A0F);
            textPaint.set(this.A0F);
            this.A0F = textPaint;
            this.A0K = false;
        }
    }

    public int hashCode() {
        int A082 = AnonymousClass000.A08((this.A0F.getColor() + 31) * 31, this.A0F.getTextSize());
        int i2 = 0;
        int hashCode = this.A0F.getTypeface() != null ? this.A0F.getTypeface().hashCode() : 0;
        TextPaint textPaint = this.A0F;
        int A083 = (((AnonymousClass000.A08(AnonymousClass000.A08(AnonymousClass000.A08((((((AnonymousClass000.A08((((AnonymousClass000.A08(AnonymousClass000.A08(AnonymousClass000.A08((A082 + hashCode) * 31, this.A01), this.A02), this.A03) + this.A09) * 31) + textPaint.linkColor) * 31, textPaint.density) + Arrays.hashCode(textPaint.drawableState)) * 31) + this.A0C) * 31) + this.A0B) * 31, this.A05), this.A04), this.A00) + (this.A0J ? 1 : 0)) * 31) + (this.A0N ? 1 : 0)) * 31;
        TextUtils.TruncateAt truncateAt = this.A0G;
        int hashCode2 = (((((A083 + (truncateAt != null ? truncateAt.hashCode() : 0)) * 31) + (this.A0M ? 1 : 0)) * 31) + this.A0A) * 31;
        Layout.Alignment alignment = this.A0E;
        int hashCode3 = (hashCode2 + (alignment != null ? alignment.hashCode() : 0)) * 31;
        AnonymousClass02F r0 = this.A0H;
        int hashCode4 = (((((((((hashCode3 + (r0 != null ? r0.hashCode() : 0)) * 31) + this.A06) * 31) + this.A07) * 31) + Arrays.hashCode((int[]) null)) * 31) + Arrays.hashCode((int[]) null)) * 31;
        CharSequence charSequence = this.A0I;
        if (charSequence != null) {
            i2 = charSequence.hashCode();
        }
        return hashCode4 + i2;
    }
}
