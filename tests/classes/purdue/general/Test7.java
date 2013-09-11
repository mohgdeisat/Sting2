package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test7 {
    final private SJProtocol pDisoveryService =
      new SJProtocol(
      ("H4sIAAAAAAAAANVXXWgcVRS+u/lP2iSa1BqTVG2TNC2ya9XU1sTWZpvaxG0S" +
       "2KRKSxMnMzebSe7O\njDN38wMi0iJEHwpCW0Eriih9UB8qiL6JD1JQ8MEHqQ" +
       "8+1QcL+iAiClbwnDsz985st9sg+mAgJ+fO\nuec7v/fekw9+JjWeS3o86nmm" +
       "bS2m+JpDvRQufS43lqN8CthZ/cq3Qx9ZvOtakiSypK5AC3PU9Ti5\nK7uoLW" +
       "vpIjdZOmMzRnUOSIOrLumviCpEPjLxfxICuUZfMJnBSX82VE8LpbRUT8fU0d" +
       "KOEktI7blF\ncAVt+UZerctdejp/7t0kIaCxxbHZWp7ZPNDw9xzq/WQ6++Nn" +
       "9/p7OsvsmRCos/qNvV3d3xz6oaEK\nXa53bM/EqDm5Oxsq+RmZDCSDq46z6k" +
       "Cq+zBbKZSlVLa8nmmrYBvmvKnNMZo1PX6jpXfPxz+dbRUp\nqWbwhZPWSKZx" +
       "D0b+wO3h1PeOYfLiVzO/bxOgCf058gJJCKfaFUrWtJaogfCbduVOjT27vr0K" +
       "kuGs\nVGOBYOvOCkXNDNO8eVNNMZV9FbQiSo+x1668N/nLOiqhd0ln1avcR6" +
       "PWCrQLLdNHtVxz8xTSdqef\nNqZZ+XSOu6aVx8T1VgDN2rbjIy6NvXPi87E/" +
       "sn4Z5mxjDd2qCp3D3FUCylHLKJeOgQo6x4DX8lC1\nQqFombrG5TG5NHDm6o" +
       "XT6d+SpOokqaeMFqjF4QRuOxmLUNOXplxNpyP+hsEsaSr4mAjDyRbVov5x\n" +
       "EqdIJgxDa5MBFt0QPoXwqZvhk0d2Dw39tX0/RuZAiAchJ50VFLSGL17v2/v9" +
       "S0lSPUoamWnR8SJe\nJVnSbFCdaVigDNM8TzgCh2se6juuFWiwbixQvmAb8g" +
       "sarb0PToeyObXgUg2ukCafSaGEk80QnPJG\nwHeDv538H5aDk/sriQOrtUOm" +
       "ZfID0lwL32DHcHJHdCngEKRXQh1AZieSfk7qvSXoCA6HPxQ3KjGS\n3VLwCD" +
       "I7kPTwWG/IHSeiOxos26AZZltK/jXf+OXOSXvJlyAzDdylJbhXkdmD5CFOqn" +
       "XbWZOi7sp5\nU0dW5E0tA2Pi7Eqwjsr+xy4V4X/siyzFfglYh8wgkqG4YAaZ" +
       "R5HsQ5JWKVShInn49oKrccGAFJzn\nG3vA4YxEVjIK5dNFZDJIDm/QNDSeen" +
       "s1z38psV/Cd3cc+KAmahnWhEd77nEeeSVKoQKvQ7T2ki8y\nljEJ9wSPPFXL" +
       "JrzCADPp2tzWbXYYLhq4BSyPadx2Oem+lSjwdCsPvtD4RmntQWQmkExCYzOq" +
       "LdOM\nxpT8LORJThO+NyOua7tHNcuAKzB/HD+hJx3lPsvwciFgohWZaSTHOa" +
       "kRBqWxyxBQibEMzCZ0lUsz\nbfEP0sAz0kCSk3tKQDDXEqE1sgqy1Ca2jRh5" +
       "qMrEMnVd01BOfYfMKSQzkCG5U8o/BH1pD8sf1rop\n1jONQjODI6JUvY6MmG" +
       "aMEBrnFyk/CGNZDFo8L8NwIYgzEVmFL4Uy4lJ1of6pQkAyWy42JJoKSnmG\n" +
       "REX7VlmXsKWUS/5Klmbpv/DjelyQl4I1aMWYgzm76Or0CFyC/nGOLP8VFy9H" +
       "i1gjCiBl+6INPe9i\n61pGKmi+SUgVpCyyCqpY5RZl7ZJTPDLOS4icvkCNIq" +
       "PQz82SD9TrQB3R5In4FZnTSM740idtTZ7w\nxKdRaZPGOS04PLbjotqBZP3/" +
       "KmC3EuyKpqAFEjRlw1zkwFRiRsaS96MXi6wEbjRFITaHbFgH3V9L\ngFeQOY" +
       "/kAiebAil2oiwVWYGpX9ooaKaVOgYELgf8E+DWeDDvqh4bR+YNJCLwN6VgK7" +
       "gkHxLUL7On\nGZm3hQCeNTQIQ3BXyb+PkwzGzqM2M6gLs/y1L58feerldf8f" +
       "C0sNs3C21CA7CsnJY1ISw/grpvLm\nvwE3FhhotA8AAA=="));
    
    public void run(int singleSession) throws Exception {
        final SJService c =
          SJService.create(pDisoveryService, "localhost", 1000);
        c.participantName("A");
        c.addParticipant("B", "localhost", 7100);
        SJSocketGroup s = null;
        try {
            s = c.request();
            Integer i = new Integer(5);
            {
                SJRuntime.negotiateNormalInwhile("C", s);
                while (SJRuntime.insync("C", s)) { SJRuntime.send(i, "B", s); }
            }
        }
        finally {
            SJRuntime.close(s);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Test7 a = new Test7();
        a.run(1);
    }
    
    String repeat(String str, int n) {
        String str2 = new String();
        for (int i = 0; i < n; ++i) { str2 += str; }
        return str2;
    }
    
    public Test7() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1378680714000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0Za2wcxXn2bJ+fxI84IYnzjhOSNjkXBDTgQJqYmNhcHJMz" +
       "AYzAWe+Oz5vs7S67\nc+czoohXC6QqLYXwKhC1AqG2VCpBtJVK6QtKW/qQqB" +
       "RSqUGqqFpQoWr6IuLVft/M7uzjzkdatf3V\nk3ZuZr6Zb775XvPNN0+8SRo8" +
       "l2Q86nmGbe3PsFmHery0J/dTjXmZ3PCo6npUHzBVzxsDwIS2731j\n75OdN+" +
       "9MEWWcdFn2NtNQvbFp1y7mp8emDa/skpWObc7mTZv5GCtwnL/m3Zmf3jbcU0" +
       "fax0m7YeWY\nygxtwLYYLbNx0laghUnqett0nerjpNOiVM9R11BN4zoYaFuw" +
       "sGfkLZUVXertoZ5tlnBgl1d0qMvX\nDDqzpE2zLY+5RY3ZrsdIR3a/WlL7is" +
       "ww+7KGx/qzJD1lUFP3riU3kFSWNEyZah4GLswGu+jjGPsG\nsR+GtxhApjul" +
       "ajSYUn/AsHRGViRnyB33XgIDYGpjgbJpWy5Vb6nQQboESaZq5ftyzDWsPAxt" +
       "sIuw\nCiNL5kQKg5ocVTug5ukEI4uS40YFCEY1c7bgFEYWJIdxTCCzJQmZRa" +
       "S1O9323sHRt1aCxIFmnWom\n0p+GScsTk/bQKepSS6Ni4sli5p6hK4tLU4TA" +
       "4AWJwWLMtrXfuCz72ndWiDE9Vcbs5ro4ob177tJl\nL237bXMdktHk2J6Bqh" +
       "DbOZfqqA/pLzug3QslRgRmAuB39/zwyhu/TP+QIk1DJK3ZZrFgDZFmaukD\n" +
       "fr0R6lnDoqJ399SUR9kQqTd5V9rmbWDHlGFSZEcD1B2VTfN62SGENMKnwHc2" +
       "Eb9mLBhpGqMe+2jG\n28/IKgZVr89ztT6n6OpF2penFnVVsy8YU0Z082YUBX" +
       "ayNGlVJqjgTtvUqTuhPf7qT67fcckdtwsZ\noV75hDDSLXBnfNwZjpsoCkc6" +
       "H1VPsGab66qzaBLlm15a9sAL6sPAaNiwZ1xH+X6UmXosYdJZNT3G\nQGhvQ1" +
       "BTQR0mtO4bX1vy4C+/9HyK1FX1GlnZOWi7BdVEwQdm0uUvl4SAvvQmtbba2n" +
       "88uOupoy8e\nXx/qLyO9FWZVORPNYnWS6a6tUR3cToj+vrd3/unuhvOeTpF6" +
       "sDXwNkwFHQHTXZ5cI2Ye/YGrwb3U\nZUnrVMXGWxgwaCayYSzbsOgQigGy6E" +
       "4QyL3UyVvSH3n5mdbn+Y4Dh9Ye8Xw5yoR5dIbyH3Mphf7j\n94/efejN266q" +
       "A4N0HCFzRtJOcdI0tDJMOT1uUUiejmrzxpH+jjs3eV/nIm42CoUiUydNCh5Y" +
       "NU17\nhuoTjLugzoi7414GONE2Cd4KHN+ECYjEXh2lBOpZxR9kFnXfc++Gh1" +
       "5Gj+FwxixEy+KUkjLv6FWw\nXF8BxPYy1ODucNtg4wfEBto25K4e3nf7ar7z" +
       "KLqNfqMsEYa2cHZNWxjEkwV0htngYkKV2fepY5fu\nuuLyPuH0zqyJYgRsWe" +
       "d4wvmHhqytzy44aqVQS9LefmnvWZLyGCPrswFKX/OwKWq54ZwABY5/4wdv\n" +
       "IFzYuP7vNx35xaE2WHicNBreoGGpJkrbGxHWW+VQSKC47tnLHjn5M/YK183Q" +
       "XJD8peVKL7dXjVjy\n5qOlzvTXDhdSpHGcdPCDXbXYXtUsouaOw9HsDfidWX" +
       "JaDB4/ZsWZ0i/dwdKkqUaWTRpqfYTb9Tga\n603CNvmY9n+I3/v4oeJgQzj/" +
       "rgG74MCJ4a68mHtjRnWnrCgOTtvMJy/n5SqhfykGSyOLGWl0XKOk\nYnxEOp" +
       "yLDM8uUXcWgqKS4cch8xnpkaJ0ixYzChTjN1/5uL9QuF1sBbXtTUhdKkgGFY" +
       "SJs/mFo1uO\nWGzpq1xUjX5QhpFR6EjgtDSBk/y4dcHiamGVajeh+UeiIhyU" +
       "Nm2YOlJ2FuBYU1MfxfS7GnOPX56/\n59GUb9OtDndm60KrDunyei+zCrZuTB" +
       "ncG4Gdv9u+9syn37izQ5wHoccBW/hgBGH/4u3kxheveWs5\nR6NoiGPAd0gb" +
       "pXs4owZHBrbTvFHBEPQI62rMikw637zvhcdGT9wesOEiB/1zLSEMWTPAa1pF" +
       "CGmm\nunnKRNTgkrU1kGRt2xEYDgx/cfx7wyezgpOTtj4rpOgTgzKphSgHgV" +
       "W17Z9TY84uqENYC3ZUKFqG\nxq8DAsfj59xy7N6b+/4G589VpImatEAtBuq6" +
       "/KpYfA0HzZgLkdMOMQCsu7UgcI4FtpzgRrCbohvg\nyiCuTCWu1OCHtmx5b/" +
       "V5/GiC/QwCA3pqTFCbn39w3bnHPwGhwxBpwdBypIhGliXz0C+peBfgR6Tv\n" +
       "bpow2hwJ3U+LuE+MhOEeIemV4CHCNSHGoipcTlpFJYMQRk6DzYXUcPSXA709" +
       "7N/kPcSytcD+qukt\nhmWwC+Vy7ewU1QOChmiTo0MkExLVhVjhfZMQYnsHQP" +
       "wMTDcAt4RgLHQJOBsrV2NxDYspghwxHh3R\nbNk6HTBtK4T/nJ2624NgPNHj" +
       "c6aZQfAVx3sMKwewAO9fr9nOrAQtq8230D4538Kmvxg3VIlscW36\nYx6D0x" +
       "/rkaLwJMJGrBSxKMUB12DlWiz4aW+ELAy3ikXhgwHH4gBbAg6xUzvawEYiLb" +
       "mLkKaHsPJx\nLG44xaXXs8jZpXoigEF9Cc6tEaj7MgmbgUxYVOcuYJEjIInK" +
       "pzrA1p3okXu5VaK7MirikgE34Ehg\ncBE4Gpy9vWjgVRL85Zwwn9Z5k9jkYR" +
       "0OkMv0Y+UOLA6CRptULdEBCP0l/E5gkIzuBBk7XNd2d6qW\nDr4vvxe7bKBg" +
       "cbVuua9PBwiVDqx8BovPQqDEF5SLPcnIssRifn5JLjM/3iEX+JxcAOKvJQkk" +
       "yGSJ\noSPS8pkznw/boedBHLshRnMNPSTqV1i5D4v7gUNypIR/lUVuPCj3QM" +
       "itMWVp4TMHMGqSU1/HysNY\nPBKgxlhHwrcysiiGmp8r28ETcGOItIIjIlwE" +
       "7qwSzzvhFrB4oNresPh8uKmQMiwOS8DhqiShSoUk\niZYUzWP/DTpejwO+IA" +
       "GzoIoxAnN20dXoIHg/YceR5n+ExCejQmzgApCwzVGFnnJRdS094yvfKLAK\n" +
       "WBZp+VKsg5tAgCI1xiIJNokip01TvWii6c+TdX96I0xHbNIi/oKVZ7D4toBe" +
       "bKvSwpVvRqGtKmO0\n4LDYiIfCEVh8//+A/wnAnAuwISqxdpDnmI1XVIiejE" +
       "j49JWoH5SKE9xlwVcE1UBtNNGWCA5i5SgW\nLzPMyHMoGk4YHczA7ViuUVAN" +
       "K7MLCvBl+OfjbYAbuRuaxAhWfo3FcSxekYDTgSR54OH8KmPmYeU3\nHADHLy" +
       "4YXKM7w+h5CHaaxx0q2/HjV4HhcuVFnd+r1/jJJ4Ll+ljmCO4By+ZKsPPHgd" +
       "uuONH2SfW5\nq8UFqCueYtthFQvnHD5GN3ysTauS4G1mtrPJpCVqyvxUHV+3" +
       "DpbdVPM6vYvfH8IES11u64YzNrb+\nHi4kc6RpO/3OPZQVXStyZYLR6r+cv1" +
       "2RYEqSns5Sz6V108aPUjzxInI1Fc8s8Un98QxNixsnlIuw\nR+RpgEVN8K2B" +
       "r9u/gfJ/BHZi0SXSrFi8VjWxGOYBk1mvUdcoGMwo+XHyXcsf/d1Tr+7pFuIT" +
       "70Vr\nKp5sonPEm1GQ3oAVVtVagY9+7sOrnrhhzyuTQT7gTfD/YELVc6IB6b" +
       "7Szw+VfkdZow7aP0fy18gh\nctIRuN4BiynZho4olbpoygOrb5fn6Dkh2Y7f" +
       "GfCt89m+rhrbq+TDuJnBRdLjD4a1N1b5psVfOIQ8\njtT1nkh9a2EvT9rXT6" +
       "qevPnHHgMr3/piT3iczha5q8Xwraixq4DXHdGUAN7xqwoFr6ZKZ1khmB1U\n" +
       "FszBjQuE5wGemNTKi/ent3FCR5itTonhVUTNr5yY1gpgIjFu2Bn53grAyrw3" +
       "tv8s6ONrzW0hp5qX\nV1aAe9fkDTjOJZGuLdeUN+IQmJp8f86Vs6qKBsyp7A" +
       "lVFJ/uVsG3yRfmplNT0Tl2mpISU7oiFlGL\nIRtBpi51qMr4LE5lV4TsCmSV" +
       "3aAWDfy5DzNxi5L+w3871la/tG/9D5zOHwtbCN53GzHdVDTNaLY7\nUk87Lp" +
       "0yOBcaRe7b4VSfB1Fk/MERwgG/hlQqm8W4LfxNCcdh6wKu42vLyj8BmI/SJZ" +
       "QgAAA=");
}
