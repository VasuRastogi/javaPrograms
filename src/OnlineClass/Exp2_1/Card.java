// (C)VasuRastogi (Github)
// 20BCS5135
package OnlineClass.Exp2_1;

class Card{
    String Symbol;
    int number;

    public Card() {} // default constructor
    public Card(String next, int nextInt) {    // Parameterized constructor
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