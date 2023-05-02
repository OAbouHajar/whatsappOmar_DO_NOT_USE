package com.obwhatsapp.conversation;

import X.AnonymousClass006;
import X.AnonymousClass12E;
import X.AnonymousClass15O;
import X.AnonymousClass1HT;
import X.AnonymousClass2Ul;
import X.AnonymousClass2XG;
import X.C15860rz;
import X.C16150sX;
import X.C16440t3;
import X.C16740tZ;
import X.C222717h;
import X.C23061Ai;
import X.C28381Vw;
import X.C30011bb;
import X.C33741j5;
import X.C38621r6;
import X.C48952Qa;
import X.C52642eC;
import X.C52652eD;
import X.C52662eE;
import X.C63793Ln;
import X.C64073Mq;
import X.C86364Sk;
import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class ConversationListView extends ListView implements AnonymousClass006 {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass12E A03;
    public C86364Sk A04;
    public AnonymousClass1HT A05;
    public C16440t3 A06;
    public C15860rz A07;
    public C222717h A08;
    public AnonymousClass15O A09;
    public C23061Ai A0A;
    public C52662eE A0B;
    public Runnable A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final Handler A0K;

    public ConversationListView(Context context) {
        super(context);
        A01();
        this.A0D = true;
        this.A0H = true;
        this.A0K = new C63793Ln(Looper.getMainLooper(), this);
        this.A04 = new C86364Sk();
    }

    public ConversationListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A0D = true;
        this.A0H = true;
        this.A0K = new C63793Ln(Looper.getMainLooper(), this);
        this.A04 = new C86364Sk();
    }

    public ConversationListView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A01();
        this.A0D = true;
        this.A0H = true;
        this.A0K = new C63793Ln(Looper.getMainLooper(), this);
        this.A04 = new C86364Sk();
    }

    public ConversationListView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A01();
        this.A0D = true;
        this.A0H = true;
        this.A0K = new C63793Ln(Looper.getMainLooper(), this);
        this.A04 = new C86364Sk();
    }

    public ConversationListView(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        super(context, attributeSet);
        A01();
    }

    public C30011bb A00(C28381Vw r5) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof C30011bb) {
                C30011bb r1 = (C30011bb) childAt;
                if (r1.A1L(r5)) {
                    return r1;
                }
            }
        }
        return null;
    }

    public void A01() {
        if (!this.A0G) {
            this.A0G = true;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            this.A06 = (C16440t3) r1.AP2.get();
            this.A08 = (C222717h) r1.AC3.get();
            this.A05 = (AnonymousClass1HT) r1.A5d.get();
            this.A0A = (C23061Ai) r1.AC0.get();
            this.A03 = (AnonymousClass12E) r1.A5Y.get();
            this.A07 = (C15860rz) r1.AQh.get();
            this.A09 = (AnonymousClass15O) r1.A0k.get();
        }
    }

    public void A02() {
        getConversationCursorAdapter().notifyDataSetChanged();
        if (this.A0E) {
            this.A0F = false;
            this.A0J = false;
        }
    }

    public void A03() {
        if (this.A0I) {
            A04();
            this.A0I = false;
        } else if (getLastVisiblePosition() >= getCount() - 2) {
            A04();
        } else {
            smoothScrollBy((int) getResources().getDimension(R.dimen.dimen0277), 100);
        }
    }

    public void A04() {
        if (this.A0E) {
            this.A0F = false;
            this.A0J = false;
        }
        this.A0D = true;
        post(new RunnableRunnableShape7S0100000_I0_6(this, 16));
    }

    public void A05() {
        C48952Qa conversationCursorAdapter = getConversationCursorAdapter();
        if (conversationCursorAdapter != null && conversationCursorAdapter.getCursor() != null) {
            int A012 = conversationCursorAdapter.A01();
            int defaultDividerOffset = getDefaultDividerOffset();
            conversationCursorAdapter.A01();
            A07(A012 + getHeaderViewsCount(), defaultDividerOffset);
            this.A0F = false;
            this.A0E = false;
        }
    }

    public void A06(int i2, int i3) {
        this.A00 = i2;
        if (i2 + i3 >= getConversationCursorAdapter().getCount() + getHeaderViewsCount()) {
            this.A0D = true;
            return;
        }
        this.A0D = false;
        if (Build.VERSION.SDK_INT < 18 || !isInLayout()) {
            setTranscriptMode(0);
        }
    }

    public void A07(int i2, int i3) {
        setTranscriptMode(0);
        setSelectionFromTop(i2, i3);
    }

    public void A08(Cursor cursor) {
        StringBuilder sb = new StringBuilder("conversationListView/changeCursor/size: ");
        sb.append(cursor.getCount());
        Log.w(sb.toString());
        C48952Qa conversationCursorAdapter = getConversationCursorAdapter();
        if (conversationCursorAdapter != null && !cursor.isClosed()) {
            conversationCursorAdapter.A0H.clear();
            conversationCursorAdapter.changeCursor(cursor);
        }
    }

    public void A09(AnonymousClass2XG r3, boolean z2) {
        C48952Qa conversationCursorAdapter = getConversationCursorAdapter();
        conversationCursorAdapter.A03 = r3.A00;
        conversationCursorAdapter.A04 = r3.A01;
        conversationCursorAdapter.A05 = r3.A02;
        if (z2) {
            conversationCursorAdapter.notifyDataSetChanged();
        }
    }

    public void A0A(C16740tZ r6, int i2, boolean z2) {
        C28381Vw r3 = r6.A11;
        C30011bb A002 = A00(r3);
        if (A002 != null) {
            if (i2 == 8) {
                A002.A0x();
            } else if (i2 == 12) {
                A002.A0u();
            } else if (i2 == 20) {
                getConversationCursorAdapter().A0T.add(r3);
            } else {
                if (i2 == 28 || i2 == 27) {
                    if (C38621r6.A0G(this.A06, this.A08, r6) == null) {
                        A002.A1F(r6, i2);
                        if (this.A0D) {
                            if (this.A0E) {
                                this.A0F = false;
                                this.A0J = false;
                            }
                            this.A0D = true;
                            new RunnableRunnableShape7S0100000_I0_6(this, 16).run();
                            return;
                        }
                        return;
                    }
                } else if (i2 == 30) {
                    C48952Qa conversationCursorAdapter = getConversationCursorAdapter();
                    conversationCursorAdapter.A0S.add(r3);
                    conversationCursorAdapter.notifyDataSetChanged();
                    return;
                } else if (z2) {
                    A002.A1H(r6, true);
                    return;
                }
                A002.A1G(r6, true);
            }
        } else if (getConversationCursorAdapter().A0T.add(r3)) {
            StringBuilder sb = new StringBuilder("conversation/refresh: no view for ");
            sb.append(r3.A01);
            sb.append(" ");
            sb.append(getFirstVisiblePosition());
            sb.append("-");
            sb.append(getLastVisiblePosition());
            sb.append(" (");
            sb.append(getCount());
            sb.append(")");
            Log.i(sb.toString());
        }
    }

    public final void A0B(C33741j5 r3, int i2, int i3, boolean z2) {
        int i4;
        if (getFirstVisiblePosition() >= i2 || getLastVisiblePosition() <= i2) {
            if (z2) {
                int i5 = -1;
                if (getFirstVisiblePosition() < i2) {
                    i5 = 1;
                }
                i4 = ((i5 * getHeight()) >> 2) + i3;
            } else {
                i4 = i3;
            }
            A07(i2, i4);
            smoothScrollToPositionFromTop(i2, i3);
            r3.A03(0);
        }
    }

    public boolean A0C() {
        return getLastVisiblePosition() >= (getHeaderViewsCount() + getConversationCursorAdapter().getCount()) - 1 && getChildCount() != 0 && getChildAt(getChildCount() - 1).getBottom() == getHeight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = getSelectedView();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r1 = r3.getKeyCode()
            r0 = 23
            if (r1 != r0) goto L_0x0013
            android.view.View r0 = r2.getSelectedView()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.dispatchKeyEvent(r3)
            return r0
        L_0x0013:
            boolean r0 = super.dispatchKeyEvent(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.ConversationListView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A0B;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public int getAdjustedVisibleItemCount() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(getChildCount() - 1);
        if (childAt instanceof AnonymousClass2Ul) {
            return 0 + (((C30011bb) childAt).getMessageCount() - 1);
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if ((r3 instanceof X.C48952Qa) != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C48952Qa getConversationCursorAdapter() {
        /*
            r4 = this;
            android.widget.ListAdapter r3 = r4.getAdapter()
            r2 = 0
            r1 = 1
            if (r3 != 0) goto L_0x000f
            r1 = 0
            java.lang.String r0 = "adapter should be NonNull"
        L_0x000b:
            X.AnonymousClass00B.A0B(r0, r1)
            return r2
        L_0x000f:
            boolean r0 = r3 instanceof X.C48952Qa
            if (r0 != 0) goto L_0x0027
            boolean r0 = r3 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x002a
            android.widget.HeaderViewListAdapter r3 = (android.widget.HeaderViewListAdapter) r3
            android.widget.ListAdapter r3 = r3.getWrappedAdapter()
            if (r3 != 0) goto L_0x0023
            java.lang.String r0 = "wrapped adapter should be NonNull"
            goto L_0x000b
        L_0x0023:
            boolean r0 = r3 instanceof X.C48952Qa
            if (r0 == 0) goto L_0x002a
        L_0x0027:
            X.2Qa r3 = (X.C48952Qa) r3
            return r3
        L_0x002a:
            java.lang.String r1 = "Unknown adapter type"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversation.ConversationListView.getConversationCursorAdapter():X.2Qa");
    }

    public int getDefaultDividerOffset() {
        Point point = new Point();
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getSize(point);
        return (point.y - (getResources().getDimensionPixelSize(R.dimen.dimen0430) << 1)) / 5;
    }

    public int getFirstPosition() {
        int firstVisiblePosition = getFirstVisiblePosition() - getHeaderViewsCount();
        for (int i2 = 1; i2 < getChildCount(); i2++) {
            firstVisiblePosition = (getFirstVisiblePosition() + i2) - getHeaderViewsCount();
            if (getChildAt(i2).getTop() >= getResources().getDimensionPixelSize(R.dimen.dimen0277)) {
                break;
            }
        }
        return firstVisiblePosition;
    }

    public void onInitializeAccessibilityNodeInfoForItem(View view, int i2, AccessibilityNodeInfo accessibilityNodeInfo) {
        ListAdapter adapter = getAdapter();
        if (i2 != -1 && adapter != null) {
            if (i2 >= adapter.getCount()) {
                StringBuilder sb = new StringBuilder("conversationvistview/onInitializeAccessibilityNodeInfoForItem pos:");
                sb.append(i2);
                sb.append(" count:");
                sb.append(adapter.getCount());
                Log.w(sb.toString());
                return;
            }
            super.onInitializeAccessibilityNodeInfoForItem(view, i2, accessibilityNodeInfo);
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        C30011bb r1;
        C86364Sk r4 = this.A04;
        r4.A01();
        int childCount = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount) {
                r1 = null;
                break;
            }
            View childAt = getChildAt(i6);
            if (childAt.isPressed() && (childAt instanceof C30011bb)) {
                r1 = (C30011bb) childAt;
                r1.A1j = true;
                break;
            }
            i6++;
        }
        super.onLayout(z2, i2, i3, i4, i5);
        if (r1 != null) {
            r1.A1j = false;
        }
        r4.A00();
    }

    public void onMeasure(int i2, int i3) {
        if (getTranscriptMode() == 2) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if ((mode == Integer.MIN_VALUE || mode == 1073741824) && size == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(1, mode);
            }
        }
        super.onMeasure(i2, i3);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        C64073Mq r2 = (C64073Mq) parcelable;
        super.onRestoreInstanceState(r2.getSuperState());
        this.A0H = r2.A02;
        this.A01 = r2.A00;
        this.A02 = r2.A01;
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        C64073Mq r1 = new C64073Mq(super.onSaveInstanceState());
        r1.A02 = this.A0H;
        r1.A00 = this.A01;
        r1.A01 = this.A02;
        return r1;
    }

    public void setScrollToBottom(boolean z2) {
        this.A0I = z2;
    }

    public void setScrollToTop(boolean z2) {
        this.A0J = z2;
    }
}
