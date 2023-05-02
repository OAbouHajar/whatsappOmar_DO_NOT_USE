package X;

import android.text.TextUtils;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5tq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117965tq {
    public final /* synthetic */ PaymentTransactionHistoryActivity A00;

    public /* synthetic */ C117965tq(PaymentTransactionHistoryActivity paymentTransactionHistoryActivity) {
        this.A00 = paymentTransactionHistoryActivity;
    }

    public final void A00(C39961tL r7, String str, List list, List list2) {
        int i2;
        String A0d;
        int i3;
        PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = this.A00;
        C110905f1 r0 = paymentTransactionHistoryActivity.A0G;
        r0.A01 = list;
        r0.A01();
        ArrayList arrayList = paymentTransactionHistoryActivity.A0X;
        arrayList.clear();
        arrayList.addAll(list2);
        paymentTransactionHistoryActivity.A02.setVisibility(8);
        if (list.isEmpty()) {
            TextView textView = paymentTransactionHistoryActivity.A03;
            boolean z2 = r7.A05;
            boolean z3 = r7.A06;
            if (z2) {
                if (!z3) {
                    boolean A1V = AnonymousClass000.A1V(r7.A00);
                    boolean isEmpty = TextUtils.isEmpty(str);
                    if (A1V) {
                        if (isEmpty) {
                            i3 = R.string.str1045;
                        } else {
                            i2 = R.string.str1046;
                            A0d = C13680ns.A0d(paymentTransactionHistoryActivity, str, new Object[1], 0, i2);
                            textView.setText(A0d);
                            paymentTransactionHistoryActivity.A01.setVisibility(0);
                            return;
                        }
                    } else if (isEmpty) {
                        i3 = R.string.str1041;
                    } else {
                        i2 = R.string.str1044;
                        A0d = C13680ns.A0d(paymentTransactionHistoryActivity, str, new Object[1], 0, i2);
                        textView.setText(A0d);
                        paymentTransactionHistoryActivity.A01.setVisibility(0);
                        return;
                    }
                } else if (TextUtils.isEmpty(str)) {
                    i3 = R.string.str1042;
                } else {
                    i2 = R.string.str1043;
                    A0d = C13680ns.A0d(paymentTransactionHistoryActivity, str, new Object[1], 0, i2);
                    textView.setText(A0d);
                    paymentTransactionHistoryActivity.A01.setVisibility(0);
                    return;
                }
            } else if (!z3) {
                boolean A1V2 = AnonymousClass000.A1V(r7.A00);
                boolean z4 = r7.A02;
                if (A1V2) {
                    if (!z4) {
                        boolean z5 = r7.A03;
                        boolean isEmpty2 = TextUtils.isEmpty(str);
                        if (z5) {
                            if (isEmpty2) {
                                i3 = R.string.str103f;
                            } else {
                                i2 = R.string.str1040;
                                A0d = C13680ns.A0d(paymentTransactionHistoryActivity, str, new Object[1], 0, i2);
                                textView.setText(A0d);
                                paymentTransactionHistoryActivity.A01.setVisibility(0);
                                return;
                            }
                        } else if (isEmpty2) {
                            i3 = R.string.str104b;
                        } else {
                            i2 = R.string.str104c;
                            A0d = C13680ns.A0d(paymentTransactionHistoryActivity, str, new Object[1], 0, i2);
                            textView.setText(A0d);
                            paymentTransactionHistoryActivity.A01.setVisibility(0);
                            return;
                        }
                    } else if (TextUtils.isEmpty(str)) {
                        i3 = R.string.str1039;
                    } else {
                        i2 = R.string.str103a;
                        A0d = C13680ns.A0d(paymentTransactionHistoryActivity, str, new Object[1], 0, i2);
                        textView.setText(A0d);
                        paymentTransactionHistoryActivity.A01.setVisibility(0);
                        return;
                    }
                } else if (!z4) {
                    boolean z6 = r7.A03;
                    boolean isEmpty3 = TextUtils.isEmpty(str);
                    if (z6) {
                        if (isEmpty3) {
                            i3 = R.string.str103b;
                        } else {
                            i2 = R.string.str103e;
                            A0d = C13680ns.A0d(paymentTransactionHistoryActivity, str, new Object[1], 0, i2);
                            textView.setText(A0d);
                            paymentTransactionHistoryActivity.A01.setVisibility(0);
                            return;
                        }
                    } else if (isEmpty3) {
                        i3 = R.string.str1047;
                    } else {
                        i2 = R.string.str104a;
                        A0d = C13680ns.A0d(paymentTransactionHistoryActivity, str, new Object[1], 0, i2);
                        textView.setText(A0d);
                        paymentTransactionHistoryActivity.A01.setVisibility(0);
                        return;
                    }
                } else if (TextUtils.isEmpty(str)) {
                    i3 = R.string.str1035;
                } else {
                    i2 = R.string.str1038;
                    A0d = C13680ns.A0d(paymentTransactionHistoryActivity, str, new Object[1], 0, i2);
                    textView.setText(A0d);
                    paymentTransactionHistoryActivity.A01.setVisibility(0);
                    return;
                }
            } else if (!r7.A02) {
                boolean z7 = r7.A03;
                boolean isEmpty4 = TextUtils.isEmpty(str);
                if (z7) {
                    if (isEmpty4) {
                        i3 = R.string.str103c;
                    } else {
                        i2 = R.string.str103d;
                        A0d = C13680ns.A0d(paymentTransactionHistoryActivity, str, new Object[1], 0, i2);
                        textView.setText(A0d);
                        paymentTransactionHistoryActivity.A01.setVisibility(0);
                        return;
                    }
                } else if (isEmpty4) {
                    i3 = R.string.str1048;
                } else {
                    i2 = R.string.str1049;
                    A0d = C13680ns.A0d(paymentTransactionHistoryActivity, str, new Object[1], 0, i2);
                    textView.setText(A0d);
                    paymentTransactionHistoryActivity.A01.setVisibility(0);
                    return;
                }
            } else if (TextUtils.isEmpty(str)) {
                i3 = R.string.str1036;
            } else {
                i2 = R.string.str1037;
                A0d = C13680ns.A0d(paymentTransactionHistoryActivity, str, new Object[1], 0, i2);
                textView.setText(A0d);
                paymentTransactionHistoryActivity.A01.setVisibility(0);
                return;
            }
            A0d = paymentTransactionHistoryActivity.getString(i3);
            textView.setText(A0d);
            paymentTransactionHistoryActivity.A01.setVisibility(0);
            return;
        }
        paymentTransactionHistoryActivity.A01.setVisibility(8);
        paymentTransactionHistoryActivity.A0D.A04(list);
    }
}
