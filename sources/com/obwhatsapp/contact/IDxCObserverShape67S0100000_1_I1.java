package com.obwhatsapp.contact;

import X.AnonymousClass000;
import X.AnonymousClass12A;
import X.AnonymousClass2Sy;
import X.AnonymousClass3BC;
import X.AnonymousClass3HT;
import X.C101124wk;
import X.C101134wl;
import X.C1042754r;
import X.C13680ns;
import X.C15830rv;
import X.C16010sH;
import X.C16030sJ;
import X.C33481ie;
import X.C56832oa;
import X.C82514Dc;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.obwhatsapp.community.EditCommunityActivity;
import com.obwhatsapp.profile.SetAboutInfo;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IDxCObserverShape67S0100000_1_I1 extends C33481ie {
    public Object A00;
    public final int A01;

    public IDxCObserverShape67S0100000_1_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(C15830rv r8) {
        C82514Dc r0;
        String str;
        C16010sH r02;
        switch (this.A01) {
            case 0:
                Log.i("CallsHistoryDataSource/onProfilePhotoChanged");
                if (r8 != null && (r0 = ((AnonymousClass3BC) this.A00).A01) != null) {
                    CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
                    C16010sH A08 = callsHistoryFragmentV2ViewModel.A0D.A08(r8);
                    if (A08 == null) {
                        str = "CallsHistoryViewModel/onProfilePhotoChanged failed to convert";
                    } else {
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            ArrayList arrayList = callsHistoryFragmentV2ViewModel.A04;
                            if (i3 < arrayList.size()) {
                                C101134wl r6 = (C101134wl) arrayList.get(i3);
                                C1042754r r1 = r6.A00;
                                if (r1 != null && ((r1.A09 && r6.A02 != null && r6.A02.equals(A08)) || (!r1.A09 && r1.A06.contains(A08)))) {
                                    try {
                                        C101134wl r12 = (C101134wl) r6.clone();
                                        C1042754r A02 = CallsHistoryFragmentV2ViewModel.A02(r6, callsHistoryFragmentV2ViewModel);
                                        if (A02 != null) {
                                            r12.A00 = A02;
                                            ArrayList arrayList2 = callsHistoryFragmentV2ViewModel.A04;
                                            arrayList2.remove(i3);
                                            arrayList2.add(i3, r12);
                                        }
                                    } catch (CloneNotSupportedException unused) {
                                        str = "CallsHistoryViewModel/onProfilePhotoChanged failed to clone ongoing call";
                                    }
                                }
                                i3++;
                            } else {
                                while (true) {
                                    ArrayList arrayList3 = callsHistoryFragmentV2ViewModel.A03;
                                    if (i2 < arrayList3.size()) {
                                        C101124wk r3 = (C101124wk) arrayList3.get(i2);
                                        AnonymousClass3HT r13 = r3.A00;
                                        if (r13 != null && ((r13.A0E && r13.A0A.contains(A08)) || (!r13.A0E && (r02 = r13.A05) != null && r02.equals(A08)))) {
                                            try {
                                                C101124wk r14 = (C101124wk) r3.clone();
                                                AnonymousClass3HT A012 = CallsHistoryFragmentV2ViewModel.A01(r14, callsHistoryFragmentV2ViewModel);
                                                if (A012 != null) {
                                                    r14.A00 = A012;
                                                    ArrayList arrayList4 = callsHistoryFragmentV2ViewModel.A03;
                                                    arrayList4.remove(i2);
                                                    arrayList4.add(i2, r14);
                                                }
                                            } catch (CloneNotSupportedException unused2) {
                                                str = "CallsHistoryViewModel/onProfilePhotoChanged failed to clone historical call";
                                            }
                                        }
                                        i2++;
                                    } else {
                                        callsHistoryFragmentV2ViewModel.A06();
                                        C56832oa r15 = callsHistoryFragmentV2ViewModel.A0A;
                                        if (!TextUtils.isEmpty(r15.A00)) {
                                            r15.filter(r15.A00);
                                        }
                                        callsHistoryFragmentV2ViewModel.A05();
                                        return;
                                    }
                                }
                            }
                        }
                    }
                    Log.w(str);
                    callsHistoryFragmentV2ViewModel.A08.A01();
                    return;
                }
                return;
            case 1:
                if (C16030sJ.A0L(r8)) {
                    EditCommunityActivity editCommunityActivity = (EditCommunityActivity) this.A00;
                    if (r8.equals(editCommunityActivity.A07)) {
                        AnonymousClass12A r03 = editCommunityActivity.A03;
                        r03.A05.A04(editCommunityActivity.A06);
                        int dimensionPixelSize = editCommunityActivity.getResources().getDimensionPixelSize(R.dimen.dimen057a);
                        editCommunityActivity.A04.A07(editCommunityActivity.A00, editCommunityActivity.A06, dimensionPixelSize);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void A02(UserJid userJid) {
        if (2 - this.A01 == 0) {
            SetAboutInfo setAboutInfo = (SetAboutInfo) this.A00;
            if (setAboutInfo.A01.A0I(userJid)) {
                String A002 = setAboutInfo.A01.A00();
                if (setAboutInfo.A06) {
                    setAboutInfo.A06 = false;
                    Iterator it = SetAboutInfo.A09.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (AnonymousClass000.A0m(it).equals(A002)) {
                                break;
                            }
                        } else {
                            SetAboutInfo.A09.add(0, A002);
                            break;
                        }
                    }
                    setAboutInfo.A35();
                }
                TextEmojiLabel textEmojiLabel = setAboutInfo.A02;
                textEmojiLabel.setText(AnonymousClass2Sy.A03(textEmojiLabel.getContext(), setAboutInfo.A02.getPaint(), setAboutInfo.A0B, A002));
                setAboutInfo.A04.notifyDataSetInvalidated();
                C13680ns.A15(setAboutInfo.A00, this, 13);
            }
        }
    }

    public void A03(UserJid userJid) {
    }

    public void A05(Collection collection) {
    }

    public void A06(Collection collection) {
        if (this.A01 == 0) {
            Log.i("CallsHistoryDataSource/onContactsChanged");
            C82514Dc r0 = ((AnonymousClass3BC) this.A00).A01;
            if (r0 != null && collection != null) {
                CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = r0.A00;
                synchronized (callsHistoryFragmentV2ViewModel) {
                    callsHistoryFragmentV2ViewModel.A05 = null;
                }
                C56832oa r1 = callsHistoryFragmentV2ViewModel.A0A;
                if (!TextUtils.isEmpty(r1.A00)) {
                    r1.filter(r1.A00);
                }
            }
        }
    }
}
