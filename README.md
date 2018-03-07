
### Trapping Water

My first attempt is pretty brute-force, so I tried a second time using a stack. One of them has a bug somewhere, at ~900+ entries they start to slowly desync.

* bug data, for later
//STACK VS BRUTE FORCE TESTS: Random(69).nextInt(11);
    // len : total: 
    // 900 : 4538 : MATCH
    // 950 : brute: 4782 , stack: 4794 : NO MATCH
    // 925 : 4673 : MATCH
    // 930 : 4712 : MATCH
    // 940 : stack: 4736 , brute 4704 : NO MATCH
    // 935 : stack: 4716 , brute 4712 : NO MATCH
    // 934 : 4715 : MATCH
    // 933 : 4715 : MATCH
    // 932 : 4715 : MATCH
    //
    // both methods return identical results up to 934 entries given Random(69).nextInt(11)
