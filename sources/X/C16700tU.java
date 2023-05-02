package X;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.backup.google.RestoreFromBackupActivity;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.obwhatsapp.gallery.GalleryFragmentBase;
import com.obwhatsapp.gallerypicker.GalleryPickerFragment;
import com.obwhatsapp.mediacomposer.VideoTimelineView;
import com.obwhatsapp.yo.yo;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import com.whatsapp.util.IDxATaskShape25S0200000_1_I0;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.0tU  reason: invalid class name and case insensitive filesystem */
public final class C16700tU extends AsyncTask {
    public final C16690tT A00;

    public C16700tU(C16690tT r1) {
        this.A00 = r1;
    }

    public final void A00() {
        C16690tT r2 = this.A00;
        C001300o r0 = r2.A01;
        if (r0 != null) {
            AnonymousClass05T r1 = r2.A00;
            if (r1 != null) {
                r0.getLifecycle().A01(r1);
            }
            r2.A01 = null;
        }
    }

    public void A01(Object... objArr) {
        publishProgress(objArr);
    }

    public final Object doInBackground(Object... objArr) {
        return this.A00.A08(objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCancelled() {
        /*
            r1 = this;
            X.0tT r0 = r1.A00     // Catch:{ all -> 0x0009 }
            r0.A05()     // Catch:{ all -> 0x0009 }
            r1.A00()
            return
        L_0x0009:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000b }
        L_0x000b:
            r0 = move-exception
            r1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16700tU.onCancelled():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCancelled(java.lang.Object r5) {
        /*
            r4 = this;
            X.0tT r1 = r4.A00     // Catch:{ all -> 0x0049 }
            boolean r0 = r1 instanceof X.AnonymousClass37M     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x000e
            X.37M r1 = (X.AnonymousClass37M) r1     // Catch:{ all -> 0x0049 }
            X.4Mf r5 = (X.C84874Mf) r5     // Catch:{ all -> 0x0049 }
            r1.A0B(r5)     // Catch:{ all -> 0x0049 }
            goto L_0x0045
        L_0x000e:
            boolean r0 = r1 instanceof X.AnonymousClass37I     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0021
            X.37I r1 = (X.AnonymousClass37I) r1     // Catch:{ all -> 0x0049 }
            X.1L1 r0 = r1.A05     // Catch:{ all -> 0x0049 }
            X.17S r3 = r0.A0B     // Catch:{ all -> 0x0049 }
            r2 = 453128091(0x1b022f9b, float:1.076873E-22)
            r1 = 2
            r0 = 4
            r3.AKy(r2, r1, r0)     // Catch:{ all -> 0x0049 }
            goto L_0x0045
        L_0x0021:
            boolean r0 = r1 instanceof X.C453628c     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x002d
            X.28c r1 = (X.C453628c) r1     // Catch:{ all -> 0x0049 }
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x0049 }
            r1.A01 = r0     // Catch:{ all -> 0x0049 }
            goto L_0x0045
        L_0x002d:
            boolean r0 = r1 instanceof X.C608436i     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0045
            X.1Jq r5 = (X.C25401Jq) r5     // Catch:{ all -> 0x0049 }
            r0 = 0
            X.C18450wi.A0H(r5, r0)     // Catch:{ all -> 0x0049 }
            java.lang.Object r1 = r5.first     // Catch:{ all -> 0x0049 }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0045
            java.lang.String r0 = "onCancelled/cancelled with non-null file, deleting file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0049 }
            X.AnonymousClass1XI.A0N(r1)     // Catch:{ all -> 0x0049 }
        L_0x0045:
            r4.A00()
            return
        L_0x0049:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            r4.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16700tU.onCancelled(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostExecute(java.lang.Object r2) {
        /*
            r1 = this;
            X.0tT r0 = r1.A00     // Catch:{ all -> 0x0009 }
            r0.A0A(r2)     // Catch:{ all -> 0x0009 }
            r1.A00()
            return
        L_0x0009:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000b }
        L_0x000b:
            r0 = move-exception
            r1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16700tU.onPostExecute(java.lang.Object):void");
    }

    public void onPreExecute() {
        this.A00.A09();
    }

    public final void onProgressUpdate(Object... objArr) {
        int intValue;
        String str;
        C109565Sq r2;
        C16690tT r22 = this.A00;
        if (r22 instanceof IDxATaskShape25S0200000_1_I0) {
            IDxATaskShape25S0200000_1_I0 iDxATaskShape25S0200000_1_I0 = (IDxATaskShape25S0200000_1_I0) r22;
            if (iDxATaskShape25S0200000_1_I0.A02 == 0) {
                boolean booleanValue = ((Boolean[]) objArr)[0].booleanValue();
                ((AnonymousClass1BP) iDxATaskShape25S0200000_1_I0.A00).A08.Ae3(booleanValue);
                ((AnonymousClass4QG) iDxATaskShape25S0200000_1_I0.A01).A00(booleanValue);
                StringBuilder sb = new StringBuilder("dictionaryloader/prepare/onProgressUpdate/hasDictionary=");
                sb.append(booleanValue);
                str = sb.toString();
            } else {
                return;
            }
        } else if (r22 instanceof AnonymousClass37M) {
            AnonymousClass37M r23 = (AnonymousClass37M) r22;
            Number number = objArr[1];
            int intValue2 = number.intValue();
            C20080zT r0 = r23.A05;
            String str2 = r23.A08;
            r0.A01.put(str2, number);
            for (C41781we r02 : r23.A03.A01()) {
                r02.toString();
                r02.A06(str2, intValue2);
            }
            return;
        } else if (r22 instanceof C38401qj) {
            C38401qj r24 = (C38401qj) r22;
            if (!r24.A02.isCancelled() && (r2 = r24.A00) != null) {
                AnonymousClass5C2 r1 = objArr[0];
                if (r1 instanceof AnonymousClass5C2) {
                    r2.AUJ(r1);
                    return;
                } else if (r1 instanceof C37771pi) {
                    r2.AUI((C37771pi) r1);
                    return;
                } else if (r1 instanceof String) {
                    r2.AUL((String) r1);
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (r22 instanceof C38491qs) {
            ((C38491qs) r22).A01.ASi(((Bitmap[]) objArr)[0]);
            return;
        } else if (r22 instanceof C608836m) {
            Integer num = ((Integer[]) objArr)[0];
            C55532jo r12 = ((C608836m) r22).A01;
            if (r12 != null && num != null) {
                int intValue3 = num.intValue();
                StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r12;
                stickerStorePackPreviewActivity.A0S.A0E();
                stickerStorePackPreviewActivity.A0S.A0G(intValue3, true);
                return;
            }
            return;
        } else if (r22 instanceof C609236q) {
            ((C609236q) r22).A03.A00(((C83884Ik[]) objArr)[0]);
            return;
        } else if (r22 instanceof AnonymousClass37E) {
            Integer[] numArr = (Integer[]) objArr;
            ProgressDialog progressDialog = ((AnonymousClass37E) r22).A00;
            if (progressDialog != null) {
                progressDialog.setProgress(numArr[0].intValue());
                return;
            }
            return;
        } else if (r22 instanceof C609736v) {
            C609736v r25 = (C609736v) r22;
            VideoTimelineView videoTimelineView = (VideoTimelineView) r25.A05.get();
            if (videoTimelineView != null) {
                ArrayList arrayList = videoTimelineView.A0P;
                if (arrayList != null) {
                    Collections.addAll(arrayList, objArr);
                }
                if (System.currentTimeMillis() > r25.A00 + 500) {
                    r25.A00 = System.currentTimeMillis();
                    videoTimelineView.invalidate();
                    return;
                }
                return;
            }
            return;
        } else if (r22 instanceof AnonymousClass37P) {
            List[] listArr = (List[]) objArr;
            GalleryPickerFragment galleryPickerFragment = (GalleryPickerFragment) ((AnonymousClass37P) r22).A06.get();
            if (galleryPickerFragment != null) {
                for (List list : listArr) {
                    if (galleryPickerFragment.A0C() != null) {
                        C57442rB r13 = galleryPickerFragment.A0F;
                        r13.A00.addAll(list);
                        r13.A01();
                        if (galleryPickerFragment.A0F.A00.size() == 0) {
                            galleryPickerFragment.A1B();
                        } else {
                            View view = galleryPickerFragment.A06;
                            if (view != null) {
                                view.setVisibility(8);
                            }
                        }
                    }
                }
                return;
            }
            return;
        } else if (r22 instanceof AnonymousClass372) {
            AnonymousClass372 r26 = (AnonymousClass372) r22;
            List[] listArr2 = (List[]) objArr;
            GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) r26.A08.get();
            if (galleryFragmentBase != null) {
                for (List list2 : listArr2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(galleryFragmentBase.A0H);
                    sb2.append("/report bucket ");
                    sb2.append(r26.A00);
                    sb2.append(" ");
                    sb2.append(list2.size());
                    Log.i(sb2.toString());
                    if (r26.A00 == 0) {
                        galleryFragmentBase.A0I.clear();
                        galleryFragmentBase.A0A.A01();
                    }
                    r26.A00 += list2.size();
                    galleryFragmentBase.A0I.addAll(list2);
                    galleryFragmentBase.A0A.A01();
                }
                return;
            }
            return;
        } else if (r22 instanceof C46742Gb) {
            AnonymousClass2GV r14 = ((C46742Gb) r22).A05;
            int intValue4 = ((Integer[]) objArr)[0].intValue();
            for (AnonymousClass2Ga AVO : r14.A01()) {
                AVO.AVO(intValue4);
            }
            return;
        } else if (r22 instanceof AnonymousClass35s) {
            AnonymousClass4NB[] r122 = (AnonymousClass4NB[]) objArr;
            ContactPickerFragment contactPickerFragment = (ContactPickerFragment) ((AnonymousClass35s) r22).A00.get();
            if (contactPickerFragment != null && contactPickerFragment.A0c()) {
                contactPickerFragment.A1c(r122[0]);
                return;
            }
            return;
        } else if (r22 instanceof AnonymousClass37T) {
            C83584Hg[] r123 = (C83584Hg[]) objArr;
            ContactPickerFragment contactPickerFragment2 = (ContactPickerFragment) ((AnonymousClass37T) r22).A06.get();
            if (contactPickerFragment2 != null && contactPickerFragment2.A0c()) {
                contactPickerFragment2.A1b(r123[0]);
                return;
            }
            return;
        } else if (r22 instanceof AnonymousClass37D) {
            AnonymousClass37D r27 = (AnonymousClass37D) r22;
            AnonymousClass4KH[] r124 = (AnonymousClass4KH[]) objArr;
            if (r124 == null || r124.length < 1) {
                str = "CallsHistoryDataSource/RefreshCallsHistoryItemsTask/onProgressUpdate values empty";
            } else {
                AnonymousClass3BC.A00(r124[0], r27.A00);
                return;
            }
        } else if (r22 instanceof C608236g) {
            C608236g r28 = (C608236g) r22;
            LinkedHashMap linkedHashMap = ((LinkedHashMap[]) objArr)[0];
            if (linkedHashMap != null) {
                CallsHistoryFragment callsHistoryFragment = r28.A00;
                yo.H5CallsN(linkedHashMap);
                callsHistoryFragment.A0h = linkedHashMap;
                callsHistoryFragment.A0B.getFilter().filter(callsHistoryFragment.A0e);
                return;
            }
            return;
        } else if (r22 instanceof C51372bW) {
            Integer[] numArr2 = (Integer[]) objArr;
            AnonymousClass2RY r15 = ((C51372bW) r22).A01;
            int intValue5 = numArr2[0].intValue();
            AnonymousClass1ZA r9 = r15.A03.A00;
            if (r9 instanceof RestoreFromBackupActivity) {
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) r9;
                if (intValue5 - restoreFromBackupActivity.A00 > 0) {
                    restoreFromBackupActivity.A00 = intValue5;
                    if (intValue5 % 10 == 0) {
                        StringBuilder sb3 = new StringBuilder("restore>RestoreFromBackupActivity/msgstore-restore-progress:");
                        sb3.append(intValue5);
                        sb3.append("%");
                        Log.i(sb3.toString());
                    }
                    if (intValue5 <= 100) {
                        restoreFromBackupActivity.A08.setText(restoreFromBackupActivity.getString(R.string.str155e, new Object[]{restoreFromBackupActivity.A01.A0L().format(((double) intValue5) / 100.0d)}));
                        restoreFromBackupActivity.A05.setIndeterminate(true);
                    }
                }
            }
            AnonymousClass2SD r03 = AnonymousClass2RY.A0G;
            if (r03 != null && r03.getProgress() != (intValue = numArr2[0].intValue())) {
                AnonymousClass2RY.A0G.setProgress(intValue);
                return;
            }
            return;
        } else {
            return;
        }
        Log.i(str);
    }
}
