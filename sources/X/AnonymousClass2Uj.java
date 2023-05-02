package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxIListenerShape108S0200000_2_I0;
import com.facebook.redex.IDxTRendererShape198S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.ConversationRowMediaControlView;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Uj  reason: invalid class name */
public class AnonymousClass2Uj extends AnonymousClass2Ul {
    public int A00 = 0;
    public C49612Uh A01 = new C49612Uh(this);
    public AnonymousClass1HE A02;
    public C209212c A03;
    public C26691Ot A04;
    public List A05;
    public boolean A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public final TextView A09 = ((TextView) findViewById(R.id.more));
    public final AnonymousClass25V A0A = new IDxTRendererShape198S0100000_2_I0(this, 0);
    public final C34331k5 A0B = new ViewOnClickCListenerShape1S0100000_I0_1(this, 22);
    public final C34331k5 A0C = new ViewOnClickCListenerShape1S0100000_I0_1(this, 24);
    public final C34331k5 A0D = new ViewOnClickCListenerShape1S0100000_I0_1(this, 23);
    public final C33741j5 A0E;
    public final ArrayList A0F;

    public AnonymousClass2Uj(Context context, AnonymousClass1YG r9, C16730tY r10) {
        super(context, r9, r10);
        A0g();
        ArrayList arrayList = new ArrayList();
        this.A0F = arrayList;
        boolean z2 = false;
        arrayList.add(new AnonymousClass39F(findViewById(R.id.thumb_0), this, 0));
        arrayList.add(new AnonymousClass39F(findViewById(R.id.thumb_1), this, 1));
        arrayList.add(new AnonymousClass39F(findViewById(R.id.thumb_2), this, 2));
        arrayList.add(new AnonymousClass39F(findViewById(R.id.thumb_3), this, 3));
        AnonymousClass00B.A0B("wrong number of views", 4 == arrayList.size() ? true : z2);
        C33741j5 r1 = new C33741j5(C004601z.A0E(this, R.id.media_control));
        this.A0E = r1;
        r1.A05(new IDxIListenerShape108S0200000_2_I0(this, 0, r10));
        A0c(true);
    }

    private void A0c(boolean z2) {
        ArrayList arrayList;
        AnonymousClass013 r6;
        int i2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        if (this.A05 != null) {
            if (z2) {
                C33741j5 r1 = this.A0E;
                if (r1.A01 != null) {
                    ((ConversationRowMediaControlView) r1.A02()).A02.setTag((Object) null);
                }
            }
            int i3 = 0;
            do {
                arrayList = this.A0F;
                AnonymousClass39F r62 = (AnonymousClass39F) arrayList.get(i3);
                C16740tZ r11 = (C16740tZ) this.A05.get(i3);
                AnonymousClass2Uj r7 = r62.A06;
                if (C34321k4.A03(r7.A0M) && 1 == r11.A06() && r62.A00 == null) {
                    ImageView imageView4 = new ImageView(r7.getContext());
                    r62.A00 = imageView4;
                    r62.A00(imageView4, R.string.str0bf9, r7.getResources().getDimensionPixelSize(R.dimen.dimen076f));
                    ImageView imageView5 = r62.A00;
                    boolean isEmpty = TextUtils.isEmpty(((C16730tY) r7.A0O).A13());
                    Context context = r7.getContext();
                    int i4 = R.color.color0553;
                    if (isEmpty) {
                        i4 = R.color.color090b;
                    }
                    imageView5.setImageDrawable(AnonymousClass2SR.A02(context, R.drawable.keep, i4));
                    ImageView imageView6 = r62.A01;
                    ViewGroup viewGroup = r62.A02;
                    ImageView imageView7 = r62.A00;
                    if (imageView6 != null) {
                        viewGroup.addView(imageView7, 1);
                    } else {
                        viewGroup.addView(imageView7, 0);
                    }
                    viewGroup.setClipChildren(false);
                }
                boolean z3 = true;
                if (1 != r11.A06()) {
                    z3 = false;
                }
                if (!z3 || (imageView3 = r62.A00) == null) {
                    ImageView imageView8 = r62.A00;
                    if (imageView8 != null) {
                        imageView8.setVisibility(8);
                    }
                } else {
                    imageView3.setVisibility(0);
                }
                if (r11.A0x && r62.A01 == null) {
                    ImageView imageView9 = new ImageView(r7.getContext());
                    r62.A01 = imageView9;
                    r62.A00(imageView9, R.string.str1675, r7.getResources().getDimensionPixelSize(R.dimen.dimen076f));
                    r62.A01.setImageDrawable(AnonymousClass00T.A04(r7.getContext(), R.drawable.message_star_media));
                    ViewGroup viewGroup2 = r62.A02;
                    viewGroup2.addView(r62.A01, 0);
                    viewGroup2.setClipChildren(false);
                }
                if (!r11.A0x || (imageView2 = r62.A01) == null) {
                    ImageView imageView10 = r62.A01;
                    if (imageView10 != null) {
                        imageView10.setVisibility(8);
                    }
                } else {
                    imageView2.setVisibility(0);
                }
                TextView textView = r62.A05;
                textView.setText(C47672Jx.A00(r7.A0K, r7.A0r.A02(r11.A0I)));
                r7.A17(textView, r11, R.drawable.broadcast_status_icon_onmedia);
                C25791Ld r9 = r7.A1d;
                ImageView imageView11 = r62.A03;
                AnonymousClass25V r12 = r7.A0A;
                StringBuilder sb = new StringBuilder("album-");
                C28381Vw r13 = r11.A11;
                sb.append(r13);
                r9.A0A(imageView11, r11, r12, sb.toString(), 100, false, false);
                if (r13.A02 && (imageView = r62.A04) != null) {
                    int i5 = r11.A0C;
                    boolean A022 = C42881yp.A02(i5, 13);
                    int bubbleTick = yo.getBubbleTick("message_got_read_receipt_from_target_onmedia");
                    if (!A022) {
                        boolean A023 = C42881yp.A02(i5, 5);
                        bubbleTick = yo.getBubbleTick("message_got_receipt_from_target_onmedia");
                        if (!A023) {
                            bubbleTick = yo.getBubbleTick("message_unsent_onmedia");
                            if (i5 == 4) {
                                bubbleTick = yo.getBubbleTick("message_got_receipt_from_server_onmedia");
                            }
                        }
                    }
                    imageView.setImageResource(bubbleTick);
                }
                C004601z.A0n(imageView11, C47612Jr.A04(r13.toString()));
                C004601z.A0n(textView, C47612Jr.A03(r11));
                ImageView imageView12 = r62.A04;
                if (imageView12 != null) {
                    StringBuilder sb2 = new StringBuilder("status-transition-");
                    sb2.append(r13);
                    C004601z.A0n(imageView12, sb2.toString());
                }
                i3++;
            } while (i3 < 4);
            AnonymousClass39F r14 = (AnonymousClass39F) arrayList.get(3);
            if (this.A05.size() > arrayList.size()) {
                TextView textView2 = this.A09;
                textView2.setVisibility(0);
                textView2.setText(getContext().getString(R.string.str12ae, new Object[]{Integer.valueOf((this.A05.size() - arrayList.size()) + 1)}));
                r14.A05.setVisibility(8);
                ImageView imageView13 = r14.A04;
                if (imageView13 != null) {
                    imageView13.setVisibility(8);
                }
                int size = this.A05.size() - 4;
                ImageView imageView14 = r14.A03;
                AnonymousClass2JP.A03(imageView14, R.string.str0096);
                imageView14.setContentDescription(this.A0K.A0J(new Object[]{Integer.valueOf(size)}, R.plurals.plurals00f2, (long) size));
            } else {
                this.A09.setVisibility(8);
                r14.A05.setVisibility(0);
                ImageView imageView15 = r14.A04;
                if (imageView15 != null) {
                    imageView15.setVisibility(0);
                }
                ImageView imageView16 = r14.A03;
                imageView16.setContentDescription(getContext().getString(R.string.str0095));
                AnonymousClass2JP.A01(imageView16);
            }
            List list = this.A05;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C16750ta r0 = ((C16730tY) it.next()).A02;
                    AnonymousClass00B.A06(r0);
                    if (r0.A0Z) {
                        C33741j5 r2 = this.A0E;
                        r2.A03(0);
                        AnonymousClass2Q7.A0d((ConversationRowMediaControlView) r2.A02(), true, !z2);
                        C33741j5 r02 = ((ConversationRowMediaControlView) r2.A02()).A04;
                        C34331k5 r15 = this.A0B;
                        r02.A04(r15);
                        ((ConversationRowMediaControlView) r2.A02()).A00.setOnClickListener(r15);
                        ((ConversationRowMediaControlView) r2.A02()).A05.A04(r15);
                        break;
                    }
                }
                A0x();
            }
            List list2 = this.A05;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C16750ta r03 = ((C16730tY) it2.next()).A02;
                    AnonymousClass00B.A06(r03);
                    if (!r03.A0P) {
                        C33741j5 r8 = this.A0E;
                        r8.A03(0);
                        AnonymousClass2Q7.A0d((ConversationRowMediaControlView) r8.A02(), false, !z2);
                        int i6 = 0;
                        int i7 = 0;
                        for (C16730tY r22 : this.A05) {
                            C16750ta r16 = r22.A02;
                            AnonymousClass00B.A06(r16);
                            if (!r16.A0P && !r16.A0Z) {
                                if (C38621r6.A0z(r22)) {
                                    i7++;
                                }
                                i6++;
                            }
                        }
                        if (i6 != i7) {
                            ((ConversationRowMediaControlView) r8.A02()).A03.setVisibility(8);
                            ConversationRowMediaControlView conversationRowMediaControlView = (ConversationRowMediaControlView) r8.A02();
                            String string = getContext().getString(R.string.str146a);
                            C34331k5 r3 = this.A0D;
                            C18450wi.A0H(string, 0);
                            C18450wi.A0H(r3, 3);
                            TextView textView3 = conversationRowMediaControlView.A02;
                            textView3.setText(string);
                            AnonymousClass04h.A08(textView3, R.style.style012b);
                            conversationRowMediaControlView.A01.setImageResource(R.drawable.btn_upload_dark);
                            conversationRowMediaControlView.A00.setOnClickListener(r3);
                        } else {
                            this.A00 = 0;
                            this.A08 = false;
                            this.A07 = false;
                            long j2 = 0;
                            ArrayList arrayList2 = new ArrayList();
                            for (C16730tY r10 : this.A05) {
                                C16750ta r5 = r10.A02;
                                AnonymousClass00B.A06(r5);
                                if (!r5.A0P && !r5.A0Z) {
                                    arrayList2.add(r10);
                                    this.A00++;
                                    j2 += r10.A01;
                                    boolean z4 = this.A07;
                                    byte b2 = r10.A10;
                                    boolean z5 = false;
                                    if (b2 == 1) {
                                        z5 = true;
                                    }
                                    this.A07 = z4 | z5;
                                    boolean z6 = this.A08;
                                    boolean z7 = false;
                                    if (b2 == 3) {
                                        z7 = true;
                                    }
                                    this.A08 = z7 | z6;
                                }
                            }
                            ((ConversationRowMediaControlView) r8.A02()).A02.setTag(arrayList2);
                            ConversationRowMediaControlView conversationRowMediaControlView2 = (ConversationRowMediaControlView) r8.A02();
                            C34331k5 r102 = this.A0C;
                            C18450wi.A0H(r102, 3);
                            TextView textView4 = conversationRowMediaControlView2.A02;
                            textView4.setText("");
                            AnonymousClass04h.A08(textView4, R.style.style012a);
                            conversationRowMediaControlView2.A01.setImageResource(R.drawable.btn_download_dark);
                            conversationRowMediaControlView2.A00.setOnClickListener(r102);
                            A18(((ConversationRowMediaControlView) r8.A02()).A02, arrayList2, j2);
                            int i8 = this.A00;
                            if (i8 == 0) {
                                ((ConversationRowMediaControlView) r8.A02()).A03.setVisibility(8);
                            } else {
                                if (!this.A07) {
                                    r6 = this.A0K;
                                    i2 = R.plurals.plurals00f5;
                                } else {
                                    boolean z8 = this.A08;
                                    r6 = this.A0K;
                                    i2 = R.plurals.plurals00f0;
                                    if (!z8) {
                                        i2 = R.plurals.plurals00f2;
                                    }
                                }
                                String A0J = r6.A0J(new Object[]{Integer.valueOf(i8)}, i2, (long) i8);
                                C18450wi.A0H(A0J, 0);
                                TextView textView5 = ((ConversationRowMediaControlView) r8.A02()).A03;
                                textView5.setText(A0J);
                                textView5.setVisibility(0);
                            }
                        }
                    }
                }
            }
            C33741j5 r17 = this.A0E;
            if (r17.A01 != null) {
                r17.A03(8);
                AnonymousClass2Q7.A0d((ConversationRowMediaControlView) r17.A02(), false, false);
            }
            A0x();
        }
    }

    public void A0g() {
        if (!this.A06) {
            this.A06 = true;
            C52652eD r2 = (C52652eD) ((C52642eC) generatedComponent());
            C16150sX r1 = r2.A07;
            this.A0M = (C14710pd) r1.A05.get();
            this.A0P = (AnonymousClass1PD) r1.AEP.get();
            this.A0F = (C16300so) r1.A5p.get();
            this.A0N = (AnonymousClass1P7) r1.ADc.get();
            this.A0J = (AnonymousClass01V) r1.AOi.get();
            this.A0K = (AnonymousClass013) r1.AR8.get();
            this.A0Q = C16150sX.A19(r1);
            this.A0L = (C26101Mi) r1.AQU.get();
            this.A0G = (AnonymousClass1L8) r1.A5W.get();
            this.A0r = (C16440t3) r1.AP2.get();
            this.A0J = (C14870pt) r1.AB3.get();
            this.A1D = (C19990zK) r1.AEZ.get();
            this.A1c = (C17110uY) r1.ADT.get();
            this.A1e = (C16320sq) r1.ARB.get();
            this.A0L = (C16040sK) r1.ADr.get();
            this.A0p = (C25801Le) r1.AFa.get();
            this.A0M = (AnonymousClass10X) r1.ALc.get();
            this.A0O = (C17130ua) r1.AN9.get();
            this.A0u = (C15810rt) r1.A43.get();
            this.A19 = (C17250um) r1.A7e.get();
            this.A0N = (C15900s5) r1.ALm.get();
            this.A1a = (C216014s) r1.AMr.get();
            this.A14 = (AnonymousClass11G) r1.ANN.get();
            this.A0R = (C16760tb) r1.APV.get();
            this.A0W = (C204310c) r1.A3O.get();
            C49132Rg r3 = r2.A05;
            this.A1A = r3.A0I();
            this.A0K = (C17090uW) r1.ADM.get();
            this.A1R = (C211613a) r1.A1E.get();
            this.A1C = (C18210wK) r1.AE4.get();
            this.A0I = (C19980zJ) r1.A0P.get();
            this.A0e = (C17200uh) r1.A52.get();
            this.A11 = (C18550ws) r1.ADB.get();
            this.A1F = (C17190ug) r1.AEu.get();
            this.A0a = (C16000sG) r1.A4x.get();
            this.A0U = (C25821Lg) r1.AMI.get();
            this.A0d = (C16080sP) r1.AQ9.get();
            this.A1Z = (C17220uj) r1.A9x.get();
            this.A1T = (C26721Ow) r1.A7o.get();
            this.A12 = (C26081Mg) r1.AIY.get();
            this.A0f = (C23181Au) r1.A53.get();
            this.A0g = (C25831Lh) r1.A5Q.get();
            this.A0w = (C16460t6) r1.A5k.get();
            this.A0V = (AnonymousClass01Y) r1.A1w.get();
            this.A1B = (C17240ul) r1.ABK.get();
            this.A1E = (C222717h) r1.AC3.get();
            this.A1V = new C25781Lc();
            this.A1P = (C27121Qn) r1.A1H.get();
            this.A10 = (AnonymousClass10B) r1.AD5.get();
            this.A1U = r1.A1d();
            this.A1d = (C25791Ld) r1.AFY.get();
            this.A1I = (C26701Ou) r1.AGb.get();
            this.A1S = (AnonymousClass1RU) r1.AEd.get();
            this.A15 = (AnonymousClass119) r1.APO.get();
            this.A0S = (C18640x1) r1.A3X.get();
            this.A16 = (AnonymousClass15G) r1.AEe.get();
            this.A17 = (C16500tA) r1.AMF.get();
            this.A1b = (AnonymousClass135) r1.AP7.get();
            this.A0c = (C17030uP) r1.APp.get();
            this.A0t = (C15860rz) r1.AQh.get();
            this.A0Y = (C17230uk) r1.A4I.get();
            this.A0x = (C27531Sc) r1.A7X.get();
            this.A1H = r1.A1Y();
            this.A1O = (C26141Mm) r1.A10.get();
            this.A0T = (C17170ue) r1.A3W.get();
            this.A1W = (AnonymousClass1MF) r1.ANa.get();
            this.A1J = (C227919h) r1.AH8.get();
            this.A0b = C16150sX.A0O(r1);
            this.A0z = (C16070sO) r1.ABY.get();
            this.A0h = (AnonymousClass2a9) r3.A0F.get();
            this.A13 = (AnonymousClass186) r1.AJI.get();
            this.A1N = (C17020u3) r1.AMG.get();
            this.A1X = (C50772aQ) r3.A02.get();
            this.A0Z = (C18260wP) r1.A4p.get();
            this.A1Q = r3.A0c();
            this.A0v = (C216114t) r1.A5O.get();
            this.A0y = (AnonymousClass188) r1.A8P.get();
            this.A0j = (AnonymousClass1LA) r1.AIg.get();
            this.A1Y = (C27651Sp) r1.ANj.get();
            this.A1G = (AnonymousClass1L9) r1.AFI.get();
            this.A0X = (AnonymousClass1SN) r1.AD0.get();
            this.A0i = (AnonymousClass1MY) r1.AIf.get();
            this.A0s = (C17120uZ) r1.AQT.get();
            this.A0q = C16150sX.A0S(r1);
            this.A1L = (AnonymousClass1DY) r1.A3w.get();
            this.A0n = r2.A02();
            this.A1K = (C18290wS) r1.AIB.get();
            this.A18 = (C18030w2) r1.A6W.get();
            this.A03 = (C209212c) r1.AE1.get();
            this.A04 = (C26691Ot) r1.AE5.get();
            this.A02 = (AnonymousClass1HE) r1.ALb.get();
        }
    }

    public void A0i(C28381Vw r4) {
        super.A0i(r4);
        List list = this.A05;
        if (list != null) {
            int i2 = 0;
            Iterator it = list.iterator();
            while (it.hasNext() && !r4.equals(((C16740tZ) it.next()).A11)) {
                i2++;
            }
            Intent A1O = A1O();
            if (C455529g.A00) {
                A1O.putExtra("start_index", i2);
            }
            getContext().startActivity(A1O);
        }
    }

    public void A0t() {
        A0c(false);
        A1J(false);
    }

    public void A1G(C16740tZ r2, boolean z2) {
        super.A1G(this.A0O, z2);
        if (z2) {
            A0c(false);
        }
    }

    public void A1N(List list, boolean z2) {
        boolean z3 = false;
        if (this.A0O != list.get(0)) {
            z3 = true;
        }
        if (!z2) {
            List list2 = this.A05;
            if (list2 != null && list2.size() == list.size()) {
                int i2 = 0;
                while (true) {
                    if (i2 < list.size()) {
                        if (this.A05.get(i2) != list.get(i2)) {
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
            z2 = true;
        }
        this.A05 = list;
        super.A1G((C16740tZ) list.get(0), z2);
        if (z3 || z2) {
            A0c(z3);
        }
    }

    public final Intent A1O() {
        C15830rv r3;
        long[] jArr = new long[this.A05.size()];
        for (int i2 = 0; i2 < this.A05.size(); i2++) {
            jArr[i2] = ((C16740tZ) this.A05.get(i2)).A13;
        }
        C16740tZ r2 = this.A0O;
        C28381Vw r1 = r2.A11;
        if (!r1.A02) {
            C15830rv r12 = r1.A00;
            if (!C16030sJ.A0L(r12) || (r3 = r2.A0B()) == null) {
                r3 = r12;
            }
        } else {
            r3 = null;
        }
        Context context = getContext();
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity");
        intent.putExtra("message_ids", jArr);
        intent.putExtra("jid", C16030sJ.A03(r3));
        return intent;
    }

    public int getCenteredLayoutId() {
        return 0;
    }

    public C16730tY getFMessage() {
        return (C16730tY) this.A0O;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout0172;
    }

    public int getMainChildMaxWidth() {
        return C31171dd.A01(getContext(), 72);
    }

    public int getMaxAlbumSize() {
        return 102;
    }

    public int getMessageCount() {
        List list = this.A05;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public AnonymousClass23T getMessageReactions() {
        List<C16740tZ> list = this.A05;
        if (list == null) {
            return null;
        }
        for (C16740tZ r4 : list) {
            AnonymousClass1RU r3 = this.A1S;
            if (AnonymousClass1RU.A00(r4, (byte) 56)) {
                r3.A05.execute(new RunnableRunnableShape0S0201000_I0(r4, r3));
            } else {
                r3.A03(r4, (Runnable) null, (byte) 56, false, false);
            }
        }
        C16040sK r2 = this.A0L;
        List<C16740tZ> list2 = this.A05;
        AnonymousClass23T r32 = new AnonymousClass23T(r2, Collections.emptyList());
        for (C16740tZ r0 : list2) {
            AnonymousClass23T r02 = r0.A0W;
            if (r02 != null) {
                for (C38541qx A042 : r02.A02()) {
                    r32.A04(A042);
                }
            }
        }
        return r32;
    }

    public int getMinAlbumSize() {
        return 4;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout0173;
    }

    public int getReactionsViewVerticalOverlap() {
        return getResources().getDimensionPixelOffset(R.dimen.dimen0768);
    }

    public int getTopAttributeTextAnchorId() {
        return R.id.media_container;
    }

    public void setFMessage(C16740tZ r2) {
        AnonymousClass00B.A0G(r2 instanceof C16730tY);
        this.A0O = r2;
    }
}
