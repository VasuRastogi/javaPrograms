//20BCS5135 ((C) VasuRastogi / Github )
package OnlineClass.Exp2_2;

class Card2 {
    String Symbol;
    int number;

    public Card2() {} // default constructor
    public Card2(String next, int nextInt) {    // Parameterized constructor
        this.number = nextInt;
        this.Symbol = next;
    }
    public void setSymbol(String Symbol){
        this.Symbol = Symbol;
    }
    public void setNumber(int number){
        this.number = number;
    }
}
