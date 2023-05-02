package X;

import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import com.obwhatsapp.components.PhoneNumberEntry;

/* renamed from: X.3CQ  reason: invalid class name */
public class AnonymousClass3CQ implements TextWatcher {
    public int A00;
    public C61823Am A01;
    public boolean A02 = false;
    public boolean A03;
    public final /* synthetic */ PhoneNumberEntry A04;

    public AnonymousClass3CQ(PhoneNumberEntry phoneNumberEntry, String str) {
        this.A04 = phoneNumberEntry;
        boolean z2 = false;
        AnonymousClass00B.A0F(str != null ? true : z2);
        C26071Mf.A00();
        this.A01 = new C61823Am(str);
    }

    public synchronized void afterTextChanged(Editable editable) {
        int i2;
        synchronized (this) {
            boolean z2 = true;
            Editable editable2 = editable;
            if (this.A03) {
                if (editable2.length() == 0) {
                    z2 = false;
                }
                this.A03 = z2;
            } else if (!this.A02) {
                int selectionEnd = Selection.getSelectionEnd(editable2) - 1;
                C61823Am r5 = this.A01;
                r5.A07();
                int length = editable2.length();
                String str = null;
                char c2 = 0;
                boolean z3 = false;
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = editable2.charAt(i3);
                    if (PhoneNumberUtils.isNonSeparator(charAt)) {
                        if (c2 != 0) {
                            boolean z4 = false;
                            if (z3) {
                                z4 = true;
                            }
                            str = r5.A05(c2, z4);
                            r5.A07 = str;
                            z3 = false;
                        }
                        c2 = charAt;
                    }
                    if (i3 == selectionEnd) {
                        z3 = true;
                    }
                }
                if (c2 != 0) {
                    boolean z5 = false;
                    if (z3) {
                        z5 = true;
                    }
                    str = r5.A05(c2, z5);
                    r5.A07 = str;
                }
                if (str != null) {
                    if (!r5.A0G) {
                        i2 = r5.A01;
                    } else {
                        int i4 = 0;
                        i2 = 0;
                        while (i4 < r5.A02 && i2 < r5.A07.length()) {
                            if (r5.A0B.charAt(i4) == r5.A07.charAt(i2)) {
                                i4++;
                            }
                            i2++;
                        }
                    }
                    this.A02 = true;
                    editable2.replace(0, editable2.length(), str, 0, str.length());
                    if (str.equals(editable2.toString())) {
                        Selection.setSelection(editable2, i2);
                    }
                    this.A02 = false;
                }
            }
            AnonymousClass4SS r0 = this.A04.A04;
            if (r0 != null) {
                r0.A00();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        if (r5 <= 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void beforeTextChanged(java.lang.CharSequence r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0013
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0013
            if (r5 != 0) goto L_0x0014
            int r0 = r3.length()
            if (r0 != r4) goto L_0x0014
            r0 = 1
        L_0x0011:
            r2.A00 = r0
        L_0x0013:
            return
        L_0x0014:
            if (r6 != 0) goto L_0x0023
            int r1 = r4 + r5
            int r0 = r3.length()
            if (r1 != r0) goto L_0x0023
            r0 = 0
            if (r5 > 0) goto L_0x0011
        L_0x0021:
            r0 = 3
            goto L_0x0011
        L_0x0023:
            if (r5 <= 0) goto L_0x0021
            r1 = r4
        L_0x0026:
            int r0 = r4 + r5
            if (r1 >= r0) goto L_0x0037
            char r0 = r3.charAt(r1)
            boolean r0 = android.telephony.PhoneNumberUtils.isNonSeparator(r0)
            if (r0 == 0) goto L_0x0021
            int r1 = r1 + 1
            goto L_0x0026
        L_0x0037:
            r0 = 2
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CQ.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (!this.A02 && !this.A03) {
            if (this.A00 == 3 && i4 > 0) {
                int i5 = i2;
                while (true) {
                    if (i5 < i2 + i4) {
                        if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i5))) {
                            break;
                        }
                        i5++;
                    } else {
                        this.A00 = 2;
                        break;
                    }
                }
            }
            if (this.A00 == 1 && i4 > 0) {
                int i6 = i2;
                while (true) {
                    if (i6 < i2 + i4) {
                        if (!PhoneNumberUtils.isNonSeparator(charSequence.charAt(i6))) {
                            break;
                        }
                        i6++;
                    } else {
                        break;
                    }
                }
            }
            if (this.A00 != 3) {
                return;
            }
            this.A03 = true;
            this.A01.A07();
        }
    }
}
