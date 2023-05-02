package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickCListenerShape5S0200000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.SelectionCheckView;
import com.obwhatsapp.components.button.ThumbnailButton;
import com.obwhatsapp.ui.voip.MultiContactThumbnail;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape1S0200000_I1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2Xf  reason: invalid class name */
public class AnonymousClass2Xf extends AnonymousClass01X {
    public AnonymousClass4DZ A00;
    public C82494Da A01;
    public C82504Db A02;
    public AnonymousClass2Ao A03;
    public AnonymousClass2Ao A04;
    public Runnable A05;
    public ArrayList A06 = new ArrayList();
    public final AnonymousClass4CS A07;
    public final AnonymousClass4CT A08;
    public final AnonymousClass4CV A09;
    public final AnonymousClass4CW A0A;
    public final AnonymousClass4CX A0B;

    public AnonymousClass2Xf(AnonymousClass4CS r2, AnonymousClass4CT r3, AnonymousClass4CV r4, AnonymousClass4CW r5, AnonymousClass4CX r6) {
        this.A07 = r2;
        this.A09 = r4;
        this.A08 = r3;
        this.A0A = r5;
        this.A0B = r6;
    }

    public int A0C() {
        return this.A06.size();
    }

    public void ANf(C005602k r11, int i2) {
        String str;
        String A002;
        StringBuilder sb;
        String str2;
        ArrayList arrayList = this.A06;
        if (i2 >= arrayList.size()) {
            sb = new StringBuilder();
            str2 = "callsHistoryAdapter/onBindViewHolder no item exists at position ";
        } else {
            AnonymousClass5P6 r7 = (AnonymousClass5P6) arrayList.get(i2);
            if (r7 == null) {
                sb = new StringBuilder();
                str2 = "callsHistoryAdapter/onBindViewHolder null item at position ";
            } else {
                i2 = r7.ACu();
                if (i2 != 0) {
                    if (i2 == 1) {
                        C64923Se r112 = (C64923Se) r11;
                        UserJid userJid = ((C101104wi) r7).A00;
                        r112.A00 = userJid;
                        C16010sH A0A2 = r112.A07.A0A(userJid);
                        AnonymousClass2Ao r0 = r112.A08;
                        ThumbnailButton thumbnailButton = r112.A06;
                        r0.A06(thumbnailButton, A0A2);
                        C30521cU r1 = r112.A01;
                        r1.A05();
                        r1.A0D(A0A2, (List) null);
                        r1.A02.setSingleLine(true);
                        r112.A03.setOnClickListener(new ViewOnClickCListenerShape5S0200000_I1((Object) r112, 26, (Object) A0A2));
                        r112.A02.setOnClickListener(new ViewOnClickCListenerShape5S0200000_I1((Object) r112, 27, (Object) A0A2));
                        if (r112.A04 == null) {
                            str = "CallsHistoryContactItemViewHolder/setEventListeners event listener empty";
                        } else {
                            r112.A0H.setOnClickListener(new ViewOnClickCListenerShape5S0200000_I1((Object) r112, 28, (Object) userJid));
                            thumbnailButton.setOnClickListener(new ViewOnClickCListenerShape1S0200000_I1(userJid, 26, r112));
                            return;
                        }
                    } else if (i2 == 2) {
                        C57712rd r113 = (C57712rd) r11;
                        C101124wk r72 = (C101124wk) r7;
                        r113.A00 = r72;
                        AnonymousClass3HT r5 = r72.A00;
                        AnonymousClass00B.A06(r5);
                        ThumbnailButton thumbnailButton2 = r113.A0B;
                        C004601z.A0n(thumbnailButton2, r5.A08);
                        boolean z2 = r5.A0E;
                        C30521cU r2 = r113.A02;
                        TextEmojiLabel textEmojiLabel = r2.A02;
                        textEmojiLabel.setSingleLine(!z2);
                        MultiContactThumbnail multiContactThumbnail = r113.A0G;
                        if (z2) {
                            multiContactThumbnail.setVisibility(0);
                            thumbnailButton2.setVisibility(8);
                            textEmojiLabel.setMaxLines(2);
                            AnonymousClass2Wj r12 = r5.A06;
                            AnonymousClass00B.A06(r12);
                            r2.A0F((List) null, r12.A00(r113.A0H.getContext()));
                            List list = r5.A0A;
                            multiContactThumbnail.A00(AnonymousClass3A7.A00, r113.A0E, list);
                        } else {
                            multiContactThumbnail.setVisibility(8);
                            thumbnailButton2.setVisibility(0);
                            C16010sH r13 = r5.A05;
                            AnonymousClass00B.A06(r13);
                            r113.A0F.A06(thumbnailButton2, r13);
                            r2.A0D(r13, new ArrayList());
                        }
                        r113.A08.setText(r5.A07);
                        int i3 = r5.A00;
                        if (i3 > 1) {
                            WaTextView waTextView = r113.A06;
                            waTextView.setText(r113.A0H.getContext().getString(r5.A01, new Object[]{Integer.valueOf(i3)}));
                            waTextView.setVisibility(0);
                        } else {
                            r113.A06.setVisibility(8);
                        }
                        WaImageView waImageView = r113.A03;
                        waImageView.setImageResource(r5.A03);
                        View view = r113.A0H;
                        AnonymousClass2SR.A08(waImageView, AnonymousClass00T.A00(view.getContext(), r5.A04));
                        waImageView.setContentDescription(view.getContext().getString(r5.A02));
                        WaTextView waTextView2 = r113.A07;
                        if (waTextView2 != null) {
                            int i4 = 8;
                            if (r5.A0F) {
                                i4 = 0;
                            }
                            waTextView2.setVisibility(i4);
                        }
                        boolean z3 = r5.A0C;
                        WaImageView waImageView2 = r113.A05;
                        C62043Bk.A05(waImageView2, z3);
                        WaImageView waImageView3 = r113.A04;
                        C62043Bk.A05(waImageView3, z3);
                        if (r5.A0D) {
                            waImageView3.setVisibility(0);
                            waImageView2.setVisibility(8);
                        } else {
                            waImageView3.setVisibility(8);
                            waImageView2.setVisibility(0);
                        }
                        C55352jN.A00(view);
                        view.setSelected(false);
                        SelectionCheckView selectionCheckView = r113.A0A;
                        selectionCheckView.A04(false, true);
                        selectionCheckView.setVisibility(8);
                        return;
                    } else if (i2 == 3) {
                        C64953Sh r114 = (C64953Sh) r11;
                        C101134wl r73 = (C101134wl) r7;
                        r114.A00 = r73;
                        C616739v r02 = r73.A01;
                        C1042754r r8 = r73.A00;
                        ArrayList arrayList2 = r02.A04;
                        if (arrayList2.isEmpty()) {
                            str = "CallsHistoryOngoingJoinableCallViewHolder/bindCall no calls registered";
                        } else if (r8 == null) {
                            str = "CallsHistoryOngoingJoinableCallViewHolder/bindCall no view state registered";
                        } else {
                            C37831po r3 = (C37831po) Collections.unmodifiableList(arrayList2).get(0);
                            boolean z4 = r8.A09;
                            MultiContactThumbnail multiContactThumbnail2 = r114.A09;
                            int i5 = 8;
                            int i6 = 0;
                            if (z4) {
                                i6 = 8;
                            }
                            multiContactThumbnail2.setVisibility(i6);
                            ThumbnailButton thumbnailButton3 = r114.A06;
                            if (z4) {
                                i5 = 0;
                            }
                            thumbnailButton3.setVisibility(i5);
                            if (z4) {
                                AnonymousClass2Ao r14 = r114.A08;
                                C16010sH r03 = r73.A02;
                                AnonymousClass00B.A06(r03);
                                r14.A06(thumbnailButton3, r03);
                            } else if (r8.A06.size() != 0) {
                                List list2 = r8.A06;
                                multiContactThumbnail2.A00(AnonymousClass3A7.A00, r114.A07, list2);
                            }
                            View view2 = r114.A0H;
                            Context context = view2.getContext();
                            if (r3.A04().size() == 0) {
                                A002 = context.getString(r8.A04);
                            } else {
                                AnonymousClass2Wj r04 = r8.A05;
                                AnonymousClass00B.A06(r04);
                                A002 = r04.A00(context);
                            }
                            C30521cU r9 = r114.A02;
                            r9.A0F(new ArrayList(), A002);
                            r114.A03.setImageResource(r8.A00);
                            r114.A04.setText(r8.A03);
                            int i7 = r8.A02;
                            int i8 = r8.A01;
                            C62043Bk.A04(view2, context.getString(i7, new Object[]{r9.A02.getText()}), context.getString(i8));
                            if (r114.A05 == null) {
                                Log.w("CallsHistoryOngoingJoinableCallViewHolder/setEventListeners event listener empty");
                            } else {
                                view2.setOnClickListener(new ViewOnClickCListenerShape5S0200000_I1((Object) r114, 29, (Object) r3));
                            }
                            C55352jN.A00(view2);
                            return;
                        }
                    } else if (i2 != 4 && i2 != 5) {
                        sb = new StringBuilder("callsHistoryAdapter/onBindViewHolder failed to match type to bind: ");
                        sb.append(i2);
                        str = sb.toString();
                    } else {
                        return;
                    }
                    Log.w(str);
                }
                C64673Rf r115 = (C64673Rf) r11;
                int i9 = ((C101114wj) r7).A00;
                WaTextView waTextView3 = r115.A00;
                AnonymousClass1UP.A06(waTextView3);
                waTextView3.setText(r115.A0H.getContext().getString(i9));
                return;
            }
        }
        sb.append(str2);
        sb.append(i2);
        str = sb.toString();
        Log.w(str);
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        Context context = viewGroup.getContext();
        if (i2 == 0) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.layout00e1, viewGroup, false);
            inflate.setEnabled(false);
            return new C64673Rf(inflate);
        } else if (i2 == 1) {
            boolean A022 = C15450qv.A02();
            int i3 = R.layout.layout00e0;
            if (A022) {
                i3 = R.layout.layout00df;
            }
            View inflate2 = LayoutInflater.from(context).inflate(i3, viewGroup, false);
            AnonymousClass4CT r0 = this.A08;
            AnonymousClass2Ao r8 = this.A04;
            AnonymousClass00B.A07(r8, "single contact photo loader null");
            AnonymousClass4DZ r4 = this.A00;
            C16150sX r1 = r0.A00.A04;
            return new C64923Se(inflate2, r4, (C204310c) r1.A3O.get(), (C16000sG) r1.A4x.get(), (C16080sP) r1.AQ9.get(), r8, (AnonymousClass013) r1.AR8.get(), new C25781Lc());
        } else if (i2 == 2) {
            boolean A023 = C15450qv.A02();
            int i4 = R.layout.layout00e0;
            if (A023) {
                i4 = R.layout.layout00df;
            }
            View inflate3 = LayoutInflater.from(context).inflate(i4, viewGroup, false);
            AnonymousClass4CS r02 = this.A07;
            AnonymousClass2Ao r9 = this.A04;
            AnonymousClass00B.A07(r9, "single contact photo loader null");
            AnonymousClass2Ao r82 = this.A03;
            AnonymousClass00B.A07(r82, "multi contact photo loader null");
            C82504Db r5 = this.A02;
            C16150sX r12 = r02.A00.A04;
            return new C57712rd(inflate3, r5, (C16000sG) r12.A4x.get(), (C16080sP) r12.AQ9.get(), r82, r9, (AnonymousClass013) r12.AR8.get(), new C25781Lc());
        } else if (i2 == 3) {
            View inflate4 = LayoutInflater.from(context).inflate(R.layout.layout0375, viewGroup, false);
            AnonymousClass4CX r03 = this.A0B;
            AnonymousClass2Ao r7 = this.A04;
            AnonymousClass00B.A07(r7, "single contact photo loader null");
            AnonymousClass2Ao r83 = this.A03;
            AnonymousClass00B.A07(r83, "multi contact photo loader null");
            C82494Da r52 = this.A01;
            C16150sX r13 = r03.A00.A04;
            return new C64953Sh(inflate4, r52, (C16080sP) r13.AQ9.get(), r7, r83, (AnonymousClass013) r13.AR8.get(), new C25781Lc());
        } else if (i2 == 4) {
            View inflate5 = LayoutInflater.from(context).inflate(R.layout.layout01fe, viewGroup, false);
            C16150sX r14 = this.A09.A00.A04;
            return new AnonymousClass3RT(inflate5, (C14870pt) r14.AB3.get(), (C18260wP) r14.A4p.get());
        } else if (i2 == 5) {
            View inflate6 = LayoutInflater.from(context).inflate(R.layout.layout0248, viewGroup, false);
            AnonymousClass4CW r15 = this.A0A;
            Runnable runnable = this.A05;
            AnonymousClass00B.A07(runnable, "callsHistoryAdapter/onCreateViewHolder no E2E runnable");
            return new AnonymousClass3RU(inflate6, (C17110uY) r15.A00.A04.ADT.get(), runnable);
        } else {
            StringBuilder sb = new StringBuilder("callsHistoryAdapter/onCreateViewHolder failed to match type to view: ");
            sb.append(i2);
            Log.e(sb.toString());
            throw new RuntimeException("callsHistoryAdapter/onCreateViewHolder type mismatch");
        }
    }

    public int getItemViewType(int i2) {
        return ((AnonymousClass5P6) this.A06.get(i2)).ACu();
    }
}
