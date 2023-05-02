package X;

import android.app.Activity;
import android.widget.PopupWindow;
import com.obwhatsapp.KeyboardPopupLayout;
import java.util.HashMap;

/* renamed from: X.5vJ  reason: invalid class name and case insensitive filesystem */
public class C118825vJ {
    public final Activity A00;
    public final C16300so A01;
    public final KeyboardPopupLayout A02;
    public final AnonymousClass01V A03;
    public final C15860rz A04;
    public final AnonymousClass013 A05;
    public final AnonymousClass1MJ A06;
    public final C206711d A07;
    public final C17250um A08;
    public final AnonymousClass1BQ A09;
    public final C14710pd A0A;
    public final C16490t9 A0B;
    public final C26151Mn A0C;
    public final C25841Li A0D;
    public final C25861Lk A0E;
    public final C17020u3 A0F;
    public final C26161Mo A0G;
    public final C23061Ai A0H;
    public final HashMap A0I = AnonymousClass000.A0x();

    public C118825vJ(Activity activity, C16300so r3, KeyboardPopupLayout keyboardPopupLayout, AnonymousClass01V r5, C15860rz r6, AnonymousClass013 r7, AnonymousClass1MJ r8, C206711d r9, C17250um r10, AnonymousClass1BQ r11, C14710pd r12, C16490t9 r13, C26151Mn r14, C25841Li r15, C25861Lk r16, C17020u3 r17, C26161Mo r18, C23061Ai r19) {
        this.A0A = r12;
        this.A0D = r15;
        this.A0H = r19;
        this.A01 = r3;
        this.A0B = r13;
        this.A08 = r10;
        this.A07 = r9;
        this.A03 = r5;
        this.A05 = r7;
        this.A0E = r16;
        this.A09 = r11;
        this.A04 = r6;
        this.A0F = r17;
        this.A0C = r14;
        this.A0G = r18;
        this.A00 = activity;
        this.A02 = keyboardPopupLayout;
        this.A06 = r8;
    }

    public void A00() {
        PopupWindow popupWindow;
        HashMap hashMap = this.A0I;
        if (hashMap.containsKey(1) && (popupWindow = (PopupWindow) hashMap.get(1)) != null) {
            popupWindow.dismiss();
        }
    }

    public void A01(int i2) {
        AnonymousClass2JI r0;
        PopupWindow popupWindow;
        HashMap hashMap = this.A0I;
        for (Number number : hashMap.keySet()) {
            if (!(number.intValue() == i2 || (popupWindow = (PopupWindow) hashMap.get(number)) == null)) {
                popupWindow.dismiss();
            }
        }
        Integer valueOf = Integer.valueOf(i2);
        if (hashMap.containsKey(valueOf) && (r0 = (AnonymousClass2JI) hashMap.get(valueOf)) != null) {
            r0.A06();
        }
    }
}
