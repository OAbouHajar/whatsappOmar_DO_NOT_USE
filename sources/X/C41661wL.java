package X;

import android.view.ViewGroup;
import android.widget.ScrollView;
import com.obwhatsapp.status.playback.widget.StatusEditText;
import com.whatsapp.util.Log;

/* renamed from: X.1wL  reason: invalid class name and case insensitive filesystem */
public class C41661wL {
    public int A00;
    public C50262Yq A01;
    public C41641wJ A02 = null;
    public String A03;
    public boolean A04 = false;
    public boolean A05;
    public final ViewGroup A06;
    public final ScrollView A07;
    public final AnonymousClass027 A08;
    public final C23081Ak A09;
    public final C41681wN A0A;
    public final AnonymousClass01V A0B;
    public final C17250um A0C;
    public final C14710pd A0D;
    public final C27661Sq A0E;
    public final C17020u3 A0F;
    public final C23091Al A0G;
    public final C17980vx A0H;
    public final AnonymousClass1L1 A0I;
    public final StatusEditText A0J;
    public final AnonymousClass4QS A0K;
    public final C41571wB A0L;

    public C41661wL(ViewGroup viewGroup, ScrollView scrollView, AnonymousClass027 r4, C23081Ak r5, C41681wN r6, AnonymousClass01V r7, C17250um r8, C14710pd r9, C27661Sq r10, C17020u3 r11, C23091Al r12, C17980vx r13, AnonymousClass1L1 r14, StatusEditText statusEditText, AnonymousClass4QS r16, C41571wB r17) {
        this.A0D = r9;
        this.A06 = viewGroup;
        this.A0J = statusEditText;
        this.A0K = r16;
        this.A0E = r10;
        this.A0A = r6;
        this.A08 = r4;
        this.A0C = r8;
        this.A0B = r7;
        this.A0F = r11;
        this.A09 = r5;
        this.A07 = scrollView;
        this.A0L = r17;
        this.A0I = r14;
        this.A0H = r13;
        this.A0G = r12;
    }

    public static final int A00(CharSequence charSequence, int i2, int i3) {
        int i4 = 0;
        if (charSequence == null) {
            Log.e("textstatus/linecount/str-null");
        } else {
            int length = charSequence.length();
            if (i2 < 0 || i3 > length || i2 > i3) {
                throw new IndexOutOfBoundsException();
            }
            while (i2 < i3) {
                if (charSequence.charAt(i2) == 10) {
                    i4++;
                }
                i2++;
            }
        }
        return i4;
    }
}
