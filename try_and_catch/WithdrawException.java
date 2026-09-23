package try_and_catch;


//runtime exception
//super call the constructor exception  constructor formthe object class form the exception class 
public class WithdrawException extends Exception{
  public WithdrawException(String message){
super("insufficient amount");
  }
}
