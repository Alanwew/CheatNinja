package c.a.a;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class aa implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final z f8a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9b;
    private static int[] al = {12234643, 92919466, 94026734, 98140147, 26606703, 34691769, 37815112, 38197713, 17391494, 19804907, 11552187, 58113134, 58758186, 45145787, 11704111, 93902486, 21640610};
    private static int[] ak = {54997637, 43439789, 72402351, 50225046};

    /* JADX INFO: Access modifiers changed from: package-private */
    public aa(z zVar, int i) {
        this.f8a = zVar;
        this.f9b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z a(aa aaVar) {
        return aaVar.f8a;
    }

    private static String q(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            switch (i % 4) {
                case 0:
                    sb.append((char) (charArray[i] ^ 230));
                    int i2 = ak[1];
                    if (i2 >= 0) {
                        do {
                        } while (i2 % (59830107 ^ i2) <= 0);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    sb.append((char) (charArray[i] ^ 5839));
                    int i3 = ak[2];
                    if (i3 >= 0 && i3 % (70682007 ^ i3) != 5391231) {
                    }
                    break;
                case 2:
                    sb.append((char) (charArray[i] ^ 20163));
                    int i4 = ak[3];
                    if (i4 >= 0) {
                        do {
                        } while (i4 % (38229723 ^ i4) <= 0);
                        break;
                    } else {
                        break;
                    }
                default:
                    sb.append((char) (charArray[i] ^ 65535));
                    int i5 = ak[0];
                    if (i5 >= 0) {
                        do {
                        } while (i5 % (65388643 ^ i5) <= 0);
                        break;
                    } else {
                        break;
                    }
            }
        }
        return sb.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r18) {
        /*
            Method dump skipped, instructions count: 962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.aa.onClick(android.view.View):void");
    }
}
