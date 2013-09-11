package purdue.general;

import sessionj.runtime.*;
import sessionj.runtime.net.*;

public class Test5 {
    final private SJProtocol pDisoveryService =
      new SJProtocol(
      ("H4sIAAAAAAAAAO1ZXWwUVRS+u9vSP2wLBRT5ERFKQbIbfgO04afbFlqWtnFb" +
       "QZCf2Znb3SmzM8PM\n3f5ERYUQ0QcSE6NRMcQ/0KgPmBh9M8YYEk1M9MGgiU" +
       "/4IIk+GGN8sCaeMzN778wyXRq1hkib8HHu\nPfeec+45595zpn33Z1JpW2SF" +
       "TW1bNfThOBs3qR3HoUule9KUDQB5VL7yTdv7Olt8LUoiKVKVp/kM\ntWxGFq" +
       "SGpREpUWCqlkgamkZlBpJaxyzSUlaqw3IlE/cn4kiulHOqpjDSkipuTzibEn" +
       "x7IrAdNd1X\nognRyAyDKajLVfJsVfrS/uxzb0QJgR3zTUMbz2oG83a4a3at" +
       "/HAw9ePH97hrFoWs6XOkHpUnNi9e\n8vWuH2piaHK1adgqnpqRu1LFTa5H+j" +
       "1O65hpjpng6mb0Vhx5ceEte8WgnjcUdUiVMhpNqTabaFi5\n7oOfzjU6LqnQ" +
       "YIaRRp+ncQ2efO3NxYn5he3kiS+O/L7UERqRT5CTJOIYNU9ISan6caqg+Nmr" +
       "04d7\njp1dHgNnmKMVGCBYuqpMUJPtNKveEFN0ZXOZXb5N27QXrrzZ/8tZ3I" +
       "TWRc0xULm6zOZuPWNJupwL\nSaRZTLKyFPw21/WbJunZRJpZqp5Fz5U7SHuo" +
       "zOhBMle1O6hJdYXqTBvHBQpmrASbGWnyxWePZOf2\nSWZr8RgmgYPMEW72+J" +
       "VV333y6YJjX8VItIvUaoakdEkyM6xuUsNyFrVzhqaMmTt2OibMHq0GbIR/\n" +
       "MRA2n9vvCEz3pKQM1XzWdpPqHGhJGgpNkZgmZYKecDMZ8pJE1p9gJNbXvx6k" +
       "rix7Z3UlLLibyuzZ\nB7SUhRzM5wu6KkuMX/pLm05fff5U4rcoiR0i1VSjef" +
       "ApeHHpoUC4JPn4gCXJtNNd0JoidXlXJoph\nZL64cO7j4LwJPPro/iYehIJV" +
       "FB9H8fEbxUe71rS1/bl8K57MhCPuBJ8sKrNBqvnspebN35+Jkopu\nCKCq09" +
       "4CPowpUq9QWZMw25KaZNuOIfBUDKka7ZXy1BvX5inLGQqfQaWzlsFdFzoHIB" +
       "EkeBDrXCKO\nHEbugMMJaxzxK8DeRexvhoORe8uxPa2z2lRdZdu5ugY2xYxh" +
       "ZI5/6IhDIWu5qO1IxBESjFTbxyEj\nGDxlRXatYCOs44yNSKxBuJ8FcoOvOO" +
       "hfUaPDfUhqhi74X7KplypG5pXMeJ6pYRYtkXsViS0IWxmp\nkA1znLNamK9m" +
       "SbZbYdCyYr3qBdrzmhh6qiqY/3Rb/SEoFeU+ZEVhTcEJT9wCRbWlfEbNFiRG" +
       "hTqu\nYIKRJaVvDWSICYlsDcLQdnwSmOHh7ShKiUSQ6ELYHWCQDcxXHUrt95" +
       "qP4gHmlczcqIdMTKbngD/K\nIyqUZZDfbxnMkA2tA+4qim0vQO9BLXiFJuV5" +
       "XqvP4LBLpZqCC7iaViR6EfogKTQqjdCkpAn+OYg8\n7ytcMzoty7D2SLoCz0" +
       "f2QZwywIKFYdP8wA9wxzYiMYAwyEilo5AruwyhK1GWhC6FjjGupik4wRXs\n" +
       "5wqijNxdIgS9zyU0+kaec5qcZZ1KFuLUN0ItS/Xl07dIPIxwGDzEV3L+e7Cf" +
       "68OEKEa/LpC2tc7O\nJDaLfOt1JDIIclE0djKcvwMatIBo52luN5RxlN/oGx" +
       "VfWaHEouIx+kMcAeFI2NkQjolDCcsQhMkX\nQk3ClBImuSMemuHpsON6kDHE" +
       "GeOQigED00bBkmkXXHb3gfIN/xUTL/uDWOkEgPO2+BN6yMLU1ZW4\nl3z94C" +
       "pwmW/kRTFmFXjsogPM19hzEWk5R5WChle/ntPe9irYjtL4jfgViScRTrnc3Y" +
       "bEb3jkIz+3\nTmKM5k0WWHFerEB4aobxnzC0yRir/RFrgHgOGFjOoAFRfR3I" +
       "O/53kCdOse7BW1Eki2kju2Mu4Bkk\nXkY4z8hsj4sXh2cWGYUenevIS6oe3w" +
       "cAbxn+58mttKG1FVfCqTWvIryG8Dpn3Akm8YKH+0PW1CNx\n0WFAX4EKod9d" +
       "XPLd269Bh7nHwOIHbfu1zx/t3Pv0WffDVBd9a6Bn7TAK8OXJSKTdUbUQvjFM" +
       "5xvD\n7duWYC+OxHKnxfasmbUMiWaEVQgtoqtFwu3gEETT2ICE6ApDu0kE0S" +
       "5OpY9E2BjWPiJsFn0jEm5/\nh7AtrPFDaBNtHxKOaTsQ+Mndde0ISYSbtzNl" +
       "+ikkehD2Tk0UOYCE27Ig9If1Mgi85yDnkHB7jgDD\n34wg8CbCfdQfQjgYYE" +
       "SiSExzCXOcnUNQEaalfl5AwkAwp03H5DUaiRGE0X+q/HJQxyOi9CLxGMJJ\n" +
       "hMdFQUVCPKunw8okwpmwColwi5SH25cxlcKI8KKohUi4pQzhlbAah3BBVDYk" +
       "wsrU5PULiYshjPog\n4y2H8Tbzfr3m1J9uKM5ZLMq+AmQ5BWjDTAGaKUAzBW" +
       "imAN16z/Dty/ifFKBG/x8K8Df/WH/GHMAV\n9X8Bhrjssm4dAAA="));
    
    public void run(int singleSession) throws Exception {
        final SJService c =
          SJService.create(pDisoveryService, "localhost", 1000);
        c.participantName("A");
        c.addParticipant("B", "localhost", 7100);
        SJSocketGroup s = null;
        try {
            s = c.request();
            Integer i = new Integer(5);
            Double d = new Double(10);
            {
                String _sjbranch_$0 = SJRuntime.inlabel("B", s);
                if (_sjbranch_$0.equals("OP1")) {
                    { SJRuntime.send(i, "B", s); }
                } else
                          if (_sjbranch_$0.equals("OP2")) {
                              { SJRuntime.send(d, "B", s); }
                          } else {
                              throw new SJIOException(
                                "Unexpected inbranch label: " + _sjbranch_$0);
                          }
            }
        }
        finally {
            SJRuntime.close(s);
        }
    }
    
    public static void main(String[] args) throws Exception {
        Test5 a = new Test5();
        a.run(1);
    }
    
    String repeat(String str, int n) {
        String str2 = new String();
        for (int i = 0; i < n; ++i) { str2 += str; }
        return str2;
    }
    
    public Test5() { super(); }
    
    final public static String jlc$CompilerVersion$jl = "2.3.0";
    final public static long jlc$SourceLastModified$jl = 1378679519000L;
    final public static String jlc$ClassType$jl =
      ("H4sIAAAAAAAAAO0aC5AcVfHN7t3el9w3IeTyzwGJJnsSCEW4SEguOXJhczly" +
       "lxAuhZe5nXd7k8zO\nDDNv7/YQMHwkATSKJCAYTKlYiGJBgnxKKET5RMVPGT" +
       "VEFCgLS6EES8pSKA1o93vz373lUGNRkqva\nvp7X7/Xr192vu2feu/d1Um5b" +
       "JGlT21YNfVuSjZnU5tAY3EbTzE72ru2RLZsqHZps231AGEhvfUfd\ndKDhmj" +
       "UxIvWTRt1Yoamy3TdsGbnMcN+wauctMts0tLGMZjCHYwGPc+cdG/3RzrUtcV" +
       "LXT+pUvZfJ\nTE13GDqjedZParM0O0gte4WiUKWfNOiUKr3UUmVNvRw6GjpM" +
       "bKsZXWY5i9obqG1oI9ix0c6Z1OJz\nuo0pUps2dJtZuTQzLJuR+tQ2eURuyz" +
       "FVa0upNmtPkcSQSjXFvoxcRWIpUj6kyRnoOCXlrqKNc2zr\nxHboXq2CmNaQ" +
       "nKbukLLtqq4wMis6wltx64XQAYZWZCkbNrypynQZGkijEEmT9UxbL7NUPQNd" +
       "y40c\nzMLItHGZQqdKU05vlzN0gJGp0X49ggS9qrhacAgjk6PdOCew2bSIzQ" +
       "LWWp+offvGnjdng8VBZoWm\nNZQ/AYNmRgZtoEPUonqaioFv5ZJ7ui7JTY8R" +
       "Ap0nRzqLPitOfXhj6pXvzBJ9Wor0Wc99cSB97Ozp\nMw6v+F1VHMWoNA1bRV" +
       "cIrZxbtcehtOdN8O4pHkckJl3iExueuWTH1+kfY6SyiyTShpbL6l2kiupK\n" +
       "h4NXAJ5SdSpa1w8N2ZR1kTKNNyUM/gzqGFI1iuooB9yU2TDH8yYhpAJ+Evza" +
       "ifirQsBIZR+12ZKk\nvY2ROQxQu8220m1mzlJytC1DdWrJWpvbJ4/sJo1KEq" +
       "xkenRXaeCCawxNodZA+u6Xf3jF6gtv2CVs\nhH7lCMJIs+CddHgnOW8iSZxp" +
       "E7qeUM0Ky5LHcEvkrz484/ZD8p2gaFiwrV5O+Xqk0TKEMGhxyYjR\n4e+3Ls" +
       "BkcIeBdPOOV6bd8fN7no6ReNGokfIaOw0rK2toeHebNDrTRSngL61Rry0295" +
       "9uXPfAkWdf\nmO/7LyOtBduqcCRui7lRpVtGmioQdnz2t/19zZ9vKV/6YIyU" +
       "wV6DaMNk8BHYujOjc4S2R7sbanAt\n8RSpGSpYeDUDBY0GFoywFkG9cAywRX" +
       "NEQB6l3ro28ZHnHqt5mq/YDWh1gcjXS5nYHg2+/fssSqH9\nhc/33LL39Z1b" +
       "4rAhTVPYnJGEmRvU1HQehpwc3lEonoJu89rB9vrdi+yHuImr1Gw2x+RBjUIE" +
       "ljXN\nGKXKAOMhqCEQ7niUAU3UDkK0gsA3oAEjsVZTGgH3LBIPklOb99y6YN" +
       "9zGDFMrpgpuLO4pCTPG1ol\nhPMLiPg8Az242V827PHtYgG1C3ovXbt111y+" +
       "8iC7hc5D3mPo74WzSu6FTsws4DPMgBDju8zWm45e\ntG7zxW0i6J1RkkU37G" +
       "WF8/HH7+3Slz8++YgeQy9J2Nu8/Z4iMZsxMj/lsnQ8Dx8F1ru2V5DcwL/w\n" +
       "3RfgT6xe8berD/50by1M3E8qVLtT1WUNrW13i91bJClEWFz++MYvvvVj9iL3" +
       "TX+7oPjT84VRbpMc\n2MnnHBlpSNy/PxsjFf2knid2WWebZC2HntsPqdnucB" +
       "pT5KQQPZxmRU5p98LB9OhWDUwb3ahlAW2X\nYW/EK8Xe5H3q/in+3sEfOg4+" +
       "iODf2GFkTcgY1uwLeDRmVDHzkmTisHP44JkczhH+F2MwNaqYkQrT\nUkdkrI" +
       "9IvblKtY0Rao1BUTSiOnVIEyMtnimtnM7ULMX6zXE+Hi8kvi+Wg9u2RqzuOU" +
       "gSHYSJ3Hzo\nyLKDOpv+MjdVhVOUYWXkBxLIlhpokqdbC3ZcKa6e2w2knZQo" +
       "iQCVHlY1BSVbDDzmlfRHMfzmit67\nL87suSvm7Okakwez0/xd7ctlt27Us4" +
       "aiDqk8GsE+P1Z36hkPvra7XuQDP+LAXnh3Bn77KSvJjmc/\n9uZMzkZKI48O" +
       "JyAt9MLD6SU00rGSZtQChWBEOK3EqMCgc7XbDn21541drhpWmRifF5QY3KUP" +
       "WuDT\nw0WskGCylaFMlA2lBV9ZlAdEhEbVXkVNKJeozrQxkRnAvDIMZqQp4D" +
       "ZrZHt4nWy2u2KbJJyLHHp5\nxfPffXLK1p/FSayTVGuGrHTKPEOTKkiN1B6G" +
       "6idvLj+fi1A7WgmwHn5xYDbZk58z7F2bkgepFpC2\ni1QOwywdhgIpKq7Jgy" +
       "jK2SCJtPgyRuLrexYDl1NLOrSuFDPekhJj1gEORTlEgWxOV9P8ZUbwuHvJ\n" +
       "tUdvvabtr5A9t5BKqtEs6BC0NnNL6O0A0mSfBXXfatEBYlNNVvDscyNRxJSu" +
       "hnOWyyuJvJKFvGKd\nH1q27O25S3lihfWcDwpoKTFArnr6jtPOfuGTUPh0gX" +
       "UginfnMESkyCSMqjK+yfAE7wTLSqyVu/3g\nWS3ehrr9YpWQxGyIb/6cUCFS" +
       "GV6tagSSRAojJ8HifGk4+0tB3hb2b+oeKvFSZGfWxDJVV9l53nR1\nbILuAS" +
       "VP8JGzQya+5OchkkEwDC8I9nYwP4PA45KrfTKCbR7hLER45EEdBRzB69Ef7F" +
       "Glg7N3aIbu\n03/CJh604VUi0uJopopB6RjmexSRyxBAIVyWNswxjzSfBWK8" +
       "bItEj5K58b0bcEdr/qMzFU+4Hqul\nQRNEWYko5TJrCjc47KYoqi1nB9VMDl" +
       "KrP503wTFGZkQDiZvCN8KjzXUSavHMe6XLRWTdTyDYESKQ\nM1kg1Efld9Kw" +
       "u4DmSEvhPOTYePNsDlp5RIVX4EBlsAr2KrJdmVPxXRJCzrg0R2uTBvGR13XY" +
       "wZum\nHZGdCHaBU2hUHqEdUPt79N1gea+8E2KstizDWiPrCoSPzCZsMkCCU4" +
       "o1ewu+yVNsPSKfRgCsy/mE\n3mQHwHSRyZwPTN40TeEGb4LPehNAATYtwgS1" +
       "73GoDzw5ymni3VYrGbDTeijSLDXgT79CZC+CW0FD\nXk+P/k0WeOVBh3CtXx" +
       "Ny22o+sgPLJm/oq4h8AcE+lzUWOx59OSNTQ6x5aF5pKGPIvz7w5EZZfxJ4\n" +
       "afX4/MNfAoLbiq0Nwe3+onzJENzpEfYXFQldyhdJPHmm+crxkOPVMGG/RxgD" +
       "VwwJ2GvkrDTthM0u\nAlTg8b8i4oGgEcu5ATzaOUGHHrLQdXUl6ThfD6gKVB" +
       "Z4cqwYh1cBl0WsjwW+sHksetPDVMlpuPUn\nebgzvAKGIzdvR/wFkW8jeFRQ" +
       "LzBkb4dLjwSpNTJjNGuyUI99fg8ET5wg/E8I2niEBUGL1YE9+wxM\nZ1CAqI" +
       "EK5BvBOOg5jpv3IFa4qOs2afHsMbgRkV8g+CXDT/KcihvH8ywyCq/H3hxZWd" +
       "WT6wBALMN/\nDt9yeCW3/C3RjcjzCH6N4Dce4WQQyUt4OL5In0mIvMQJUFfg" +
       "hO57dKAAXWXk4KWPEWklJ/bB24HJ\n3w7O4M8XY2GNyBZeLzusE7MRGUCwFY" +
       "Hsl6iIiHIMga+fOkT8Eq9oaYjAr/0mUhQiyBarBREYfhGI\niCjWEPgmORom" +
       "5PwaDpFRBPz9wi/uliLycQRXIHj32qREcYTItQiumxgrshkRUX8guKFYYYLA" +
       "KyDI\nbkREAREiBCsLBF5FICL05xDcEiJIMUSOcz5ajsiXEHwZwXFJhvsR+R" +
       "qCe47bHOMnXETuQ3D/fzr5\ngfAc3/LzKCIPIXgYwSN+dkTEj5GPFct5CB4v" +
       "lu4QvE9i/QeXMJEsh+Cwn9gQEXkJwZFiCQvBUT9N\nIVIs54yfjBB5qQhhUp" +
       "jwWzf/NPj5pwsybQYzbCABWTwBnXkiAZ1IQCcS0IkE9P4Lwx9cwv9JAqoP\n" +
       "fvXHz/iYf/IcYI+14iA8dFTJo+g85/idIBTH7+7ZuW0Fvl5Erhjx61E7N79R" +
       "e7381KXiEKUxfMlg\ntZ7LLtl/lC44vzZd5IpLFTPMRRodoeI7A57Qx/m8eB" +
       "K0qOSB4jp+BuEfMcd7ly84fWHNH2KkbJyL\nKg1O4wbKcpYeOHaB3vJ7vsEy" +
       "K6KUqDwNIy0XxYfV78f40bM4rS64aBYe1B4+o662woJyE7ZwAepA\nRXhoNg" +
       "9+k4n44/+R2ICgUVw0ASCJ1+7o1Qr/JkT03L/HUrMqU0ecy2A3z7zr9w+8vK" +
       "FZmE/cmJtX\ncGktOEbcmnMPeGGGOaVm4L2f+vCce6/a8OKgcyIqjUGppOqs" +
       "+K0QV3TH6Zt8p1+dT1MTP4BwJjv8\nr2jSdSbnJe1kpGzEUBVkKX0m4Om84f" +
       "p88RbpSk/t+DsdfosctS8qpvbCbcaT/DxGEja/Mll6YYW3\n+vgdL2GPg/HW" +
       "N2KPTmnl15bKBmXbOz0MXYcsvO0YusTI5az2VnUK/GaVXpVkFjUAFo3SnXmJ" +
       "4F0I\naf84K/+oiDKwfo1CVBrmqkWwz7+bExPdi5iVH1HhIb5LE9eAVCPp3S" +
       "4FYuEtH5zgKiEfn2v83TDR\nW0jSPYyUp70Ts3DIFZdT8iVtizw+xTntcT5e" +
       "cUcs7o77CtxxX9Qd8aLiHKzdHcOdNTF3HGelMc9i\n/GqLux9KKeQhsKlFTS" +
       "ozPkryPWVhcWaFzeAW5fxyI94FmRqNFc5N2fTcw1vnP2k2/ED4vXubtQKP\n" +
       "p3OaFrzbE8ATpkWHVK6FCnHTx+RSP8nIpPD1SkYqHIxr+Hui3zP8Bh32w6dD" +
       "XOD78tK/ADaQbDqC\nLQAA");
}
